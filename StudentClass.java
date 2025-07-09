public class StudentClass extends Person{
	private String Major;
	
	public StudentClass(){
		super("", 0);
		Major = "Undecided";
	}
	
	public StudentClass(String name, int birthyear, String major){
		super(name, birthyear);
		this.Major = major;
	}
	
	public String getStudentMajor(){
		return Major;
	}
	
	public void setStudentMajor(String major){
		this.Major = major;
	}
	
	@Override
	public void toStringPerson(){
		System.out.println("I am an Student!");
		System.out.println("Named: " +  this.getPersonName());
		System.out.println("Born in: " + this.getPersonBirthYear());
		System.out.println("My Major is: " + this.Major);
	}	
}