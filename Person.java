public class Person{
	private String Name;
	private int BirthYear;
	
	public Person(){
		Name = "";
		BirthYear = 0;
	}
	
	public Person(String name, int birthyear ){
		this.Name = name;
		this.BirthYear = birthyear;
	}
	
	public String getPersonName(){
		return Name;
	}
	
	public int getPersonBirthYear(){
		return BirthYear;
	}
	
	public void setPersonName(String name){
		this.Name = name;
	}
	
	public void setPersonBirthYear(int birthyear){
		this.BirthYear = birthyear;
	}
	
	public void toStringPerson(){
		System.out.println("I am a Person!");
		System.out.println("Named: " +  this.Name);
		System.out.println("Born in: " + this.BirthYear);
	}
}