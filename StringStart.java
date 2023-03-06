public class StringStart{
    public static void main(String args[]){
        //Immutable String class
        String brand = "pwskill";
        System.out.println(brand);
        //new object is created in heap area but does not affect the original object 
        brand.concat("Mumbai");
        System.out.println(brand);

        //Mutable stringBuilder class object
        StringBuilder brand1 = new StringBuilder("pwskills");
        System.out.println(brand1);
        //Changes will be reflected in same object only
        brand1.append("Mumbai");
        System.out.println(brand1);

    }
}