import java.util.*;
import java.util.Scanner;
//single level
/*class A{
    String name="in class a";
    public void Welcome(){
        System.out.println("Welcome to class A");
    }
}
class B extends  A{
    //here if we give a strin name="Shivani" we also get Shivani as output as child overwrites parent
}
public class inherit{
    public static void main(String srgs[]){
        B ob=new B();
        System.out.println(ob.name);
        ob.Welcome();
    }
}*/

/* 
//multilevel
class A{
    String name_1="in class a";
    public void Welcome(){
        System.out.println("Welcome to class A");
    }
}
class B extends  A{
    String name_2="in class b";
    public void home(){
        System.out.println("Welcome home in class b");
    }
}
class C extends B{
    public void zoo(){
        System.out.println("Welcome to zoo");
    }
}
public class inherit{
    public static void main(String args[]){
        B ob=new B();
        System.out.println(ob.name_1);
        ob.Welcome();//here the output will be class A 
        //ob.home(); then op will be class b
        //ob.zoo; then op will be  class c
        //if class c extends A then class c has no relation to b
    }
}*/
/* 
//Hierarchial
class dept{
    String name="Iam ECE";
    public void branch(){
        System.out.println("Welcome to ECE");
    }
}
class faculty extends dept{
    String name="Em levv";
    public void facult(){
        System.out.println("I pretend to teach");
    }
}
class student extends dept{
    String name="Manchipillalu";
    public void stud(){
        System.out.println("Memu amayakulam");
    }
}
public class inherit{
    public static void main(String args[]){
        dept ob=new dept();
        System.out.println(ob.name);
        ob.branch();
    }
}*/
/* 
//Multiple
//************the reason of not supporting multiple inheritence in java is DIAMOND PROBLEM ie., it has two parents of same method the compiler doesnot know from which class and which method  to execute 
//to use multiple we use INTERDFACE in java****************
interface A{
    public void Welcome();
        public void something();
}
interface B{
    public void Welcome();
}
class C implements A,B{//the methods declared in parent shld be defined here
    public void Welcome(){
        System.out.println("Welcome to Class c");
    }
    public void something(){

    }
}
public class inherit{
    public static void main(String args[]){

    }
}
//Interfaces have only method declaration.They are public,static and final.Child class acquires props of parent class.
*/

/*//concept of array list
import java.util.*;
import java.util.Scanner;
public class inherit{
    class Book{
        String name;
        int bookid;
        int count;
    }
    public Book(String name,int bookid,int count){
        this.name=name;
        this.id=bookid;
        this.count=count;
    }
    class library{
        ArrayList <Book> books = new ArrayList <Book>();
        public void add_book(Book b){
            this.books.add(b);
        }
        public boolean check(Book b){
            for(Book bk:this.books){
                if (bk.id==b.id){
                    return true;
                }
            return false;
            }
        }
    }
}
*/

/*

 * /
 //method overriding
import java.util.*;
import java.util.Scanner;
class shape{
    public void area(){
        System.out.println("Area is:");
    }
}
class square extends shape{
    public void area(){  
        int a=4;
        System.out.println(a*a);
    }
}
class triangle extends shape{
    public void area(){
        int l=4;
        int b=2;
        System.out.println(l*b);
    }
}
public class inherit{
    public static void main(String args[]){
        square ob = new square();
        ob.area();
    }
}
*/

/* 
//ABSTRACT CLASS
import java.util.*;
import java.util.Scanner;
//interface variables are always static and final and cannot create a object directly
//Abstarct class variables can be static and non static and final and cannot create a object directly
abstract class Animal{
    abstract public void welcome();
    public void print(){
        System.out.println("Hello people");
    }
}
class dog extends animal{
    public void welcome(){
        System.out.println("Welcometo java training");
    }
}
public class inherit{
    public static void main(String args[]){
        dog ob=new dog();
        ob.welcome();
    }
}
*/

