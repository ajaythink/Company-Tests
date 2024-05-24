public class StringVowel{
    public static void main(String[] aregs){
        String str = "beautifoud";
        int count = 0;
        String ans = "";
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
                ans = count + "" + ans;
            }
            else{
                ans = ch + "" + ans;
                count = 0;                
            }
        }
        System.out.println(ans);
    }
}