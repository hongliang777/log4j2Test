package com.yhl.log4j2;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * 使用ResourceBundle给log4j2属性替换
 */
public class AppBundle extends ResourceBundle {

    protected Object handleGetObject(String key) {
        return PropertySubstitutionTest.dataMap.get(key);
    }

    public Enumeration<String> getKeys() {
        return null;
    }
}
