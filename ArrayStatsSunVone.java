import java.util.Scanner;

public class ArrayStatsSunVone {
    public static void main(String[] args) {
        System.out.println("How long is your array?");        
        Scanner scanner = new Scanner(System.in);        
        int arrayLength = Integer.parseInt(scanner.nextLine());
        int[] userArray = new int[arrayLength];        
        int userInt = 0;
        System.out.println("Enter the integers in your array.");
        for (int i = 0; i < arrayLength; i++) {
            userInt = Integer.parseInt(scanner.nextLine());  
            userArray[i] = userInt;
        }
        System.out.println("Your array is: ");
        for (int j = 0; j < arrayLength; j++) {
            System.out.print(userArray[j] + " ");
        } 
        System.out.println();
        System.out.println("The sum is " + userSum(userArray));
        System.out.println("The mean is " + userAvg(userArray));
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter a number to search for: ");
            int userSearchNum = Integer.parseInt(scanner.nextLine());
            System.out.println(userSearchNum + userFind(userSearchNum, userArray));
        }
        System.out.println(maxNumber(userArray) + " is the biggest number");
        System.out.println(minNumber(userArray) + " is the smallest number");
        System.out.println(secondMaxNumber(userArray) + " is the second biggest number");
    }    
    
    /* finds sum of the array
    * @param userArray the array being checked
    * @return the sum of the array 
    */
    public static int userSum(int[] userArray) {
        int sum = 0;
        for (int j = 0; j < userArray.length; j++) {
            sum += userArray[j];
        }
        return sum;
    }
    
    /* finds average of the array
    * @param userArray the array being checked
    * @return average of the array
    */
    public static int userAvg(int[] userArray) {
        int userAverage = 0;
        int sum = 0;
        for (int j = 0; j < userArray.length; j++) {
            sum += userArray[j];
        }
        userAverage = sum / userArray.length; 
        return userAverage;
    }
    
    public static String userFind(int userSearchNum, int[] userArray) {
        String inArray = " is in the array";
        String outsideArray = " is NOT in the array";
        for (int i = 0; i < userArray.length; i++) {            
            if (userSearchNum == userArray[i]) {
                return inArray;
            }         
        } return outsideArray; 
    }
    
    public static int maxNumber(int[] userArray) {
        int maximumValue = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (maximumValue < userArray[i]) {
                maximumValue = userArray[i];
            }            
        }
        return maximumValue;
    }

    public static int minNumber(int[] userArray) {
        int minimumValue = userArray[0];
        for (int i = 0; i < userArray.length; i++) {
            if (minimumValue > userArray[i]) {
                minimumValue = userArray[i];
            }            
        }
        return minimumValue;
    }

    public static int secondMaxNumber(int[] userArray) {
        int secondMax = 0;
        int firstMax = 0;          
        for (int i = 0; i < userArray.length; i++) {
            if (firstMax < userArray[i]) {
                secondMax = firstMax;
                firstMax = userArray[i];
            } else if (secondMax < userArray[i]) {
                secondMax = userArray[i]; 
            }
                
        }        
    return secondMax;
    }
}
