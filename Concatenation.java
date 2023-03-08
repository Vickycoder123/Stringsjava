public class Concatenation{
    public static void main(String args[]){
        String s1 = "Vikas";
        String s2 = new String("kumar");
        String s3 = s1.concat(s2);
        String s4 = "Gupta";
        String s5 = s3.concat(s4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        String s6 = s1 + "Sachin" + 99;
        System.out.println(s6);
    }
}