class MicroBlog {
    public String truncate(String input) {
        int strCodePointsTotal = input.codePointCount(0, input.length());
        int smallerValue = Math.min(5, strCodePointsTotal);
        int charIndexEnd = input.offsetByCodePoints(0, smallerValue);

        return input.substring(0, charIndexEnd);
    }
}
