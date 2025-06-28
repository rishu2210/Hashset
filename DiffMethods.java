import java.util.HashSet;
public class DiffMethods{
    public static void main(String args[]){
        HashSet<String> st = new HashSet<>();
        st.add("Rishu");
        st.add("Vaishu");
        st.add("Rishu");
        System.out.println(st); //duplicate values will not get printed
        System.out.println(st.contains("Vaishu")); //true
        System.out.println(st.size()); //2
        st.remove("Rishu");
        System.out.println(st.contains("Rishu"));
        System.out.println(st.size());
        st.add("Shipra");
        for(String s:st){
            System.out.println(s);
        }
    }
}