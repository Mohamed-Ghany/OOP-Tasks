//(name , email, phone, faculty , Grade[] grades ) 
public class Student {
//Create Data Field
	private String name;
	private String email;
	private int phone;
	private String faculty;
	private Grade [] gradeDetails; //Array of Grade
//==============================================
//Create constructors 
	public Student() {  //default constructor
		super();
	}

public Student(String name, String email, int phone, String faculty, Grade[] studSubject) { //five argument constructor
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.faculty = faculty;
	this.gradeDetails = gradeDetails;
}

public Student(String name, String email, int phone, String faculty) {  //four argument constructor
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.faculty = faculty;
}

public Student(String name, String email, String faculty) {  //Three argument constructor
	super();
	this.name = name;
	this.email = email;
	this.faculty = faculty;
}

public Student(String name, String faculty) {  //Two argument constructor
	super();
	this.name = name;
	this.faculty = faculty;
}

public Student(String name) {  //One argument constructor
	super();
	this.name = name;
}
//==============================================
//Create Getter & Setter 	

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getPhone() {
	return phone;
}

public void setPhone(int phone) {
	this.phone = phone;
}

public String getFaculty() {
	return faculty;
}

public void setFaculty(String faculty) {
	this.faculty = faculty;
}

public  Grade[] getGradeDetails() {
	return gradeDetails;
}

public void setGradeDetails(Grade[] gradeDetails) {
	this.gradeDetails = gradeDetails;
}


}
	


