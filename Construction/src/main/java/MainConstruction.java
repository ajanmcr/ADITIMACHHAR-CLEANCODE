import java.util.Scanner;

public class MainConstruction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double area;
		String standard;
		boolean fullyAutomated;
		System.out.format("Enter the area");
		area = scanner.nextDouble();
		System.out.format("Enter the standard");
		standard = scanner.next();
		System.out.format("Fully Automated or not");
		fullyAutomated = scanner.nextBoolean();
		Construction construction = new Construction();
		construction.compute(standard, fullyAutomated, area);

		
	}

}
