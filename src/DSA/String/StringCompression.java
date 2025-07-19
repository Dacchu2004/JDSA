package DSA.String;

public class StringCompression {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar; //post incrementation of index after writing the currentChar value in the correct index

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c; //post incrementation of index after writing c in the right index
                }
            }
        }
        return index;
    }
}
