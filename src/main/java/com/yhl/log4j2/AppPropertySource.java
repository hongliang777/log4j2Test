package com.yhl.log4j2;

import org.apache.logging.log4j.util.BiConsumer;
import org.apache.logging.log4j.util.PropertySource;

import java.util.Map;

public class AppPropertySource implements PropertySource{

    public int getPriority() {
        return 1;
    }

    public void forEach(final BiConsumer<String, String> action) {
        for(Map.Entry<String,String> entry : PropertySubstitutionTest.dataMap.entrySet()){
            action.accept(entry.getKey(),entry.getValue());
        }
    }

    public CharSequence getNormalForm(Iterable<? extends CharSequence> tokens) {
        return "abc";
    }
}
