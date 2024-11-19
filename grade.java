
import java.util.Scanner;
public class Main {
  public static void main (String[] args){
    Scanner reply = new Scanner(System.in);
    // title
    System.out.println ("Report Card Calculator");
    System.out.println (" - - - - - - - - - - - - - - - - \n");

    // asking user for their name
    System.out.println("Hi welcome to the report card calculator! \nPlease enter your name:"); 
    String name = reply.next();

    // number of classes being entered
    System.out.println("\nHow many classes are you taking this marking period?: ");
    int numClasses = reply.nextInt();

    int avgAll = 0 ;

    // for loop that runs that length of the amount of classes entered
    for (int i = 1; i <= numClasses; i++){

      // asks user to enter class, then the grade
      System.out.println("Enter Class " + (i) + ": ");
      String classes = reply.next();
      System.out.println("What was your grade for that class?: ");
      int grade = reply.nextInt();

      // adding up the total of the grades entered
      avgAll += grade;
      
    }

    // double division so we can keep the decimal
    double aveD = (double) avgAll/numClasses;

    // prints all the info out
    System.out.println( name + ", your grade averge for the " + numClasses + " classes you took this marking period was a " + aveD + ". Nice work!");
    
    
  }
}
