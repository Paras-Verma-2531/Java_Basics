package GenericTypes;
public class GenericMain {
    public static void main(String[] args) {
        GenericExample<String> st= new GenericExample<>("paras");// String type caste generic type
        st.show();
        System.out.println(st.getOb());
    }
}
