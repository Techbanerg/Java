package simple_lambda_expression;

public class ValidatePerformanceRating  implements Validate{
    public boolean check(Emp emp) {
    	return (emp.getPerformanceRating()  >= 5);
    }
}
