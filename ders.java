import java.util.Scanner;

public class Ders {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String num12,operating,num22;
      num12=input.nextLine();
      try{
         String[] n=num12.split(" ");
         num12=n[0];
         operating=n[1];
         num22=n[2];
      }catch (Exception e){
         operating=input.nextLine();
         num22=input.nextLine();
      }
      int num1=Integer.parseInt(num12);
      int num2=Integer.parseInt(num22);

      switch(operating){
         case "*":
            System.out.println(num1*num2);
            break;
         case "/":
            System.out.println(num1/num2);
            break;
         case "+":
            System.out.println(num1+num2);
            break;
         case "-":
            System.out.println(num1-num2);
            break;
      }
      input.close();
   }

}

