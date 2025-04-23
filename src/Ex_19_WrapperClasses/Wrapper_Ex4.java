package Ex_19_WrapperClasses;

public class Wrapper_Ex4 {
    public static void main(String[] args) {
        String num = "10";
        Integer a = Integer.parseInt(num);
        //we can covert string to int using parseInt method
        System.out.println(a);

        //we can also convert string to double
        String num1 = "10.5";
        Double b = Double.parseDouble(num1);
        System.out.println(b);

        //we can also convert string to boolean
        String num9 = "true";
        Boolean c = Boolean.parseBoolean(num9);
        System.out.println(c);

        //we can also convert string to short
        String num7 = "10";
        Short e = Short.parseShort(num7);
        System.out.println(e);

        //we can also convert string to byte
        String num6 = "10";
        Byte f = Byte.parseByte(num6);
        System.out.println(f);

        //we can also convert string to long
        String num5 = "10";
        Long g = Long.parseLong(num5);
        System.out.println(g);

        //we can also convert string to float
        String num4 = "10.5";
        Float h = Float.parseFloat(num4);
        System.out.println(h);

        //we can also convert string to character
        String num3 = "a";
        Character d = num3.charAt(0);
        System.out.println(d);

        //we can also convert this into primitive datatype
        //string to primitive conversion
        int i = Integer.parseInt(num);
        // the conclusion is that using parseInt() method we can convert
        //a string into a wrapper integer also and primitive integer also

    }

}
