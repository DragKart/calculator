import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int term = 1;

        Scanner button = new Scanner(System.in);
        //operations what = new operations();
   
    while(term != 2)
      {
    System.out.println("What operation are you using?");
        String operation = button.nextLine();

        if(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("x") || operation.equals("/") || operation.equals("r") 
           // || operations.equals("x^y")
           )
        {

          if(operation.equals("+"))
        {

          System.out.print("Enter First Term: ");

          double addOne = button.nextDouble();

          System.out.print("Enter Second Term: ");

          double addTwo = button.nextDouble();

          double finalAdd = addOne + addTwo;

          System.out.println(addOne + " + " + addTwo + " = " + finalAdd);
          System.out.println("Would you like to continue? yes / no");
          button = new Scanner(System.in);
          String continueOne = button.nextLine();
           
          if(continueOne.equals("no") || continueOne.equals("n"))
          {System.out.print("That's fine. I'm not sad or anything.");
            term++;
          }
          else if(continueOne.equals("yes") || continueOne.equals("y"))
          {
          }
          else
            System.out.println("Invalid Entry. Try Again. ");
           
        }

        if(operation.equals("-"))
        {

          System.out.print("Enter First Term: ");

          double subOne = button.nextDouble();

          System.out.print("Enter Second Term: ");

          double subTwo = button.nextDouble();

          double finalSub = subOne - subTwo;

          System.out.println(subOne + " - " + subTwo + " = " + finalSub);
          System.out.println("Would you like to continue? yes / no");
          button = new Scanner(System.in);
          String continueTwo = button.nextLine();
          if(continueTwo.equals("no") || continueTwo.equals("n"))
          {System.out.print("You're hurting my feelings. ");
            term++;
          }
          else if(continueTwo.equals("yes") || continueTwo.equals("y"))
          {
          }
          else
            System.out.println("Invalid Entry. Try Again. ");
        }

        if(operation.equals("*") || operation.equals("x"))
        {

          System.out.print("Enter First Term: ");

          double mulOne = button.nextDouble();

          System.out.print("Enter Second Term: ");

          double mulTwo = button.nextDouble();

          double finalMul = mulOne * mulTwo;

          System.out.println(mulOne + " times " + mulTwo + " = " + finalMul);
          System.out.println("Would you like to continue? yes / no");
          button = new Scanner(System.in);
          String continueThree = button.nextLine();
        if(continueThree.equals("no") || continueThree.equals("n"))
          {System.out.print("That's like a dagger to the heart.");
            term++;
          }
          else if(continueThree.equals("yes") || continueThree.equals("y"))
          {
          }
          else
            System.out.println("Invalid Entry. Try Again. ");
          }

        if(operation.equals("/"))
        {

          System.out.print("Enter First Term: ");

          double divOne = button.nextDouble();

          System.out.print("Enter Second Term: ");

          double divTwo = button.nextDouble();

          double finalDiv = divOne / divTwo;

          System.out.println(divOne + " over " + divTwo + " = " + finalDiv);
          System.out.println("Would you like to continue? yes / no");
          button = new Scanner(System.in);
          String continueFour = button.nextLine();
          if(continueFour.equals("no") || continueFour.equals("n"))
          {System.out.print("Calculators have hearts too.");
            term++;
          }
        }
            
        if(operation.equals("r"))
          {

            System.out.print("Enter First Term: ");

          double remOne = button.nextDouble();

          System.out.print("Enter Second Term: ");

          double remTwo = button.nextDouble();

          double finalRem = remOne / remTwo;
          double finalRain = remOne % remTwo;
            

           
            System.out.println(finalRem + "with a remainder of: " + finalRain);
 

          }
