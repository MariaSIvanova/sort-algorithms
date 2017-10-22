package Study02_Sorting;
import java.util.Arrays;

/**
 * Created by User on 27.09.2017.
 */
//comment
public class Insertion2 {
    void sort (int[] arr){
        int l = arr.length;
        for (int i=1; i<l; i++){
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j] > key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String [] args){
        int [] mass = {42,20,17,13,28,14,23,15};
        Insertion2 ob = new Insertion2();
        ob.sort(mass);
        System.out.println(Arrays.toString(mass));

    }
}
