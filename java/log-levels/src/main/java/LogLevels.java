public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf(": ");

        return index >= 0 ? logLine.substring(index + 2).trim() : "";
    }

    public static String logLevel(String logLine) {
        int logLevelTypeStartIndex = logLine.indexOf("[") + 1;
        int logLevelTypeEndIndex = logLine.indexOf("]"); // excludes index in .indexOf() call

        return  logLine.substring(logLevelTypeStartIndex, logLevelTypeEndIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        String myLogLevelMessage = message(logLine);
        String myLogLevel = logLevel(logLine);

        return "%s (%s)".formatted(myLogLevelMessage, myLogLevel);
    }
}
