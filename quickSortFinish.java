/*
 * Метод быстрой сортировки с опорным элементом в середине
 */
import java.util.Arrays;

public class quickSortFinish {
    public static void main(String[] args) {

            int [] x = {8,4,3,-2,0,5,7,9,0,12,-8};
            int min =0;
            int max = x.length-1;
            System.out.println("Исходный массив:");
            System.out.println(Arrays.toString(x));
            quickSort(x, min, max);
            System.out.println("Отсортированный массив:");
            System.out.println(Arrays.toString(x));
    
    
            
        }
        public static void quickSort (int [] array, int min, int max){
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