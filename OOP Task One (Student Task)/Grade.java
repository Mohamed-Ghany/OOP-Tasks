//SubName - Mark
public class Grade {
//Create Data Field
	 private String subjectName;
	 private int mark;
//==============================================
//Create constructors 	 
	public Grade() {
		super();
	}
	public Grade(String subjectName, int mark) {
		super();
		this.subjectName = subjectName;
		this.mark = mark;
	}
	
//==============================================
//Create Getter & Setter 
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getMark() {
		
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}	  	
	
}

