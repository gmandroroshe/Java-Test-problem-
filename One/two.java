//Practice problem - Tuition fees

package One;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        //create scaner variable  
        
        Scanner read = new Scanner(System.in);
        System.out.print("Enter retern value: ");
        int t = read.nextInt();
        for(int a = 0; a<t; a++){

            System.out.print("Enter First Number: ");
            int x = read.nextInt();
            System.out.print("Enter Second Number: ");
            int y = read.nextInt();


            //output 
            System.out.print("Your output is : ");
            System.out.println(x * y);

        }
    }
    
}
