
public class Intern extends Employee {
	
	private int hoursPerWeek;
	private String university;
	private boolean isPaid;
	
	public Intern(String name, double salary, String ssn, int hoursPerWeek, String university, boolean isPaid) {
		super(name, salary, ssn);
		this.hoursPerWeek = hoursPerWeek;
		this.university = university;
		this.isPaid = isPaid;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	
	public double getPay() {
		
		if(this.isPaid) {
			
			return this.salary* hoursPerWeek * 2;
		}
		
		else {
			return 0.0;
		}
		
	}
	
}
