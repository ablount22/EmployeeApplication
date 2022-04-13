
public class PartTime extends Employee {

	private int hoursPerWeek;

	public PartTime(String name, double salary, String ssn, int hoursPerWeek) {
		super(name, salary, ssn);
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	
	public double getPay() {
		//double biWeekly;
		//biWeekly = this.salary * this.hoursPerWeek * 2;
		return this.salary * this.hoursPerWeek * 2;
	}
}
