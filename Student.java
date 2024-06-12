package may2024;

public class Student {
	// attributes(variable) - instance variable, local variable , static variable	
			public String stdNames;
			public int rollNo;
			public String address;
			private int phoneNo;
			private String emailId;
			
			Student(){
				System.out.println("constructor");
				
			}
			// methods , functions
			
			public void displayDetails() {
				System.out.println("StudentName: "+ stdNames);
				System.out.println("RollNo: "+ rollNo);
				System.out.println("Address: "+ address);
				System.out.println("PhoneNo "+ phoneNo);
				System.out.println("EmailId "+ emailId);
			}

}
