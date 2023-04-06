package serialization;

import java.io.*;
/* used with data members of class in order to avoid serialization*/
class Demo implements Serializable{
	transient int id; // by using transient Keyword id will not showing in the console
	transient String name;
	transient int age;
	public Demo(int i, String n,int f) {
		this.id=i;
		this.name=n;
		this.age=f;
	}
}
public class TransientEx {
	public static void main(String[] args) throws Exception{
		Demo obj= new Demo(101,"Hemant",25);
		//In this part we can Serialize data from Object stream to byte stream
		FileOutputStream f=new FileOutputStream("H://hemant.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(obj);
		o.flush();
		o.close();
		f.close();
		System.out.println("The Data Write in the File...");
		
		//In this part we can Deserialize data from byte stream to Object 
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("H://hemant.txt"));
		Demo obj1= (Demo)oi.readObject();
		System.out.println("Data from the file is: "+obj1.id+" "+obj1.name+" "+obj1.age);
		oi.close();
		}
	

}