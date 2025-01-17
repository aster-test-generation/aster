/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.jdom.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNodePointer_Test_Failing {
    private Object node;
    private JDOMNodePointer jdomnodepointer;
    @Mock
    private Locale locale;
    @Mock
    private Text text;
    @Mock
    private Element element;
    @Mock
    private Document document;
    @Mock
    private ProcessingInstruction processingInstruction;
    @Mock
    private Comment comment;
    @Mock
    private KeywordVariables keywordVariables;
    @Mock
    private VariablePointer variablePointer;
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private JDOMNodePointer jdomNodePointer;
    private JXPathContext context;
    private QName name;
    @Mock
    private VariablePointer parent;
    @Mock
    private KeywordVariables variables;
    @Mock
    private Object nodeMock;
    @Mock
    private NodeIterator nodeIterator;
    private String id;
    private QName qName1;
    private QName qName2;
    private QName qName3;
    private QName qName4;
    private QName qName5;
    private QName qName6;
    private QName qName7;
    private QName qName8;
    private QName qName9;
    private QName qName10;
    private QName qName11;
    private QName qName12;
    private QName qName13;
    private QName qName14;
    private QName qName15;
    private QName qName16;
    private QName qName17;
    private QName qName18;
    private QName qName19;
    private QName qName20;
    private QName qName21;
    private QName qName22;
    private QName qName23;
    private QName qName24;
    private QName qName25;
    private QName qName26;
    private QName qName27;
    private QName qName28;
    private QName qName29;
    private QName qName30;
    private QName qName31;
    private QName qName32;
    private QName qName33;
    private QName qName;
    private static final Locale LOCALE = Locale.ENGLISH;
    private static final String ID = "ID";
    private static final String KEYWORD = "KEYWORD";
    private static final String LOCAL_NAME = "LOCAL_NAME";
    private static final String PREFIX = "PREFIX";
    private static final String QUALIFIED_NAME = "QUALIFIED_NAME";
    private NamespaceResolver namespaceResolver;
    @Mock
    private Attribute attribute;
    @Mock
    private Pointer pointer;
    private String lang;
    private String prefix;
    private Namespace ns;
    String attrName;
    private NamespaceResolver localNamespaceResolver;

    private static Element nodeParent(final Object node) {
        if (node instanceof Element) {
            final Object parent = ((Element) node).getParent();
            return parent instanceof Element ? (Element) parent : null;
        }
        if (node instanceof Text) {
            return (Element) ((Text) node).getParent();
        }
        if (node instanceof CDATA) {
            return (Element) ((CDATA) node).getParent();
        }
        if (node instanceof ProcessingInstruction) {
            return (Element) ((ProcessingInstruction) node).getParent();
        }
        if (node instanceof Comment) {
            return (Element) ((Comment) node).getParent();
        }
        return null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_TextNode_Null_nKJZ1() {
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Text("text"), Locale.getDefault());
        jDOMNodePointer.setValue(null);
        assertEquals("", jDOMNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_1() throws Exception {
        node = new Object();
        nodeMock = Mockito.mock(Object.class);
        JDOMNodePointer jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        jdomnodepointer = new JDOMNodePointer(nodeMock, Locale.getDefault());
        assertEquals(node.hashCode(), jdomnodepointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testattributeIterator() {
        jdomnodepointer = new JDOMNodePointer(node, locale);
        Mockito.when(jdomnodepointer.attributeIterator(name)).thenReturn(nodeIterator);
        NodeIterator actualNodeIterator = jdomnodepointer.attributeIterator(name);
        assertEquals(nodeIterator, actualNodeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChildIterator() {
        jdomnodepointer = new JDOMNodePointer(Mockito.mock(Object.class), Locale.getDefault());
        nodeIterator = new JDOMNodeIterator(jdomnodepointer, Mockito.mock(NodeTest.class), false, null);
        // Mock the behavior of the childIterator method
        Mockito.when(jdomnodepointer.childIterator(Mockito.any(NodeTest.class), Mockito.anyBoolean(), Mockito.any(NodePointer.class))).thenReturn(nodeIterator);
        // Call the childIterator method and verify the behavior
        NodeIterator actualNodeIterator = jdomnodepointer.childIterator(Mockito.mock(NodeTest.class), false, null);
        assertEquals(nodeIterator, actualNodeIterator);
        // Verify that the childIterator method was called with the correct arguments
        Mockito.verify(jdomnodepointer).childIterator(Mockito.any(NodeTest.class), Mockito.anyBoolean(), Mockito.any(NodePointer.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove() throws Exception {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        Element parent = mock(Element.class);
        when(nodeParent(node)).thenReturn(parent);
        jdomnodepointer.remove();
        verify(parent).getContent().remove(node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void remove_OFPL0() {
        final Element parent = nodeParent(node);
        if (parent == null) {
            throw new JXPathException("Cannot remove root JDOM node");
        }
        parent.getContent().remove(node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName_1() throws Exception {
        node = Mockito.mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getName()).thenReturn("elementName");
        when(node instanceof Attribute).thenReturn(true);
        when(((Attribute) node).getName()).thenReturn("attributeName");
        when(node instanceof Element).thenReturn(false);
        when(node instanceof Attribute).thenReturn(false);
        assertEquals("elementName", JDOMNodePointer.getLocalName(node));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName_2() throws Exception {
        node = Mockito.mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getName()).thenReturn("elementName");
        when(node instanceof Attribute).thenReturn(true);
        when(((Attribute) node).getName()).thenReturn("attributeName");
        when(node instanceof Element).thenReturn(false);
        when(node instanceof Attribute).thenReturn(false);
        assertEquals("attributeName", JDOMNodePointer.getLocalName(node));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName_3() throws Exception {
        node = Mockito.mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getName()).thenReturn("elementName");
        when(node instanceof Attribute).thenReturn(true);
        when(((Attribute) node).getName()).thenReturn("attributeName");
        when(node instanceof Element).thenReturn(false);
        when(node instanceof Attribute).thenReturn(false);
        assertNull(JDOMNodePointer.getLocalName(node));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_Element_ZlcM4() {
        final Element element = new Element("element");
        final Element valueElement = new Element("value");
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.getDefault());
        jDOMNodePointer.setValue(valueElement);
        assertEquals(valueElement, jDOMNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_Document_ZWGF5() {
        final Element element = new Element("element");
        final Document valueDocument = new Document(new Element("value"));
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.getDefault());
        jDOMNodePointer.setValue(valueDocument);
        assertEquals(valueDocument, jDOMNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_ProcessingInstruction_exww6() {
        final Element element = new Element("element");
        final ProcessingInstruction value = new ProcessingInstruction("target", "data");
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.getDefault());
        jDOMNodePointer.setValue(value);
        assertEquals(value, jDOMNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_Comment_xVBm7() {
        final Element element = new Element("element");
        final Comment value = new Comment("comment");
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.getDefault());
        jDOMNodePointer.setValue(value);
        assertEquals(value, jDOMNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_Other_TkJV8() {
        final Element element = new Element("element");
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.getDefault());
        jDOMNodePointer.setValue(new Object());
        assertEquals("", jDOMNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentLocale_fid1() {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        Locale differentLocale = Locale.CANADA;
        JDOMNodePointer other = new JDOMNodePointer(node, differentLocale);
        assertFalse(jdomnodepointer.equals(other));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLanguage_1_fid1() throws Exception {
        locale = mock(Locale.class);
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, locale);
        lang = "en";
        when(locale.getLanguage()).thenReturn("en");
        when(locale.getLanguage()).thenReturn("fr");
        assertTrue(jdomnodepointer.isLanguage(lang));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLanguageWithLanguageNotSet_YLAo1_fid1() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Element("root"), Locale.ENGLISH);
        boolean result = pointer.isLanguage("en");
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespacePointer_NdKf0_fid1() {
        Element root = new Element("root");
        Element child = new Element("child");
        child.addNamespaceDeclaration(Namespace.getNamespace("ns", "http://example.com/ns"));
        root.addContent(child);
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.getDefault());
        pointer.setIndex(0);
        NodePointer namespacePointer = pointer.namespacePointer("ns");
        assertEquals("http://example.com/ns", namespacePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLanguage() throws Exception {
        locale = mock(Locale.class);
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, locale);
        lang = "en";
        when(locale.getLanguage()).thenReturn("en");
        assertTrue(jdomnodepointer.isLanguage(lang));
        when(locale.getLanguage()).thenReturn("fr");
        assertFalse(jdomnodepointer.isLanguage(lang));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName() throws Exception {
        node = Mockito.mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getName()).thenReturn("elementName");
        assertEquals("elementName", JDOMNodePointer.getLocalName(node));
        when(node instanceof Attribute).thenReturn(true);
        when(((Attribute) node).getName()).thenReturn("attributeName");
        assertEquals("attributeName", JDOMNodePointer.getLocalName(node));
        when(node instanceof Element).thenReturn(false);
        when(node instanceof Attribute).thenReturn(false);
        assertNull(JDOMNodePointer.getLocalName(node));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception {
        node = mock(Object.class);
        locale = mock(Locale.class);
        element = mock(Element.class);
        ns = mock(Namespace.class);
        jdomnodepointer = new JDOMNodePointer(node, locale);
        when(node instanceof Document).thenReturn(true);
        when(((Document) node).getRootElement()).thenReturn(element);
        when(element.getNamespace("xml")).thenReturn(ns);
        when(ns.getURI()).thenReturn("http://www.w3.org/XML/1998/namespace");
        assertEquals("http://www.w3.org/XML/1998/namespace", jdomnodepointer.getNamespaceURI("xml"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute2_Qatl1() {
        Object n = new Element("root", Namespace.getNamespace("ns"));
        String attrName = "attr";
        Namespace ns = Namespace.getNamespace("ns");
        Element e = new Element("child", Namespace.getNamespace("ns"));
        e.setAttribute(attrName, "value");
        n = e;
        String result = JDOMNodePointer.findEnclosingAttribute(n, attrName, ns);
        assertEquals("value", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute3_Lmjm2() {
        Object n = new Element("root", Namespace.getNamespace("ns"));
        String attrName = "attr";
        Namespace ns = Namespace.getNamespace("ns");
        Element e1 = new Element("child1", Namespace.getNamespace("ns"));
        e1.setAttribute(attrName, "value1");
        Element e2 = new Element("child2", Namespace.getNamespace("ns"));
        e2.setAttribute(attrName, "value2");
        n = e2;
        String result = JDOMNodePointer.findEnclosingAttribute(n, attrName, ns);
        assertEquals("value2", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute4_OrAs3() {
        Object n = new Element("root", Namespace.getNamespace("ns"));
        String attrName = "attr";
        Namespace ns = Namespace.getNamespace("ns");
        Element e1 = new Element("child1", Namespace.getNamespace("ns"));
        e1.setAttribute(attrName, "value1");
        Element e2 = new Element("child2", Namespace.getNamespace("ns"));
        e2.setAttribute(attrName, "value2");
        n = e1;
        String result = JDOMNodePointer.findEnclosingAttribute(n, attrName, ns);
        assertEquals("value1", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute5_JyJT4() {
        Object n = new Element("root", Namespace.getNamespace("ns"));
        String attrName = "attr";
        Namespace ns = Namespace.getNamespace("ns");
        Element e1 = new Element("child1", Namespace.getNamespace("ns"));
        e1.setAttribute(attrName, "value1");
        Element e2 = new Element("child2", Namespace.getNamespace("ns"));
        e2.setAttribute(attrName, "value2");
        Element e3 = new Element("child3", Namespace.getNamespace("ns"));
        e3.setAttribute(attrName, "value3");
        n = e3;
        String result = JDOMNodePointer.findEnclosingAttribute(n, attrName, ns);
        assertEquals("value3", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceResolver() throws Exception {
        locale = mock(Locale.class);
        node = mock(Object.class);
        namespaceResolver = mock(NamespaceResolver.class);
        jdomnodepointer = new JDOMNodePointer(node, locale);
        when(jdomnodepointer.getNamespaceResolver()).thenReturn(namespaceResolver);
        NamespaceResolver actualNamespaceResolver = jdomnodepointer.getNamespaceResolver();
        assertEquals(namespaceResolver, actualNamespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceResolver_ZdPA0() {
        Element element = new Element("root", Namespace.getNamespace("ns1", "http://ns1.com"));
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.getDefault());
        NamespaceResolver result = jDOMNodePointer.getNamespaceResolver();
        assertEquals(namespaceResolver, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceResolver2_nUAw1() {
        Element element = new Element("root", Namespace.getNamespace("ns1", "http://ns1.com"));
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.getDefault(), "id");
        NamespaceResolver result = jDOMNodePointer.getNamespaceResolver();
        assertEquals(namespaceResolver, result);
    }
}