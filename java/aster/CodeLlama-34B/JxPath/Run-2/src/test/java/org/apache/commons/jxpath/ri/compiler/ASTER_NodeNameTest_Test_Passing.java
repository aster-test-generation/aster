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
    public void testGetNamespaceURI_QName_VNnD0() {
        QName qname = new QName("prefix", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        assertEquals("namespaceURI", nodeNameTest.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_QName_Null_hUZE1() {
        QName qname = new QName(null, "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        assertEquals("namespaceURI", nodeNameTest.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_QName_Empty_CvKb2() {
        QName qname = new QName("", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        assertEquals("namespaceURI", nodeNameTest.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_QName_NullNamespace_MxmS3() {
        QName qname = new QName("prefix", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, null);
        assertNull(nodeNameTest.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_QName_EmptyNamespace_AZHQ4() {
        QName qname = new QName("prefix", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "");
        assertEquals("", nodeNameTest.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_QName_NullQNameAndNamespace_opzw7() {
        NodeNameTest nodeNameTest = new NodeNameTest(null, null);
        assertNull(nodeNameTest.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_QName_EmptyQNameAndNamespace_HmMx8() {
        QName qname = new QName("", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "");
        assertEquals("", nodeNameTest.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_LozC0() {
        QName qname = new QName("prefix", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        String expected = "prefix:localName";
        String actual = nodeNameTest.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_jwmm1() {
        QName qname = new QName("qualifiedName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname);
        String expected = "qualifiedName";
        String actual = nodeNameTest.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeName_QName_FZQc0() {
        QName qname = new QName("prefix", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        QName result = nodeNameTest.getNodeName();
        assertEquals(qname, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeName_QName_Null_BWPt1() {
        QName qname = null;
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        QName result = nodeNameTest.getNodeName();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeName_QName_Empty_IaIv2() {
        QName qname = new QName("", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        QName result = nodeNameTest.getNodeName();
        assertEquals(qname, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeName_QName_Prefix_vQtN3() {
        QName qname = new QName("prefix", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        QName result = nodeNameTest.getNodeName();
        assertEquals(qname.getPrefix(), result.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeName_QName_HashCode_TfFd6() {
        QName qname = new QName("prefix", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        QName result = nodeNameTest.getNodeName();
        assertEquals(qname.hashCode(), result.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeName_QName_Name_YzeP7() {
        QName qname = new QName("prefix", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        QName result = nodeNameTest.getNodeName();
        assertEquals(qname.getName(), result.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeName_QName_Prefix_Null_EWZb8() {
        QName qname = new QName(null, "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        QName result = nodeNameTest.getNodeName();
        assertNull(result.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcard1_mSNq0() {
        QName qname = new QName("prefix", "localName");
        NodeNameTest nodeNameTest = new NodeNameTest(qname, "namespaceURI");
        assertFalse(nodeNameTest.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcard2_pnRR1() {
        QName qname = new QName("*");
        NodeNameTest nodeNameTest = new NodeNameTest(qname);
        assertTrue(nodeNameTest.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_QName_NullQName_qpfM5_fid2() {
        NodeNameTest nodeNameTest = new NodeNameTest(null, "namespaceURI");
        assertEquals("namespaceURI", nodeNameTest.getNamespaceURI());
    }
}