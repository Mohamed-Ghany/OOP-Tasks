import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

//Create Object from the Circle Class using the constructor:	
//Then use Dot Operator [ .method();]to call the object method 
//print

public class Test {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome Customer...Please press \"Ok\" and follow the next Steps:");
//Create Joptionpane with name asking user to Enter count of students [in order to add this count in array]	
		String studentCountString =JOptionPane.showInputDialog("Please enter Students Count :");
		int studentCount =Integer.parseInt(studentCountString); //convert string to Int
		
//Create the 1st Array with name -"studentArray" - using "Student Class" to store the students count that user was entered in "studentCount"
		Student [] studentArray = new Student[studentCount];
		JOptionPane.showMessageDialog(null, " you Entered.."+studentCount+"..to Continue press \"Ok\""); //just to show count to user
		
//Then user should enter the Data of each Student depending on the students count array , So will use "for LooP" :		
		for (int i = 0; i < studentArray.length; i++) { // for loop to take Students' Data input with condition that Looping must be < students count that user has been entered before
			
			String studentName = JOptionPane.showInputDialog("Please Enter Student number "+(i+1)+" \"Name\" : ");
			String studentEmail = JOptionPane.showInputDialog("Please Enter Student number "+(i+1)+" \"Email\" : ");
			String studentPhoneString = JOptionPane.showInputDialog("Please Enter Student number "+(i+1)+" \"Phone\" : ");
			       int studentPhone = Integer.parseInt(studentPhoneString); //to Convert above carPriceString to Double
			String studentFaculty = JOptionPane.showInputDialog("Please Enter Student number "+(i+1)+" \"Faculty\" : ");

//Create student Object from the "Student Class" using the Four argument constructor:			
Student student =new Student(studentName,studentEmail,studentPhone,studentFaculty ); //Object from student class with name "student"
//==================
//Ask user to enter his subjects count +create subject Array+ then enter them one by one       
   String input = JOptionPane.showInputDialog("Is this student attended the Exam?\n  Yes        No ");
    if (input.toLowerCase().equals("yes") ) { // if he selected "Yes" complete the below :
    	
//Ask user to enter his subjects count +create subject Array+ then enter them one by one
         String subjectCountString =JOptionPane.showInputDialog("Please enter \"Subjects Count\" for Student number "+(i+1)+" :");
         int subjectCount =Integer.parseInt(subjectCountString); //convert string to Int
         
//create the 2nd Array with name "gradeDetails" - Using Grade Class- to store the Subject count that user was entered in "subjectCount"
 		Grade [] gradeDetails = new Grade[subjectCount];
 		JOptionPane.showMessageDialog(null, " you Entered.."+subjectCount+"..to Continue press \"Ok\""); //just to show count to user
 		
 		
	for (int j = 0; j < gradeDetails.length; j++) {
		String subjectName = JOptionPane.showInputDialog("Please Enter Subject number "+(j+1)+" \"Name\" : ");
		String subjectMarkString = JOptionPane.showInputDialog("Please Enter Subject number "+(j+1)+" \"Mark\" : ");
		     int subjectMark = Integer.parseInt(subjectMarkString);			
					
//Create Object from the "Grade Class" using the constructor:
		     Grade m =new Grade(subjectName,subjectMark);
		     gradeDetails[j]=m;		     
	}
		
//Then use Dot Operator [ .method();] to call the object method [ This Method Exist in "Student Class"	]		
	student.setGradeDetails(gradeDetails); //create object for Grade..i tell him to setGradeDetails on student Object then add it in the array
	
	}
	
	studentArray[i] =student; //add object car in the array
		}
//============================================
//Then after Getting all Data [ Student & grade ] Print all data: 
//Then will print the Result but will add all result in one String :
		
	String result = ""; //For Student Data
	String resultGrade = ""; // For Grade [ subject & Mark ]
    String excellenceResult= ""; // For Grade [ higher than 75 ]
	
//2-Create for loop similar to the 1st one , and already the Student Data was entered previously so i'll collect it via ".getName()....ETC" methods that is exist in "student Class" 
	for (int s = 0; s < studentArray.length; s++) {
		result +="Student Number "+(s+1)+" Name is : "+studentArray[s].getName()+"\n";
		result +="Student Number "+(s+1)+" Email is : "+studentArray[s].getEmail()+"\n";
		result +="Student Number "+(s+1)+" Phone is : "+studentArray[s].getPhone()+"\n";
		result +="Student Number "+(s+1)+" Faculty is : "+studentArray[s].getFaculty()+"\n";

//Then use if to determine is user entered/settled/updated a Subjects & Marks in " GradeDetails " array ? and if yes complete the steps till print it
//and to prevent exception Error "Exception in thread "main" java.lang.NullPointerException" to appear
		if(studentArray[s].getGradeDetails()!=null) {  //.getGradeDetails()!=null : means GradeDetails doesn't equal null so there are subject & Marks was entered.
			
			result +="   The Student Number "+(s+1)+" Grade Details is : \n";
			
		for (int j = 0; j < studentArray[s].getGradeDetails().length; j++) {
			result +="Subject number "+(j+1)+" is "+"("+studentArray[s].getGradeDetails()[j].getSubjectName()+")"+" with Mark: "+studentArray[s].getGradeDetails()[j].getMark()+"\n" ;
							
			if(studentArray[s].getGradeDetails()[j].getMark()>=75 ) {
				    excellenceResult +="Congratulation for :"+"("+studentArray[s].getName()+")"+" achieved \"Very Good\" in: "+studentArray[s].getGradeDetails()[j].getSubjectName()+" With Mark: "+studentArray[s].getGradeDetails()[j].getMark()+"\n";
			}
		}
		}
		result +="-------------------\n";
	}
	result+="----------------------------------\n"+excellenceResult;
			
	JOptionPane.showMessageDialog(null,result);

	}
}
