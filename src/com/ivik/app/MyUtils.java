package com.ivik.app;

import com.ivik.logger.LogFactory;
import com.ivik.logger.Logger;

/**
 * Created by Eigenaar on 5-2-2016.
 */
public class MyUtils {

    static Logger logger = LogFactory.getLogger();

    public static boolean getInt(String intString){
        boolean ok = false;
        logger.info(" checking string " + intString);
        try {
            int value = Integer.parseInt (intString);
            ok = true;
            logger.debug(" alles OK ");
        }catch (NumberFormatException e){
            logger.error(e.getMessage());
        }
        return ok;
    }


}
