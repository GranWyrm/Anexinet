public class VowelCounter {
    private String string;

    public VowelCounter(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    /*
    * This approach is easier to read, take advantage of the behaviour of switch case.
    * */
    public long getNumberOfVowels() {
        long count = 0;
        for (char c : this.string.toCharArray()) {
            switch (c) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    count++;
                    break;
            }
        }

        return count;
    }
}
