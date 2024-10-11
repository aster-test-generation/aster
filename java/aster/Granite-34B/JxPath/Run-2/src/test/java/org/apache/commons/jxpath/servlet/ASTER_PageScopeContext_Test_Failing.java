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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PageScopeContext_Test_Failing {
    private PageContext pageContext;
    PageScopeContext pagescopecontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAttributeNames_4_fid2() throws Exception {
        pageContext = mock(PageContext.class);
        pagescopecontext = new PageScopeContext(pageContext);
        when(pageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(Collections.enumeration(Arrays.asList("attribute1", "attribute2")));
        Enumeration<String> attributeNames = pagescopecontext.getAttributeNames();
        assertEquals("attribute2", attributeNames.nextElement());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAttributeNames_5_fid2() throws Exception {
        pageContext = mock(PageContext.class);
        pagescopecontext = new PageScopeContext(pageContext);
        when(pageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(Collections.enumeration(Arrays.asList("attribute1", "attribute2")));
        Enumeration<String> attributeNames = pagescopecontext.getAttributeNames();
        assertFalse(attributeNames.hasMoreElements());
    }
}