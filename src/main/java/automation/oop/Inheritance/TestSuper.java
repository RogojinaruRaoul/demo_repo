package automation.oop.Inheritance;

class Super {
	public double calculatePay() {
		return 2 + 2 + 2 + 2 + 2;
	}
}

class PartTimeEmployee extends Super {

	@Override
	public double calculatePay() {
		double pay = super.calculatePay();
		return pay / 2;

	}

}

public class TestSuper {
	public static void main(String args[]) {
		PartTimeEmployee p = new PartTimeEmployee();
		double x = p.calculatePay();
		System.out.println(x);

	}
}
