package Class09.CTrapezoid;

public class CTrapezoid{
	int upper;
	int base;
	int height;
	
	public CTrapezoid(int u , int b , int h) {
		upper = u;
		base = b;
		height = h;
	}
	
	public double math() {
		return (upper + base) * height / 2;
	}
	
	public void show() {
		System.out.println(upper);
		System.out.println(base);
		System.out.println(height);
		System.out.println(math());
	}
}