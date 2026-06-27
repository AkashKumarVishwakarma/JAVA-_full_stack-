class LoopsInJava{
    public static void main(String[] args) {
        // for (int i = 1,j=1; i <= 10 && j<=5; i++,j+=2) {
        //     System.out.println(i*j);
            
        // }

        // boolean b = true;
        // for (int i = 0; b == true; i++) {
        //     if (condition) {
        //         b = false;
        //     }  
        // }


        // for (byte i = 0; i <= 10;) { // type promotion byte -> int by compiler
        //     System.out.println(i);
        // }

        //Nested Loops
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //Jumps Statements in java
        // break, continue

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        //     if(i>5){  // contition => (b == true)
        //         break;
        //     }
        // }


        // for (int i = 1; i <= 10; i++) {
        //     // if(i%2 != 0){       // (without using continue)
        //     //     System.out.println(i);
        //     // }
            
        //     if(i%2 == 0) continue;
        //     System.out.println(i);
        // }


        //Break in Nested Loop

        // for (int i = 1; i <= 10; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");

        //         if (j>=5) {
        //             break;
        //         }
        //     }
        //     System.out.println();
        // }


        //Labels

        // outer: for (int i = 1; i <= 5; i++) {
        // inner:      for (int j = 1; j <= i; j++) {
        //                 System.out.print("* ");

        //                 if (j>=5) break outer; // continue outer;
        //             }
        //             System.out.println();
        //         }


        //Code Blocks
        first:{
            second: {
                third: {
                    System.out.println("Hello third");
                    break first;
                }
                // System.out.println("Hello second");
            }
        }
        // you are hear after break statment


    }
}