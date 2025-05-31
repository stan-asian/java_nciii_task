package taskSheet_4;

public class taskSheet4 {
    public static void main(String[] args) {
        System.out.println("Open!");
        String target = "eatae";
        boolean result = isPalindrome(target);
        System.out.println((result) ? "A Palindrome!" : "Not a palindrome!");
    }

    static boolean isPalindrome(String str){

        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }
}
