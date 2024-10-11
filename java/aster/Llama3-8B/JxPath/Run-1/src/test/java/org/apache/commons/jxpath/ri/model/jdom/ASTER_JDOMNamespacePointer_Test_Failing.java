/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNamespacePointer_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNonNullParent_AmVg1() {
        JDOMNamespacePointer parent = new JDOMNamespacePointer(null, "parentPrefix");
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(parent, "prefix");
        String result = pointer.asPath();
        Assertions.assertEquals("parentPrefix/namespace::prefix", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNonNullParentAndNonEmptyPath_VIXv2() {
        JDOMNamespacePointer parent = new JDOMNamespacePointer(null, "parentPrefix");
        JDOMNamespacePointer grandParent = new JDOMNamespacePointer(null, "grandParentPrefix");
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(parent, "prefix");
        String result = pointer.asPath();
        Assertions.assertEquals("grandParentPrefix/parentPrefix/namespace::prefix", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_Bhkh0() {
        String prefix = "testPrefix";
        DOMNodePointer parent = new DOMNodePointer(null, Locale.US, "");
        JDOMNamespacePointer jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        String result = jdomnamespacepointer.asPath();
        assertEquals("", result);
    }
}