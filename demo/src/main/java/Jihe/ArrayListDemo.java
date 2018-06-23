package Jihe;

import java.util.ArrayList;
import java.util.Iterator;

/*
为什么出现集合类
  我们学习的是面对对象编程语言，而面对对象编程语言对事物的描述都是通过对象来体现的
  为了方便对多个对象操作就必须对多个对象进行存储
  就不能是一个基本的变量，而应该是一个容器类型的变量
  StringBuider ，数组，
  StringBuider的结果只能是一个字符串类型
  数组的长度是固定的
  局限性让java提供了集合类供我们使用
集合的特点：
长度可变。
ArrayList<E>
大小可变数组的实现
E 特殊的数据类型，泛型
构造方法：
ArrayList();


 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array= new ArrayList<String>();
        array.add("hello");
        array.add("world");
        //System.out.println("Array:"+array);
        Iterator it= array.iterator();
        //遍历集合
        while(it.hasNext()){

       String s =(String)it.next();
            System.out.println(s);
            }
        }
    }


