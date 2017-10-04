package week.pkg2.prg.pkg420;

import java.util.Scanner;
/*
 * Name: Eduard Altunov
 * Date: 8/28/17
 * Program: Salesperson Java Application Part I 
 */

public class Week2PRG420 {
    public static void main(String[] args) 
	{
double annualSales = 0;	
double fixedSalary = 30000;
double totalCompensation;

System.out.println("Please enter employees annual sales amount in dollars: "); 
Scanner userInput = new Scanner(System.in);
annualSales = userInput.nextInt(); 
userInput.close(); 
totalCompensation = fixedSalary +  .08 * annualSales;
System.out.println("The total compensation for the year is: " );
System.out.println("Gross income for employee is " + totalCompensation);
        }

}
class totalCompensation{
    public double calc(double rate,double sales){
        return sales * (rate / 100);
    }
}

/* 
References:

Animations. (n.d.). Retrieved August 28, 2017, 
from http://bcs.wiley.com/he-bcs/Books?action=resource&bcsId=7872&itemId=1118431111&resourceId=36473

Java 101By Jeff Friesen,JavaWorld|Sep 15, 2015 1:34 PMPTAbout |
A beginner's library for learning about essential Java programming concepts, syntax, APIs, and packages., 
& Jeff Friesen,JavaWorld|Sep 15, 2015 1:34 PMPT. (2015, September 15). Java 101: 
Classes and objects in Java. Retrieved August 28, 2017, from 
http://www.javaworld.com/article/2979739/learn-java/java-101-classes-and-objects-in-java.html

Sonmez, J. (2011, November 04). Java Fundamentals, Part 1. Retrieved August 28, 2017, from
https://app.pluralsight.com/library/courses/java1/table-of-contents
*/