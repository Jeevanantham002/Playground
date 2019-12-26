import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int i, space, rows=5, k=0;
        Scanner scan = new Scanner(System.in);
        
        rows = scan.nextInt();
        for(i=1; i<=rows; i++)
        {
            for(space=1; space<=(rows-i); space++)
            {
                System.out.print(" ");
            }
            while(k != (2*i-1))
            {
                System.out.print("*");
                k++;
            }
            k = 0;
            System.out.println();
        } 
      
	}
}