package Class09.CSphere;

public class CSphere{
	double radius;
	
	public CSphere(double r) {
		radius = r;
	}
	
	public double math() {
		return (double)4 / (double)3 * 3.14 / radius * radius * radius;
	}
	public void show() {
		System.out.println(radius);
		System.out.println(math());
	}
}