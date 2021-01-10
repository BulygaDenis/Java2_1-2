public class Main {
    public static void main(String[] args) {
        int score = 100;
        int transfer = 100;
        int bonus;
        int limit = 1000;
        if (transfer < limit) {
            bonus = 0;
        } else {
            bonus = transfer / 100;
        }
        int account = score + transfer + bonus;
        System.out.println(account);
    }
}
