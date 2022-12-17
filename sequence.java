import java.util.ArrayList;
import java.util.List;

/*
 * f z q w e r a s
f d q w a s r t e q a

f q w a s

Найти длину наибольшей общей последовательности


ПОСЛЕДОВАТЕЛЬНОСТЬ 

f z q w e r a s
f d q w a s r t e q a

A = f d q w a s r t e q a LEN(A) = 11
 */
public class sequence {
    public static void main(String[] args) {
        String[] a = { "m", "z", "f", "q", "w", "e", "r", "a", "o", "s", "s", "s", "f" };
        String[] b = { "f", "d", "m", "z", "m", "q", "w", "a", "s", "r", "t", "e", "q", "a", "s", "f" };
        String finishLine= moreLine(findSubSequence(a, b), findSubSequence(b, a));
        int lenFinish=finishLine.length();
        System.out.printf("Самая длинная последовательность: %s с %d элементами", finishLine, lenFinish);
    }   
    static String findSubSequence(String[] a, String[] b) {
        int nextInd = 0;
        int lenReal = 0; // текущее значение длины подпоследовательности
        int lenMax = 0;
        String line = "";
        String lineOut = "";
        for (int k = 0; k < a.length; k++) {
            nextInd = 0;
            lenReal = 0;
            line = "";
            for (int i = k; i < a.length; i++) {
                for (int j = nextInd; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        line = line + b[j];
                        nextInd = j + 1;
                        lenReal++;
                        break;
                    }
                }
            }
            if (lenReal > lenMax) {
                lenMax = lenReal;
                lineOut = line;
            }
        }
        return lineOut;
    }
    static String moreLine (String lineOutOne, String lineOutTwo)
    {   String lineMax="";
        if (lineOutOne.length()>lineOutTwo.length() ) {
            lineMax=lineOutOne;
        }
        else {lineMax=lineOutTwo;}
        return lineMax;
    }

}
        
