import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int option,num1,num2,result;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1 = input.nextInt();
        System.out.println("Enter Number 2:");
        num2=input.nextInt();
        System.out.println("Enter operation:1.Largest  2.Smallest  3.Prime or not  4.Even or not  5.Reverse  6.Exit");
        option=input.nextInt();

        switch (option){

            case 1:
                if(num1>num2)
                {
                    System.out.println(num1 +" is largest.");
                }else
                {
                    System.out.println(num2 +" is largest.");
                }

            case 2:
                if(num1>num2)
                {
                    System.out.println(num2 +" is Smallest.");
                }else
                {
                    System.out.println(num1 +" is Smallest.");
                }

            case 3:
                boolean flag = false;
                // prime or not for num1
                for (int i = 2; i <= num1 / 2; ++i)
                {
                    if (num1 % i == 0)
                    {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    System.out.println(num1 + " is a prime number.");
                else
                    System.out.println(num1 + " is not a prime number.");

                //prime or not for num2
                for (int i = 2; i <= num2 / 2; ++i)
                {
                    if (num2 % i == 0)
                    {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    System.out.println(num2 + " is a prime number.");
                else
                    System.out.println(num2 + " is not a prime number.");

            case 4:
                if ( num1 % 2 == 0 )
                    System.out.println(num1+" is even");
                else
                    System.out.println(num1+" is not even");

                if ( num2 % 2 == 0 )
                    System.out.println(num2+" is even");
                else
                    System.out.println(num2+" is not even");

            case 5:
                int reversed1=0;
                while(num1 != 0)
                {
                    int digit1 = num1 % 10;
                    reversed1 = reversed1 * 10 + digit1;
                    num1 /= 10;
                }
                System.out.println("Reversed Number1: " + reversed1);
                int reversed2=0;
                while(num2 != 0)
                {
                    int digit2 = num2 % 10;
                    reversed2 = reversed2 * 10 + digit2;
                    num2 /= 10;
                }
                System.out.println("Reversed Number2: " + reversed2);

            case 6:
                System.out.println("Exiting...");
                System.exit(0);

            default:
                System.out.println("Invalid option");

        }

    }
}