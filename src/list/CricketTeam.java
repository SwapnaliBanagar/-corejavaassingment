package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class IndiaPlayer{
	int jerseyNumber;
	String name;
	String lastName;
	long totalRuns;


	public IndiaPlayer(int jerseyNumber,String name, String lastName,long totalRuns)
	{
		this.jerseyNumber=jerseyNumber;
		this.name=name;
		this.lastName=lastName;
		this.totalRuns=totalRuns;
	}
}
class AustraliaPlayer{
	int jerseyNumber;
	String name;
	String lastName;
	long totalRuns;


	public AustraliaPlayer(int jerseyNumber,String name, String lastName,long totalRuns)
	{
		this.jerseyNumber=jerseyNumber;
		this.name=name;
		this.lastName=lastName;
		this.totalRuns=totalRuns;
	}
}



public class CricketTeam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Team Name");
		String name=sc.nextLine();

		List<IndiaPlayer>listIndia=new ArrayList<>();
		IndiaPlayer p1=new IndiaPlayer(7, "MS", "Dhoni", 50000);
		IndiaPlayer p2=new IndiaPlayer(45, "Rohit", "Sharma", 40000);
		IndiaPlayer p3=new IndiaPlayer(18, "Virat", "Kohali", 40000);
		IndiaPlayer p4=new IndiaPlayer(8, "Ravindra", "Jadeja", 20000);
		listIndia.add(p1);
		listIndia.add(p2);
		listIndia.add(p3);
		listIndia.add(p4);
		if(name.equalsIgnoreCase("India"))
		{
			for(IndiaPlayer p:listIndia)
			{
				System.out.println("JerseyNumber:"+p.jerseyNumber+"  "+"Name:"+p.name+"  "+"LastName:"+p.lastName+"  "+"Total Runs:"+p.totalRuns);
				System.out.println("________________________________________________________________________________________________________________");
			}


		}
		else if(name.equalsIgnoreCase("Australia"))
		{
			List<AustraliaPlayer>listAustralia=new ArrayList<>();

			AustraliaPlayer ap1=new AustraliaPlayer(31, "David", "Warner", 10000);
			AustraliaPlayer ap2=new AustraliaPlayer(32, "Mitchell", "Marsh", 80000);
			AustraliaPlayer ap3=new AustraliaPlayer(18, "Glenn", "Maxwell", 30000);
			AustraliaPlayer ap4=new AustraliaPlayer(88, "Adam", "Zampa", 20000);
			listAustralia.add(ap1);
			listAustralia.add(ap2);
			listAustralia.add(ap3);
			listAustralia.add(ap4);

			for(AustraliaPlayer p:listAustralia)
			{
				System.out.println("JerseyNumber:"+p.jerseyNumber+"  "+"Name:"+p.name+"  "+"LastName:"+p.lastName+"  "+"Total Runs:"+p.totalRuns);
				System.out.println("________________________________________________________________________________________________________________");
			}
		}
		sc.close();
	}

}







