package catchDemo;

public class T {
    public static void main(String[] args) {
        int b=10;
        System.out.println("1:"+b);
    try {
        System.out.println("2:" + b );
    }finally {
        System.out.println("finally");
    }
//    catch (Exception e){
//
//e.printStackTrace();
//
//        }
        System.out.println("3:"+b);
    }
}
