/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DOMAttributePointer_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath1_nTRm0() {
        final StringBuilder buffer = new StringBuilder();
        final DOMAttributePointer domAttributePointer = new DOMAttributePointer(null, null);
        assertEquals("", domAttributePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_qjDa1_fid1() {
        final StringBuilder buffer = new StringBuilder();
        final DOMAttributePointer domAttributePointer = new DOMAttributePointer(null, null);
        final String expected = "";
        final String actual = domAttributePointer.asPath();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath6_VZVm5_fid1() {
        final StringBuilder buffer = new StringBuilder();
        final DOMAttributePointer domAttributePointer = new DOMAttributePointer(null, null);
        assertEquals(null, domAttributePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath8_LptM7_fid1() {
        final StringBuilder buffer = new StringBuilder();
        final DOMAttributePointer domAttributePointer = new DOMAttributePointer(null, null);
        final String actual = domAttributePointer.asPath();
        final String expected = "";
        assertEquals(expected, actual);
    }
}