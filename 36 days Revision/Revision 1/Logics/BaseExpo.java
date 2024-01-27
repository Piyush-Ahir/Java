class BaseExpo {
    public static void main(String[] args) {
        int base = 4;
        int exp = 5;
        int ans = 1;
        while (exp != 0) {
            ans = ans * base;
            exp--;
            System.out.println("Tracing Part " + ans);
        }
        System.out.println("Final answer is " + ans);
    }
}
