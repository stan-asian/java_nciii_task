package taskSheet_1_1_3;

class Loop{
    public static void main(String[] args) {
        int check_number = 10;
        String message;

        for(int i = 1 ; i <= check_number ; i++){
            message = i%2 == 0 ? i + " is Even number" : i + " is Odd number";
            System.out.println(message);
        }
    }   
}