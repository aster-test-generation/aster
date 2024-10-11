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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LangAttributePointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_aCRQ0_NZTc0() {
        org.w3c.dom.Node node = null; // You need to initialize Node object
        DOMNodePointer parent = new DOMNodePointer(node, new Locale("en"), "id");
        LangAttributePointer langAttributePointer = new LangAttributePointer(parent);
        boolean result = langAttributePointer.isLeaf();
        assert(result);
    }
}