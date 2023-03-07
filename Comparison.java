public class Comparison{
    public static void main(String args[]){
        String n1 = "abc";
        String n2 = "abc";
        String s1 = new String("abc");
        String s2 = new String("Abc");

        System.out.println(n1 == n2); //true refer to same object in scp
        System.out.println(n1.equals(n2)); //true as content are same
        System.out.println(n1 == s1); //false
        System.out.println(n1.equals(s1)); //true
        System.out.println(n1 == s2); //false
        System.out.println(n1.equals(s2)); //false
        System.out.println(n1.equalsIgnoreCase(s2)); //true as content are same after removing case sensitivity
    }
}