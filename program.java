import java.util.Arrays;

public class program {
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
                String res = "Число " + resultArr[i] + " повторяется " + resultArr[resultArr.length / 2 + i] + " раза";
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

                                             