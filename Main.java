 /* Name: Eduard Altunov
 *  Date: 9/03/17
 *  Program: Salesperson commision Part II
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main 
{

    public static void main(String[] args) {
   
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sales: ");
        
        double sales = input.nextDouble();
        double fixedSalary = 30000;
        double commissionRate = 0.08;
     
        SalesPerson salesPerson = new SalesPerson(fixedSalary, commissionRate);

        System.out.println("Total compensation: " + numberFormat.format(salesPerson.calculateTotalCompensation(sales)));
      
        double maxSales = 1.5 * sales;
        double salesAmount = sales;
        System.out.println("Total Sales\t\tTotal compensation");
        while (salesAmount <= maxSales) {
            System.out.println(numberFormat.format(salesAmount) + "\t\t"
                    + numberFormat.format(salesPerson.calculateTotalCompensation(salesAmount)));
            salesAmount = salesAmount + 5000;
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