import javax.swing.table.*; 
import java.sql.*; 
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
public class Project extends JFrame implements ActionListener
{
JTextField t1,t2,t3,t4;
JLabel l1,l2,l3,l4;
JButton b1,b2;
int row,column;
Project()
{ 
setLayout(new FlowLayout()); 
setSize(500,500); 
setVisible(true); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
l1=new JLabel("ID"); 
add(l1); 
t1=new JTextField(10); 
  add(t1); 
l2=new JLabel("Name"); 
add(l2); 
t2=new JTextField(10); 
add(t2); 
l3=new JLabel("Description"); 
add(l3);
t3=new JTextField(10); 
add(t3); 
l4=new JLabel("Status");
add(l4);
t4=new JTextField(10); 
add(t4); 
b1=new JButton("Insert"); 
add(b1); 
b1.addActionListener(this); 
b2=new JButton("Display"); 
add(b2); 
b2.addActionListener(this); 
try 
{
Class.forName("org.postgresql.Driver"); 
} 
catch(Exception e) 
{ 
System.out.println("Error"+e.getMessage());
} 
} 
public void actionPerformed(ActionEvent e2) 
{ 
if(e2.getSource()==b1) 
{ 
try 
{ 
int eno=Integer.parseInt(t1.getText()); 
String ename=t2.getText(); 
String description=t3.getText();
String status=t4.getText();
Connection conn = DriverManager.getConnection("jdbc:postgresql:project","postgres","postgres");  
PreparedStatement st=conn.prepareStatement("insert into fields values(?,?,?,?)"); 
st.setInt(1, eno); 
st.setString(2,ename); 
st.setString(3,description);
st.setString(4,status);
st.executeUpdate(); 
st.close(); 
JOptionPane.showMessageDialog(this,"Inserted"); 
}catch(Exception e) 
{ 
System.out.println("Error"+e.getMessage()); 
} 
}
if(e2.getSource()==b2) 
{ 
try 
{ 
Object[] data=new Object[4]; 
DefaultTableModel dtm=new DefaultTableModel(); 
JTable jt=new JTable(dtm); 
ResultSet rs; 
System.out.println("hello"); 
jt.setBounds(20,20,50,50); 
String[] darr={"ID","Name","Description","Status"}; 
for(int column=0;column<4;column++)
dtm.addColumn(darr[column]);
Connection conn =DriverManager.getConnection("jdbc:postgresql://localhost/project","postgres","postgres");  
Statement st=conn.createStatement(); 
rs=st.executeQuery("select * from fields"); 
for(row=0;rs.next();row++)
for(int column=0;column<4;column++) 
{ 
data[column]=rs.getObject(column+1); 
} 
dtm.addRow(data); 
rs.close(); 
getContentPane().add(new JScrollPane(jt)); 
}catch(Exception e) 
{
} 
}
}
public static void main(String args[])
{
	new Project();
}
}


 
