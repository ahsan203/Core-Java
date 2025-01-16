package Practice.Collection.Ankit.List;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo
{
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push("Java");
        st.push("C++");
        st.push("C#");

        System.out.println(st);

        st.pop();

        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.search("Java"));

        System.out.println("----------- Enumeration Cursor--------------------");
        Enumeration e = st.elements();

        while(e.hasMoreElements())
        {
           String data = (String) e.nextElement();

            System.out.println(data);
        }
    }
}
