package Getter.Setter;

public class Pojo_RunnerA {

	public static void main(String[] args) {
		Pojo_ClassA ob=new Pojo_ClassA();
		ob.setName("Jai");
		ob.setRollNo(144);
		String name=ob.getName();
		int rollNo=ob.getRollNo();
		
		System.out.println("Name is "+name);
		System.out.println("Roll No. is "+rollNo);
			}

}
