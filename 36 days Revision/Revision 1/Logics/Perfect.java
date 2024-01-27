class Perfect {
    public static void main(String[] args) {
        // Perfect number is that number in which the summation of the factors are same as that main number...
        int num = 6;
        int sum = 0;
        for(int i = 1; i < num; i++){
            if (num%i == 0) {
                sum = sum + i;
                System.out.println("i is : " + i + " And sum is : "+sum);
            }
        }
        if (num == sum) {
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not perfect");
        }
    }
}