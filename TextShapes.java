public class TextShapes{
    public static void main(String[] args){



        for ( int i = 1; i <4; i++ ){
            System.out.println("*****");
        }
        System.out.println();

        int size = 5;
        for (int i = 1; i <= size; i++){
            for (int j = 1; j < size; j++){
                System.out.print("* ");
            }
            System.out.println("*");
        }
        System.out.println();



        size = 10;
        for (int i = 1; i <= size; i++){
            for (int j=1; j<size; j++){
                System.out.print("* ");
            }
            System.out.println("*");
        }
        System.out.println();
    }
}