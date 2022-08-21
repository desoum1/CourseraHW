import java.util.Stack;
// import queue
import java.util.Queue;
import java.util.LinkedList;


public class bracketCheck {
     public static void main(String[] args){ 
        String brack = ")()))(";
        Stack<Character> stack = new Stack<Character>();
        int bracks= 0;
        System.out.println(stack);
        String textInvert = "";
         for(int i = 0; i<brack.length();i++){
             stack.push(brack.charAt(i));
             
         }
         for(int i = 0; i<brack.length();i++){
         textInvert += stack.pop();
         
        }
        for(int i = 0; i<textInvert.length();i++){
            stack.push(textInvert.charAt(i));
     }
     System.out.println(stack);
     for(int i = 0; i<textInvert.length() ;i++){
         System.out.println(stack);
         char x = stack.pop();
         if (x == '(' ){
            bracks+=1;
        }
        else if(x == ')' & bracks > 0){
            bracks -= 1;
        }
        
        }
        System.out.println(stack);
        if (bracks == 0){
            System.out.println("Suitable");
        }
        else{
            System.out.println("invalid");
        }
    }
}