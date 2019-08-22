import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	
	
	String bw =JOptionPane.showInputDialog(null, "put in any number");
	boolean bn = true;	
		
	int vc=Integer.parseInt(bw);
	for (int i = 2; i < vc  ; i++) {
		if (vc%i==0) {
			bn=false;
		}
	}
	
	
	if (bn==true) {
		System.out.println(vc+"is prime");
	}else {
		System.out.println(vc+"is not prime");
	}
	
	
	
	
	
	
	
	
	
	
}  

	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
