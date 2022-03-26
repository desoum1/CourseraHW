import java.util.Stack;
// import queue
import java.util.Queue;
import java.util.LinkedList;


public class Reverseal {
    
        public static void main(String[] args){   
            String text = "abcdef";
          Stack<Character> stack = new Stack<Character>();
            String textInvert = "";
         for(int i = 0; i<text.length();i++){
             stack.push(text.charAt(i));
             
         }
         for(int i = 0; i<text.length();i++){
         textInvert += stack.pop();
         
        }
        System.out.println(textInvert);
    }
}
