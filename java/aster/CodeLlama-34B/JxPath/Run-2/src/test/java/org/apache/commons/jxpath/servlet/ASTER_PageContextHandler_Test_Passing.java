/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.jsp.PageContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PageContextHandler_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyWithNullValue_Fnox3_HOTd0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        PageContext pageContext = Mockito.mock(PageContext.class);
        String property = "property";
        Object value = null;
        pageContextHandler.setProperty(pageContext, property, value);
        assertNull(pageContext.getAttribute(property, PageContext.PAGE_SCOPE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyWithInvalidScope_NSqn4_qklh0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        PageContext pageContext = Mockito.mock(PageContext.class);
        String property = "property";
        Object value = new Object();
        pageContextHandler.setProperty(pageContext, property, value);
        assertNull(pageContext.getAttribute(property, PageContext.PAGE_SCOPE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyWithValidScope_qwiF5_yIiM0() {
        PageContextHandler pageContextHandler = new PageContextHandler();
        PageContext pageContext = mock(PageContext.class);
        String property = "property";
        Object value = new Object();
        pageContextHandler.setProperty(pageContext, property, value);
        verify(pageContext).setAttribute(property, value, PageContext.PAGE_SCOPE);
    }
}