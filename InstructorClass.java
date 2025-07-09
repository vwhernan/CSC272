public class InstructorClass extends Person{
	private double Salary = 0;
	
	public InstructorClass(){
		super("", 0);
		Salary = 0;
	}
	
	public InstructorClass(String name, int birthyear, double salary){
		super(name, birthyear);
		this.Salary = salary;
	}
	
	public double getInstructorSalary(){
		return Salary;
	}
	
	public void setInstructorSalary(double salary){
		this.Salary = salary;
	}
	
	@Override
	public void toStringPerson(){
		System.out.println("I am an Instructor!");
		System.out.println("Named: " +  this.getPersonName());
		System.out.println("Born in: " + this.getPersonBirthYear());
		System.out.println("I make: $" + String.format("%.2f",this.Salary));
	}	
}