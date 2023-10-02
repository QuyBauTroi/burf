package Main;

public class Main {

    public static void main(String[] args) {
        // Để chuỗi s thành “I love you forever”
        String s = "I love you";

        // Nối chuỗi với "forever"
        s += " forever";

        System.out.println(s); // "I love you forever"

        // Để chuỗi thành “I love y”
        String s1;
        s1 = s.substring(0, 8);

        System.out.println(s1); // "I love y"

        // Để chuỗi thành “I hate you”
        s1 = s.substring(0, 2);
        String s2 = s.substring(2, 6);
        String s3 = s.substring(6, 10);

        s2 = "hate";

        s = s1 + s2 + s3;

        System.out.println(s); // "I hate you"
    }
}
