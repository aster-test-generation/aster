/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HttpSessionHandler_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_SessionExists_TYfB0() {
        HttpSessionHandler handler = new HttpSessionHandler();
        HttpSessionAndServletContext mockHandle = mock(HttpSessionAndServletContext.class);
        HttpSession mockSession = mock(HttpSession.class);
        when(mockHandle.getSession()).thenReturn(mockSession);
        handler.setProperty(mockHandle, "testProperty", "testValue");
        verify(mockSession).setAttribute("testProperty", "testValue");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_SessionExists_NullValue_EnYV2() {
        HttpSessionHandler handler = new HttpSessionHandler();
        HttpSessionAndServletContext mockHandle = mock(HttpSessionAndServletContext.class);
        HttpSession mockSession = mock(HttpSession.class);
        when(mockHandle.getSession()).thenReturn(mockSession);
        handler.setProperty(mockHandle, "testProperty", null);
        verify(mockSession).setAttribute("testProperty", null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_SessionExists_DifferentDataType_GPYc3() {
        HttpSessionHandler handler = new HttpSessionHandler();
        HttpSessionAndServletContext mockHandle = mock(HttpSessionAndServletContext.class);
        HttpSession mockSession = mock(HttpSession.class);
        when(mockHandle.getSession()).thenReturn(mockSession);
        Integer value = 123;
        handler.setProperty(mockHandle, "testProperty", value);
        verify(mockSession).setAttribute("testProperty", value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_SessionExists_EmptyStringProperty_QgNU4() {
        HttpSessionHandler handler = new HttpSessionHandler();
        HttpSessionAndServletContext mockHandle = mock(HttpSessionAndServletContext.class);
        HttpSession mockSession = mock(HttpSession.class);
        when(mockHandle.getSession()).thenReturn(mockSession);
        handler.setProperty(mockHandle, "", "testValue");
        verify(mockSession).setAttribute("", "testValue");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_SessionExists_EmptyStringValue_uRpv5() {
        HttpSessionHandler handler = new HttpSessionHandler();
        HttpSessionAndServletContext mockHandle = mock(HttpSessionAndServletContext.class);
        HttpSession mockSession = mock(HttpSession.class);
        when(mockHandle.getSession()).thenReturn(mockSession);
        handler.setProperty(mockHandle, "testProperty", "");
        verify(mockSession).setAttribute("testProperty", "");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyWithNonNullSessionAndNonNullAttribute_Xzoa2() {
        HttpSessionHandler handler = new HttpSessionHandler();
        HttpSessionAndServletContext handle = mock(HttpSessionAndServletContext.class);
        HttpSession session = mock(HttpSession.class);
        when(handle.getSession()).thenReturn(session);
        when(session.getAttribute("testProperty")).thenReturn("valueFromSession");
        Object result = handler.getProperty(handle, "testProperty");
        assert result.equals("valueFromSession");
    }
}