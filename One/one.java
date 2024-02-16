//Basic math - Addition and multiplication


package One;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
		System.out.print("Enter retearn number :");
		int start = read.nextInt();
        for(int t = 0; t<start; t++ ){
            System.out.print("Enter First Valu: ");
            int a = read.nextInt();
            System.out.print("Enter Second Valu: ");
            int b = read.nextInt();

            int s = a + b ;
            int d = a * b ;

            System.out.println(s + " " + d); 

        }
        
    }
}
