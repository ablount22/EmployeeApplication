
public class FullTime extends Employee{

	public FullTime(String name, double salary, String ssn) {
		super(name, salary, ssn);
	}

	 double calculateBonus() {
		//double money;
		//money = this.salary * 15/100;
		return this.salary * 0.15;
	
	}
	 
	 @Override
	 double getPay() {
		 //double salaries;
		 //salaries = this.salary / 26;
		 return this.salary / 26;
	 }
}

