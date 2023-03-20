import java.lang.Math;
import java.util.*;
public class Calculator {
    public double root(double number1)
    {
        double return_val = Math.sqrt(number1);
        return return_val;
    }
    public double factorial(int number1)
    {
        if(number1<0)
            return Double.NaN;
        double fact=1;
        for(int i=1;i<=number1;i++)
            fact=fact*i;
        return fact;
    }
    public double log(double number1)
    {
        double return_val = Math.log(number1);
        return return_val;
    }
    public double power(double number1, double number2)
    {
        double return_val = Math.pow(number1 , number2);
        return return_val;
    }
    public static void main(String[] args)
    {
        try
        {
            Calculator sci_calci = new Calculator();
            int exit=0;
            System.out.println("Hii, Welcome to Scientific Calculator!!");
            while(exit == 0)
            {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Choose which operation to do, by selecting the corresponding number");
                System.out.println("Press 1 to get square root \nPress 2 to get factorial\nPress 3 to get natural logarithm\nPress 4 to get power function\nPress 5 to exit");
                int input=scanner.nextInt();;

                if(input==1)
                {
                    System.out.println("Enter the number");
                    System.out.println("Square root result is : " + sci_calci.root(scanner.nextDouble()));
                }
                else if(input==3)
                {
                    System.out.println("Enter the number");
                    System.out.println("Natural logarithm result is : " + sci_calci.log(scanner.nextDouble()));
                }
                else if(input==2)
                {
                    System.out.println("Enter the number");
                    System.out.println("Factorial result is : " + sci_calci.factorial(scanner.nextInt()));
                }
                else if(input==4)
                {
                    System.out.println("Enter the numbers");
                    System.out.println("Power function result is : " + sci_calci.power(scanner.nextDouble(),scanner.nextDouble()));
                }
                else if(input==5)
                {
                    exit = 1;
                    System.out.println("Done, Bye!!");
                }
                else
                    System.out.println("No corresponding operation for the given input :(");
            }
        }
        
        catch(InputMismatchException error)
        {
            System.out.println("Invalid input, Entered input is not of the expected type");
            return;
        }
    }
}
