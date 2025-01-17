/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockServletContext;
public class Aster_ServletRequestHandler_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty1_QKlQ0() {
        ServletRequestHandler servletRequestHandler = new ServletRequestHandler();
        Object request = new Object();
        String property = "property";
        Object value = new Object();
        servletRequestHandler.setProperty(request, property, value);
        assertEquals(value, ((ServletRequestAndContext) request).getServletRequest().getAttribute(property));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollectPropertyNames2_gLuc1() {
        ServletRequestHandler servletRequestHandler = new ServletRequestHandler();
        HashSet set = new HashSet();
        MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
        MockServletContext mockServletContext = new MockServletContext();
        ServletRequestAndContext servletRequestAndContext = new ServletRequestAndContext(mockHttpServletRequest, mockServletContext);
        servletRequestHandler.collectPropertyNames(set, servletRequestAndContext);
    }
}