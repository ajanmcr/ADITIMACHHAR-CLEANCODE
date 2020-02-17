
public class SimpleInterest {
	void Simple(int principle, double rate, int time) {
		double simpleI = (principle * rate * time) / 100;
		System.out.format("Simple interest after %d years is %f", time, simpleI);

	}
}
