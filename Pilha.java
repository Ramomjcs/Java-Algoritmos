import java.io.*;
import java.util.*;

public class Pilha{

    int elementos[];
    int topo;

    public Pilha(){
        elementos = new int[10000000];
        topo = -1;
    }

    public boolean empty(){
        return (topo == -1);
    }

    public int size (){
        return topo+1;
    }
    
    public int top(){
        return elementos[topo];
    }

    public int pop(){
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public void push(int e){
        topo++;
        elementos[topo] = e;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String entrada = in.next();

        Pilha stack = new Pilha ();
        int var = entrada.length();

        int i = 0;

        while(i < var){
            if(!stack.empty() && stack.top() == '(' && entrada.charAt(i) == ')' ){
                stack.pop();
            }else stack.push(entrada.charAt(i));
            i++;
        }
        
    System.out.println(entrada.length() - stack.size());
    }
}