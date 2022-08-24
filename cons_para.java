package constructor;

public class cons_para {
	int empno,age;
	String name,job;
	//constructor
	public cons_para(int eno,int age ,String name , String job) {
		this.empno=eno;
		this.name=name;
		this.age=age;
		this.job=job;	
	}
	public void display() {
		System.out.println(empno);
		System.out.println(age);
		System.out.println(name);
		System.out.println(job);
		
	}
	
	public static void main(String[] args) {
		cons_para obj = new cons_para(101,30,"kiran","google");
		System.out.println(obj.name);
		obj.display();
		cons_para obj1 = new cons_para(102,30,"kajal","hwaie");
		System.out.println(obj1.job);
		obj1.display();
	}
	

}
