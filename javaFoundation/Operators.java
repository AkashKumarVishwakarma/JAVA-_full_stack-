public class Operators {
    public static void main(String[] args) {
        int j = 7;
        j++;
        ++j;

        // j = 9
        int k = j++; // k= j; j = j+1;
        // System.out.println(j + " , "+k); // 10,9

        int l = ++j; // l = j+1;

        // System.out.println(j + " , "+l); // 11, 11


        //************************************************* */


        int a = 2;// 10 -->00000000 00000000 00000000 00000010
        int b = 3;// 11 -->00000000 00000000 00000000 00000011
        int c = a&b;// 10 --> 2
        int d = a|b;// 11 --> 3
        int e = a^b;// 01 --> 1
        int f = ~a;// 11111111 11111111 11111111 11111101 --> -3

        // System.out.println(c + " , "+d+" , "+e+" , "+f);


        // Shift operations

        int g = 1; // 00000000 00000000 00000000 00000001 --> 1
        g = g << 33;// g = g << 33 == g << 1
        // System.out.println(g); //2

        // Right shift(>>)(>>>)
        byte h = 8; // 00001000
        h = (byte)(h>>1); // 00000100 --> 4
        // System.out.println(h);

        int i = -128;
        i = i>>2;
        // System.out.println(i);

        int z = i >>> 2;
        // System.out.println(z);


        //*************************************** */

        int p = 25;
        int q = 10;
        int r = 15;

        boolean s = (p<q) && (q<r);
        
        // short circuit
        System.out.println(s); // flase
        
        boolean t = (p<q) & (q<r);
        System.out.println(t); // false


        

    }
}
