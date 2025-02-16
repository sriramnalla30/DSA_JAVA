import java.util.*;
class Simplify_Path{
    public static void main(String args[]){
        String str="/a//b/../c/d/."; //ans: /a/c/d
        Simplify_Path o=new Simplify_Path();
        System.out.println(o.simplifyPath(str));
    }
    public String simplifyPath(String path) {
        String[] arr = path.split("/+");
        int count = 0;
        for (String s : arr)
            if (!s.isEmpty()) {
                count++;
            }
        String result[] = new String[count];
        int ind = 0;
        for (String s : arr) {
            if (!s.isEmpty())
                result[ind++] = s;
        }
        return check(result);
    }

    public static String check(String[] arr) {
        Stack<String> st = new Stack<>();
        for (String s : arr) {
            if (s.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();  
                }
            } else if (s.equals(".")) {
                continue;  
            } else {
                st.push(s);  
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String dir : st) {
            sb.append("/").append(dir);
        }
        return sb.length() > 0 ? sb.toString() : "/";
    }

}