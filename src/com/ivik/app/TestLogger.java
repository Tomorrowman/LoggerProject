package com.ivik.app;

import com.ivik.logger.LogFactory;
import com.ivik.logger.LogType;

/**
 * Created by Eigenaar on 5-2-2016.
 */
public class TestLogger {

    public static void main(String[] args) {
        LogFactory.setLogger(LogType.FANCY);
        MyUtils.getInt("67");
    }
}
