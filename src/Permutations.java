import java.util.ArrayList;
import java.util.List;

public class Permutations {
    private String string;

    public Permutations(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    /*
    * Since there were no stated space/speed constraints, this to me is the easier to understand
    * since it goes splitting the string and merging all the permutations from small to large
    * */
    public List<String> getPermutations() {
        return permutations(this.string);
    }

    private List<String> permutations(String string) {
        List<String> result = new ArrayList<>();
        if (string.length() == 1) {
            result.add(string);
        } else {
            int lastChar = string.length() - 1;
            String last = string.substring(lastChar);
            String rest = string.substring(0, lastChar);
            result = merge(permutations(rest), last);
        }
        return result;
    }

    private List<String> merge(List<String> permutations, String last) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : permutations) {
            for (int i = 0; i <= s.length(); ++i) {
                String ps = new StringBuffer(s).insert(i, last).toString();
                result.add(ps);
            }
        }
        return result;
    }
}
