package hierarchical;

public class cvb extends bank {
	private void homeloan() {
		// TODO Auto-generated method stub
        System.out.println("my home loan is :"+50);
	}
    
	public static void main(String[] args) {
		cvb vb=new cvb();
		vb.homeloan();
		vb.goldloan();
    	vb.bikeloan();
		
	}
	
}
