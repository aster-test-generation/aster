/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NodeNameTest_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString01_ZnBJ0() {
        NodeNameTest node = new NodeNameTest(new QName("qualifiedName"), "namespaceURI");
        assertEquals("qname.toString()", node.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString02_JGhH1() {
        NodeNameTest node = new NodeNameTest(new QName("prefix", "localName"), "namespaceURI");
        assertEquals("qname.toString()", node.toString());
    }
}