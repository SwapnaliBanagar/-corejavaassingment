package CompanyDetails;

import java.util.Comparator;

public class MyComapanyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		CompanyDetails c1=(CompanyDetails) o1;
		CompanyDetails c2=(CompanyDetails) o2;
		return Integer.compare(c1.getCompanyId(), c2.getCompanyId());
		}

}
