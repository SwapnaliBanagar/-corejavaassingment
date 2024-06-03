package CompanyDetails;

public class CompanyDetails {
	
	int companyId;
	String companyName;
	double companyPackage;
	long noOfEmployee;
	
	
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getCompanyPackage() {
		return companyPackage;
	}
	public void setCompanyPackage(double companyPackage) {
		this.companyPackage = companyPackage;
	}
	public long getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(long noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	
	

	public CompanyDetails(int companyId, String companyName, double companyPackage, long noOfEmployee) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyPackage = companyPackage;
		this.noOfEmployee = noOfEmployee;
	}
	
	
	public CompanyDetails() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
