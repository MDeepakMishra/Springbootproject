public class palindrome {
    public static void main(String[] args) {
        String s = "KaNaK" ;
        System.out.println("ORGINAL STRING");
        System.out.println(s);
        s = s.toLowerCase();
        String s2 = s;
        String s1 =" ";
        for( int  i = s.length() -1 ; i >=0 ; i--){
            s1 = s1 + s.charAt(i);
        }
        System.out.println("AFTERV REVERSE STRING " +" ");
        System.out.println(s1);
        System.out.println(" NOW CHECK WEATHER STRING IS PALLINDROM OR NOT ");
        if(s2 == s1)
        {
            System.out.println("THE STRING IS PALLINDROM");
        }
        else
        {
            System.out.println("THE STRING IS NOT PALLINDROM");
        }
    }
}
