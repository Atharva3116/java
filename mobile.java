import java.sql.*;
import java.io.*;

public class mobile 
{
	public static void main(String args[])throws SQLException
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		PreparedStatement ps1=null,ps2=null,ps3=null;
		int mno;
		String mname,mcolor,stype,ntype,bcapacity,istorage,ram,ptype;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Class.forName("org.postgresql.Driver");
		    con=DriverManager.getConnection("jdbc:postgresql:mobile","postgres","postgres");
		    stmt=con.createStatement();
		    while(true)
		    {	
		    	System.out.println("\n**MENU**");
		    	System.out.println("\n1. Insert");
		    	System.out.println("\n2. Modify ");
		    	System.out.println("\n3. Delete");
		    	System.out.println("\n4. Search");
		    	System.out.println("\n5. View All");
		    	System.out.println("\n6. Exit");
		    	
		    	System.out.println("\nEnter choice:");
		    	int ch=Integer.parseInt(br.readLine());
		    	switch(ch)
		    	{
		    	case 1:
		    		System.out.println("\nInsert values->");
		    		ps1=con.prepareStatement("Insert into mobile values(?,?,?,?,?,?,?,?,?)");
		    		if(con!=null)
		    		{
		    			System.out.println("Connection Successful..");
		    			System.out.println("Enter the mobile model number");
		    			mno=Integer.parseInt(br.readLine());
		    			System.out.println("Enter the mobile model name");
		    			mname=br.readLine();
		    			System.out.println("Enter the mobile model color");
		    			mcolor=br.readLine();
		    			System.out.println("Enter the mobile sim type");
		    			stype=br.readLine();
		    			System.out.println("Enter the mobile network type");
		    			ntype=br.readLine();
		    			System.out.println("Enter the mobile battery capacity");
		    			bcapacity=br.readLine();
		    			System.out.println("Enter the mobile internal storage");
		    			istorage=br.readLine();
		    			System.out.println("Enter the mobile RAM");
		    			ram=br.readLine();
		    			System.out.println("Enter the processor type");
		    			ptype=br.readLine();
		    			ps1.setInt(1,mno);
		    			ps1.setString(2,mname);
		    			ps1.setString(3,mcolor);
		    			ps1.setString(4,stype);
		    			ps1.setString(5,ntype);
		    			ps1.setString(6,bcapacity);
		    			ps1.setString(7,istorage);
		    			ps1.setString(8,ram);
		    			ps1.setString(9,ptype);
		    			ps1.executeUpdate();
		    		}
		    		break;
		    	
		    	case 2:
		    		System.out.println("Enter Mobile Model ID to modify:");
		    		mno=Integer.parseInt(br.readLine());
		    		
	    			System.out.println("1.Model Name:");
	    			System.out.println("2.Model Color:");
	    			System.out.println("3.Sim type:");
	    			System.out.println("4.Network type:");
	    			System.out.println("5.Battery Capacity:");
	    			System.out.println("6.Internal Storage:");
	    			System.out.println("7.RAM:");
	    			System.out.println("8.Processor Type:");
	    			
	    			System.out.println("\nEnter choice:");
			    	int ch1=Integer.parseInt(br.readLine());
			    	switch(ch1)
			    	{
			    	case 1:
			    		System.out.println("Enter Model Name to modify:");
			    		mname=br.readLine();
			    		ps2 = con.prepareStatement("Update mobile set mname= '"+mname+"'where mno = "+mno);
			    		ps2.executeUpdate();
			    		break;
			    		
			    	case 2:
			    		System.out.println("Enter Model Color to modify:");
		    			mcolor=br.readLine();
		    			ps2 = con.prepareStatement("Update mobile set mcolor= '"+mcolor+"'where mno = "+mno);
		    			ps2.executeUpdate();
			    		break;
			    		
			    	case 3:
			    		System.out.println("Enter Sim Type to modify:");
		    			stype=br.readLine();
		    			ps2 = con.prepareStatement("Update mobile set stype= '"+stype+"'where mno = "+mno);
		    			ps2.executeUpdate();
			    		break;
			    		
			    	case 4:
			    		System.out.println("Enter Network Type to modify:");
		    			ntype=br.readLine();
		    			ps2 = con.prepareStatement("Update mobile set ntype= '"+ntype+"'where mno = "+mno);
		    			ps2.executeUpdate();
			    		break;
			    		
			    	case 5:
			    		System.out.println("Enter Battery Capacity to modify:");
		    			bcapacity=br.readLine();
		    			ps2 = con.prepareStatement("Update mobile set bcapacity= '"+bcapacity+"'where mno = "+mno);
		    			ps2.executeUpdate();
			    		break;
			    		
			    	case 6:
			    		System.out.println("Enter Internal Storage to modify:");
		    			istorage=br.readLine();
		    			ps2 = con.prepareStatement("Update mobile set istorage= '"+istorage+"'where mno = "+mno);
		    			ps2.executeUpdate();
			    		break;
			    	
			    	case 7:
			    		System.out.println("Enter RAM to modify:");
		    			ram=br.readLine();
		    			ps2 = con.prepareStatement("Update mobile set ram= '"+ram+"'where mno = "+mno);
		    			ps2.executeUpdate();
			    		break;
			    		
			    	case 8:
			    		System.out.println("Enter Processor Type to modify:");
		    			ptype=br.readLine();
		    			ps2 = con.prepareStatement("Update mobile set ptype= '"+ptype+"'where mno = "+mno);
		    			ps2.executeUpdate();
			    		break;
			    		
			    	}
			    	System.out.println("record modified successfully");
		    		break;
		            
		    	case 3:
		    		System.out.println("Enter Mobile Model ID to Delete:");
		    		mno=Integer.parseInt(br.readLine());
		    		stmt.executeUpdate("Delete from mobile where mno = " + mno);
	                System.out.println("record deleted successfully");
		    		break;
		    		
		    	case 4:
		    		System.out.println("Enter Mobile Model ID to Search:");
		    		mno=Integer.parseInt(br.readLine());
		    		rs = stmt.executeQuery("Select * from mobile where mno = " +mno);
		    		if(rs.next())
		            {
		    			System.out.println("Model ID:"+rs.getInt(1));
		    			System.out.println("Model Name:"+rs.getString(2));
		    			System.out.println("Model Color:"+rs.getString(3));
		    			System.out.println("Sim type:"+rs.getString(4));
		    			System.out.println("Network type:"+rs.getString(5));
		    			System.out.println("Battery Capacity:"+rs.getString(6));
		    			System.out.println("Internal Storage:"+rs.getString(7));
		    			System.out.println("RAM:"+rs.getString(8));
		    			System.out.println("Processor Type:"+rs.getString(9));
		            }
		            else
		                System.out.println("Student not found");    
		            break;  
		    		
		    	case 5:
		    		rs=stmt.executeQuery("Select * from mobile");
		    		while(rs.next())
		    		{
		    			System.out.println("Model ID:"+rs.getInt(1));
		    			System.out.println("Model Name:"+rs.getString(2));
		    			System.out.println("Model Color:"+rs.getString(3));
		    			System.out.println("Sim type:"+rs.getString(4));
		    			System.out.println("Network type:"+rs.getString(5));
		    			System.out.println("Battery Capacity:"+rs.getString(6));
		    			System.out.println("Internal Storage:"+rs.getString(7));
		    			System.out.println("RAM:"+rs.getString(8));
		    			System.out.println("Processor Type:"+rs.getString(9));
		    		}
		    		break;
		    		
		    	case 6:
		    		System.exit(0);
		    	}
		    
		    }
		    
		}
		catch(Exception e)
		{
			System.out.println("ERROR"+e);
		}
		con.close();
	}
}
