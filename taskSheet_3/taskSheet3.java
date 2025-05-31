package taskSheet_3;

public class taskSheet3{
    public static void main(String[] args) {
        String a = "Wow";
        String b = a;
        String c = "Ulam!";
        String d = "Wow!";

        boolean b1 = (a == b);
        System.out.println(b1);

        boolean b2 = d.equals(b + "!");
        System.out.println(b2);
        
        boolean b3 = !c.equals(a);
        System.out.println(b3);

        if(b1 && b2 && b3){
            System.out.println("Success!");
        }else{
            System.out.println("Failed!");
        }
        
    }
}