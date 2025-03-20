public class String_Reverse {
    public static void main(String[] args) {
        System.out.println("i will reverse theoriginal string");
        String s = "DeePaK" ;
        System.out.println("ORGINAL STRING");
        System.out.println(s);
        s = s.toLowerCase();
        String s1 =" ";
        for( int  i = s.length() -1 ; i >=0 ; i--){
            s1 = s1 + s.charAt(i);
        }
        System.out.println("AFTERV REVERSE STRING " +" ");
        System.out.println(s1);
    }
}
