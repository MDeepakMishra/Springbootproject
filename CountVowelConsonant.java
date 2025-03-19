public class CountVowelConsonant {
    public static void main(String[] args) {
        System.out.println("COUNT TOTL UMBER OF VOWELS AND CONSONANT");
        String str = "This is a really simple sentence";
        System.out.println(str);
        str = str.toLowerCase();
        int TOTAL_VOWELS = 0 , TOTAL_CONSO = 0 ;
        for( int i = 0 ; i < str.length() ; i++ ){
            if(str.charAt(i) == 'a'  || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'  && str.charAt(i) != ' '){
                TOTAL_VOWELS++;
            }
            else{
                TOTAL_CONSO++;
            }
            }
            System.out.println("TOTAL NUM OF VOWEL" + " " + TOTAL_VOWELS);
            System.out.println("TOTAL NUM OF CONSONANT" + " " + TOTAL_CONSO);
    }
}
