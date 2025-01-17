/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NodeNameTest_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_NdLD0() {
        NodeNameTest testee = new NodeNameTest(new QName(" qualifiedName"), "namespaceURI");
        assert testee.getNodeName().equals(new QName("qualifiedName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_cbcj1() {
        NodeNameTest testee = new NodeNameTest(new QName("prefix", "localName"));
        assert testee.getNodeName().equals(new QName("prefix", "localName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_PfHx2() {
        NodeNameTest testee = new NodeNameTest(new QName(" qualifiedName"));
        assert testee.getNodeName().equals(new QName("qualifiedName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_wEuE3() {
        NodeNameTest testee = new NodeNameTest(new QName("prefix", "localName"), "namespaceURI");
        assert testee.getNodeName().equals(new QName("prefix", "localName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardTrue_ZkIc0() {
        NodeNameTest testee = new NodeNameTest(new QName("*"), "namespace");
        assertTrue(testee.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardFalse_pNpW1() {
        NodeNameTest testee = new NodeNameTest(new QName("local"), "namespace");
        assertFalse(testee.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardNull_YuCi2() {
        NodeNameTest testee = new NodeNameTest(null, "namespace");
        assertFalse(testee.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardNullNamespace_DhUW3() {
        NodeNameTest testee = new NodeNameTest(new QName("local"), null);
        assertFalse(testee.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardNullArguments_YLMZ4() {
        NodeNameTest testee = new NodeNameTest(null, null);
        assertFalse(testee.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_1_Dyaa0() {
        NodeNameTest testObject = new NodeNameTest(new QName("qualifiedName"), "namespaceURI");
        assertEquals("namespaceURI", testObject.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_2_xHno1() {
        NodeNameTest testObject = new NodeNameTest(new QName("prefix", "localName"), "namespaceURI");
        assertEquals("namespaceURI", testObject.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_3_Odua2() {
        NodeNameTest testObject = new NodeNameTest(new QName("qualifiedName"));
        assertEquals(null, testObject.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_4_qkMi3() {
        NodeNameTest testObject = new NodeNameTest(new QName("prefix", "localName"));
        assertEquals(null, testObject.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_5_HQDq4() {
        NodeNameTest testObject = new NodeNameTest(null, "namespaceURI");
        assertEquals("namespaceURI", testObject.getNamespaceURI());
    }
}