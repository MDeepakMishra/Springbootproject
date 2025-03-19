public class CountPunctuation {
    public static void main(String[] args) {
        System.out.println("COUNT TOTAL NUMBER OF PUNTUATION");
        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";  
        System.out.println(str);
        int CountPunctuation = 0;
        for( int i = 0 ; i < str.length() ; i++ ){
            
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
            str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
                CountPunctuation++;
            }
            }
            System.out.println("TOTAL NUMBER OF PUNTUATIONS INTO STRING");
            System.out.println(CountPunctuation);
    }
}
