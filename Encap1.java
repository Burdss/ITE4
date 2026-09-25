public class Encap1{

	static class Employee{

		private String name;
		private int age;
		private long empID;

		public void setName(String name){
			this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setEmpID(long empID){
		this.empID = empID;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public long getEmpID(){
		return empID;
	}
}

public static void main(String[] args){
	Employee e = new Employee();

	e.setName("Richard");
	e.setAge(41);
	e.setEmpID(12465789);

	System.out.println("Employee's name: " + e.getName());
	System.out.println("Employee's age: " + e.getAge());
	System.out.println("Employee's ID: " + e.getEmpID());
}
}
