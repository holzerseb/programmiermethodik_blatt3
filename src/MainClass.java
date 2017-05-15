/**
 * The Main-Stuff
 */
public class MainClass
{
	
	public static void main(String[] args)
	{
		//Create two Professors
		System.out.println("[INFO] Creating Professors...");
		Professor stacy = new Professor("Stacy", "Sabrent");
		Professor bobby = new Professor("Bob", "Builder", 32000);
		bobby.setMaxAnnualSalary(50000); //cuz otherwise he will be earning 0
		
		//Next we need a room ;)
		System.out.println("[INFO] Creating Room...");
		Room myRoom = new Room(14, 40);
		
		//And a course
		System.out.println("[INFO] Creating Course...");
		Course myCourse = new Course(301, myRoom, bobby);
		myCourse.setName("Programmiermethodik");
		
		//Now create some inquisitive students
		System.out.println("[INFO] Creating Students and adding them to the course...");
		for(int id = 10; id < 40; id++)
			myCourse.addStudent(new Student(id));
		
		
		//Check for some raise
		System.out.println("[INFO] Raise Bobbys salary...");
		if(myCourse.getStudentAmount() > 25)
			myCourse.getProfessor().raisePayout(90.09009009009009d); //with the given formula ((100*Gehalt)/Param), you cannot
																	//simply hand 11%, but have to calculate this value
		/* Answer to Question:
		 * 	You probably want to place this if-statement inside the addStudent-Method, whereas you have to keep track
		 * 	about, whether the professor already got a raise or not - otherwise he would get multiple raises */
		
		
		//Check for even more raise
		System.out.println("[INFO] Raise Bobbys salary even more...");
		if(bobby == myCourse.getProfessor())
			bobby.raisePayout(79.87220447284345); //same again, raises his Salary by 25,2%
		
		/* Answer:
		 * 	I actually had some troubles to understand this task, since (according to the previous tasks) a
		 * 	professor doesn't have a member to know which courses he holds (or holds one at all)
		 * 
		 * 	So my solution would been to add a list of courses to the professor-class, and as long as there is atleast
		 * 	one course, bobby gets a raise
		 *  */
		
		
		//Create three students
		System.out.println("[INFO] Create more students...");
		Student s1 = new Student(100, "Johnny", "Depp");
		Student s2 = new Student(100, "Mary", "Poppins");
		Student s3 = new Student(101, "Mary", "Poppins");
		
		//Check how many students are in the course
		System.out.println("[INFO] Printing the amount of students in this course...");
		MainClass.checkStudentsAmount(myCourse);
		
		//Add the three students
		System.out.println("[INFO] Adding a student to the course...");
		myCourse.addStudent(s1);
		System.out.println("[INFO] Adding a student to the course...");
		myCourse.addStudent(s2);
		System.out.println("[INFO] Adding a student to the course...");
		myCourse.addStudent(s3);
		
		//Check how many students are in the course AGAIN
		System.out.println("[INFO] Printing the amount of students in this course...");
		MainClass.checkStudentsAmount(myCourse);
		System.out.println("[CHECK] What do you see? (Question from the task)");
		
		//Print salaries of professors
		System.out.println("[INFO] Printing the salary of a professor...");
		MainClass.printProfessorSalary(stacy);
		System.out.println("[CHECK] What do you see? (Question from the task)");
		System.out.println("[INFO] Printing the salary of a professor...");
		MainClass.printProfessorSalary(bobby);
		System.out.println("[CHECK] What do you see? (Question from the task)");
		
		//Check Students Equality
		System.out.println("[INFO] Check students equality...");
		System.out.println(String.format("%s and %s are equal: %b", s1.toString(), s2.toString(), s1.equals(s2)));
		System.out.println("[CHECK] What do you see and why? (Question from the task)");

		//Check other Students Equality
		System.out.println("[INFO] Check students equality...");
		System.out.println(String.format("%s and %s are equal: %b",
				s2.getFirstname() + " " + s2.getLastname(), s3.getFirstname() + " " + s3.getLastname(), s2.equals(s3)));
		System.out.println("[CHECK] What do you see and why? (Question from the task)");
		
		//make mary poppins an object
		System.out.println("[INFO] Printing Mary Poppins as an object...");
		System.out.println(s1);
		System.out.println("[CHECK] What do you see and why? (Question from the task)");
		
		
		/* OLD PART, IGNORE THIS, I WAS NOT ALLOWED TO DELETE IT; */
		if(true)
			return; //had to wrap around an if, because i hate eclipse and his "unreachable code"
		
		//Create two students
		System.out.println("[INFO] Creating Students...");
		Student studentOne = new Student(12345, "Krea", "Tive");
		Student studentTwo = new Student(12346, "Nam", "Ensgebung");
		
		//Initialize the course
		System.out.println("[INFO] Setting up Course 'Programmiermethodik' with maximum 3 students...");
		Course mainCourse = new Course();
		mainCourse.setName("Programmiermethodik");
		mainCourse.setMaxStudents(3);

		//check how many students are in the course
		System.out.println("[CHECK] Verify that course is empty:");
		MainClass.checkStudentsAmount(mainCourse);
		
		//add our students
		System.out.println("[INFO] Adding a student to the course...");
		mainCourse.addStudent(studentOne);
		System.out.println("[INFO] Adding a student to the course...");
		mainCourse.addStudent(studentTwo);
		
		//and check again
		System.out.println("[CHECK] Verify that course contains two students:");
		MainClass.checkStudentsAmount(mainCourse);
		
		//print this courses students
		System.out.println("[IFNO] Printing the students of the course...");
		mainCourse.printStudents();
		
		//delete one of those poor guys
		System.out.println("[INFO] Removing a student from the course...");
		mainCourse.removeStudent(studentOne); //I didn't like 'Krea' anyway
		
		//and print students again to verify Krea isn't here anymore
		System.out.println("[IFNO] Printing the students of the course...");
		System.out.println("[CHECK] Verify that 'Krea' isn't visiting this course anymore:");
		mainCourse.printStudents();
	}
	
	/**
	 * Checks, how many students are in a course and prints the results
	 * 
	 * @param course
	 */
	private static void checkStudentsAmount(Course course)
	{
		/* Note: the name checkStudentsAmount does not imply to print something - but maybe we will change the usage
		 * of this method and won't print something in the future, which makes the name suit better imo */
		System.out.println(String.format("There are %d students in the course '%s'", course.getStudentAmount(), course.getName()));
	}
	
	/** Prints the salary of the professor and his name
	 * 
	 * @param professor the professor
	 * */
	private static void printProfessorSalary(Professor prof)
	{
		System.out.println(String.format("Prof. %s currently earns € %.2f", prof.toString(), prof.getSalary()));
	}

}
