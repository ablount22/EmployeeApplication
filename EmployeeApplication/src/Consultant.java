
public class Consultant extends Employee {

	private int contractPeriodInMonths;

	public Consultant(String name, double salary, String ssn, int contractPeriodInMonths) {
		super(name, salary, ssn);
		this.contractPeriodInMonths = contractPeriodInMonths;
	}

	public int getContractPeriodInMonths() {
		return contractPeriodInMonths;
	}

	public void setContractPeriodInMonths(int contractPeriodInMonths) {
		this.contractPeriodInMonths = contractPeriodInMonths;
	}
	
	@Override
	
	double getPay() {
		//double money = this.salary / this.contractPeriodInMonths;
		return this.salary / this.contractPeriodInMonths;
	}

}