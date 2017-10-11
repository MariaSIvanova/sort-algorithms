package Study02_Sorting;
import java.util.Arrays;

/**
 * Created by User on 27.09.2017.
 */
public class Insertion1 {

    void sort1(int[] arr){
        int l = arr.length;
        int k;
        for (int i = 0; i<l; i++){
            for (int j=i+1; j>0 && j<l; j--){
                if (arr[j]<arr[j-1]){
                    k=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=k;
                }
                else break;
            }
        }
    }
    public static void main (String [] args){
        int [] mass = {42,20,17,13,28,14,23,15};
        Insertion1 ob = new Insertion1();
        ob.sort1(mass);
        System.out.print(Arrays.toString(mass));
    }





}
