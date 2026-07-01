public class Recursion {
    // static void printNum(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     printNum(n-1);
    //     System.out.println(n);
    // }

    static int fibonacci(int n){
        if(n<=0) 
            return 0;
        if(n == 1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        // printNum(5);

        int n = 6;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
  
    }
}
