/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.jsp.PageContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.springframework.mock.web.MockPageContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PageContextHandler_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_PageScope_EKGB0_YxHx0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        MockPageContext pageContext = new MockPageContext();
        pageContext.setAttribute("pageScope", "pageScopeValue", PageContext.PAGE_SCOPE);
        String[] result = pageContextHandler.getPropertyNames(pageContext);
        assert result.length == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_SessionScope_NHFy2_YYIx0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        MockPageContext pageContext = new MockPageContext();
        pageContext.setAttribute("sessionScope", "sessionScopeValue", PageContext.SESSION_SCOPE);
        String[] result = pageContextHandler.getPropertyNames(pageContext);
        assert result.length == 1;
        assert result[0].equals("sessionScope");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_ApplicationScope_Lews3_uaWu0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        MockPageContext pageContext = new MockPageContext();
        pageContext.setAttribute("applicationScope", "applicationScopeValue", PageContext.APPLICATION_SCOPE);
        String[] result = pageContextHandler.getPropertyNames(pageContext);
        assert result.length == 1;
        assert result[0].equals("applicationScope");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_MultipleScopes_ZLWE4_yfVD0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        MockPageContext pageContext = new MockPageContext();
        pageContext.setAttribute("pageScope", "pageScopeValue", PageContext.PAGE_SCOPE);
        pageContext.setAttribute("requestScope", "requestScopeValue", PageContext.REQUEST_SCOPE);
        pageContext.setAttribute("sessionScope", "sessionScopeValue", PageContext.SESSION_SCOPE);
        pageContext.setAttribute("applicationScope", "applicationScopeValue", PageContext.APPLICATION_SCOPE);
        String[] result = pageContextHandler.getPropertyNames(pageContext);
        assert result.length == 4;
        assert result[0].equals("pageScope");
        assert result[1].equals("requestScope");
        assert result[2].equals("sessionScope");
        assert result[3].equals("applicationScope");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_DnWY0_iJXm0() throws Exception {
        PageContextHandler pageContextHandler = new PageContextHandler();
        Object pageContext = new Object();
        ((PageContext) pageContext).setAttribute("testProperty", "testValue", PageContext.PAGE_SCOPE);
        Object result = ((PageContext) pageContext).getAttribute("testProperty");
        assertEquals("testValue", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperty_IHCu0_hENv0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        MockPageContext pageContext = new MockPageContext();
        pageContextHandler.setProperty(pageContext, "property", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyNullValue_Riut2_Jzfx0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        MockPageContext pageContext = new MockPageContext();
        pageContextHandler.setProperty(pageContext, "property", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyEmptyProperty_kdPV3_wvug0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        MockPageContext pageContext = new MockPageContext();
        pageContextHandler.setProperty(pageContext, "", "value");
    }
}