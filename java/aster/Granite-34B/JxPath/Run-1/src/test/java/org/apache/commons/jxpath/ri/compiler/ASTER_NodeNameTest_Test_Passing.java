/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NodeNameTest_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_odKO0() {
        NodeNameTest test = new NodeNameTest(new QName("qualifiedName"), "namespaceURI");
        assertEquals("namespaceURI", test.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI2_llFV1() {
        NodeNameTest test = new NodeNameTest(new QName("prefix", "localName"));
        assertEquals(null, test.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI3_YRZS2() {
        NodeNameTest test = new NodeNameTest(new QName("prefix", "localName"), "namespaceURI");
        assertEquals("namespaceURI", test.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTestGetNodeName0_XTjR0() {
        NodeNameTest node0 = new NodeNameTest(new QName("qualifiedName0"), "namespaceURI0");
        QName qname1 = new QName("qualifiedName0");
        assertEquals(qname1, node0.getNodeName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTestGetNodeName1_gtQZ1() {
        NodeNameTest node0 = new NodeNameTest(new QName("prefix0", "localName0"));
        QName qname1 = new QName("prefix0", "localName0");
        assertEquals(qname1, node0.getNodeName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardTrue_DuMn0() {
        NodeNameTest testee = new NodeNameTest(new QName("*"), "namespaceURI");
        assertTrue(testee.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardFalse_cZyF1() {
        NodeNameTest testee = new NodeNameTest(new QName("localName"), "namespaceURI");
        assertFalse(testee.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardNull_MgCQ2() {
        NodeNameTest testee = new NodeNameTest(null, "namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardNull2_EHSg3() {
        NodeNameTest testee = new NodeNameTest(new QName("localName"), null);
        assertFalse(testee.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_nHMT0_uClA0() {
        NodeNameTest node = new NodeNameTest(new QName("qualifiedName"), "namespaceURI");
        String result = node.toString();
        String expected = "qualifiedName";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_KOYR1_FBKk0() {
        NodeNameTest node = new NodeNameTest(new QName("prefix", "localName"));
        String result = node.toString();
        String expected = "prefix:localName";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }
}