
public class T2 {

import java.util.Scanner; 

    public static void main (String [] args) {

        System.out.println("Please enter float value:");
        Scanner fn  = new Scanner(System.in);

        float ff = fn.nextFloat();
        int n = Math.round(ff);

        System.out.println("Mathematical rounded value for"+ fn.nextFloat()+" is "+n);
    }
    
}
