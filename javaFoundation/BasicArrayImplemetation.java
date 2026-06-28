public class BasicArrayImplemetation {
    public static void main(String[] args){
        // int[] rollNums = new int[3];
        int rollNums[] = new int[3];
        //101, 102, 103

        rollNums[0] = 101;
        rollNums[1] = 102;
        rollNums[2] = 103;
        // System.out.println(rollNums[0]);
        // System.out.println(rollNums[1]);
        // System.out.println(rollNums[2]);


        // System.out.println(rollNums.length);

        // int x = 101;
        // for (int i = 0; i < rollNums.length; i++) {
        //     rollNums[i] = x;
        //     x++;            
        // }
        // for (int i = 0; i <= rollNums.length-1; i++) {
        //     System.out.println(rollNums[i]);            
        // }


        // 1-D array second method to Implement
        // int[] rollNumber = {101, 102, 103};
        // for (int i = 0; i < rollNumber.length; i++) {
        //     System.out.println(rollNumber[i]);
        // }



        //Multi-Dimensional Array------------
            // 2-D Array Immplementation

            // int row = 3,
            //     col = 3;
            // int[][] marks = new int[row][col];
            // // System.out.println(marks.length);
            // // System.out.println(marks[0].length);
            // // System.out.println(marks[1].length);

            // marks[0][0] = 23;
            // marks[0][1] = 25;
            // marks[0][2] = 45;

            // marks[1][0] = 34;
            // marks[1][1] = 11;
            // marks[1][2] = 90;
            
            // marks[2][0] = 56;
            // marks[2][1] = 23;
            // marks[2][2] = 78;
            
            // for (int i = 0; i < marks.length; i++) {
            //     for (int j = 0; j < marks[i].length; j++) {
            //         System.out.print(marks[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            
            
            //*************************************** */
            // int[][] marks = new int[3][];
            int marks[][] = new int[3][];

            marks[0] = new int[1];
            marks[1] = new int[2];
            marks[2] = new int[3];

            marks[0][0] = 23;
            // marks[0][1] = 25; // Raise Exception out of bound

            marks[1][0] = 24;
            marks[1][1] = 90;

            marks[2][0] = 12;
            marks[2][1] = 78;
            marks[2][2] = 45;

        for (int i = 0; i < marks.length; i++) {
                for (int j = 0; j < marks[i].length; j++) {
                    System.out.print(marks[i][j]+" ");
                }
                System.out.println();
            }

            //2-D array second method to Implement
            // int[][] marks = {
            //     {12,13,14},
            //     {34,34,36},
            //     {45,46,47}
            // };

            

    }
}
