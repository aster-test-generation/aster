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
    public void testSetPropertyWithNonNullSession_RjUS0() {
        HttpSessionHandler handler = new HttpSessionHandler();
        HttpSession session = mock(HttpSession.class);
        when(session.getAttribute("property")).thenReturn(null);
        handler.setProperty(session, "property", "value");
        verify(session).setAttribute("property", "value");
    }
}