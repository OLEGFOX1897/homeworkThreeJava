import java.util.Arrays;

public class quickSort {


    public class QuickSort {

        int [] x = {8,4,3,-2,0,5,7,9,0,12,-8};
        int min =0;
        int max = x.length-1;
        
        


        
    }
    public void quickSort (int [] array, int min, int max){
        if (array.length==0)
            return;
        if (min>=max)
            return;
        int indPivot = min+(max-min)/2; // выбор опорного элемента
        int pivot=array[indPivot];
        int i=min;
        int j=max;
        while (i<=j) {
            while (array[i]<pivot) {
                i++;
            }
            while (array[j]>pivot) {
                j--;
            }

            if (i<=j) { // смена мест большего элемента справа на меньший элемент слева
                int tmp=array[i];
                array[i]=array[j];
                array[j]=tmp;
                i++;
                j--;
            }
            if (i<max) {
                quickSort(array, i, max);
            }
            if (j>min) {
                quickSort(array, min, j);
            }
        }
    }

    
}