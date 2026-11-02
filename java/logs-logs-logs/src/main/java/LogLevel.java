public enum LogLevel {
    UNKNOWN("UNK", 0),
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42);

    private final String code;
    private final int encoding;

    LogLevel(String code, int encoding) {
        this.code = code;
        this.encoding = encoding;
    }

    static LogLevel fromCode(String srcCode) {
        for (LogLevel level : LogLevel.values()) {
            if (level.code.equals(srcCode)) {
                return level;
            }
        }

        // fallback for unknown srcCode
        return LogLevel.UNKNOWN;
    }

    int getEncoding() {
        return this.encoding;
    }
}
