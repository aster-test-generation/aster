/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PageContextHandler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetProperty_YiKU0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        Object pageContext = new Object();
        String property = "property";
        Object value = new Object();
        pageContextHandler.setProperty(pageContext, property, value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getProperty_1_JfHu0() {
        Object pageContext = new Object();
        String property = "";
        Object expected = null;
        Object actual = new PageContextHandler().getProperty(pageContext, property);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_xfvL0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        pageContextHandler.getPropertyNames(new Object());
    }
}