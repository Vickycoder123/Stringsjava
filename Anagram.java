import java.util.*;

public class Anagram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string ");
        String str1 = sc.nextLine();
        System.out.println("Enter another string to check ");
        String str2 = sc.nextLine();

        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char s1[] = str1.toCharArray();
        char s2[] = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        if(Arrays.equals(s1,s2)){
            System.out.println("The given string is anagram");
        }else{
            System.out.println("The given string is not anagram");
        }


    }
}