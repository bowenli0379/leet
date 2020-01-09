package Math;

public class CountPrimes_204 {
    public static int countPrimes(int n){
        if (n < 2)
            return 0;
        boolean[] prime = new boolean[n];
        for (int i = 2; i < n; i++){
            prime[i] = true;
        }
        int sqrt = (int)Math.sqrt(n);
        for (int p = 2; p <= sqrt; p++){
            if (prime[p]){
                for (int i = p * p; i < n; i += p){
                    prime[i] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++){
            if (prime[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 100;
        System.out.println(countPrimes(n1));
        System.out.println(countPrimes(n2));
    }
}
