import java.util.*;

public class Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Original string: ");
        String OriginalStr = sc.nextLine();
        String ReverseStr = "";
        //Reversing a String
        System.out.println("Original string before reversing is "+OriginalStr);
        for(int i = OriginalStr.length()-1; i >= 0; i--){
            ReverseStr += OriginalStr.charAt(i);
        }
        System.out.println("After reversing a string "+ReverseStr);

        //Swap a postition of words not reversing
        String Swap = "";
        String sArr[] = OriginalStr.split(" ");
        for(int j = sArr.length-1; j >=0; j --){
            Swap += sArr[j]+" ";
        }
        System.out.println("After swaping the position "+Swap);

        //Reversing a word without changing its position
        String ReverseNotSwap = "";
        for(String elem : sArr){
            for(int i = elem.length()-1; i >= 0; i--){
                ReverseNotSwap += elem.charAt(i);
            }
            ReverseNotSwap += " ";
        }
        System.out.println("String after reversing at its own position "+ ReverseNotSwap);
    }
}