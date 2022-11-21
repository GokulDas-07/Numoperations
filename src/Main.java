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
                    System.out.println(num1 +" is largest");
                }else
                {
                    System.out.println(num2 +" is largest");
                }
        }

    }
}