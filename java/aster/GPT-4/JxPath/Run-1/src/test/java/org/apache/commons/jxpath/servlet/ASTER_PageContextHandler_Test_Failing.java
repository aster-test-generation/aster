/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.jsp.PageContext;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockPageContext;
public class Aster_PageContextHandler_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_NoAttributes_JEjU0() {
        PageContext mockPageContext = new MockPageContext();
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertEquals(0, result.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_SingleScopeSingleAttribute_WKWN1() {
        PageContext mockPageContext = new MockPageContext();
        mockPageContext.setAttribute("testAttribute", "value", PageContext.PAGE_SCOPE);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertArrayEquals(new String[]{"testAttribute"}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_MultipleScopesMultipleAttributes_qWul2() {
        PageContext mockPageContext = new MockPageContext();
        mockPageContext.setAttribute("pageAttribute", "value1", PageContext.PAGE_SCOPE);
        mockPageContext.setAttribute("requestAttribute", "value2", PageContext.REQUEST_SCOPE);
        mockPageContext.setAttribute("sessionAttribute", "value3", PageContext.SESSION_SCOPE);
        mockPageContext.setAttribute("applicationAttribute", "value4", PageContext.APPLICATION_SCOPE);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        String[] expected = {"pageAttribute", "requestAttribute", "sessionAttribute", "applicationAttribute"};
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_DuplicateAttributesAcrossScopes_nvSQ3() {
        PageContext mockPageContext = new MockPageContext();
        mockPageContext.setAttribute("duplicateAttribute", "value1", PageContext.PAGE_SCOPE);
        mockPageContext.setAttribute("duplicateAttribute", "value2", PageContext.REQUEST_SCOPE);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertArrayEquals(new String[]{"duplicateAttribute"}, result);
    }
}