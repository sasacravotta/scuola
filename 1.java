import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	  
	  	System.out.println(" inserisci numero ");
	  	
	   Scanner myObj = new Scanner(System.in); 
	   int n = myObj.nextInt();
	  
	    if((n%2)==0 ){
		System.out.println(" pari ");
	    }
	    else
	    {
	      	System.out.println(" dispari ");  
	    }
	}
}
