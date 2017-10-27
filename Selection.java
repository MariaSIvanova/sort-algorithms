package Study02_Sorting;

import com.sun.org.apache.bcel.internal.generic.Select;

/**
 * Created by User on 28.09.2017.
 */
public class Selection {
    void sort(int [] arr){
        int l = arr.length;
        int temp;
        for(int i=0; i<l; i++){
            int minIndex=i;
            for (int j=i+1; j<l; j++){
                if(arr[minIndex]> arr[j]) minIndex=j;
            }
            temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

        }
    }

    public static void main(String[] args) {
        int [] mass = {42,20,17,13,28,14,23,15};
        Selection obj = new Selection();
        obj.sort(mass);
        for(int i: mass) System.out.print (i+", ");
    }
}
