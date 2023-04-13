public class App {
    public static void main(String[] args) {
        int x = 5;
        String line;
        for (int i = 1; i <= x; i++) {
            line = "";
            for (int j = 1; j <= i; j++) {
                line += i;
            }
            System.out.println(line);
        }
    }
}
