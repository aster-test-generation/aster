/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JDOMNodePointer_Coverage_Test_Passing {
    private Object node;
    JDOMNodePointer jdomnodepointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_bxmQ0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        boolean actual = jDOMNodePointer.isCollection();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_Dnke0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        NodeIterator iterator = nodePointer.attributeIterator(new QName(""));
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMethod1_MEaX0() {
        JDOMNodePointer node = new JDOMNodePointer(new Object(), new Locale(""));
        assertEquals(node.hashCode(), node.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMethod1_IynR0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        int actual = jDOMNodePointer.getLength();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_ECmJ0() {
        JDOMNodePointer node = new JDOMNodePointer(new Object(), new Locale(""));
        assertEquals(node.getImmediateNode(), node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_clsG1() {
        JDOMNodePointer node = new JDOMNodePointer(new Object(), new Locale(""), "id");
        assertEquals(node.getImmediateNode(), node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_ckiB2() {
        JDOMNodePointer parent = new JDOMNodePointer(new Object(), new Locale(""));
        JDOMNodePointer node = new JDOMNodePointer(parent, new Object());
        assertEquals(node.getImmediateNode(), node);
    }

    @BeforeEach
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespacePointer_vdZx0() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        NodePointer nodePointer = jdomNodePointer.namespacePointer("prefix");
        assertEquals(nodePointer.getClass(), JDOMNamespacePointer.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_pNIb0() {
        JDOMNodePointer node = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        assertTrue(node.isLanguage("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_bBxo1() {
        JDOMNodePointer node = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        assertFalse(node.isLanguage("fr"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_NCMf2() {
        JDOMNodePointer node = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        assertTrue(node.isLanguage("e"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_VrWw0() {
        Element element = new Element("name");
        String prefix = JDOMNodePointer.getPrefix(element);
        assertEquals(null, prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_olWl2() {
        Attribute attribute = new Attribute("name", "value");
        String prefix = JDOMNodePointer.getPrefix(attribute);
        assertEquals(null, prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_XEcC4() {
        Object object = new Object();
        String prefix = JDOMNodePointer.getPrefix(object);
        assertEquals(null, prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf1_iUUA0() {
        Document document = new Document(new Element("root"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null);
        assertTrue(jDOMNodePointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf2_IVWP1() {
        Element element = new Element("root");
        element.addContent(new Element("child"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null);
        assertFalse(jDOMNodePointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf3_dvWd2() {
        Document document = new Document(new Element("root"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null);
        assertFalse(jDOMNodePointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf4_uGAj3() {
        Element element = new Element("root");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null);
        assertTrue(jDOMNodePointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove1_hQqf0() {
        JDOMNodePointer classUnderTest = new JDOMNodePointer(new Object(), new Locale("en"));
        classUnderTest.remove();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove2_ztGY1() {
        JDOMNodePointer classUnderTest = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        classUnderTest.remove();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove4_msuz3() {
        JDOMNodePointer classUnderTest = new JDOMNodePointer(new Object(), new Locale("en"));
        Element node = new Element("name");
        Element parent = new Element("parent");
        parent.addContent(node);
        classUnderTest.remove();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove5_oxxc4() {
        JDOMNodePointer classUnderTest = new JDOMNodePointer(new Object(), new Locale("en"));
        Element node = new Element("name");
        classUnderTest.remove();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_gykf0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        NamespaceResolver resolver = nodePointer.getNamespaceResolver();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_CpLR0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        boolean actual = jDOMNodePointer.equals(new Object());
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_sfLs1() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        boolean actual = jDOMNodePointer.equals(jDOMNodePointer);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_jSgF2() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        boolean actual = jDOMNodePointer.equals(new JDOMNodePointer(new Object(), new Locale("")));
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_uIrV3() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        boolean actual = jDOMNodePointer.equals(new JDOMNodePointer(new Object(), new Locale(""), "id"));
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURIMatchesExpectedForXmlPrefix_vBIH0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("root"), Locale.getDefault());
        String namespaceURI = nodePointer.getNamespaceURI("xml");
        assertEquals(Namespace.XML_NAMESPACE.getURI(), namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURIForDocumentNodeReturnsCorrectNamespaceURI_rrDu1() {
        Document document = new Document(new Element("root"));
        JDOMNodePointer nodePointer = new JDOMNodePointer(document, Locale.getDefault());
        String namespaceURI = nodePointer.getNamespaceURI("prefix");
        assertEquals("namespaceURI", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURIForElementNodeReturnsCorrectNamespaceURI_HQUg2() {
        Element element = new Element("root");
        element.addNamespaceDeclaration(Namespace.XML_NAMESPACE);
        JDOMNodePointer nodePointer = new JDOMNodePointer(element, Locale.getDefault());
        String namespaceURI = nodePointer.getNamespaceURI("xml");
        assertEquals(Namespace.XML_NAMESPACE.getURI(), namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURIForNullPrefixReturnsNull_Xznc4() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("root"), Locale.getDefault());
        String namespaceURI = nodePointer.getNamespaceURI(null);
        assertNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURIForNonExistingPrefixReturnsNull_GCZj5() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("root"), Locale.getDefault());
        String namespaceURI = nodePointer.getNamespaceURI("prefix");
        assertNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURIForEmptyPrefixReturnsNull_QWkt7() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("root"), Locale.getDefault());
        String namespaceURI = nodePointer.getNamespaceURI("");
        assertNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURIForNamespaceXMLNamespaceURIReturnsXMLNamespaceURI_qZFg9() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("root"), Locale.getDefault());
        String namespaceURI = nodePointer.getNamespaceURI(Namespace.XML_NAMESPACE.getURI());
        assertEquals(Namespace.XML_NAMESPACE.getURI(), namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_dGMC0_1() {
        Object node = new Element("test");
        Locale locale = new Locale("en");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        QName qName = jDOMNodePointer.getName();
        assertEquals("test", qName.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_dGMC0_2() {
        Object node = new Element("test");
        Locale locale = new Locale("en");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        QName qName = jDOMNodePointer.getName();
        assertEquals(null, qName.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_gxBK3() {
        Object node = null;
        Locale locale = new Locale("en");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        try {
            jDOMNodePointer.getName();
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_FgkT4() {
        Object node = new Element("test");
        Locale locale = null;
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        try {
            jDOMNodePointer.getName();
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test6_fHVX5() {
        Object node = new Comment("test");
        Locale locale = new Locale("en");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        try {
            jDOMNodePointer.getName();
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test7_aECR6() {
        Object node = new Text("test");
        Locale locale = new Locale("en");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        try {
            jDOMNodePointer.getName();
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test8_zRLD7() {
        Object node = new CDATA("test");
        Locale locale = new Locale("en");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        try {
            jDOMNodePointer.getName();
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNode_line_1_fYGx1() throws Exception {
        boolean result = JDOMNodePointer.testNode(jdomnodepointer, node, null);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueForElementNode_LfjN0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("test"), Locale.getDefault());
        assertEquals("test content", nodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueForCommentNode_roJN1() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Comment("test comment"), Locale.getDefault());
        assertEquals("test comment", nodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueForTextNode_Ckju2() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Text("test text"), Locale.getDefault());
        assertEquals("test text", nodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueForElementNodeWithChildren_THpo4() {
        Element element = new Element("test");
        element.addContent(new Element("child1"));
        element.addContent(new Text("child2"));
        JDOMNodePointer nodePointer = new JDOMNodePointer(element, Locale.getDefault());
        assertEquals("child1child2", nodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueForElementNodeWithNamespace_PRON5() {
        Element element = new Element("test", Namespace.getNamespace("test", "http://test.com"));
        element.addNamespaceDeclaration(Namespace.XML_NAMESPACE);
        JDOMNodePointer nodePointer = new JDOMNodePointer(element, Locale.getDefault());
        assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<test xmlns=\"http://test.com\" xmlns:xml=\"http://www.w3.org/XML/1998/namespace\"/>", nodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueForElementNodeWithAttributes_cImd6() {
        Element element = new Element("test");
        element.setAttribute("attr1", "value1");
        element.setAttribute("attr2", "value2");
        JDOMNodePointer nodePointer = new JDOMNodePointer(element, Locale.getDefault());
        assertEquals("<test attr1=\"value1\" attr2=\"value2\"/>", nodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueForElementNodeWithComments_pxKp8() {
        Element element = new Element("test");
        element.addContent(0, new Comment("comment1"));
        element.addContent(1, new Comment("comment2"));
        JDOMNodePointer nodePointer = new JDOMNodePointer(element, Locale.getDefault());
        assertEquals("<!--comment1-->\n<!--comment2-->\n<test/>", nodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_pJxk1_Nqpp0() {
        Attribute attribute = new Attribute("name", "");
        assertEquals("name", attribute.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueForProcessingInstructionNode_kvOK3_XdwR0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new ProcessingInstruction("test", "test data"), Locale.getDefault());
        assertEquals("test data", nodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_MFJR2_hEwl0_1() {
        Object node = new ProcessingInstruction("target", "data");
        Locale locale = new Locale("en");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        QName qName = jDOMNodePointer.getName();
        assertEquals("target", qName.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_MFJR2_hEwl0_2() {
        Object node = new ProcessingInstruction("target", "data");
        Locale locale = new Locale("en");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        QName qName = jDOMNodePointer.getName();
        assertEquals(null, qName.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_PBAb0_sGiM0() {
        JDOMNodePointer pointer1 = new JDOMNodePointer(new Object(), new Locale("en"));
        JDOMNodePointer pointer2 = new JDOMNodePointer(new Object(), new Locale("en"));
        int result = pointer1.compareChildNodePointers(pointer1, pointer2);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_YtDv1_ReII0() {
        JDOMNodePointer pointer1 = new JDOMNodePointer(new Object(), new Locale("en"));
        JDOMNodePointer pointer2 = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        int result = pointer1.compareChildNodePointers(pointer1, pointer2);
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_XYWy0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        NodeIterator iterator = nodePointer.namespaceIterator();
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_dGMC0() {
        Object node = new Element("test");
        Locale locale = new Locale("en");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        QName qName = jDOMNodePointer.getName();
        assertEquals("test", qName.getName());
        assertEquals(null, qName.getPrefix());
    }
}