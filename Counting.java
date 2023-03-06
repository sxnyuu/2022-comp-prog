public class Counting {
    public static void main(String[] args) {
    //1-25 
    for (int i = 1 ; i < 26; i++){
        System.out.println(i);
     }
    System.out.println();

    //-5-10
    for (int i = -5; i < 11; i++){
        System.out.println(i);
    }
    System.out.println();
        
    // 30-100 by 7
    for (int i = 30; i < 101; i += 7){
        System.out.println(i);
    }
    System.out.println();
        
    // 10-0
    for (int i = 10; i > -1; i--){
        System.out.println(i);
    }
    System.out.println();
        
    // 1-25 squared
    for (int i = 1 ; i < 26; i++){
        System.out.println(i*i);
     }
    System.out.println();
        
    for (int i = 1;  i < 6 ; i++){
        for (int j = 1; j < 5; j++){
            System.out.println(i + "x" + j + "=" + i * j);
        }
    }
    }
}