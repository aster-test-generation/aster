/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNamespacePointer_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNullParent_Voab0() {
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(null, "prefix");
        String result = pointer.asPath();
        Assertions.assertEquals("namespace::prefix", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNonNullParent_AmVg1_fid1() {
        JDOMNamespacePointer parent = new JDOMNamespacePointer(null, "parentPrefix");
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(parent, "prefix");
        String result = pointer.asPath();
        Assertions.assertEquals("namespace::parentPrefix/namespace::prefix", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNonNullParentAndNonEmptyPath_VIXv2_fid1() {
        JDOMNamespacePointer parent = new JDOMNamespacePointer(null, "parentPrefix");
        JDOMNamespacePointer grandParent = new JDOMNamespacePointer(null, "grandParentPrefix");
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(parent, "prefix");
        String result = pointer.asPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNonNullParentAndEmptyPath_mDpX3() {
        JDOMNamespacePointer parent = new JDOMNamespacePointer(null, "parentPrefix");
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(parent, "prefix");
        String result = pointer.asPath();
    }

    @Test
    @Timeout(value = 0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength_JcSW0() throws Exception {
        MockitoAnnotations.initMocks(this);
        DOMNodePointer parent = Mockito.mock(DOMNodePointer.class);
        JDOMNamespacePointer jdomnamespacepointer = Mockito.mock(JDOMNamespacePointer.class);
        when(jdomnamespacepointer.isLeaf()).thenReturn(true);
        int length = jdomnamespacepointer.getLength();
        assertEquals(1, length);
    }
}