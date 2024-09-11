public class Multiples {
    public static int main(int n, int a, int b) {
        int count = 0;

        if (a == b) {
            for (int i = 1; i < n; i++) {
                if (i % a == 0 || i % b == 0) {
                    count += i;
                }
            }
        } else {
            for (int i = 1; i < n; i++) {
                if (i % a == 0 || i % b == 0) {
                    count += i;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int n = 1000;
        int a = 3;
        int b = 2;

        int result = main(n,a,b);
        System.out.println(result);
    }
}
