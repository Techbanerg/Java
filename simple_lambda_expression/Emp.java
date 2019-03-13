package simple_lambda_expression;

public class Emp {
	String name;
	int performanceRating;
	double salary;
	Emp(String nm, int rating, double sal){
		name  = nm;
		performanceRating =rating;
		salary  = sal;
	}
	public String getName() {return name;}
	public int getPerformanceRating() {return performanceRating; }
	public double getSalary() { return salary;}
	public String totring() { return name + ":" + performanceRating + ":" + salary;
	}
}
