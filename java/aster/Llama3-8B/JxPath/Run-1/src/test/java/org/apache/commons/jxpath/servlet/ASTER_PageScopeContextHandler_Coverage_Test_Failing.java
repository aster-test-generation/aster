/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PageScopeContextHandler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_NullPageScope_Bzrs2() {
        PageScopeContextHandler handler = new PageScopeContextHandler();
        String[] result = handler.getPropertyNames(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNullPageScope_lOBb1() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        String property = "testProperty";
        Object actualValue = pageScopeContextHandler.getProperty(null, property);
        assertNull(actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNullPageScopeAndProperty_xEbY4() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        Object actualValue = pageScopeContextHandler.getProperty(null, null);
        assertNull(actualValue);
    }
}