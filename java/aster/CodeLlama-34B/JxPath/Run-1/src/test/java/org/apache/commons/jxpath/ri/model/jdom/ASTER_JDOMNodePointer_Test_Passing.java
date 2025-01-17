/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.jdom.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNodePointer_Test_Passing {
    private Object node;
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private JDOMNodePointer jdomNodePointer;
    JDOMNodePointer jdomnodepointer;
    private String id;
    private NamespaceResolver localNamespaceResolver;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_SameNode_DgAH0() {
        JDOMNodePointer nodePointer1 = new JDOMNodePointer(new Element("root"), new Locale("en"));
        JDOMNodePointer nodePointer2 = new JDOMNodePointer(new Element("root"), new Locale("en"));
        int result = nodePointer1.compareChildNodePointers(nodePointer2, nodePointer2);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_DifferentNodes_ucBV1() {
        JDOMNodePointer nodePointer1 = new JDOMNodePointer(new Element("root"), new Locale("en"));
        JDOMNodePointer nodePointer2 = new JDOMNodePointer(new Element("root"), new Locale("en"));
        int result = nodePointer1.compareChildNodePointers(nodePointer1, nodePointer2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_ElementAndElement_BnYh5() {
        JDOMNodePointer nodePointer1 = new JDOMNodePointer(new Element("root"), new Locale("en"));
        JDOMNodePointer nodePointer2 = new JDOMNodePointer(new Element("root"), new Locale("en"));
        int result = nodePointer1.compareChildNodePointers(nodePointer1, nodePointer2);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_ElementAndText_NQhC6() {
        JDOMNodePointer nodePointer1 = new JDOMNodePointer(new Element("root"), new Locale("en"));
        JDOMNodePointer nodePointer2 = new JDOMNodePointer(new Text("text"), new Locale("en"));
        int result = nodePointer1.compareChildNodePointers(nodePointer1, nodePointer2);
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_ElementAndComment_uwlD9() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        jdomNodePointer = new JDOMNodePointer(domNodePointer, node);
        when(domNodePointer.getImmediateNode()).thenReturn(node);
        assertEquals(node, jdomNodePointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixWithNull_uNvF2() {
        String prefix = JDOMNodePointer.getPrefix(null);
        assertNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithId_LTHz2() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        int length = jdomNodePointer.getLength();
        assertEquals(1, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        assertTrue(jdomnodepointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_Element_zVJu0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("test"), Locale.ENGLISH);
        assertTrue(nodePointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_Document_Rwon1() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Document(), Locale.ENGLISH);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_Other_kqmG2() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsSameObject_ZMZc0() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        assertTrue(pointer.equals(pointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentObjects_MqhA1() {
        JDOMNodePointer pointer1 = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        JDOMNodePointer pointer2 = new JDOMNodePointer(new Object(), Locale.FRENCH);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentNode_Omne2() {
        JDOMNodePointer pointer1 = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        JDOMNodePointer pointer2 = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsNull_UMyO4() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        assertFalse(pointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentClass_aRyX5() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        assertFalse(pointer.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsSameNodeAndLocale_uYQX6() {
        JDOMNodePointer pointer1 = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        JDOMNodePointer pointer2 = new JDOMNodePointer(new Object(), Locale.ENGLISH);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName_1() throws Exception {
        jdomnodepointer = new JDOMNodePointer(node, Locale.ENGLISH);
        Element element = mock(Element.class);
        when(element.getName()).thenReturn("test");
        Attribute attribute = mock(Attribute.class);
        when(attribute.getName()).thenReturn("test");
        assertEquals("test", JDOMNodePointer.getLocalName(element));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName_2() throws Exception {
        jdomnodepointer = new JDOMNodePointer(node, Locale.ENGLISH);
        Element element = mock(Element.class);
        when(element.getName()).thenReturn("test");
        Attribute attribute = mock(Attribute.class);
        when(attribute.getName()).thenReturn("test");
        assertEquals("test", JDOMNodePointer.getLocalName(attribute));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName_3() throws Exception {
        jdomnodepointer = new JDOMNodePointer(node, Locale.ENGLISH);
        Element element = mock(Element.class);
        when(element.getName()).thenReturn("test");
        Attribute attribute = mock(Attribute.class);
        when(attribute.getName()).thenReturn("test");
        assertNull(JDOMNodePointer.getLocalName(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguageWithoutParent_lixH2() {
        JDOMNodePointer node = new JDOMNodePointer(new Object(), new Locale("en"));
        String language = node.getLanguage();
        assertNull(language);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullId_LbYc0() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Element("test"), new Locale("en-US"), null);
        String actual = jdomNodePointer.asPath();
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullId_iBUy1() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Element("test"), new Locale("en-US"), "id");
        String actual = jdomNodePointer.asPath();
        String expected = "id('id')";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithText_LUiz4() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Text("test"), new Locale("en-US"), null);
        String actual = jdomNodePointer.asPath();
        String expected = "/text()[1]";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithCDATA_dKuR5() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new CDATA("test"), new Locale("en-US"), null);
        String actual = jdomNodePointer.asPath();
        String expected = "/text()[1]";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNamespaceURI_spxI7() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Element("test", "http://www.example.com"), new Locale("en-US"), null);
        String actual = jdomNodePointer.asPath();
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithId_egcU0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("test"), new Locale("en"), "id");
        String path = nodePointer.asPath();
        Assertions.assertEquals("id('id')", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithText_byFm3() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Text("test"), new Locale("en"), "id");
        String path = nodePointer.asPath();
        Assertions.assertEquals("id('id')", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNamespace_vlvu5() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("test", "http://www.example.com"), new Locale("en"), "id");
        String path = nodePointer.asPath();
        Assertions.assertEquals("id('id')", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullParent_nKGU0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(null, null, null);
        String path = nodePointer.asPath();
        assertEquals("", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullParent_KBZc1() {
        JDOMNodePointer parent = new JDOMNodePointer(null, null, null);
        JDOMNodePointer nodePointer = new JDOMNodePointer(parent, null, null);
        String path = nodePointer.asPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithId_qNFM6() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(null, null, "id");
        String path = nodePointer.asPath();
        assertEquals("id('id')", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithParentAndId_VLSC7() {
        JDOMNodePointer parent = new JDOMNodePointer(null, null, null);
        JDOMNodePointer nodePointer = new JDOMNodePointer(parent, null, "id");
        String path = nodePointer.asPath();
        assertEquals("id('id')", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullId_DlIq0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("root"), null, null);
        String path = nodePointer.asPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullId_kVAU1() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("root"), null, "id");
        String path = nodePointer.asPath();
        assertEquals("id('id')", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithText_DIMI4() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Text("text"), null, null);
        String path = nodePointer.asPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithCDATA_WGGP5() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new CDATA("cdata"), null, null);
        String path = nodePointer.asPath();
        assertEquals("/text()[1]", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNamespace_XRbr7() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("root", "http://www.example.com"), null, null);
        String path = nodePointer.asPath();
        assertEquals("", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithRelativePositionByQName_Nfpy8() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("root"), null, null);
        String path = nodePointer.asPath();
        assertEquals("", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithRelativePositionOfTextNode_oZGt10() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Text("text"), null, null);
        String path = nodePointer.asPath();
        assertEquals("/text()[1]", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithXMLPrefix_koSa0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Document(), Locale.ENGLISH);
        String namespaceURI = nodePointer.getNamespaceURI("xml");
        assertEquals(Namespace.XML_NAMESPACE.getURI(), namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithElementNode_IVHk4() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("root"), Locale.ENGLISH);
        String namespaceURI = nodePointer.getNamespaceURI("ns");
        assertNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithNonElementNode_qZIy6() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Text("text"), Locale.ENGLISH);
        String namespaceURI = nodePointer.getNamespaceURI("ns");
        assertNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithNonDocumentNode_EqGF7() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Comment("comment"), Locale.ENGLISH);
        String namespaceURI = nodePointer.getNamespaceURI("ns");
        assertNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithNonNode_aYGt8() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        String namespaceURI = nodePointer.getNamespaceURI("ns");
        assertNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver1_slCC0_1() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        NamespaceResolver resolver = nodePointer.getNamespaceResolver();
        assertNotNull(resolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver1_slCC0_2() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        NamespaceResolver resolver = nodePointer.getNamespaceResolver();
        assertEquals(nodePointer, resolver.getNamespaceContextPointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_AttributeAndElement_RYel2_awnd0() {
        JDOMNodePointer nodePointer1 = new JDOMNodePointer(new Element("root"), new Locale("en"));
        JDOMNodePointer nodePointer2 = new JDOMNodePointer(new Attribute("attr", "value"), new Locale("en"));
        int result = nodePointer1.compareChildNodePointers(nodePointer1, nodePointer2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_zzRd0_btVr0() {
        QName name = new QName("name");
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        NodeIterator iterator = nodePointer.attributeIterator(name);
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithParent_LnHC2_fTvP1() {
        JDOMNodePointer parent = new JDOMNodePointer(new Element("parent"), null, null);
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("child"), null, null);
        String path = nodePointer.asPath();
        assertEquals("", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_nullNode_sZOc0_eMlD0() {
        String attrName = "attrName";
        String result = JDOMNodePointer.findEnclosingAttribute(null, attrName, null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName() throws Exception {
        jdomnodepointer = new JDOMNodePointer(node, Locale.ENGLISH);
        Element element = mock(Element.class);
        when(element.getName()).thenReturn("test");
        assertEquals("test", JDOMNodePointer.getLocalName(element));
        Attribute attribute = mock(Attribute.class);
        when(attribute.getName()).thenReturn("test");
        assertEquals("test", JDOMNodePointer.getLocalName(attribute));
        assertNull(JDOMNodePointer.getLocalName(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver1_slCC0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        NamespaceResolver resolver = nodePointer.getNamespaceResolver();
        assertNotNull(resolver);
        assertEquals(nodePointer, resolver.getNamespaceContextPointer());
    }
}