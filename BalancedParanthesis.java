import java.util.*;

import java.lang.*;
class BalacedParanthesis{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Equation");
        String equation=sc.nextLine();
        int index=0;
        String stack[]=new String[equation.length()];
        int pointerToStack=0;
        while(index<equation.length())
        {
            if(equation.charAt(index)=='{')
            {
                stack[pointerToStack++]="{";
            }
            else if(equation.charAt(index)=='}'){
                stack[--pointerToStack]="";
            }
            index++;
        }
        for(int i=0;i<equation.length();i++)
        {
            if(stack[i]!=""&&stack[i]!=null)
            {
                System.out.println("Not Balanced");
                return;
            }
        }
        System.out.println("Balanced");
    }
}