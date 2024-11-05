public class dayTwoSecond {

    public static void main(String[] args) {
        String hello = "Hello"  ;
        System.out.println(hello);
        String name = "Kaisa";
        System.out.println(hello + " " + name);

        StringBuilder sb = new StringBuilder("Hello!");
        sb.append("!");
        String string = String.valueOf(sb);  // sb.toString() ;
        System.out.println(sb);   // siia siis (string)

        // String inComingText = "Aadress Tallinn, kesklinn";


        char [] data = {'a','b','c'};
        String [] dataOfString = {"one","two","three"};
        String abc = "abc";   // sama nagu see one , two, three , ja veel sama ;
        String str = new String (data);
        System.out.println(str);

        str.length();
        System.out.println(str.length());

        String university = "University of ";
        String tallinn = "Tallinn";
        String fullName = university.concat(tallinn);
        String fullNameOfCity = university.concat(tallinn);
        System.out.println(fullName);


    }

}
