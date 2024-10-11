/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.apache.commons.jxpath.JXPathContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathServletContexts_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_XrAb0_tkxH0() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    assertEquals(parentContext, result);
}
}