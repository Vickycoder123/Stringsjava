public class StringComparision{
    public static void main(String args[]){
        //Same Object will be created in SCP which is part of Heap area refered by name1 & name2
        String name1 = "Vikas";
        String name2 = "Vikas";
        System.out.println(name1 == name2); //true

        //different object will be created for name3 and name4 reference
        String name3 = new String("Vikas");
        String name4 = new String("Vikas");
        System.out.println(name3 == name4);//false


    }
}