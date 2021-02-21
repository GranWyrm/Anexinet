class Main{
    public static void main(String[] args) {
        // Time taken: 20 min
        VowelCounter string = new VowelCounter("hola mundo");
        System.out.println(string.getString() + " has " + string.getNumberOfVowels());

        // Time taken: 20 min
        Palindrome palindrome = new Palindrome("perro");
        System.out.println("is " + palindrome.getString() + " palindrome?\n" + palindrome.isPalindrome());
    }
}