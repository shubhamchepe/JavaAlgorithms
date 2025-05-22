package PracticeOne;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial : ");
        try{
             num = sc.nextInt();
        }catch(Exception e){
            System.out.println("Invalid Input");
        }finally{
            sc.close();
        }
        
        int fact = 1;

        for(int i=num; i>=1; i--){
          fact = fact*i;
        }

        System.out.println(fact);
    }

}

