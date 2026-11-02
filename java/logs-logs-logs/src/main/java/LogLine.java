public class LogLine {

    private final String fullMessage;

    public LogLine(String logLine) {
        this.fullMessage = logLine;
    }

    public LogLevel getLogLevel() {
        int startIndex = fullMessage.indexOf("[") + 1;
        int endIndex = fullMessage.indexOf("]");
        String logCode = fullMessage.substring(startIndex, endIndex);

        return LogLevel.fromCode(logCode);
    }

    public String getOutputForShortLog() {
        throw new UnsupportedOperationException("Please implement the getOutputForShortLog() method");
    }
}
