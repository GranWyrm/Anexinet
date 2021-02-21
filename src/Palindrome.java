public class Palindrome {
    private String string;

    public Palindrome(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    /*
    * This method takes advantage of the provided reverse functionality in StringBuilder class
    * to test if a given string is a palindrome, looking for simplicity in this code.
    * */
    public boolean isPalindrome() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.string);
        return builder.reverse().toString().equals(this.string);
    }
}
