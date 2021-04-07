public class Palindrome{
    public static boolean is_palindrome(String s)
    {
      int n = s.length();
        boolean T=true;
        int i=n-1;
        
        while(i!=0){
          if(s.charAt(i)!=s.charAt(n-1-i))
          {
            i=0;
            T=false;
          } else{
            i--;

          }

      
          
        }
 
        return T;
    }
}
