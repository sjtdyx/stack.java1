 import java.util.Stack;
 public class BalancedParentthese {
    Stack<Character> stack=new Stack<>();
public void balancedParentthese(String expression){
    for(char bracket:expression.toCharArray()){
        if(bracket=='{'||bracket=='('||bracket=='['){
            stack.push(bracket);
        }else if (bracket=='}'||bracket==')'||bracket==']'){
        if(stack.isEmpty()||!isItBalanced(stack.pop(),bracket)){
            System.out.println("the expression is not balanced");
            return;
        }
        }
    }
    System.out.println("the expression is banlanced");

    
}
public boolean isItBalanced(char open,char close){
    
    if(open=='{'&&close=='}'){
        return true;}
     if(open=='('&&close==')')  {
        return true;}
     if(open=='['&&close==']')  {
        return true; } 
        return false;
     } 

        
       


    
} 

