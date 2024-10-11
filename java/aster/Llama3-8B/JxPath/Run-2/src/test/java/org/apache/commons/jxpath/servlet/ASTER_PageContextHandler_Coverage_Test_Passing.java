/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.jsp.PageContext;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PageContextHandler_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setAttribute(String name, Object value, int scope) {
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_PageContext_PageScope_zhKW0_TEUv0() {
    PageContextHandler pageContextHandler = new PageContextHandler();
    Object pageContext = new Object();
    String[] expected = new String[]{"pageScope1", "pageScope2"};
    ((PageContext) pageContext).setAttribute("pageScope1", "value1", PageContext.PAGE_SCOPE);
    ((PageContext) pageContext).setAttribute("pageScope2", "value2", PageContext.PAGE_SCOPE);
    String[] result = pageContextHandler.getPropertyNames(pageContext);
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_PageContext_RequestScope_oqsh1_Qmkp0() {
    PageContextHandler pageContextHandler = new PageContextHandler();
    Object pageContext = new Object();
    String[] expected = new String[]{"requestScope1", "requestScope2"};
    ((PageContext) pageContext).setAttribute("requestScope1", "value1", PageContext.REQUEST_SCOPE);
    ((PageContext) pageContext).setAttribute("requestScope2", "value2", PageContext.REQUEST_SCOPE);
    String[] result = pageContextHandler.getPropertyNames(pageContext);
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_PageContext_ApplicationScope_eEGT3_LBhS0() {
    PageContextHandler pageContextHandler = new PageContextHandler();
    Object pageContext = new Object();
    String[] expected = new String[]{"applicationScope1", "applicationScope2"};
    ((PageContext) pageContext).setAttribute("applicationScope1", new Object(), PageContext.APPLICATION_SCOPE);
    ((PageContext) pageContext).setAttribute("applicationScope2", new Object(), PageContext.APPLICATION_SCOPE);
    String[] result = pageContextHandler.getPropertyNames(pageContext);
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_PageContext_SessionScope_XEcl2_JoxL0() {
    PageContextHandler pageContextHandler = new PageContextHandler();
    Object pageContext = new Object();
    String[] expected = new String[]{"sessionScope1", "sessionScope2"};
    ((PageContext) pageContext).setAttribute("sessionScope1", "value1", PageContext.SESSION_SCOPE);
    ((PageContext) pageContext).setAttribute("sessionScope2", "value2", PageContext.SESSION_SCOPE);
    String[] result = pageContextHandler.getPropertyNames(pageContext);
    assertArrayEquals(expected, result);
}
}