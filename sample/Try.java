package sample;

public class Try{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append("Hello"); 
        sb.append("Bruh"); 
        sb.append("World"); 
        
        System.out.println(sb);
        System.out.println(sb);
        
        sb1.append("Cutiee");
        sb1.append(sb);
        
        System.out.println(sb);
        System.out.println(sb);
        System.out.println(sb1.toString() + sb.toString());
        System.out.println(sb1.toString() + sb.toString());
        System.out.println(sb1.toString() + sb.toString());
        System.out.println(sb1.toString() + sb.toString() + "2");

        System.out.println(sb1);

    }
}