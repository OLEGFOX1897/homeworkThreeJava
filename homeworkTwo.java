/*
 *  Ханойская башня
 */
public class homeworkTwo {
   public static void main(String[] args) {
   moveHanoi(2, 1, 3);
   }
   static void moveHanoi(int n, int start, int finish){
      if (n==1){
         String res = n +" "+start+ " "+ finish;
         System.out.println(res);
      }
      else{
         int temp=6-start-finish;
         moveHanoi(n-1, start, temp);
         String res = n +" "+start+ " "+ finish;
         System.out.println(res);
         moveHanoi(n-1, temp, finish);

      }
   }
   }
   