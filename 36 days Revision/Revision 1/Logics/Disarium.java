class Disarium {
    public static void main(String[] args) {
        int num = 89;
        int num2 = num;
        int num3 = num;
        int sum = 0;
        int count = 0;

        // First we go for counting the digits...
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits or Power : "+count);

        // Now we have Number of digits then we will put it as the power of each digits
        while (num2 != 0) {
            int rem = num2 %  10;
            sum += Math.pow(rem, count);
            num2 = num2 / 10;
            count--;
        }
        System.out.println("Sum of each number with that power "+sum);

        // Now we have the sum so we are gonna compare this with given number
        if (num3 == sum) {
            System.out.println(num3 +" is a Disarium Number");
        }
        else{
            System.out.println(num3 + " is not a Disarium Number");
        }
    }    
}
