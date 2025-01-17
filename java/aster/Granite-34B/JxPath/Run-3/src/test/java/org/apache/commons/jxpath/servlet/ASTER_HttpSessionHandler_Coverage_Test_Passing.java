/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpSession;
import org.apache.commons.jxpath.JXPathException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_HttpSessionHandler_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSessionNotNull_nuZh0() {
        HttpSessionHandler handler = new HttpSessionHandler();
        HttpSession session = mock(HttpSession.class);
        HttpSessionAndServletContext context = new HttpSessionAndServletContext(session, null);
        handler.setProperty(context, "test", "test");
        verify(session, times(1)).setAttribute("test", "test");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSessionNull_awem1() {
        HttpSessionHandler handler = new HttpSessionHandler();
        HttpSession session = null;
        HttpSessionAndServletContext context = new HttpSessionAndServletContext(session, null);
        try {
            handler.setProperty(context, "test", "test");
            fail("JXPathException expected");
        } catch (JXPathException e) {
            assertEquals("Cannot set session attribute: there is no session", e.getMessage());
        }
    }
}