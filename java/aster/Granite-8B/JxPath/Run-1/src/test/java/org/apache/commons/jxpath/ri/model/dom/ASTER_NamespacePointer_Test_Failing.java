/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespacePointer_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI_vdUz0() throws Exception {
        String namespaceURI = "http://example.com";
        String prefix = "prefix";
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        NamespacePointer namespacepointer = new NamespacePointer(parent, prefix);
        when(parent.getNamespaceURI(prefix)).thenReturn(namespaceURI);
        String result = namespacepointer.getNamespaceURI();
        assertEquals(namespaceURI, result);
    }
}