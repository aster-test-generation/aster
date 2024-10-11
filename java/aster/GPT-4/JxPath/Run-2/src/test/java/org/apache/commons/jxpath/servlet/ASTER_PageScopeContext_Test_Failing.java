/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.jsp.PageContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PageScopeContext_Test_Failing {
@Mock
    private PageContext pageContext;
private PageScopeContext pageScopeContext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAttributeNames_LNJv0_fid1() {
    PageContext mockPageContext = mock(PageContext.class);
    Enumeration<String> expectedAttributes = Collections.enumeration(Arrays.asList("attr1", "attr2", "attr3"));
    when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(expectedAttributes);
    PageScopeContext pageScopeContext = new PageScopeContext(mockPageContext);
    Enumeration<String> result = pageScopeContext.getAttributeNames();
    List<String> resultList = Collections.list(result);
    List<String> expectedList = Collections.list(expectedAttributes);
    assertEquals(expectedList, resultList);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAttributeNames_4_fid2() {
        pageScopeContext = new PageScopeContext(pageContext);
        // Prepare the mock environment
        Vector<String> attributeNames = new Vector<>();
        attributeNames.add("attribute1");
        attributeNames.add("attribute2");
        Enumeration<String> expectedEnumeration = attributeNames.elements();
        when(pageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(expectedEnumeration);
        // Execute the method under test
        Enumeration<String> result = pageScopeContext.getAttributeNames();
        // Verify the results
        // Verify interactions
        verify(pageContext).getAttributeNamesInScope(PageContext.PAGE_SCOPE);
        assertEquals("attribute2", result.nextElement(), "Second element should match");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAttributeNames_5_fid2() {
        pageScopeContext = new PageScopeContext(pageContext);
        // Prepare the mock environment
        Vector<String> attributeNames = new Vector<>();
        attributeNames.add("attribute1");
        attributeNames.add("attribute2");
        Enumeration<String> expectedEnumeration = attributeNames.elements();
        when(pageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(expectedEnumeration);
        // Execute the method under test
        Enumeration<String> result = pageScopeContext.getAttributeNames();
        // Verify the results
        // Verify interactions
        verify(pageContext).getAttributeNamesInScope(PageContext.PAGE_SCOPE);
        assertFalse(result.hasMoreElements(), "No more elements should be present");}
}