/*
 below 100  -   1.5 per unit   100*1.5
 101 - 200  -   2 per unit     100*2
 201 - 300  -   2.5 per unit   75*2.5
 more 301  -    3 per unit
 
 fixed meter charges 100Rs
 
 Dues -300
 Usage Charges  
 Tax(5%)
 Fixed Meter Charges
 Total Payable
 Due Date
 If Paid After Due Date 
 
 */
package day1;

import java.util.Scanner;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Units consumed");
		int units=sc.nextInt();
		double usageAmount=getUsageAmount(units);
		double taxAmount=usageAmount*0.05;
		double fixedMeterCharges=100;
		double totalPayable=usageAmount+taxAmount+fixedMeterCharges;
		System.out.println(totalPayable);
	}
	
public static double getUsageAmount(int units)
{
	double usageAmount;
	if(units<100)
	{
		usageAmount=units*1.5;
	}
	else if(units>100 && units<200)
	{
		usageAmount=100*1.5 + (units-100)*2;
	}
	else if(units>200 && units<300)
	{
		usageAmount=100*1.5 + 100*2 + (units-200)*2.5;
	}
	else
	{
		usageAmount=100*1.5 + 100*2 + 100*2.5 + (units-300)*3;
	}
	return usageAmount;
}
}
