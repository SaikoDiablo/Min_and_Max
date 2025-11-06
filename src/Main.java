import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        int[] tab = new int[10];
        Random rnd = new Random();
         for(int i = 0; i<tab.length;i++){
            tab[i]=rnd.nextInt(100)+1;
         }
         System.out.println(Arrays.toString(tab));
         
        int min = tab[0];
        int max = tab[0];
        for(int i = 0; i<tab.length;i++){
            if(tab[i]<min) min = tab[i];
            if(tab[i]>max) max = tab[i];
        }
        System.out.println("Minimum number is:" + min);
        System.out.println("Maximum number is:" + max); 

    }
}