package declaring_and_initializing_instance_variables;


public class PoorDogTestDrive{
	public static void main (String[] args) {
		PoorDog one = new PoorDog();
		
		//one.setName("fernando");
		//one.setSize(10);
		
		System.out.println("Dog size is " + one.getSize());
		System.out.println("Dog name is " + one.getName());
	}
}



