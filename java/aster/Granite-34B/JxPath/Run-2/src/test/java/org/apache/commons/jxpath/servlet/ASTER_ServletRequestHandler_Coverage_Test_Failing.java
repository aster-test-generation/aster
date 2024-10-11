/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ServletRequestHandler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetProperty_1_yWoL0() {
        ServletRequestHandler servletRequestHandler = new ServletRequestHandler();
        servletRequestHandler.setProperty(new Object(), "property", new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollectPropertyNames_MuMb0() {
        HashSet set = new HashSet();
        Object bean = new Object();
        ServletRequestHandler servletRequestHandler = new ServletRequestHandler();
        servletRequestHandler.collectPropertyNames(set, bean);
    }
}