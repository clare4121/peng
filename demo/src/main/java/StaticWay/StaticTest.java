package StaticWay;

public class StaticTest {

    public void Test() {

//Students.walk();
//Students.name=""
        Test1();
    }

    public static void main(String[] args) {
           Students s= new Students();
           Students.walk();
           s.walk();
       // Students.age="cyy";
        // 这个方法是非静态了所以不能使用调用.
           s.age="wer";
        //但是这个实例又是阔以调用的
                 Students.name="qwe";
                 s.name="kaoooo";
                 s.look();
    }
    public  void Test1(){
    }

}
