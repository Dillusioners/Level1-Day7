/*
	Author - Debag101
	Desc - Lvl1Day7 SuperB prog number 2
	Date - 1.5.23
*/

import java.io.*;
import java.util.*;
class Sales
{
	//Displaying company name

	public static void display(String companyStr)
	{
		String displayStr = String.format("Welcome to %s",companyStr);
		System.out.println("##############################");
		System.out.println("  " + displayStr);
		System.out.println("##############################\n");
	}

	public static void main(String[] args)throws IOException {

		//Taking sales number input
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		//Creating HashMap to store data
		HashMap<String,Double> map = new HashMap<>();
		//Variables for running the code

		String saleName;
		//Sale and counter
		int sales, i=1;
		//Money related vars
		double cost, discount, totalCost = 0;
		//Getting name of company
		System.out.println(">> Enter the name of the company :  ");
		String company = rd.readLine();
		display(company);
		//Displaying company name
		try{
			//Asking for number of sales
			System.out.println("How many sales did you have ?: ");
			sales = Integer.parseInt(rd.readLine());
			//Iterating on number of sales and storing names : cost - discount in map
			while(i <= sales)
			{
				//Taking some more input
				System.out.println("What is the name of your product numbered " + i);
				saleName = rd.readLine();
				System.out.println("What is the cost price of the " + saleName);
				cost = Double.parseDouble(rd.readLine());
				System.out.println("Enter discount on product. If none enter 0");
				discount = Double.parseDouble(rd.readLine());
				//If discount is -ve
				if(discount < 0)
					{
						System.out.println("Discount can't be -ve sir!");
					}
				else
				{
					//If discount >= 0
					cost -= (discount / 100)*cost;
					totalCost += cost;
					//Putting data in map
					map.put(saleName,cost);
					++i;
				}


			}
			//Catching some exceptions
		}catch(Exception e)
		{
			System.out.println("Something went wrong : (");
		}
		System.out.println("Your costs in accordance to their sale numbers are : ");
		System.out.println(map);
		//Finishing code
		System.out.println("Accumulated Cost is : " + totalCost);

	}
}