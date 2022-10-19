public class dop {

    public static void main(String[] args){

        //6

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result);
        System.out.println(-result);
        System.out.println();

        //7

        int x = 5;
        int y = 7;
        x = y * x;
        y = x / y;
        x = x / y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

        //8

        int a1 = 748;
        System.out.println(a1 / 10 % 10);

    }
}
