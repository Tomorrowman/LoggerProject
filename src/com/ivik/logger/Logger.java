package com.ivik.logger;

/**
 * Created by Eigenaar on 4-2-2016.
 */
public interface Logger {

    void debug (String msg);
    void warn (String msg);
    void info (String msg);
    void error (String msg);
}
