import java.util.Scanner;

public class QuestionOne
{
  public static void main(String args[])
  {
   Scanner keyboard = new Scanner(System.in);

   int a = 1 + (int) (Math.random() * 99),
       guess, 
       count = 0;

   System.out.println("I am thinking of a number from 1 to 100 ... guess what it is ?");

   while((guess = keyboard.nextInt()) != a){
     if (guess > a)
     {  
       System.out.println("lower!");
     }
     else
     {
       System.out.println("higher!");
     }
     count++;
   }

   System.out.println("Congratulations.   You guessed the number with "+ count +" tries!");
  }

}