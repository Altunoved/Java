 /* Name: Eduard Altunov
 *  Date: 9/11/17
 *  Program: Salesperson commision Part III
 */

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
		ArrayList<SalesPerson> persons=new ArrayList<SalesPerson>();
		Scanner sc=new Scanner(System.in);
		System.out.print("How many sales persons do you want to enter in the list: ");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Sales Persons " +(i+1));
			System.out.println("Enter name: ");
			String name=sc.nextLine();
			System.out.println("Enter Fixed Compensation: ");
			double fixedCompensation=Double.parseDouble(sc.nextLine());
			System.out.println("Enter Commission Rate: ");
			double variablePercent=Double.parseDouble(sc.nextLine());
			SalesPerson sp=new SalesPerson(name, fixedCompensation, variablePercent);
			persons.add(sp);
                        
		}
		System.out.println("Sales persons are added to the list");
		System.out.println("Compare Two sales person");
		System.out.println("Enter the name of first sales person:");
		String name1=sc.nextLine();
		System.out.println("Enter his sales: ");
		double sales1=Double.parseDouble(sc.nextLine());
		System.out.println("Enter the name of second sales person:");
		String name2=sc.nextLine();
		System.out.println("Enter his sales: ");
		double sales2=Double.parseDouble(sc.nextLine());
		SalesPerson s1=new SalesPerson();
		SalesPerson s2=new SalesPerson();
		for (SalesPerson salesPerson : persons) {
			if(salesPerson.getName().equals(name1))
			{
				s1=salesPerson;
			}
			else if(salesPerson.getName().equals(name2))
			{
				s2=salesPerson;
			}
		}
		
		double salary1=s1.calculateTotalCompensation(sales1);
		double salary2=s2.calculateTotalCompensation(sales2);
		System.out.println("Salary of Sales Person "+name1+" is "+numberFormat.format(salary1));
		System.out.println("Salary of Sales Person "+name2+" is "+numberFormat.format(salary2));
		if(salary1>salary2)
		{
			System.out.printf("Salary of %s is higher than %s by %.2f\n",name1,name2,(salary1-salary2));
			double sales=s2.extraSaleNeeded(salary1);
                        
		
		}
		if(salary2>salary1)
		{
			System.out.printf("Salary of %s is higher than %s by %.2f\n",name2,name1,(salary2-salary1));
			double sales=s1.extraSaleNeeded(salary2);
			
		}
		
		
	}

}

/* 
References:

Animations. (n.d.). Retrieved September 03, 2017, from 
http://bcs.wiley.com/he-bcs/Books?action=resource&bcsId=7872&itemId=1118431111&resourceId=36473


Java 101By Jeff Friesen,JavaWorld|Sep 15, 2015 1:34 PMPTAbout |
A beginner's library for learning about essential Java programming concepts, syntax, APIs, and packages., 
& Jeff Friesen,JavaWorld|Sep 15, 2015 1:34 PMPT. (2015, September 15). Java 101: 
Classes and objects in Java. Retrieved September 03, 2017, from 
http://www.javaworld.com/article/2979739/learn-java/java-101-classes-and-objects-in-java.html

Sonmez, J. (2011, November 04). Java Fundamentals, Part 1. Retrieved September 03, 2017, from
https://app.pluralsight.com/library/courses/java1/table-of-contents
*/