public class String2Char {
    public static void main(String[] args) {
        System.out.println("CONVERT STRING TO ITS ALL CHARACTERS ");
        String s = "Deepak" ;
        System.out.println("ORIGINA STRING");
        char[] ch = new char[s.length()];
        for( int i = 0 ; i < s.length() ; i++ ){
              ch[i]=s.charAt(i);
            }
        System.out.println("ALL CHARACTERS ARE");
        for( int i = 0 ; i < ch.length; i++ ){
             System.out.print(ch[i] +" ");
            }

    }
}
