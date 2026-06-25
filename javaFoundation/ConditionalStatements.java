public class ConditionalStatements {
    public static void main(String[] args) {
        // int age = 50;

        // if(age>80)
        //     System.out.println("You are very old");
        // else if(age>60)
        //     System.out.println("You are old");
        // else if(age>40)
        //     System.out.println("You are becoming old");
        // else if(age>20)
        //     System.out.println("You are young");
        // else
        //     System.out.println("You are a child");

        //************************************************** */

        // switch Statement
        // int i = 3;
        // switch (i) {  // switch(expression) -> byte, short, int, char, Enumeration
        //     case 1:
        //         System.out.println("i is 1");
        //         break;
        //     case 2:
        //         System.out.println("i is 2");
        //         break;
        //     case 3:
        //         System.out.println("i is 3");
        //         break;
        //     default:
        //         System.out.println("i is greater then 3");
        //         break;
        // }
        

        //*********************************************************************** */
        // int i = 2;
        // while(i<5){
        //     if(i == 1){
        //         System.out.println("i is 1");
        //         i++;
        //     }
        //     else if(i==2){
        //         System.out.println("i is 2");
        //         i++;
        //     }
        //     else if(i==3){
        //         System.out.println("i is 3");
        //         i++;
        //     }
        //     else {
        //         System.out.println("i is greter than 3");
        //         i++;
        //     }
        // }
        /*************************************************************************/

        //Nested Switch

        int j = 5;
        int k =2;

        switch (j) {
            case 4:
                System.out.println("J is 4");
                break;
            case 5:
                switch (k) {
                    case 1:
                        System.out.println("k is 1");
                        break;
                    case 2:
                        System.out.println("k is 2");
                        break;
                
                    default:
                        System.out.println("k is greter than 2");
                        break;
                }
            case 6:
                System.out.println("j is 6");
                break;
        
            default:
                System.out.println("j is greter than 6");
                break;
        }

    }
}
