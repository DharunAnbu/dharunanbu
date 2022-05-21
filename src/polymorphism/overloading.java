package polymorphism;

public class overloading {
	public void std(int i) {
		System.out.println(" my roll no is :"+i);
	}
	public void std( String s) {
		System.out.println(" my name is : "+s);
	}
	public void std(float f) {
		System.out.println(" my CGPA  is:" + f);
	}
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		overloading obj = new overloading();
		obj.std (0);
		obj.std(0);
		obj.std(0);
	}
}
		
