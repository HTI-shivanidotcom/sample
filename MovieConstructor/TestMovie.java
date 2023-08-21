package MovieConstructor;

public class TestMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a->
		Movie m1=new Movie("RRR","Raj");
		System.out.println(m1);
		
		// b-> Compiler should raise an error when we try to create Movie object with out passing any parameters.
		
		// Movie m2=new Movie();
		// System.out.println(m2);
		
		// c->
		Movie m3= new Movie("Bahubali","Raj","NTR",150,2022,"Action");
		System.out.println(m3);
		
		

	}

}
