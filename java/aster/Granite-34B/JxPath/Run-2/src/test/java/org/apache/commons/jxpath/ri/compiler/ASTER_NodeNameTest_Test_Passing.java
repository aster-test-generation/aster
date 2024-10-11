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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NodeNameTest_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_0_oMKp0() {
        NodeNameTest testee = new NodeNameTest(new QName("qualifiedName"), "namespaceURI");
        assertEquals(new QName("qualifiedName"), testee.getNodeName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_1_qjwI1() {
        NodeNameTest testee = new NodeNameTest(new QName("prefix", "localName"));
        assertEquals(new QName("prefix", "localName"), testee.getNodeName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_2_vRfO2() {
        NodeNameTest testee = new NodeNameTest(new QName("qualifiedName"));
        assertEquals(new QName("qualifiedName"), testee.getNodeName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_3_jwEp3() {
        NodeNameTest testee = new NodeNameTest(new QName("prefix", "localName"), "namespaceURI");
        assertEquals(new QName("prefix", "localName"), testee.getNodeName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardTrue_woNU0() {
        NodeNameTest testee = new NodeNameTest(new QName("*"), "namespaceURI");
        boolean actual = testee.isWildcard();
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardFalse_NMNJ1() {
        NodeNameTest testee = new NodeNameTest(new QName("localName"), "namespaceURI");
        boolean actual = testee.isWildcard();
        boolean expected = false;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_bYXP0_RKoy0() {
        NodeNameTest test = new NodeNameTest(new QName("qualifiedName"), "namespaceURI");
        String actual = test.getNamespaceURI();
        String expected = "namespaceURI";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI2_aaeb1_LQMf0() {
        NodeNameTest test = new NodeNameTest(new QName("prefix", "localName"));
        String actual = test.getNamespaceURI();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI3_FTto2_MgzO0() {
        NodeNameTest test = new NodeNameTest(new QName("prefix", "localName"), "namespaceURI");
        String actual = test.getNamespaceURI();
        String expected = "namespaceURI";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_HTrK0_QxCG0() {
        NodeNameTest node = new NodeNameTest(new QName("qualifiedName"), "namespaceURI");
        String result = node.toString();
        String expected = "qualifiedName";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_xztQ1_tbFS0() {
        NodeNameTest node = new NodeNameTest(new QName("prefix", "localName"));
        String result = node.toString();
        String expected = "prefix:localName";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }
}