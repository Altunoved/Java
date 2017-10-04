 /* Name: Eduard Altunov
 *  Date: 9/11/17
 *  Program: Salesperson commision Part III
 */

public class SalesPerson {
	private double fixedCompensation;
	private double variablePercent;
	private String name;

	public SalesPerson() {
	}
	public SalesPerson(double fixedCompensation, double variablePercent) {
		this.fixedCompensation=fixedCompensation;
		this.variablePercent=variablePercent;
	}

	public SalesPerson(String name,double fixedCompensation, double variablePercent) {
		this.fixedCompensation = fixedCompensation;
		this.variablePercent = variablePercent;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFixedCompensation() {
		return fixedCompensation;
	}

	public void setFixedCompensation(double fixedCompensation) {
		this.fixedCompensation = fixedCompensation;
	}

	public double getVariablePercent() {
		return variablePercent;
	}

	public void setVariablePercent(double variablePercent) {
		this.variablePercent = variablePercent;
	}

	public double calculateTotalCompensation(double sales) {
		double salesTarget = 400000;
		double salesNeededForIncentive = 0.80 * salesTarget;
		double commissionRate = getVariablePercent();
		double accelerationFactor = 0.25;
		if (sales >= salesNeededForIncentive) {
		} else if (sales > (salesTarget * 0.8)) {
			commissionRate = accelerationFactor;
		} else {
			commissionRate = 0;

		}
		return getFixedCompensation() + (sales * commissionRate);
	}
	public double extraSaleNeeded(double compensation)
	{
		double sales=compensation-getFixedCompensation();
		double salesTarget = 400000;
		double salesNeededForIncentive = 0.80 * salesTarget;
		double commissionRate = getVariablePercent();
		double accelerationFactor = 0.25;
		if (sales >= salesNeededForIncentive) {
		} else if (sales > (salesTarget * 0.80)) {
			commissionRate = accelerationFactor;
		} else {
			commissionRate = 0;

		}
		return sales/commissionRate;
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