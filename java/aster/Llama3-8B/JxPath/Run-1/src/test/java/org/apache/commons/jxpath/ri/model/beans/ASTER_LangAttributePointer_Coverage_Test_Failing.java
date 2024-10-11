/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LangAttributePointer_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_BufferLengthNotZeroAndLastCharNotSlash_wXmc1() {
        LangAttributePointer langAttributePointer = new LangAttributePointer(new DOMNodePointer(null, null, null));
        String result = langAttributePointer.asPath();
        assertEquals("/@xml:lang", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValueWithNullParent_matI4() {
        LangAttributePointer langAttributePointer = new LangAttributePointer(null);
        assertEquals(null, langAttributePointer.getBaseValue());
    }
}