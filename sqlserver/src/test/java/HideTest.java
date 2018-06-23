public class HideTest{


    public static void main(String[] args) {
            Derived d = new Derived();
            //System.out.println(d.tag);
            System.out.println(((Parent) d).tag);
        }
}

