/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
class StackMethods {
    
    static final int maxsize=5;
    int top;
    int stack_array []=new int[maxsize];
    
    
    StackMethods(){
        top=-1;
        
    }
    
    
    boolean push(int x)
    {
        if(top >= (maxsize-1))
        {
                System.out.println("Stack overflow");
                return false;
               
        }
        else
        {
            stack_array[++top] = x;
            System.out.println(x +"pushed onto stack");
            return true;
        }
    }
    
    int pop()
    {
        if(top < 0)
        {
            System.out.println("Stack underflow");
            return 0;
            
        }
        
        else
        {
            int x=stack_array[top--];
            return x;
            
        }
    }
}




class Stack
{
    public static void main(String args[])
    {
        StackMethods s=new StackMethods();
        s.push(10);
        s.push(5);
        s.push(12);
        s.push(26);
        s.pop();
        s.push(27);
        s.push(88);
        s.push(77);
    }
}