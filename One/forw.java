//programe date 2024.02.19



package One;

import java.util.Scanner;

public class forw {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        for(int a = 0; a<t; a++){

            int x = read.nextInt();
            int y = read.nextInt();

            int m = 10 * x;
            int n = 100 * y;
            int o = 10 * y;

            System.out.println(m + n - o); 

        }
    }
    
}
