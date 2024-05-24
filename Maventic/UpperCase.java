public class UpperCase {
    public static void main(String[] args){
        String string = "Welcome to my home";
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        //Severse order 
        StringBuilder string1 = new StringBuilder();
        string1.append(string);
        string1.reverse();
        System.out.println(string1);

        String ans = "";
        for(int i = string.length()-1; i>=0; i--){
            ans =   ans + "" + string.charAt(i);
        }
        System.out.println(ans);
        
       String result = "";
       for(int i=0; i<string.length(); i++){
        result  = string.charAt(i)+""+result;
 
       }
       System.out.println(result);
    }


}
