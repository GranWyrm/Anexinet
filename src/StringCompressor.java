import java.util.HashSet;

public class StringCompressor {
    private String string;

    public StringCompressor(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    /*
    * Not so simple but this uses the string builder to append the current char and the number of times
    * it is repeated before the character changes and starts to count it again
    * */
    public String  compress() {
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for (int i = 0; i < this.string.length(); i++) {
            if (i < this.string.length() - 1) {
                if (this.string.charAt(i) == this.string.charAt(i + 1)) {
                    count++;
                }
                else {
                    builder.append(this.string.charAt(i)).append(count);
                    count = 1;
                }
            }
            else {
                builder.append(this.string.charAt(i)).append(count);
            }
        }

        return builder.toString();
    }
}
