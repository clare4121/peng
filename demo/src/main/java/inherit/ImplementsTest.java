package inherit;

        import java.util.Scanner;

public class ImplementsTest implements Persons{
    private String name;
    public  ImplementsTest(String name){
        this.name=name;

    }
    public void talk() {
        System.out.println("i m talking");
    }

    public String walk(String w) {

        Scanner sc=new Scanner(System.in);
        w =sc.nextLine();
        System.out.println("12313:"+w);
        return w;
    }

    public String listen() {
        return null;
    }
    //    public static void main(String[] args) {
//        ImplementsTest it=new ImplementsTest();
//        it.talk();
//    }
    public  String  look(){
        return null;
    }
}
