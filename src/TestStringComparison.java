public class TestStringComparison {
    public static void main(String[] args) {
        String s1 = "Perscholas";
        String s2 = "Perscholas";
        String s3 = new String("Perscholas");
        String s4 = "Teksystem";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
