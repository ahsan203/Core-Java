package Practice.Collection.Durga;

import java.util.Stack;

public class Test6
{
    public static void main(String[] args) {


        Stack st = new Stack();

        st.push("Ahsan");
        st.push("Shoeab");
        st.push("Zaki");
        st.push("Nomaan");
        st.push("Muzammil");
        st.push("Ismail");
        st.push("Hisham");

        System.out.println("Stack (LIFO) : " + st);

        Object last_element = st.peek();
        System.out.println("Last-element of Stack (peek) : " + last_element);

        Object removed_element = st.pop();
        System.out.println("Removed LIFO element : " + removed_element);

        System.out.println("After removing LIFO : " + st);

        int searching_element_offset = st.search("Muzammil");
        System.out.println("Muzammil-offset : " + searching_element_offset);

        boolean stack_empty = st.empty();
        System.out.println("Is Stack empty : " + stack_empty);
    }
}
