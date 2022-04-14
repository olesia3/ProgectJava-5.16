package Package;
public class Task2 {
	public static void main(String[] args) {
		int a=3;
		int b=4;
		int c;
		int i=(a*b)/2;
		System.out.println(i+"-площа прямокутного тирикутника");
		c=(int)(Math.pow(a, 2)+Math.pow(b, 2));
		c=(int)Math.sqrt(c);
		System.out.println(a+b+c+"-периметр прямокутного трикутника");
	}
}
