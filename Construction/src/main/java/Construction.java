
public class Construction {
	void compute(String standard, boolean fullyAutomated, double area) {
		double result = 0;
		if(standard.equals("standard")) {
			result = 1200 * area;
		}
		else if (standard.equals("above")) {
			result = 1500 * area;
		}
		else if (standard.equals("higher")&& fullyAutomated) {
			result = 2500 * area;
		} 
		else if (standard.equals("higher") ) {
			result = 1800 * area;
		} 
		System.out.format("The cost of construction is %.2f", result);
	}
	
}
