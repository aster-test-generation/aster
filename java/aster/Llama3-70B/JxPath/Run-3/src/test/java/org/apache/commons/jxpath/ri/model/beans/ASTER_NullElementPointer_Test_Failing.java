/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullElementPointer_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode_AOqd0() throws Exception {
        DOMNodePointer parentPointer = mock(DOMNodePointer.class);
        int index = 1;
        NullElementPointer nullelementpointer = new NullElementPointer(parentPointer, index);
        int expectedHashCode = 31 * 10 + index;
        assertEquals(expectedHashCode, nullelementpointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer_JTdH0_1() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        when(parent.asPath()).thenReturn("path");
        when(parent.getIndex()).thenReturn(0);
        NullElementPointer nullelementpointer = new NullElementPointer(parent, 0);
        String result = nullelementpointer.asPath();
        verify(parent).asPath();
        assertEquals("path[0]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_zCDT1_FPGF0_fid1() {
        org.w3c.dom.Node node = null; // Initialize node as null
        DOMNodePointer parent = new DOMNodePointer(node, new Locale("en"));
        NullElementPointer nullElementPointer = new NullElementPointer(parent, 1);
        assertEquals("[2]", nullElementPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_JIDo0_fid1() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        when(parent.asPath()).thenReturn("parentPath");
        NullElementPointer nullelementpointer = new NullElementPointer(parent, 1);
        String result = nullelementpointer.asPath();
        assertEquals("parentPath[2]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_YUQn0_fid1() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        when(parent.asPath()).thenReturn("parentPath");
        NullElementPointer nullelementpointer = new NullElementPointer(parent, 0);
        String path = nullelementpointer.asPath();
        assertEquals("parentPath[1]", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode_AOqd0_fid1() throws Exception {
        DOMNodePointer parentPointer = mock(DOMNodePointer.class);
        int index = 1;
        NullElementPointer nullelementpointer = new NullElementPointer(parentPointer, index);
        when(parentPointer.hashCode()).thenReturn(10);
        int expectedHashCode = 31 * 10 + index;
        assertEquals(expectedHashCode, nullelementpointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_huQa0_2_fid1() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        when(parent.asPath()).thenReturn("parentPath");
        NullElementPointer nullelementpointer = new NullElementPointer(parent, 0);
        String path = nullelementpointer.asPath();
        assertEquals("parentPath/[1]", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer_JTdH0_1_fid1() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        when(parent.asPath()).thenReturn("path");
        when(parent.getIndex()).thenReturn(0);
        NullElementPointer nullelementpointer = new NullElementPointer(parent, 0);
        when(nullelementpointer.getImmediateParentPointer()).thenReturn(parent);
        String result = nullelementpointer.asPath();
        verify(nullelementpointer).getImmediateParentPointer();
        verify(parent).asPath();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer_JTdH0_2_fid1() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        when(parent.asPath()).thenReturn("path");
        when(parent.getIndex()).thenReturn(0);
        NullElementPointer nullelementpointer = new NullElementPointer(parent, 0);
        when(nullelementpointer.getImmediateParentPointer()).thenReturn(parent);
        String result = nullelementpointer.asPath();
        verify(nullelementpointer).getImmediateParentPointer();
        verify(parent).asPath();
        assertEquals("path[1]", result);
    }
}