package data_structure;

public class StackMain {

    public static void main(String[] args) {


        Stack stck=new Stack();
        stck.push(1);
        stck.push(2);
        stck.push(3);
        stck.push(4);
        stck.push(5);

        System.out.println(stck.peek());
        System.out.println(stck.peek());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
       stck.show();
    }


}

class Stack {

    int stack[] = new int[5];
    int top = 0;
    public void push(int data) {
        stack[top]=data;
        top++;
    }
    public int pop(){

        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;


    }

    public int peek(){

        int data;
        top--;
        data=stack[top];
        return data;


    }

    public void show(){

        for(int n:stack){
            System.out.print(n+" ");
        }

    }
}
