import java.util.Map;  
import java.util.HashMap;  
import java.util.TreeMap;  
import java.util.Iterator;  
public class ass1setb2
{  
public static void main(String args[])  
{  

HashMap<Integer, String> hm=new HashMap<Integer, String>();  

hm.put(23, "Yash");  
hm.put(17, "Arun");  
hm.put(15, "Swarit");  
hm.put(9, "Neelesh");  
Iterator <Integer> it = hm.keySet().iterator();         
System.out.println("Before Sorting");  
while(it.hasNext())  
{  
int key=(int)it.next();  
System.out.println("key:"+key+"\tvalue:"+hm.get(key));  
}  
System.out.println("\n");  
Map<Integer, String> map=new HashMap<Integer, String>();  
System.out.println("After Sorting");  

TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);  
Iterator itr=tm.keySet().iterator();               
while(itr.hasNext())    
{    
int key=(int)itr.next();  
System.out.println("key:"+key+"\tvalue:"+hm.get(key)); 
}    
}  
}  
