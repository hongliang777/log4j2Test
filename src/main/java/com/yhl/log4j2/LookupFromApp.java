package com.yhl.log4j2;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.StrLookup;

/**
 * Created with IntelliJ IDEA.
 * User: hongliang
 * Date: 18-7-22
 * Time: 上午11:28
 * To change this template use File | Settings | File Templates.
 */
@Plugin(name = "lk", category = StrLookup.CATEGORY)
public class LookupFromApp implements StrLookup{
    @Override
    public String lookup(String key) {
        // use apollo
        // return ConfigService.getConfig("app").getProperty(key,"");
        return "d:/abc/logs1/";
    }

    @Override
    public String lookup(LogEvent event, String key) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
