
public class CompoundInterest {
	void compute(int principle, int time, double rate, int number) {
		double amount = principle * Math.pow(1+(rate / number), number * time);
		double cinterest = amount - principle;
		System.out.format("Compound interest after %d years is %f", time, cinterest);
		System.out.format("\nAmount after %d years is %f", time, amount);
	}
}
