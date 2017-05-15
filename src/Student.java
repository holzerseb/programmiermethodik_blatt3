/**
 * This is a class for students
 */
public class Student
{
/* Members 'n Properties */
	private long id;
	private String firstname;
	private String lastname;
	
	/**
	 * @return the id of the student as 'long'
	 */
	public long getId()
	{
		return this.id;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return this.lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return this.firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
/* Constructors */

	/**
	 * @param studentId Die Id
	 */
	public Student(int studentId)
	{
		this.id = studentId;
	}
	
	/**
	 * @param studentId Die Id,
	 * @param firstname Der Vorname
	 * @param lastname Der Nachname
	 */
	public Student(int studentId, String firstname, String lastname)
	{
		this.id = studentId;
		this.setFirstname(firstname);
		this.setLastname(lastname);
	}
	
/* Methods */
	
	/*
	 * @param student Der Student, den wir mit this vergleichen wollen
	 */
	public boolean equals(Student student)
	{
		if(this == student) //obvious
			return true;
		
		if(student == null) //obvious as well
			return false;
		
		if(!(student instanceof Student)) //checks, if the given student is an instance of Student, returns false if not
			return false;					//or if the actual object behind the reference to student is of a superclass
				//so if there would also be a class "Informatik-Studenten", which is a sub-class of Student, we could
					//check for (student instanceof Informatik-Student) and if the student is actually a Informatik-Student (but
						//got castet to a Student (equal to (Number)Integer -> Number)) it returns true
		
		Student other = student;
		if(this.id != other.id) //I don't see why we would need a new local Student, but okay
							//Guess       if(this.id != student.id)     would do the job as well...
			return false;
		
		return true;
	}
}
