package model;


public class User {
    private  String  id;


    public String  passid;
    public String name;
    protected String mail;
    private int age;
    private static String type="地球人";
//上述为user的四个属性 id name mail age。并非构造方法，另外注意private public的区别

    public User(String name, String mail, int age,String passid) {
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.passid=passid;
    }

    public  String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getPassid() { return passid; }
    public void setPassid(String passid) { this.passid = passid; }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<18||age>100){
            System.out.println("年龄参数错误");
            this.age=0;
            return;
        }
        else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", age=" + age +
                '}';
    }

    public User() {

    }
}
