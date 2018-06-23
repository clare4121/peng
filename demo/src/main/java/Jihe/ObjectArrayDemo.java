package Jihe;

import StaticWay.Students;

public class ObjectArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student s1 = new Student("林青霞", 27);
        Student s2 = new Student("李玉", 21);
        Student s3 = new Student("刘霞", 30);
        Student s4 = new Student("王丽", 47);
        Student s5 = new Student("张昊", 47);
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;
        students[4]=s5;
        for (int i = 0; i < students.length; i++) {
//    System.out.println(students[i]);
            //只有当类中含有toString方法时才会正确输出数组元素，否则只会输出数组地址
            Student s = students[i];
            System.out.println(s.getName() +"-------"+ s.getAge());
        }


    }
}
