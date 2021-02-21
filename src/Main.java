import java.math.BigInteger;
import java.util.List;

class Main{
    public static void main(String[] args) {
        // Time taken: 20 min
        VowelCounter string = new VowelCounter("hola mundo");
        System.out.println(string.getString() + " has " + string.getNumberOfVowels());

        // Time taken: 20 min
        Palindrome palindrome = new Palindrome("perro");
        System.out.println("is " + palindrome.getString() + " palindrome?\n" + palindrome.isPalindrome());

        // Time taken: 60 min
        Permutations permutations = new Permutations("abc");
        List<String> perms = permutations.getPermutations();
        for (String s: perms) {
            System.out.println(s);
        }

        StringCompressor compressor = new StringCompressor("aabcccccaaa");

        System.out.println(compressor.compress());

        int n = 100;
        System.out.println("First " + n + " of Fibonacci series:");
        nFibo(n);
    }


    /*
    * As fibonacci series tends to scalate pretty fast I used BigInt to front all, this approach
    * is fast but requires more storage
    * Time taken: 15 min
    */
    private static void nFibo(int n) {
        BigInteger t1 = BigInteger.ZERO;
        BigInteger t2 = BigInteger.ONE;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");

            BigInteger sum = t1.add(t2);
            t1 = t2;
            t2 = sum;
        }
    }
}