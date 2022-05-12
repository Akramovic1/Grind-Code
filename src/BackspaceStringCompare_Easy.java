import java.util.Stack;

public class BackspaceStringCompare_Easy {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c != '#')
                stack.push(c);
            else if(!stack.isEmpty())
                stack.pop();
        }
        return String.valueOf(stack);
    }
}
