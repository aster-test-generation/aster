/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNodePointer_Test_Passing {
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
    public void testcompareChildNodePointers() throws Exception {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        NodePointer pointer1 = mock(NodePointer.class);
        NodePointer pointer2 = mock(NodePointer.class);
        when(pointer1.getBaseValue()).thenReturn(node);
        when(pointer2.getBaseValue()).thenReturn(node);
        assertEquals(0, jdomnodepointer.compareChildNodePointers(pointer1, pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_cDED0() {
        JDOMNodePointer pointer1 = new JDOMNodePointer(new Element("root"), Locale.getDefault());
        JDOMNodePointer pointer2 = new JDOMNodePointer(new Element("root"), Locale.getDefault());
        int result = pointer1.compareChildNodePointers(pointer1, pointer2);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_TextNode_String_DELJ0() {
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Text("text"), Locale.getDefault());
        jDOMNodePointer.setValue("new text");
        assertEquals("new text", jDOMNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_String_uJOr2() {
        final Element element = new Element("element");
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.getDefault());
        jDOMNodePointer.setValue("new text");
        assertEquals("new text", jDOMNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_Null_Xxko3() {
        final Element element = new Element("element");
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.getDefault());
        jDOMNodePointer.setValue(null);
        assertEquals("", jDOMNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild17_mmFu16() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), Locale.getDefault());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_GPCc0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), Locale.getDefault());
        boolean result = jDOMNodePointer.isCollection();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        assertEquals(node, jdomnodepointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_2() throws Exception {
        node = new Object();
        nodeMock = Mockito.mock(Object.class);
        JDOMNodePointer jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        jdomnodepointer = new JDOMNodePointer(nodeMock, Locale.getDefault());
        assertEquals(nodeMock.hashCode(), jdomnodepointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_VtSh0() {
        Object node = new Object();
        Locale locale = new Locale("en", "US");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        assertEquals(node.hashCode(), jDOMNodePointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithId_GrWf2() {
        Object node = new Object();
        Locale locale = new Locale("en", "US");
        String id = "123";
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale, id);
        assertEquals(node.hashCode(), jDOMNodePointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointerConstructor1_kVfG0() {
        final QName name = new QName("name");
        final VariablePointer variablePointer = new VariablePointer(name);
        assertNotNull(variablePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointerConstructor2_jjOA1() {
        final KeywordVariables variables = new KeywordVariables("keyword", new Object());
        final QName name = new QName("name");
        final VariablePointer variablePointer = new VariablePointer(variables, name);
        assertNotNull(variablePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeywordVariablesConstructor_GfMa2() {
        final KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        assertNotNull(keywordVariables);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQNameConstructor1_hrnU6() {
        final String qualifiedName = "qualifiedName";
        final QName qName = new QName(qualifiedName);
        assertNotNull(qName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQNameConstructor2_fzBR7() {
        final String prefix = "prefix";
        final String localName = "localName";
        final QName qName = new QName(prefix, localName);
        assertNotNull(qName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJDOMNodePointerConstructor1_YBBr8() {
        final Object node = new Object();
        final Locale locale = Locale.getDefault();
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        assertNotNull(jDOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJDOMNodePointerConstructor2_VapS9() {
        final Object node = new Object();
        final Locale locale = Locale.getDefault();
        final String id = "id";
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale, id);
        assertNotNull(jDOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLength_lwbd0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"));
        assertEquals(1, jDOMNodePointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_nQLR0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Element("root"), Locale.getDefault());
        NodeIterator namespaceIterator = jDOMNodePointer.namespaceIterator();
        assertNotNull(namespaceIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public static void main(String[] args) {
        JDOMNodePointer jDOMNodePointer1 = new JDOMNodePointer(new Element("root"), Locale.ENGLISH);
        JDOMNodePointer jDOMNodePointer2 = new JDOMNodePointer(new Document(new Element("root")), Locale.ENGLISH);
        JDOMNodePointer jDOMNodePointer3 = new JDOMNodePointer(new Element("root"), Locale.ENGLISH, "id");
        assert jDOMNodePointer1.isLeaf();
        assert jDOMNodePointer2.isLeaf();
        assert jDOMNodePointer3.isLeaf();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals() {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        JDOMNodePointer other = new JDOMNodePointer(node, Locale.getDefault());
        assertTrue(jdomnodepointer.equals(other));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentNode() {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        Object differentNode = mock(Object.class);
        JDOMNodePointer other = new JDOMNodePointer(differentNode, Locale.getDefault());
        assertFalse(jdomnodepointer.equals(other));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentLocale() {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        Locale differentLocale = Locale.CANADA;
        JDOMNodePointer other = new JDOMNodePointer(node, differentLocale);
        assertTrue(jdomnodepointer.equals(other));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull() {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        assertFalse(jdomnodepointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClass() {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        assertFalse(jdomnodepointer.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLanguage_1() throws Exception {
        locale = mock(Locale.class);
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, locale);
        lang = "en";
        when(locale.getLanguage()).thenReturn("en");
        when(locale.getLanguage()).thenReturn("fr");
        assertFalse(jdomnodepointer.isLanguage(lang));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLanguageWithLanguageNotSet_YLAo1() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Element("root"), Locale.ENGLISH);
        boolean result = pointer.isLanguage("en");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespacePointer_NdKf0() {
        Element root = new Element("root");
        Element child = new Element("child");
        child.addNamespaceDeclaration(Namespace.getNamespace("ns", "http://example.com/ns"));
        root.addContent(child);
        JDOMNodePointer pointer = new JDOMNodePointer(root, Locale.getDefault());
        pointer.setIndex(0);
        NodePointer namespacePointer = pointer.namespacePointer("ns");
        assertNull(namespacePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        node = new Object();
        nodeMock = Mockito.mock(Object.class);
        JDOMNodePointer jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        assertEquals(node.hashCode(), jdomnodepointer.hashCode());
        jdomnodepointer = new JDOMNodePointer(nodeMock, Locale.getDefault());
        assertEquals(nodeMock.hashCode(), jdomnodepointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointerConstructor1_XEqG0() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        assertNotNull(variablePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointerConstructor2_UdAd1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(keywordVariables, new QName("name"));
        assertNotNull(variablePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeywordVariablesConstructor_TIvn2() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        assertNotNull(keywordVariables);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQNameConstructor1_fnDh6() {
        QName qName = new QName("qualifiedName");
        assertNotNull(qName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQNameConstructor2_bhBb7() {
        QName qName = new QName("prefix", "localName");
        assertNotNull(qName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJDOMNodePointerConstructor1_KrwQ8() {
        Object node = new Object();
        Locale locale = Locale.getDefault();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale);
        assertNotNull(jDOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJDOMNodePointerConstructor2_ecMd9() {
        Object node = new Object();
        Locale locale = Locale.getDefault();
        String id = "id";
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, locale, id);
        assertNotNull(jDOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_GKJn11() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), Locale.getDefault());
        String path = jDOMNodePointer.asPath();
        assertNotNull(path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_JtyE0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Document(), Locale.ENGLISH);
        String namespaceURI = jDOMNodePointer.getNamespaceURI("xml");
        assertEquals("http://www.w3.org/XML/1998/namespace", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_LTGQ1() {
        Element element = new Element("root", Namespace.getNamespace("prefix", "uri"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.ENGLISH);
        String namespaceURI = jDOMNodePointer.getNamespaceURI("prefix");
        assertEquals("uri", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_KMLh2() {
        Element element = new Element("root", Namespace.getNamespace("prefix", "uri"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.ENGLISH);
        String namespaceURI = jDOMNodePointer.getNamespaceURI("other");
        assertEquals(null, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_FsJD3() {
        Document document = new Document(new Element("root", Namespace.getNamespace("prefix", "uri")));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, Locale.ENGLISH);
        String namespaceURI = jDOMNodePointer.getNamespaceURI("prefix");
        assertEquals("uri", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_xqJw4() {
        Document document = new Document(new Element("root", Namespace.getNamespace("prefix", "uri")));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, Locale.ENGLISH);
        String namespaceURI = jDOMNodePointer.getNamespaceURI("other");
        assertEquals(null, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        Object baseValue = jdomnodepointer.getBaseValue();
        assertEquals(node, baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute1_ntSt0() {
        Object n = new Element("root", Namespace.getNamespace("ns"));
        String attrName = "attr";
        Namespace ns = Namespace.getNamespace("ns");
        String result = JDOMNodePointer.findEnclosingAttribute(n, attrName, ns);
        assertEquals(null, result);
    }
}