package com.jpetstore.helpers;

import com.jpetstore.framework.BaseConfiguration;

public class Util {

    public static String getProperty(String property) {
        BaseConfiguration baseConfiguration = new BaseConfiguration();

        return baseConfiguration.getProperty(property);
    }

}
