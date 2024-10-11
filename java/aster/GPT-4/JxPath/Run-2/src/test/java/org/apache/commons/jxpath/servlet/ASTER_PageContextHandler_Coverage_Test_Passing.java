/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.jsp.PageContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PageContextHandler_Coverage_Test_Passing {
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyWithInvalidPageContextType_GfQw1() {
        Object invalidPageContext = new Object();
        PageContextHandler handler = new PageContextHandler();
        handler.setProperty(invalidPageContext, "testProperty", "testValue");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_ueKH0() {
        PageContext mockPageContext = mock(PageContext.class);
        when(mockPageContext.findAttribute("testProperty")).thenReturn("testValue");
        PageContextHandler handler = new PageContextHandler();
        Object result = handler.getProperty(mockPageContext, "testProperty");
        assertEquals("testValue", result);
        verify(mockPageContext).findAttribute("testProperty");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyValidInputs_qorD0() {
        PageContext mockPageContext = mock(PageContext.class);
        PageContextHandler handler = new PageContextHandler();
        handler.setProperty(mockPageContext, "testProperty", "testValue");
        verify(mockPageContext).setAttribute("testProperty", "testValue", PageContext.PAGE_SCOPE);
    }
}