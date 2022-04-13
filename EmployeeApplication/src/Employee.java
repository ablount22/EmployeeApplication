
public abstract class Employee {

	protected String name;
	protected double salary;
	protected String ssn;
	protected final int employeeId;
	protected static int nextId = 1;

	public Employee(String name, double salary, String ssn) {
		super();
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
		this.employeeId = nextId++;

	}

	public int getEmployeeId() {
		return employeeId;
	}

	@Override

	public String toString() {
		return "Employee Name: " + this.name + "Employee Salary: " + this.salary + "Employee SSN: " + this.ssn;
	}

	abstract double getPay();
}
