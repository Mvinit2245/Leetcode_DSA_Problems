class PalindromeEx {
    public static boolean isPalindrome(int x) {

        if (x< 0) return false;

        int rev =0;
        int y = x;
        while(x>0){
            int var = x%10;
           
            rev = rev*10 + var;
            x = x/10; 
        }
        

       return y == rev;
        
    }


    public static void main(String[] args) {
        int x=121;
         boolean res = isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? \n" + res);
    }
}