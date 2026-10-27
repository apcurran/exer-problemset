class ReverseString {

    String reverse(String inputString) {
        // start at the end and build a new string with for loop
        StringBuilder result = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            char c = inputString.charAt(i);
            result.append(c);
        }

        return result.toString();
    }
  
}
