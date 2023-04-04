import java.util.*;
import java.util.ArrayList;

/*class Stack{
    ArrayList<Integer> stk=new ArrayList<Integer>();
    public void push(int element){
        if (stk.size()==size){
            System.out.println("Overflow: Stack is Full");
        }
    }
    public void pop(){

    }
    public int peek(){
        if(!isEmpty()){
            System.out.println("Underflow:Stack is Empty");
        }else{
            stk.remove(stk.size()-1);
        }
    }
}
public class stackds{
    public static void main(String args[]){
        stack ob=new stack();
        ob.push(10);
        ob.printStack();
        ob.pop();
        ob.printStack();
        ob.peek();
        ob.printStack();
    }
}*/


//to print elements of stack in correct order like if we give 1,2,3,4,5 then we get have
//stack elements as from top 5,4,3,2,1 so print from top like 1,2,3,4,5 only

public class stackds {
    public static void main(String args[]){
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.remove(0);
        System.out.println(arr.get(0));
        System.out.println(arr.size());

//implementing stack
        stack ob = new stack();
        ob.push(5);
        ob.push(6);
        ob.pop();
        ob.push(8);
        ob.printstack();
        ob.printrev();
    }
} 
class stack{
    ArrayList<Integer> stk= new ArrayList<Integer>();
    int size=5;
    public void push(int element){
        if(stk.size()==size){
            System.out.println("overflow:stack is full");
        }
        else{
            stk.add(element);
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("underflow: stack is empty");
        }
        else{
            stk.remove(stk.size()-1);
        }
    }
    public int peek(){
        if(isEmpty()){
            return stk.get(stk.size());
        }
        else{
            System.out.println("stack is empty");
            return -1;

        }    
    }
    public boolean isEmpty(){
        if(stk.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void printstack(){
        for (int i = 0; i < stk.size(); i++)
            System.out.print(stk.get(i)+" ");
            System.out.println();
    }
    public void printrev(){
        for(int i=stk.size()-1;i>=0;i--){
            System.out.print(stk.get(i)+" ");
        }
    }
}
