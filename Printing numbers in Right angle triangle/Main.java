import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       int i,j,n=1;               
         Scanner in = new Scanner(System.in);
		    n = in.nextInt();
  
               for(i=1;i<=n;i++)
               {
	           for(j=1;j<=i;j++)
	            System.out.print(i);
	          System.out.println("");
              }
	}
}