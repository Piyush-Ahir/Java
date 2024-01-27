class Happy {
    static int happy(int no) {
        int rem = 0;
        int sum = 0;
        while (no != 0) {
            rem = no % 10;
            sum = sum + rem * rem;
            no = no / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int no = 23;
        int res = no;
        while (res != 1 && res != 4) {
            res = happy(res);
        }
        if (res == 1) {
            System.out.println("Happy number");
        } else if (res == 4) {
            System.out.println("not happy number");
        }
    }
}
