import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        /* Scanner operations = new Scanner(System.in);
        int n = operations.nextInt();
        int a = operations.nextInt();
        int b = operations.nextInt();
        System.out.println(operation(n, a, b));*/
        System.out.println(ostat(1, 3)==1);
        System.out.println(square(3, 2) == 3);
        System.out.println(legs(2, 3,5) == 36);
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(operation(24, 15, 9).equals("added"));
        System.out.println(ASCII('A') == 65);
        System.out.println(addUpTo(10) == 55);
        System.out.println(nextEdge(8, 10) == 17);
        System.out.println(sumOfCubes(new int[]{1, 5, 9}) == 855);
        System.out.println(abcmath(5, 2, 1));


    }
    public static int ostat(int x, int y){

        return x % y;


    }


    public static int square(int x, int y){

        return (x*y)/2;
    }

    public static int legs(int x, int y, int z){

        return x*2 + y*4 + z*4;
    }

    public static boolean profitableGamble(double x, double y, double z) {
        if (x * y > z) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String operation (int n, int a, int b){
        if (a * b == n){
            return "multiply";
        }
        else if(a + b == n){
            return "added";
        }
        else if (a - b == n){
            return "subtract";
        }
        else if (a / b == n){
            return "share";
        }
        else{
            return "none";
        }
    }

    public static int ASCII(char s) throws UnsupportedEncodingException {
        return s;
    }

    public  static int addUpTo (int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum+=i;
        }
        return sum;
    }

    public static int nextEdge (int x, int y){
        return (x + y) - 1;
    }

    public static int sumOfCubes(int[] mas){
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum+=Math.pow(mas[i], 3);
        }
        return sum;
    }

    public static boolean abcmath(int a, int b, int c){
        for (int i = 1; i < b; i++){
            a+= a;
        }
        if (a % c == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
