public class StringVowelCount {
    public static void main(String[] aregs){
        String str = "beautifoud";
        int count = 0;
        String ans = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;                
            }
            else{
                if(count > 0){
                    for(int j=0; j < count; j++){
                        ans = ans + "" + count;
                    }
                    count = 0;   
                }
                ans = ans + ""+ ch;                             
            }
        }
        System.out.println(ans);
    }
}
