/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMNamespacePointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WhenParentPathEndsWithSlash_jrQN0() {
        DOMNodePointer mockParent = mock(DOMNodePointer.class);
        when(mockParent.asPath()).thenReturn("parent/path/");
        JDOMNamespacePointer namespacePointer = new JDOMNamespacePointer(mockParent, "testPrefix");
        String result = namespacePointer.asPath();
        assertEquals("parent/path/namespace::testPrefix", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WhenParentPathDoesNotEndWithSlash_jIIm1() {
        DOMNodePointer mockParent = mock(DOMNodePointer.class);
        when(mockParent.asPath()).thenReturn("parent/path");
        JDOMNamespacePointer namespacePointer = new JDOMNamespacePointer(mockParent, "testPrefix");
        String result = namespacePointer.asPath();
        assertEquals("parent/path/namespace::testPrefix", result);
    }
}