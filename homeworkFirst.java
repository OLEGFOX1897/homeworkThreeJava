import java.util.Arrays;
/*
 * Составить частотный словарь элементов одномерного массива
Частотный словарь содержит информацию о том, сколько раз встречается элемент входных данных.

Пример:
Есть набор данных

{ 1, 9, 9, 0, 2, 8, 0, 9 }
частотный массив может быть представлен так:

0 встречается 2 раза
1 встречается 1 раз
2 встречается 1 раз
8 встречается 1 раз
9 встречается 3 раза
 */
public class homeworkFirst {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 0, 2, 2, 2, 14, -89 };
        printMod(array);
    }

    static void printMod(int[] array) {
        String outArrayString = Arrays.toString(array);
        System.out.println(outArrayString);
        int[] resultArr = calculator(array);
        for (int i = 0; i < resultArr.length / 2; i++) {
            if (resultArr[resultArr.length / 2 + i] != 0) {
                String res = "Число " + resultArr[i] + " встречается " + resultArr[resultArr.length / 2 + i] + " раз(а)";
                System.out.println(res);
            }
        }
    }

    static int[] calculator(int[] arrInp) { // Создает массив в 2 раза длинее исходного и до его серидины записывает
        int lenArr = arrInp.length; // числа из исходного массива в ед варианте. Во второй половине массива
        int[] arrOut = new int[2 * lenArr]; // записывается количество повторений числа в исходном массиве.
        int countArr = 0;
        for (int i = 0; i < lenArr; i++) {
            int countRep = 0;
            for (int j = 0; j < i; j++) {
                if (arrInp[i] == arrInp[j]) { // Определяет во входном массиве, что до исследуемого числа нет его
                    countRep = 1; // повторов, если есть, то данное число уже обсчитывалось и считать количество
                } // повторений не надо
            }
            if (countRep == 0) {
                arrOut[countArr] = arrInp[i];
                countArr += 1;
                arrOut[countArr + lenArr - 1] = lib.countIdentDigInArray(arrInp, i);
            }
        }
        return arrOut;
    }
}

                                             