package org.example.properties.converters;

import org.example.enumeration.SupportedBrowsers;
public class SupportedBrowserConverter {
    public static SupportedBrowsers valueOfWebBrowsers(String webBrowserName){
        switch (webBrowserName) {
            case "local_chrome":
                return SupportedBrowsers.LOCAL_CHROME;
            case "local_firefox":
                return SupportedBrowsers.LOCAL_FIREFOX;
            default:
                throw new IllegalArgumentException("Incorrect browser name");
        }
    }
}
