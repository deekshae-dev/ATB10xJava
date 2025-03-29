package Ex_13_Strings;

public class Lab122_Ex9 {
    public static void main(String[] args) {

        //length():
        String name = "Subhan";
        System.out.println(name.length());
       // System.out.println(name.charAt(2));
     // System.out.println(name.charAt(10));
     // for this we will get an exception called StringIndexOutOfBoundsException

        //concat():
        System.out.println(name.concat("Rao"));

        //contains():
        System.out.println(name.contains("an"));
        System.out.println(name.contains("no"));

        //equalsIgnoreCase():
        System.out.println(name.equalsIgnoreCase("subhan"));

        //indexOf():
        System.out.println(name.indexOf('h'));

        //replace():
        System.out.println(name.replace('h','a'));

        //split():
        String name1 = "lovelysingh@live.com@12345";
        String[] split = name1.split( "@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //substring():
        //String pass1 = "Please. help me quickly";
        //String pass2 = pass1.substring(8,11);
        System.out.println(name.substring(1,3));
        String name2 = "Lakshmi";
        System.out.println(name2.substring(1,4));

        //toLowerCase():
        System.out.println("MAHITHA".toLowerCase());

        //startsWith():
        System.out.println(name2.startsWith("Lak"));
        System.out.println(name2.startsWith("L"));

        //endsWith():
        System.out.println(name2.endsWith("K"));
        System.out.println(name2.endsWith("i"));

        //trim():
        String name3 = "    Matching Centre   ";
        System.out.println(name3.trim());

        //compareTo():
        System.out.println(name2.compareTo("Lakshmitha"));

        //compareToIgnoreCase():
        System.out.println(name2.compareToIgnoreCase("LAKSHMIKA"));

        //append():
        StringBuilder str = new StringBuilder("Knowledge");
        str.append(" is divine");
        System.out.println(str);

    }

}
