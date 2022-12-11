/**
 * Библиотека моих функций:
 */
public class lib {
    public static void main(String[] args) {
        
        
    }
    /**
     * Метод считает количество повторений числа в массиве по указанному индексу этого числа
     */
    public static int countIdentDigInArray(int[] arr, int ind) {
        int countDig = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == arr[ind]) {
                countDig += 1;
            }
        }
        return countDig;
    }
}