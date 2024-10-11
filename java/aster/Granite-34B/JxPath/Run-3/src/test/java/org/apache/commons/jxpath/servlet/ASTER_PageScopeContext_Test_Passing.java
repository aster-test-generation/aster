/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.Arrays;
import java.util.Collections;
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
    PageScopeContext pagescopecontext;
    PageContext pagecontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAttributeNames() throws Exception {
        when(pageContext.getAttributeNamesInScope(anyInt())).thenReturn(Collections.enumeration(Arrays.asList("a", "b", "c")));
        Enumeration<String> result = pagescopecontext.getAttributeNames();
        assertEquals(Arrays.asList("a", "b", "c"), Collections.list(result));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetAttribute() throws Exception {
        String attribute = "test";
        Object value = "test";
        pagescopecontext.setAttribute(attribute, value);
        verify(pageContext, times(1)).setAttribute(attribute, value, PageContext.PAGE_SCOPE);
    }
}