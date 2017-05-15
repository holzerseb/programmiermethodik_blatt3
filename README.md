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

_________________________

Hab leider zu spät gelesen, dass wir das als Text-datei abgeben sollen, daher lass ich die 
Comments mal drinnen.

_________
ANTWORT:
_________

Okay, das erste ist selbsterklärend... Es werden die Referenzen verglichen
Beim zweiten if wird geprüft, ob der übergebene Student null ist, damit sind sie nicht gleich

Beim dritten hingegen kommt ein neues Schlüsselwort hinzu: instanceof
Dabei wird geprüft, ob der student auch wirklich eine Instanz der Klasse Student ist,
bzw. eine Instanz einer Subklasse von Student.
Ist es keine Instanz von Student, können sie auch nicht gleich sein.

Theoretisch wäre es aber möglich, dass der Student einer Subklasse angehört (zb. Informatik-Student),
dann würde student instanceof Student trotzdem true zurückgeben.

Zum Schluss weisen wir den Student einer lokalen Variable "other" zu - aus welchem
Grund auch immer - und prüfen die Id des lokalen Studenten mit der id von this (diesem student)
Sind die Ids verschieden, können die Studenten nicht gleich sein.