/**
 * 
 */

/**
 * @author Kesaven
 *
 */
public class Person {
	
	/*static attributes*/
	private static int counter =0;
	
	/*attributes*/
	private String nid;
	private String firstName;
	private String lastName;
	private String dob;
	private char gender;
	private double height;
	private double weight;
	

	
	/*constructor*/
	
	
	/**
	 * Default constructor
	 */
	public Person() {
		this.nid = null;
		this.firstName = null;
		this.lastName = null;
		this.dob = null;
		this.gender = '-';
		this.height = 0.0;
		this.weight = 0.0;
		
		setCounter(getCounter() + 1);//incrementing the count to track num of objects created
	}
	
	/**
	 * overloaded 2 parameter constructor
	 * @param dob of person
	 * @param weight of person
	 */
	public Person(String dob, double weight) {
		this.dob = dob;
		this.weight = weight;
		
		setCounter(getCounter() + 1);//incrementing the count to track num of objects created
		
	}
	
	  
	
	/**
	 * overloaded constructor with 7 parameters
	 * @param nid
	 * @param firstName
	 * @param lastName
	 * @param dob
	 * @param gender
	 * @param height
	 * @param weight
	 */
	public Person(String nid, String firstName, String lastName, String dob, char gender, double height, double weight) {
		
		this.nid = nid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		
		
		setCounter(getCounter() + 1);//incrementing the count to track num of objects created
	
	
	}
	
	
	/*behaviors*/
	
	
	/**getters*/
	
	
	
	/**
	 * method to calculate bmi using static method
	 * @param height
	 * @param weight
	 * @return
	 */
	
	public static double calculateBmi(double height, double weight) {
		//return ( (weight) / (height*height))
		
		/* convert height from cm to m*/
		
		return (weight / Math.pow((height/100), 2));
	}
	
	
	
	
	
	/**
	 * Method to return bmi of a person
	 * @param height of the person
	 * @param weight of the person
	 * @return bmi
	 */
	public double calculateBmi() {
		//return ( (weight) / (height*height))
		
		/* convert height from cm to m*/
		
		return (this.weight / Math.pow((this.height/100), 2));
	}
	
	/**
	 * method to return firstName
	 * @return first name
	 */
	public String getfirstName() {
		return this.firstName;
	}
	
	
	public String getlastName() {
		return this.lastName;
	}
	
	/**
	 *method to return gender 
	 * @return gender
	 */
	public char getGender() {
		return this.gender;
	}
	
	
	
	/**
	 * method to return nid of a person
	 * @return nid
	 */
	public String getNid() {
		return this.nid;
	
	}
	
	
	/**
	 * method to get weight 
	 * @return weight
	 */
	public double getWeight() {
		return this.weight;
	}
	
	/**
	 * method to return of the person
	 * @return height
	 */
	public double getHeight() {
		return this.height;
	}
	
	
	/*setters*/
	
	/**
	 * method to return nid
	 * @param nid of person
	 */
	public void setNid(String nid) {
		this.nid = nid;
	}
	
	/**
	 * method to return firstName
	 * @param firstName
	 */
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * method to return lastName
	 * @param lastName
	 */
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * method to return gender
	 * @param gender
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	/**
	 * method to return weight
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * method to return height
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	

	@Override
	public String toString() {
		return "Person [nid=" + nid + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	
	/**
	 * a method to compare if two person objects are the same based on their NID
	 * @param p is the other Person with whom we are trying to compare
	 * @return true if they are the same
	 */
	
	public boolean equals(Person p) {
		if(this.nid.equalsIgnoreCase(p.nid)) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * @return the counter
	 */
	public static int getCounter() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 */
	public static void setCounter(int counter) {
		Person.counter = counter;
	}
	
	
	
	
	
	
	
	
	
	
}
