package Class17;

public class Class17 {
	public static void main(String[] args) {
		String a = "262904713";
		short b = Short.parseShort(a);
		System.out.println(b);
	}
}
//會有錯誤，因為short的最大值才32767就超過了String的數字大小了。