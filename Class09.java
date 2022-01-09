package Class09;

import Class09.CSphere.CSphere;
import Class09.CTrapezoid.CTrapezoid;

public class Class09 {
	public static void main(String[] args) {
		CSphere cs = new CSphere(5.0);
		cs.show();
		CTrapezoid ct = new CTrapezoid(2 , 4 , 6);
		ct.show();
	}
}