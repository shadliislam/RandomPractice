import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class PrintReverseTriangle {
    public static void printTriangle(int number){

        for (int row=0;row<number;row++){
            int num=1;
            for (int col=1;col<=number-row;col++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
            for (int h=0;h<=row;h++){
                if(row==number-1)
                    break;
                else System.out.print("-");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a positive number greater than zero");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if (number<0){
            number=abs(number);
        }
        if(number==0){
            System.out.println("Enter a valid positive number: ");
            number=scanner.nextInt();
        }
        printTriangle(number);
    }
}
