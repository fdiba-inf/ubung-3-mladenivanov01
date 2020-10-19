package exercise3;

import java.util.Scanner;
public class NamePrinter  {
   public static void main(String[]args) {
    Scanner input  =  new Scanner(System.in);

    String name =input.next();
    for (int i=0; i < name.length();i++){
      char 1 = Name.charAt(i);
      System.out.println("* "  +  1  +  " *");
    }


   }

}