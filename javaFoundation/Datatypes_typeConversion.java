public class Datatypes_typeConversion{
    public static void main(String[] args){

        int a = 50_000;
        // System.out.println(a);

        // byte x = 5;
        // System.out.println(x);

        // byte x = 0b101;  // binary representaion
        // System.out.println(x);

    
        // byte x = 05; // Octal representation
        // // byte x = 08;
        // System.out.println(x);

        // // byte x = 0x5;  // Hexadecimal representation
        // // byte x = 0x9;

        // // byte x = 0x12; // 1*16^1 + 2*16^0(Wrong Use)

        // // byte x = 0xf;
        // byte x = 0xa;
        // System.out.println(x);



        // double x = 6.022e23; // 6.022 * 10^23
        // System.out.println(x);


        // // long l = 341256789; // not easy readable
        // long l = 34_12_56_789;  // don't use after decimal(10._5) & after E(6.022e_23)
        // System.out.println(l);


        // float x = 0.7f;
        // System.out.printf(format:"%.20f%n",f);
        // float x = 8.125f;
        // System.out.printf(format:"%.20f%n",f);

        
        // // int x = -42;
        // int x = -0;
        // System.out.println(x);





        //********************************************************** */

        // //Implicit conversion
        // //(byte to int)
        // byte b = 24;
        // int i;
        // i = b;
        // System.out.println(i); // 24

        // // character to int
        // char c = 'a';
        // int i;
        // i = c;
        // System.out.println(i);//97

        //Explicit conversion

        // int i = 24;
        // byte b;
        // // b = i; // type mismatch can't convert from int to byte
        // b = (byte) i;
        // System.out.println(b);
        // i = 300;
        // b = (byte) i;
        // System.out.println(b);// 44 not 300 (300 % 256 = 44)

        // //Truncating converion
        // float f = 15.978f;
        // int i;

        // i = (int) f;
        // System.out.println(i); //15

        //Boolean to any data type
        //These conversions are not possible

        // boolean bool = false;
        // int i;

        // i = (int) bool;


        // byte b = 50;
        // // b = b*2;
        // b = (byte)(b*2);
        // System.out.println(b);

        //******************************************************** */

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);

        //f*b --> float
        //i/c --> integer
        //d*s --> double

        // float + integer --> float - double --> double

        // System.out.println((f*b) + " + " + (i/c) + " - "+(d*s));
        // System.out.println("result = " + result);

        // System.out.println(((Object)result).getClass().getSimpleName());



    }
}