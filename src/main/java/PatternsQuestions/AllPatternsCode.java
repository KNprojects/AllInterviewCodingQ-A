package main.java.PatternsQuestions;

public class AllPatternsCode {

    //https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(8);
        pattern4(6);
        pattern5(5);
    }

   static void pattern1(int n){
        for (int row = 1; row <= n; row++){

            //for every row run the col is also n here
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }

            //when row is printed new need to add a new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++){

            //for every row run the col
            for (int col = 1; col <= n; col++){
                System.out.print("1 ");
            }

            //when row is printed nwe need to add a new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 0; row <= n; row++){

            //for every row run the col
            for (int col = 1; col <= n-row*1; col++){
                System.out.print("* ");
            }

            //when row is printed nwe need to add a new line
            System.out.println();
        }
    }



    static void pattern4(int n){
        for (int row = 1; row <= n; row++){

            //for every row run the col
            for (int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }

            //when row is printed nwe need to add a new line
            System.out.println();
        }
    }


    static  void pattern5(int n){

        for (int row = 0; row < 2 * n; row++){
            int totalColsInRow=row > n ? 2 * n - row: row;

            for (int col =0; col <totalColsInRow; col++) {

                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
