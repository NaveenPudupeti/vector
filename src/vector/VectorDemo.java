package vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



Vector<student> v = new Vector<>();

student s1 = new student(12,"Naveen","Kadapa");
student s2 = new student(13,"Sai","krishnagiri");
student s3 = new student(15,"Kumar","Vellore");

v.add(s1);
v.add(s2);
v.add(s3);

for(student s : v) {
	System.out.println(s.rollno+" "+s.name+" "+s.address);
}
	}

}

 class student{
	 
	 int rollno;
	 String name,address;
	 
	 student(int rollno,String name,String address){
		 this.rollno = rollno;
		 this.name = name;
		 this.address = address;	 
	 }
 }