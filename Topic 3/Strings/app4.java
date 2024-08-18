public class app4 {
    public static void main(String[] args) {
        System.out.println("String Methods");
        String name = "Prince";
        String name1 = "Pr in ce";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name1.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(3, 5));
        System.out.println(name.replace("P", "V"));
        System.out.println(name.startsWith("P"));
        System.out.println(name.startsWith("V"));
        System.out.println(name.endsWith("V"));
        System.out.println(name.indexOf("r", 4));
    }
}
