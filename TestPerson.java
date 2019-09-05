import java.util.Scanner;
/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("No of Person in register is: " + Person.getCounter());
		
		
		int size = 0;
		
		String nid = null;
		String firstName = null;
		String lastName = null;
		String dob = null;
		char gender = '-';
		double height = 0.0;
		double weight = 0.0;
		
		Scanner mykeyboard = new Scanner(System.in);
		
		
		System.out.println("Please enter weight: ");
		weight = mykeyboard.nextDouble();
				
		System.out.println("Please enter height: ");
		height = mykeyboard.nextDouble();
		
		
		System.out.println("Your BMI is: " + Person.calculateBmi(height, weight));
		
		
		/****************************************************************************************/
		
		/*create a first Person object*/
		Person p1 = new Person();//using default constructor
		System.out.println("No of Person in register is: " + Person.getCounter());
		
		System.out.println(p1.toString());//display a string representation of Person p1
		
		p1.setNid("uerh");
		
		p1.setfirstName("John");//change name of the person
		
		System.out.println(p1.toString());//display a string representation of Person p1
		
		
		p1.setHeight(170.50);// change the height of the person
		
		//get name and height of the Person p1
		System.out.println("Height of " + p1.getfirstName() + " is:" + p1.getHeight() );
		
		
		
		/********************************************************************************/
		
		/*creating another object of type Person*/
		Person p2 = new Person("16/08/19",2.5); //using overloaded 2args constructor
		p2.setfirstName("Sara");
		p2.setHeight(35.2);
		p2.setNid("hgshqsgdx");
		System.out.println("Height of " + p2.getfirstName() + " is :" + p2.getHeight());
		
		
		
		/*********************************************************************************/
		
		/*creating another object of type Person*/
		Person p3 = new Person("B01028200700B", "James", "Bond", "01/02/82", 'M', 190.70, 85.40);//using overloaded 7args constructor

		System.out.println(p3.toString());//display a string representation of Person P3
		
		/* update first and last name*/
		p3.setfirstName("Jay");
		p3.setlastName("kumar");
		System.out.println(p3.toString());
		
		System.out.println("BMI of " +  p3.getfirstName() + p3.getlastName() + " was " + p3.calculateBmi());
		
		
		
		/*now Jay Kumar becomes overweight*/
		p3.setWeight(105.2);
		System.out.println(p3.toString());
		
		System.out.println("BMI of " +  p3.getfirstName() + p3.getlastName() + " is now " + p3.calculateBmi());
	
	
	
		/********************************************************************************************************************************/
	
		if (p1.equals(p2)) {
			System.out.println("same person");
		}
		else {
			System.out.println("different person");
		}
	
		/********************************************************************************************************************************/
		
		
		
		
		
		
		
		System.out.println("Enter number of students: ");
		size= mykeyboard.nextInt();
		Person[] bdaStudents =  new Person[size];
		
		
		for(int i = 0; i< bdaStudents.length; i++) {
			
			System.out.println("Enter student " +(i+1)+ " NID:");
			nid = mykeyboard.next();
			
			System.out.println("Enter student" +(i+1)+ " First Name: " );
			firstName = mykeyboard.next();
			
			System.out.println("Enter student" +(i+1)+ " Last Name: ");
			lastName = mykeyboard.next();
			
			System.out.println("Enter student" +(i+1)+ " DOB: ");
			dob = mykeyboard.next();
			
			System.out.println("Enter student" +(i+1)+  " Gender: ");
			gender = mykeyboard.next().charAt(0);
			
			System.out.println("Enter student" +(i+1)+  " Height: ");
			height = mykeyboard.nextDouble();
			
			System.out.println("Enter student" +(i+1)+  " Weight: ");
			weight = mykeyboard.nextDouble();
			
			bdaStudents[i] = new Person( nid, firstName, lastName, dob, gender, height, weight);
			System.out.println(bdaStudents[i]);
			System.out.println("No of Person in register is: " + Person.getCounter());
			
		}
		
		
		
		
		
		for(int i = 0; i< bdaStudents.length; i++) {
			//bdaStudents[i].calculateBmi(height, weight);
			System.out.println(bdaStudents[i].calculateBmi());
			
			
		}
			
	
		System.out.println("No of Person in register is: " + Person.getCounter());
	
	
	
	
	
	
	}
	

}
