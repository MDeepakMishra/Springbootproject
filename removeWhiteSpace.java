public class removeWhiteSpace {
    public static void main(String[] args) {
        System.out.println("TO REMOVE WHITE SPACES FROM  A STRING");
        String str = "My Name is Deepak Kumar Mishra.";  
        System.out.println("BEFORE STRING" + " " + str);
        str = str.replaceAll("\\s+", "");
        System.out.println("BEFORE STRING" + " " + str);
    }
}
