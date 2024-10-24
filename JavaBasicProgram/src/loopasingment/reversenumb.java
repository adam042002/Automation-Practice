package loopasingment;
public class reversenumb {
    public static void main(String[] args) {
        int count = 0;
        int num = 123456789; // You can change this number to test with different values

        for (; num != 0; num /= 10) {
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}

