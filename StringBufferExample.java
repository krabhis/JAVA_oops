public class StringBufferExample {

    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("Abhishek");
        sb.append("reddy"); // Append "reddy" to the end
        sb.insert(8, "Java"); // Insert "Java" at index 8 (after "Abhishek")

        System.out.println(sb);

    }
}
