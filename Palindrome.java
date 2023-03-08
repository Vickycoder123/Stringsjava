import java.util.*;

public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Original String ");
        String originalStr = sc.nextLine();
        String reverseStr = "";

        for(int i = originalStr.length()-1; i >= 0; i--){
            reverseStr += originalStr.charAt(i);
        }
        if(originalStr.equalsIgnoreCase(reverseStr)){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not palindrome");
        }
    }
}