class PersonTestClass {
    public static void main(String[] args) {
        Person test = new Person();
		test.setPersonName("Vincent");
		test.setPersonBirthYear(1990);
		
		System.out.println("");
		System.out.println("");
		test.toStringPerson();
		
		System.out.println("");
		System.out.println("========================================");
		System.out.println("");
		
		
		InstructorClass testIns = new InstructorClass();
		testIns.setPersonName("Professor Hernandez");
		testIns.setPersonBirthYear(1950);
		testIns.setInstructorSalary(200000);
		testIns.toStringPerson();
		
		
		System.out.println("");
		System.out.println("========================================");
		System.out.println("");
		
		StudentClass testStu = new StudentClass();
		testStu.setPersonName("Good Student");
		testStu.setPersonBirthYear(2000);
		testStu.setStudentMajor("Software Engineer");
		testStu.toStringPerson();
	
	}
}