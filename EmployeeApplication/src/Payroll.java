import java.util.Scanner;

public class Payroll {
	
    static Employee [] employees = new Employee [6]; //creating an array with an index of 6 employees 
    
	static String printMenu() { //print menu statement
		return "Employee types\n\t1. Full-time" + 
	           "\n\t2. Part-time\n\t3. Intern\n"+ 
			   "\n\t4. Consultant" +
	           "\n\t0. Exit system";	
	} 
	
	public static void main(String[] args) {
		
	int index = 0;
	int userChoice;
	Scanner input =new Scanner(System.in); //creating user input

	String name;
	String ssn;
	double salary;
	int hoursPerWeek;
	String university;
	boolean paid;
	int contractPeriodInMonths;
	
	do {
		
		userChoice = input.nextInt();
		input.nextLine();
		
		if(userChoice == 1) { //Full-time
			System.out.println("What is the name of the employee?");
			name = input.nextLine();
			
			System.out.println("What is the employee's SSN");
			ssn = input.nextLine();
			
			System.out.println("What is the employee's salary?");
			salary = input.nextDouble();
			
			employees [index] = new FullTime(name, salary, ssn);
			index++;
			
		}
		else if(userChoice == 2) { //Part-time
			System.out.println("What is the name of the employee?");
			name = input.nextLine();
			
			System.out.println("What is the employee's SSN");
			ssn = input.nextLine();
			
			System.out.println("What is the employee's salary?");
			salary = input.nextDouble();
			
			System.out.println(" How many hours per week does the employee work?");
			hoursPerWeek = input.nextInt();
			
			employees [index] = new PartTime(name, salary, ssn, hoursPerWeek);
			index++;
		}
		
		else if(userChoice == 3) { //Intern
			System.out.println("What is the name of the employee?");
			name = input.nextLine();
			
			System.out.println("What is the employee's SSN");
			ssn = input.nextLine();
			
			System.out.println("What is the employee's salary?");
			salary = input.nextDouble();
			
			System.out.println(" How many hours per week does the employee work?");
			hoursPerWeek = input.nextInt();
			
			System.out.println(" Which university does the employee study at?");
			university = input.nextLine();
			
			System.out.println("Is this internship paid?");
			paid = input.nextBoolean();
			
			employees [index] = new Intern(name, salary, ssn, hoursPerWeek, university, paid);
			index++;
		}
		
		else if(userChoice == 4) { //Consultant
			System.out.println("What is the name of the employee?");
			name = input.nextLine();
			
			System.out.println("What is the employee's SSN");
			ssn = input.nextLine();
			
			System.out.println("What is the employee's salary?");
			salary = input.nextDouble();
			
			System.out.println(" How many hours per week does the employee work?");
			hoursPerWeek = input.nextInt();
			
			System.out.println(" Which university does the employee study at?");
			university = input.nextLine();
			
			System.out.println("How many months of contract?");
			contractPeriodInMonths = input.nextInt();
			
			employees [index] = new Consultant(name, salary, ssn, contractPeriodInMonths);
			index++;
		}
		
	}while(userChoice !=0 && index !=6);
	
	for(int i = 0; i < index; i++) {
		System.out.println(employees[i].getEmployeeId() + " : " +employees[i].getPay());
		System.out.println(employees[i]);
	}
	input.close();} 
} 
