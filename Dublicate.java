public class Dublicate {
    public static void main(String[] args) {
        System.out.println("FIND DUBLICATE CHARCTERS FROM A STRING");
        String s = "KaNaKpa" ;
        s = s.toLowerCase();
        int count = 1;
        System.out.println("ORIGINAL STRING IS ");
        System.out.println(s);
        System.out.println("DUBLICATE CHARACTER ARE");
        for( int i = 0 ; i < s.length() ; i++ ){
            for( int j = i + 1 ; j < s.length() ; j++ ){
            if(s.charAt(i) == s.charAt(j)){
                count++;
                s.charAt(j)   = '0';
            }
        }
        }
    }
}
