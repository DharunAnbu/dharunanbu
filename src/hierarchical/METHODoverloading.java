package hierarchical;


public class METHODoverloading {
	public void std(int i) {
		
		System.out.println("my roll no is:"+i );
		
		}
    public void std( char c) {
    	
    	System.out.println("my initial is:"+c);
    }
    public void std(String s) {
    	
    	System.out.println("my nam is :"+s);
    }
    public static void main(String[] args) {
    	 METHODoverloading ov=new METHODoverloading ();
    	  ov.std(331);
          ov.std('A');
          ov.std("A.DHARUN");
		
	}
    	
    }

	  
		   
	
	
	
	
	
	

