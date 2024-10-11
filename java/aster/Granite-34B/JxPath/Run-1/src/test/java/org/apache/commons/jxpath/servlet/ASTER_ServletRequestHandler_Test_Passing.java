/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ServletRequestHandler_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_NullRequest_uROa1() {
        ServletRequestHandler handler = new ServletRequestHandler();
        Object request = null;
        String property = "property";
        Object value = new Object();
        try {
            handler.setProperty(request, property, value);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_NullRequestAndProperty_Auzv3() {
        ServletRequestHandler handler = new ServletRequestHandler();
        Object request = null;
        String property = null;
        Object value = new Object();
        try {
            handler.setProperty(request, property, value);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_NullRequestAndValue_zFJt4() {
        ServletRequestHandler handler = new ServletRequestHandler();
        Object request = null;
        String property = "property";
        Object value = null;
        try {
            handler.setProperty(request, property, value);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_NullRequestPropertyAndValue_GMea6() {
        ServletRequestHandler handler = new ServletRequestHandler();
        Object request = null;
        String property = null;
        Object value = null;
        try {
            handler.setProperty(request, property, value);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}