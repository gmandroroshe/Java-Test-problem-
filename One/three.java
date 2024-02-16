/*Return trips imply that 
2
2*
�
X distance is travelled each day */


package One;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.print("Enter retern value: ");
        int number = read.nextInt();
        for(int a = 0 ; a<number; a++){

            System.out.print("Enter number: ");
            int x = read.nextInt();
            System.out.print("Your output is: ");
            System.out.println(x * 10);

        }

    }
    
}
