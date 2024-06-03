package CompanyDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class Company {

	public static void main(String[] args) {
		List<CompanyDetails> companyList=new ArrayList<CompanyDetails>();
		CompanyDetails c1=new CompanyDetails(101,"Wipro",20,100000);
		CompanyDetails c2=new CompanyDetails(105,"TCS",29,200000);
		CompanyDetails c3=new CompanyDetails(104,"TATA",10,900);
		CompanyDetails c4=new CompanyDetails(102,"Mahindra",8,3000);
		CompanyDetails c5=new CompanyDetails(103,"Bajaj",32,700000);
		companyList.add(new CompanyDetails(302,"Hp",36,40000));
		//companyList.add(c1);
		//companyList.add(c2);
		
		companyList.addAll(Arrays.asList(c1,c2,c3,c4,c5));
		

		Collections.sort(companyList, new MyComapanyComparator());
		
		for(CompanyDetails c:companyList)
		{
			System.out.println("CompanyId:"+c.getCompanyId() +"\nCompanyName:"+c.getCompanyName() +"\nCompanyPackage:"+c.getCompanyPackage()+"\nNoOfEmployee:"+c.getNoOfEmployee());
			System.out.println("***************************************************************************");
		}
		
		
		
		
		HashMap<Integer,String> hm=new HashMap<>();
		for(CompanyDetails com:companyList)
		{
			hm.put(com.companyId, com.companyName);
				
			}
		System.out.println(hm);
		}
	}

