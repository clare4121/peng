package inherit;

public class ExtendsTest extends Students{
    public ExtendsTest(String a){
        this.name=a;
    }
    public static void main(String[] args) {
        ExtendsTest et =new ExtendsTest("test");
        //new Thread(new Thread2("D")).start();
        //new Students(new ExtendsTest("test")).talk();
        et.age="20";
    }

}
