import java.util.Scanner;

public class MainCompound {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int principle, time, number;
		double rate;
		System.out.format("Enter Principle amount : ");
		principle = scanner.nextInt();
		System.out.format("Enter time : ");
		time = scanner.nextInt();
		System.out.format("Enter annual interest rate : ");
		rate = scanner.nextDouble();
		System.out.format("Enter number of times : ");
		number = scanner.nextInt();
		CompoundInterest compoundInterest = new CompoundInterest();
		compoundInterest.compute(principle, time, rate, number);
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.Simple(principle, rate, time);
	}

}
