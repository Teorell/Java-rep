public class ScopeDemo{
    public static void main(String args[]){
        int x;

        x = 10;
        if (x== 10){
            int y = 20;

            System.out.println("x and y : " +x + " " + y);
            x = y * 2;
        }
        // cant print y here, because of the SCOPE!
        System.out.println("x is:" + x);
    }
}