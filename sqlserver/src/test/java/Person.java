 public class Person{
    private String name;
    private int age;

     public void SetName(String name) {
         if (name.length()>6||name.length()<2){
             System.out.println("name error");

             return ;
         }
         else{
           this.name= name;
         }

     }

     public String getName() {
         return  this.name;
     }
     public void setAge(int age){
         if(age>100||age<0){
             System.out.println("age error");
             return;
         }
         else{
             this.age =age;
System.out.println(+age);
         }
     }
     public int getAge(){
         return  this.age;
     }
 }
