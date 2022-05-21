package hierarchical;

public class demo {
	private void demo( int i) {// constructor
		// TODO Auto-generated method stub
      System.out.println("my id is :"+i);
      
	}
   
	 private void demo() {//default   or non-constructor
		// TODO Auto-generated method stub
		 System.out.println("my roll no is = 311");

	}
	 
	 private void demo( String s) {
		// TODO Auto-generated method stub
      System.out.println( " my name is :"+s);
      
	}
	 
	 public static void main(String[] args) {
		 demo vb=new demo();
		 vb.demo();
		vb.demo("DHARUN");
		vb.demo("my roll no is = 311");

	 
		 
		 
	 }
}   


