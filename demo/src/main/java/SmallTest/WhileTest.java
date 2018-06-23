package SmallTest;

public class WhileTest {

    public static void main(String[] args) {
        int i=0;
        while (true){
            i++;
            System.out.println(i);
            if(i>5){
                break;
            }
        }
    }
}
