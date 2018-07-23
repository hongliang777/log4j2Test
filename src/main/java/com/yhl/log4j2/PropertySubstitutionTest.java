package com.yhl.log4j2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: hongliang
 * Date: 18-7-22
 * Time: 上午10:21
 * To change this template use File | Settings | File Templates.
 */
public class PropertySubstitutionTest {

    public static Logger logger = LogManager.getLogger(PropertySubstitutionTest.class);

    public static void main(String[] args) {
        logger.info("test {},{}","abc","bcd");
    }
}
