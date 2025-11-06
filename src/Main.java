import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        int[] tab = new int[10]; // creating and assigning array
        Random rnd = new Random(); // using random methos to generate random numbers
         for(int i = 0; i<tab.length;i++){ // using for loop to fill array with numbers
            tab[i]=rnd.nextInt(100)+1; //assign random numbers from 1 to 100 that why we use +1, because when we just using 100 it exuleds 100 and includes only 99
         }
         System.out.println(Arrays.toString(tab)); // printing the random numbers to console

        int min = tab[0]; 
        int max = tab[0];
        for(int i = 0; i<tab.length;i++){ // using for loop for finding min and max value
            if(tab[i]<min) min = tab[i];
            if(tab[i]>max) max = tab[i];
        }
        System.out.println("Minimum number is:" + min); // printing results 
        System.out.println("Maximum number is:" + max); // printing results 
        

    }
}
