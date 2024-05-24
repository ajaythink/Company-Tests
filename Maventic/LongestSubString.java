public class LongestSubString {
        //  String str = "mazaconceptofthedays";


    public static String second_longest(String input) {
        int n = input.length();
        int maxLength = 0;
        int secondMaxLength = 0;
        int start = 0;
        int secondStart = 0;

        for (int end = 0; end < n; end++) {
            char currentChar = input.charAt(end);

            for (int j = start; j < end; j++) {
                if (input.charAt(j) == currentChar) {
                    start = j + 1;
                    break;
                }
            }

            int currentLength = end - start + 1;

            if (currentLength > maxLength) {
                secondMaxLength = maxLength;
                maxLength = currentLength;
                secondStart = start;
            } else if (currentLength > secondMaxLength && currentLength < maxLength) {
                secondMaxLength = currentLength;
                secondStart = start;
            }
        }

        return input.substring(secondStart, secondStart + secondMaxLength);
    }

    public static void main(String[] args) {
        String input = "mazaconceptofthedays";
        String result = second_longest(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}