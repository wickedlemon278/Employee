package Employee;
import java.util.Scanner ;

public class employee {
	public static String employeeName;
	public static String employeeID;
	public static String employeeDepartment;
	public static String employeePosition;
	static String str1 = "s";
	static String str2 = "e";
	public static int flag = 0;
	
	 public static void intro(){
		 System.out.println("***********  Welcome To Employee Detail System *********");
			System.out.println("Select the working mode:");
			System.out.println("1) Press 's' (set)for setting details of the employee \n2) Press 'e' (exit) to exit programm");
			coreFunction();
	 }
	 public static void coreFunction(){
		 setDetails set = new setDetails() ; 
			getDetails get = new getDetails();
			Scanner inputCommand  = new Scanner (System.in);
			String input = inputCommand.nextLine();
			int compareResult = input.compareTo(str1);
			if (compareResult == 0){
				System.out.println(" INPUT COMMAND : 'S' ");
				System.out.println("Enterring SET Command Mode........... ");
				System.out.println("Enter the Name of the emoloyee :");
				String inputName = inputCommand.nextLine();
				set.setEmployeeName(inputName);
				System.out.println("Enter the Emplyoee ID of the emoloyee :");
				String inputID = inputCommand.nextLine();
				set.setEmployeeID(inputID);
				System.out.println("Enter the Department of the employee");
				String inputDepartment = inputCommand.nextLine();
				set.setEmployeeDepartment(inputDepartment);			
				System.out.println("Enter the Position of the employee");
				String inputPosition = inputCommand.nextLine();
				set.setEmployeePosition(inputPosition);
				System.out.println("ALL SET  !!!! \n");
				System.out.println("1) press 'S' (set)for setting details of the employee \n 2). press 'v'(view) to view details of the employee");
				String inputCommand2 = inputCommand.nextLine();
				int compareResult_2 = inputCommand2.compareTo(str1);
				if(compareResult_2 == 0){
					coreFunction();
				}
				else {
					System.out.println("NAME\t\t:"+get.getEmployeeName());
					System.out.println("ID\t\t:"+get.getEmployeeID());
					System.out.println("DEPARTMENT\t:"+get.getEmployeeDepartment());
					System.out.println("POSITION\t:"+get.getEmployeeposition());
					intro();
					}
			}
			else {
				System.out.println("INPUT COMMAND : 'E' ");
				System.out.println("EXITING .....");
				
			} 
			 
	 }
	
	public static void main(String[] args){
		intro();	
	}
}

abstract class setget extends employee{
	public abstract void setEmployeeName(String givenName);
	
	public abstract void setEmployeeID(String givenID);
	
	public abstract void setEmployeeDepartment(String givenDepartment);
	
	public abstract void setEmployeePosition(String givenPosition);
	
	public abstract String getEmployeeName();
	
	public abstract String getEmployeeID();
	
	public abstract String getEmployeeDepartment();
	
	public abstract String getEmployeeposition ();

}

 class setDetails extends setget{
    
	public  void setEmployeeName(String givenName){
    	employeeName=givenName;
    }
	
	public void setEmployeeID(String givenID){
		employeeID=givenID;
	}
	
	public void setEmployeeDepartment(String givenDepartment){
		employeeDepartment = givenDepartment;
	}
	
	public void setEmployeePosition(String givenPosition){
		employeePosition=givenPosition;
	}
	
}

  class getDetails extends setget{

	public String getEmployeeName(){
		return employeeName;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	
	public  String getEmployeeDepartment(){
		return employeeDepartment;
	}
	
	public String getEmployeeposition (){
		return employeePosition;
	}

}
 