import java.util.*;

import java.lang.*;
class ReversePolishNotation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Equation");
        String equation=sc.nextLine();
        int index=0;
        String stack[]=new String[equation.length()];
        int pointerToStack=0;
        while(index<equation.length())
        {
            if(equation.charAt(index)=='+'){
                int a=Integer.parseInt(stack[--pointerToStack]);
                int b=Integer.parseInt(stack[--pointerToStack]);
                stack[pointerToStack++]=b+a+"";
            }else if(equation.charAt(index)=='-'){              
                int a=Integer.parseInt(stack[--pointerToStack]);
                int b=Integer.parseInt(stack[--pointerToStack]);
                stack[pointerToStack++]=b-a+"";
            }else if(equation.charAt(index)=='/'){
                int a=Integer.parseInt(stack[--pointerToStack]);
                int b=Integer.parseInt(stack[--pointerToStack]);
                stack[pointerToStack++]=b/a+"";
            }else if(equation.charAt(index)=='*'){
                int a=Integer.parseInt(stack[--pointerToStack]);
                int b=Integer.parseInt(stack[--pointerToStack]);
                stack[pointerToStack++]=b*a+"";
            }else{
                stack[pointerToStack++]=equation.charAt(index)+"";
            }
            index++;
        }
        System.out.println("Result = "+stack[--pointerToStack]);
        sc.close();
    }
}