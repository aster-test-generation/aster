/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import javax.servlet.jsp.PageContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PageScopeContext_Test_Passing {
    @Mock
    private PageContext pageContext;
    PageScopeContext pageScopeContext;
    PageScopeContext pagescopecontext;
    PageContext pagecontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAttribute() throws Exception {
        pageScopeContext = new PageScopeContext(pageContext);
        Field field_pageContext = PageScopeContext.class.getDeclaredField("pageContext");
        field_pageContext.setAccessible(true);
        field_pageContext.set(pageScopeContext, pageContext);
        // given
        String attribute = "myAttribute";
        Object expectedValue = "myValue";
        when(pageContext.getAttribute(attribute, PageContext.PAGE_SCOPE)).thenReturn(expectedValue);
        // when
        Object actualValue = pageScopeContext.getAttribute(attribute);
        // then
        assertEquals(expectedValue, actualValue);
        verify(pageContext).getAttribute(attribute, PageContext.PAGE_SCOPE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAttributeNames() throws Exception {
        pagecontext = mock(PageContext.class);
        pagescopecontext = new PageScopeContext(pagecontext);
        Field field_pageContext = PageScopeContext.class.getDeclaredField("pageContext");
        field_pageContext.setAccessible(true);
        field_pageContext.set(pagescopecontext, pageContext);
        Enumeration<String> enumeration = mock(Enumeration.class);
        when(pageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(enumeration);
        Enumeration<String> result = pagescopecontext.getAttributeNames();
        assertEquals(enumeration, result);
        verify(pageContext).getAttributeNamesInScope(PageContext.PAGE_SCOPE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetAttribute() throws Exception {
        pageScopeContext = new PageScopeContext(pageContext);
        Field field_pageContext = PageScopeContext.class.getDeclaredField("pageContext");
        field_pageContext.setAccessible(true);
        field_pageContext.set(pageScopeContext, pageContext);
        String attribute = "myAttribute";
        Object value = new Object();
        pageScopeContext.setAttribute(attribute, value);
        verify(pageContext).setAttribute(attribute, value, PageContext.PAGE_SCOPE);
    }
}