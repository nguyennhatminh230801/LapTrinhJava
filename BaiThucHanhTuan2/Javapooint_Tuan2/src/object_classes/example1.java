package object_classes;

// Chương trình java minh họa lớp và các thuộc tính
// Định nghĩa 1 lớp Student
class Student{  
	//định nghĩa các thuộc tính
	int id;
	String name;  

}  
public class example1 {
	public static void main(String args[]){  
		Student s1=new Student();//tạo 1 đối tượng Student
		
		//in ra giá trị
		System.out.println(s1.id);
		System.out.println(s1.name);  
	}  
}
