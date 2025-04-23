package Ex_19_WrapperClasses;

public class Wrapper_Ex3_Auto_Un_Boxing {
    public static void main(String[] args) {
        //autoboxing means if you have a smaller primitive datatype
        //you are trying to assign it to a bigger primitive datatype
        //then it will automatically convert it to the bigger primitive datatype
        //and this is called autoboxing which is done by JVM.
        //after we assign the primitive datatype to wrapper class one then it
        //automatically they will have all the attributes and behaviour as
        //wrapper class has.
        int a1 = 10;
        Integer b1 = a1;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b1.intValue());
                        //Boxing means automatically int -> Integer will happen

        //unboxing means converting back to primitive datatype
        Integer a2 = 25;
        int b2 = a2;
        System.out.println(b2);

    }
}
