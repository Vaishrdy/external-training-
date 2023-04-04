import java.util.*;
import java.util.ArrayList;

public class queueds{
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.remove(0);
        System.out.println(arr.get(0));
        System.out.println(arr.size());

        //implementing queue
        stack ob=new queue();
        ob.push(5);
        ob.push(6);
        ob.pop();
        ob.push(8);
        ob.printqueue();
        ob.printrev();
    }
}
class queue{
    ArrayList<Integer> qu= new ArrayList<Integer>();
    int size=5;
    public void push(int element){
        if(qu.size()==size){
            System.out.println("overflow:stack is full");
        }
        else{
            qu.add(element);
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("underflow: stack is empty");
        }
        else{
            qu.remove(qu.size()-1);
        }
    }
    public boolean isEmpty(){
        if(qu.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void printstack(){
        for (int i = 0; i < qu.size(); i++)
            System.out.print(qu.get(i)+" ");
            System.out.println();
    }
    public void printrev(){
        for(int i=qu.size()-1;i>=0;i--){
            System.out.print(qu.get(i)+" ");
        }
    }
}
