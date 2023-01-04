import java.util.Arrays;
import java.util.Scanner;

class App {

  private static int n;
  public static void main(String[] args) {
    n=inputMod();
    int k=2;
    // long[][] array = new long[n];
    long [][] arrayBig = new long [n][k];
    long [] array = new long [n];
    moveArray(array, n);
    moveArrayBig(arrayBig, n);
    System.out.println(Arrays.toString(array));
    outMod(arrayBig);
    
   
  } 
    static void moveArrayBig (long[][] array,int n){
      int ind=0;
      array[0][0]=1;
      long remHead=0;
      for (int i = 3; i <= n+1; i++) {
        ind+=1;
        if (i%2==0) {
          array[ind][0]=array[ind-1][0]+array[i/2-2][0];
          if (array[ind][0]>=1000000){
            remHead= array[ind][0]/1000000;
            array[ind][0]=array[ind][0]-remHead*1000000;
          }
          array[ind][1]=array[ind-1][1]+array[i/2-2][1]+remHead;
          remHead=0;
        }
        if (i%2!=0) {
          array[ind][0]=array[ind-1][0];
          if (array[ind][0]>=1000000){
            remHead= array[ind][0]/1000000;
            array[ind][0]=array[ind][0]-remHead*1000000;
          }
          array[ind][1]=array[ind-1][1]+remHead;
          remHead=0;
        }
    } 
 
}
static void moveArray (long[] arrayLong,int n){
  int ind=0;
  arrayLong[0]=1;
  for (int i = 3; i <= n+1; i++) {
    ind+=1;
    if (i%2==0) {
      arrayLong[ind]=arrayLong[ind-1]+arrayLong[i/2-2];
    }
    if (i%2!=0) {
      arrayLong[ind]=arrayLong[ind-1];
    }
  }
} 
  public static int inputMod (){
    Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите значение числа, для которого хотите знать количество шагов n= ");
        int n = iScanner.nextInt();
        iScanner.close();
    return n;
  }
  static void outMod(long [][] array){
    if (array[n-1][0]<100000){
      System.out.printf("%d0%d", array[n-1][1],array[n-1][0]);
    }
    else{
      System.out.printf("%d%d", array[n-1][1],array[n-1][0]);
    }
  }
  // public static void outMod (long[]array, int n){
  //   System.out.printf("Количество шагов для указанного числа равно");
  //   if (n<15000){
  //     System.out.println(array[n]);
  //   }
  //   else {
  //     System.out.printf("%s х 1000 ", array[n]);
  //   }
  // }
}

//   //
//   // N ->
//   // / F(N-1) , N mod 2 != 0
//   // F(N) = { F(N-1) + F(N/2), N mod 2 = 0
//   // \ 1, N = 2
//   //
//   //
//   static int F(int a, int b) {
//     //System.out.println(b);
//     // new Scanner(System.in).nextLine();
//     if (b == a)
//       return 1;
//     else if (b < a) {
//       return 0;
//     } else if (b % 2 != 0)
//       return F(a, b - 1);
//     else
//       return F(a, b - 1) + F(a, b / 2);
//   }


// N ->