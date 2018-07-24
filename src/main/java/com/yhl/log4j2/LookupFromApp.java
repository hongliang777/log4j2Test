package com.yhl.log4j2;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.StrLookup;

/**
自定义lookup插件log4j属性替换
 */
@Plugin(name = "lk", category = StrLookup.CATEGORY)
public class LookupFromApp implements StrLookup{

    @Override
    public String lookup(String key) {
        // use apollo
        // return ConfigService.getConfig("app").getProperty(key,"");
        return PropertySubstitutionTest.dataMap.get(key);
    }

    @Override
    public String lookup(LogEvent event, String key) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
