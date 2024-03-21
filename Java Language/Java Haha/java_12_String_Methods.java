public class java_12_String_Methods
{
    public static void main(String[] args)
    {
        System.out.println("\n---- String Methods ----");
        String name = "Aman";
        System.out.println(name);

        System.out.println("\n---- name.length() ----");
        int length = name.length();
        System.out.println(length);

        System.out.println("\n---- name.toLowerCase() ----");
        String lowerstring = name.toLowerCase();
        System.out.println(lowerstring);

        System.out.println("\n---- name.toUpperCase() ----");
        String upperstring = name.toUpperCase();
        System.out.println(upperstring);

        System.out.println("\n---- name.trim() ----");
        String nonTrimmedString = "    Aman    ";
        System.out.println(nonTrimmedString);
        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);

        System.out.println("\n---- name.substring( int start ) ----");
        System.out.println(name.substring(2));

        System.out.println("\n---- name.substring( int start,int end ) ----");
        System.out.println(name.substring(1,3));

        System.out.println("\n---- name.replace( oldChar,newChar ) ----");
        System.out.println(name.replace('A','N'));
        System.out.println(name.replace("man","dam"));
        System.out.println(name.replace("A","Sha"));

        System.out.println("\n---- name.startsWith() ---- ");
        System.out.println(name.startsWith("Am"));
        System.out.println(name.startsWith("Nm"));

        System.out.println("\n---- name.endsWith() ---- ");
        System.out.println(name.endsWith("an"));
        System.out.println(name.endsWith("ma"));

        System.out.println("\n---- name.charAt( int )");
        System.out.println(name.charAt(1));

        System.out.println("\n---- name.indexOf() ----");
        System.out.println(name.indexOf("m"));
        String name3 = "science";
        System.out.println(name3.indexOf("e",3));

        System.out.println("\n---- name.lastIndexOf() ----");
        System.out.println(name.lastIndexOf("m"));
        System.out.println(name3.lastIndexOf("e",4));

        System.out.println("\n ---- name.equals() ----");
        System.out.println(name.equals("Aman"));

        System.out.println("\n ---- name.equalsIgnoreCase() ----");
        System.out.println(name.equalsIgnoreCase("aman"));









    }
}
