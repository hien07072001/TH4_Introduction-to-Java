import java.util.Scanner;

public class FirstEquation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a,b,x;

        System.out.println("a:");
        a=scanner.nextDouble();

        System.out.println("b:");
        b=scanner.nextDouble();

        System.out.println("x:");
        x=scanner.nextDouble();

        if ( a!=0){
            double abc= -b/a;
            System.out.println("nghiem la :" + abc);

        }else{
            if (b==0){
                System.out.println("nghiem la!");
            } else
                System.out.println("vo ngiem!");

        }


    }
}
