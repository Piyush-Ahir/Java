class Prime{
    public static void main(String[] args) {
        int a = 7;
        boolean flag = false; // Assumption
        for(int i = 2; i<a; i++){
            if (a%i==0) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("It is a Prime number");
        }
        else{
            System.out.println("It's not a Prime number");
        }
    }
}