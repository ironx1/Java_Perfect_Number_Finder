public class Main {
    public static long perfectNumber(int p)
    {
        return (long) ((Math.pow(2,p-1))*(Math.pow(2,p) - 1));
    }
    public static boolean isPrime(int val)
    {
        for (int i = 2; i < val; i++) {
            if (val%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        for (int i = 2; i <= 20; i++) {
            int val = (int)Math.pow(2, i) - 1;
            if (isPrime(i)&&isPrime(val))
            {
                System.out.println(perfectNumber(i));
            }
        }
    }
}
