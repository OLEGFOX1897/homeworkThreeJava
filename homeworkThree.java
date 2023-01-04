import java.util.Arrays;
import java.util.Scanner;



public class homeworkThree {
    public static void main(String[] args) {
        int n = inputMod();
        int k = 2;
        long[][] arrayBig = new long[n][k];
        long[] array = new long[n];
        moveArray(array, n); // метод с использованием только long (для сравнения, работает правильно примерно до n=15500)
        moveArrayBig(arrayBig, n); // основной метод
        System.out.println(Arrays.toString(array));
        outMod(arrayBig, n);

    }

    static void moveArrayBig(long[][] array, int n) {
        int ind = 0;
        array[0][0] = 1;
        long remTail = 0; // число для головы от остатка хвоста
        for (int i = 3; i <= n + 1; i++) {
            ind += 1;
            if (i % 2 == 0) {
                array[ind][0] = array[ind - 1][0] + array[i / 2 - 2][0]; // tail (хвост)
                if (array[ind][0] >= 1000000) { // число было выбрано примерно, чтобы голова или хвост не превышали long
                    remTail = array[ind][0] / 1000000;
                    array[ind][0] = array[ind][0] - remTail * 1000000;
                }
                array[ind][1] = array[ind - 1][1] + array[i / 2 - 2][1] + remTail; // head формируется из того, что было в head +
                                                                                    // то, что осталось хвоста
                remTail = 0;
            }
            if (i % 2 != 0) {
                array[ind][0] = array[ind - 1][0];
                if (array[ind][0] >= 1000000) {
                    remTail = array[ind][0] / 1000000;
                    array[ind][0] = array[ind][0] - remTail * 1000000;
                }
                array[ind][1] = array[ind - 1][1] + remTail;
                remTail = 0;
            }
        }
    }

    static void moveArray(long[] arrayLong, int n) {
        int ind = 0;
        arrayLong[0] = 1;
        for (int i = 3; i <= n + 1; i++) {
            ind += 1;
            if (i % 2 == 0) {
                arrayLong[ind] = arrayLong[ind - 1] + arrayLong[i / 2 - 2];
            }
            if (i % 2 != 0) {
                arrayLong[ind] = arrayLong[ind - 1];
            }
        }
    }

    public static int inputMod() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите значение числа, для которого хотите знать количество шагов n= ");
        int n = iScanner.nextInt();
        iScanner.close();
        return n;
    }

    static void outMod(long[][] array, int n) {
        if (array[n - 1][0] < 100000 & array[n-1][1]>0) { 
            System.out.printf("%d0%d", array[n - 1][1], array[n - 1][0]); // выводит дополнительный ноль между головой и 
                                                                                 // хвостом, если хвост меньше 100000 
        } else {
            System.out.printf("%d%d", array[n - 1][1], array[n - 1][0]);
        }
    }
}
