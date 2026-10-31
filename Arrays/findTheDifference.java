
public class findTheDifference {

    public static char findTheDifference(String s, String t) {

        int[] frequency = new int[26];

        // Count characters in string s
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        // Subtract frequencies using string t
        for (char ch : t.toCharArray()) {
            frequency[ch - 'a']--;

            if (frequency[ch - 'a'] < 0) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println("Extra character: " + findTheDifference(s1, t1));

        String s2 = "aabb";
        String t2 = "ababa";
        System.out.println("Extra character: " + findTheDifference(s2, t2));

        String s3 = "";
        String t3 = "y";
        System.out.println("Extra character: " + findTheDifference(s3, t3));
    }
}
