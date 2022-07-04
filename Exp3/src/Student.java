import java.util.*;

public class Student {
	String USN,name,address,category;
	int age;
	double s1,s2,s3,s4,s5,s6,s7,s8,cgpa;
	Scanner sc=new Scanner(System.in);
	
	public Student(String name,String usn,String addr,String cat,int age,double s1,double s2,double s3,double s4,double s5,double s6,double s7,double s8) {
		this.address = addr;
		this.name = name;
		this.USN = usn;
		this.age = age;
		this.category = cat;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
		this.s7 = s7;
		this.s8 = s8;
		
	}
	public void setCGPA(double g) {
		this.cgpa =g;
	}
	public String toString() {
		return "Name: "+name+" USN :"+USN+" Age :"+age+" address :"+address+" category :"+category+" CGPA :"+cgpa;
	}

}
