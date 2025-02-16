class Solution {

    static class Stack_LL {
        Node top; 
        public void push(char val) {
            Node newNode = new Node(val);
            if (top == null) {
                top = newNode;
                return;
            }
            newNode.next = top;
            top = newNode;
        }
        public char pop() {
            if (top == null) {
                throw new RuntimeException("Stack is empty!"); 
            }
            char value = top.val;
            top = top.next;
            return value;
        }

        public char peek() {
            if (top == null) {
                throw new RuntimeException("Stack is empty!"); 
            }
            return top.val;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    static class Node {
        char val;
        Node next;

        Node(char val) {
            this.val = val;
            this.next = null;
        }
    }

    
    public static boolean isValid(String s) {
        Stack_LL stack = new Stack_LL();

        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop(); 
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("{[]}")); // true
    }
}