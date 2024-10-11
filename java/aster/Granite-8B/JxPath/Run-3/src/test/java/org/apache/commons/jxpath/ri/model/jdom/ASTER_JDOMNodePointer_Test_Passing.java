/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.Functions;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
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
    JDOMNodePointer jdomnodepointer;
    private Locale locale;
    private VariablePointer parent;
    private KeywordVariables variables;
    private QName name;
    private NodeTest test;
    private static final Locale LOCALE = Locale.ENGLISH;
    private static final String ID = "id";
    private static final String PREFIX = "prefix";
    private static final String LOCAL_NAME = "localName";
    private static final String QUALIFIED_NAME = "qualifiedName";
    private static final String KEYWORD = "keyword";
    private static final Object OBJECT = new Object();
    @Mock
    private Object nodeMock;
    VariablePointer variablePointer;
    NodeIterator nodeIterator;
    String qualifiedName;
    String prefix;
    String localName;
    String keyword;
    Object object;
    @Mock
    private Element mockElement;
    @Mock
    private Text mockText;
    @Mock
    private Comment mockComment;
    @Mock
    private ProcessingInstruction mockProcessingInstruction;
    @Mock
    private Locale mockLocale;
    @Mock
    private NodeIterator mockNodeIterator;
    @Mock
    private NodePointer mockNodePointer;
    @Mock
    private KeywordVariables mockKeywordVariables;
    @Mock
    private QName mockQName;
    @Mock
    private VariablePointer mockVariablePointer;
    private KeywordVariables keywordVariables;
    private JXPathContextReferenceImpl jxpathContextReferenceImpl;
    private JXPathContext jxpathContext;
    private Functions functions;
    private AbstractFactory abstractFactory;
    private Pointer pointer;
    private Pointer namespaceContextPointer;
    private Pointer contextPointer;
    private Pointer pointer1;
    private Pointer pointer2;
    private Pointer pointer3;
    private Pointer pointer4;
    private Pointer pointer5;
    private Pointer pointer6;
    private Pointer pointer7;
    private Pointer pointer8;
    private Pointer pointer9;
    private Pointer pointer10;
    private Pointer pointer11;
    private Pointer pointer12;
    private Pointer pointer13;
    private Pointer pointer14;
    private Pointer pointer15;
    private Pointer pointer16;
    private Pointer pointer17;
    private Pointer pointer18;
    private Pointer pointer19;
    private Pointer pointer20;
    private Pointer pointer21;
    private Pointer pointer22;
    private Pointer pointer23;
    private Pointer pointer24;
    private Pointer pointer25;
    private Pointer pointer26;
    private Pointer pointer27;
    private Pointer pointer28;
    private Pointer pointer29;
    private Pointer pointer30;
    private Pointer pointer31;
    private Pointer pointer32;
    private Pointer pointer33;
    private Pointer pointer34;
    private Pointer pointer35;
    private Pointer pointer36;
    private Pointer pointer37;
    private Pointer pointer38;
    private Pointer pointer39;
    private Pointer pointer40;
    private Pointer pointer41;
    private Pointer pointer42;
    private Pointer pointer43;
    private Pointer pointer44;
    private Pointer pointer45;
    private Pointer pointer46;
    private Pointer pointer47;
    private Pointer pointer48;
    private Pointer pointer49;
    private Pointer pointer50;
    private Pointer pointer51;
    private Pointer pointer52;
    private Pointer pointer53;
    private Pointer pointer54;
    private Pointer pointer55;
    private Pointer pointer56;
    private Pointer pointer57;
    private Pointer pointer58;
    private Pointer pointer59;
    private Pointer pointer60;
    private Pointer pointer61;
    private Pointer pointer62;
    private Pointer pointer63;
    private Pointer pointer64;
    private Pointer pointer65;
    private Pointer pointer66;
    private Pointer pointer67;
    private Pointer pointer68;
    private Pointer pointer69;
    private Pointer pointer70;
    private Pointer pointer71;
    private Pointer pointer72;
    private Pointer pointer73;
    private Pointer pointer74;
    private Pointer pointer75;
    private Pointer pointer76;
    private Pointer pointer77;
    private Pointer pointer78;
    private Pointer pointer79;
    private Pointer pointer80;
    private Pointer pointer81;
    private Pointer pointer82;
    private Pointer pointer83;
    private Pointer pointer84;
    private Pointer pointer85;
    private Pointer pointer86;
    private Pointer pointer87;
    private Pointer pointer88;
    private Pointer pointer89;
    private Pointer pointer90;
    private Pointer pointer91;
    private Pointer pointer92;
    private Pointer pointer93;
    private Pointer pointer94;
    private Pointer pointer95;
    private Pointer pointer96;
    private Pointer pointer97;
    private Pointer pointer98;
    private Pointer pointer99;
    private Pointer pointer100;
    private Pointer pointer101;
    private Pointer pointer102;
    private Pointer pointer103;
    private Pointer pointer104;
    private Pointer pointer105;
    private Pointer pointer106;
    private Pointer pointer107;
    private Pointer pointer108;
    private Pointer pointer109;
    private Pointer pointer110;
    private Pointer pointer111;
    private Pointer pointer112;
    private Pointer pointer113;
    private Pointer pointer114;
    private Pointer pointer115;
    private Pointer pointer116;
    private Pointer pointer117;
    private Pointer pointer118;
    private Pointer pointer119;
    private Pointer pointer120;
    private Pointer pointer121;
    private Pointer pointer122;
    private Pointer pointer123;
    private Pointer pointer124;
    private String id;
    @Mock
    private ProcessingInstruction processingInstruction;
    @Mock
    private Text text;
    @Mock
    private CDATA cdata;
    @Mock
    private Element element;
    @Mock
    private Namespace ns;
    private NamespaceResolver localNamespaceResolver;
    @Mock
    private NamespaceResolver namespaceResolver;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNode() throws Exception {
        node = Mockito.mock(Object.class);
        locale = Locale.ENGLISH;
        parent = Mockito.mock(VariablePointer.class);
        variables = Mockito.mock(KeywordVariables.class);
        name = Mockito.mock(QName.class);
        test = Mockito.mock(NodeTest.class);
        jdomnodepointer = new JDOMNodePointer(node, locale);
        when(jdomnodepointer.testNode(test)).thenReturn(true);
        boolean result = jdomnodepointer.testNode(test);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers() throws Exception {
        jdomnodepointer = new JDOMNodePointer(Mockito.mock(Object.class), Locale.ROOT);
        NodePointer pointer1 = Mockito.mock(NodePointer.class);
        NodePointer pointer2 = Mockito.mock(NodePointer.class);
        when(pointer1.getBaseValue()).thenReturn(Mockito.mock(Object.class));
        when(pointer2.getBaseValue()).thenReturn(Mockito.mock(Object.class));
        assertEquals(0, jdomnodepointer.compareChildNodePointers(pointer1, pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        when(node.hashCode()).thenReturn(123);
        assertEquals(123, jdomnodepointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_OtherNode_Other_QmOj15() {
        final Object node = new Object();
        final Object value = new Object();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ecoN0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), Locale.getDefault(), "id");
        assertEquals(jDOMNodePointer.getNode().hashCode(), jDOMNodePointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName() throws Exception {
        node = mock(Object.class);
        locale = mock(Locale.class);
        parent = mock(VariablePointer.class);
        variables = mock(KeywordVariables.class);
        name = mock(QName.class);
        jdomnodepointer = new JDOMNodePointer(node, locale);
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getNamespacePrefix()).thenReturn("ns");
        when(((Element) node).getName()).thenReturn("ln");
        when(new QName("ns", "ln")).thenReturn(name);
        assertEquals(name, jdomnodepointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_BmwP0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        boolean result = jDOMNodePointer.isCollection();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection2_sEft1() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"));
        boolean result = jDOMNodePointer.isCollection();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_ACmx0() {
        Element element = new Element("testElement", Namespace.getNamespace("testNamespace"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, Locale.ENGLISH);
        String namespaceURI = jDOMNodePointer.getNamespaceURI();
        assertEquals("testNamespace", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLength_PFVG0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        assertEquals(1, jDOMNodePointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() throws Exception {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getContent().isEmpty()).thenReturn(true);
        assertTrue(jdomnodepointer.isLeaf());
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getContent().isEmpty()).thenReturn(false);
        assertFalse(jdomnodepointer.isLeaf());
        when(node instanceof Document).thenReturn(true);
        when(((Document) node).getContent().isEmpty()).thenReturn(true);
        assertTrue(jdomnodepointer.isLeaf());
        when(node instanceof Document).thenReturn(true);
        when(((Document) node).getContent().isEmpty()).thenReturn(false);
        assertFalse(jdomnodepointer.isLeaf());
        when(node instanceof Element).thenReturn(false);
        when(node instanceof Document).thenReturn(false);
        assertTrue(jdomnodepointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrefix1_hgLS0() {
        final Object node = null;
        final String actual = JDOMNodePointer.getPrefix(node);
        assertEquals(null, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrefix2_EyPK1() {
        final Object node = new Element("root");
        final String actual = JDOMNodePointer.getPrefix(node);
        assertEquals(null, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrefix3_aDGw2() {
        final Object node = new Attribute("attr", "value");
        final String actual = JDOMNodePointer.getPrefix(node);
        assertEquals(null, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_xMFc0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"));
        NodeIterator nodeIterator = jDOMNodePointer.namespaceIterator();
        assertNotNull(nodeIterator);
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
        assertFalse(jdomnodepointer.equals(other));
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
    public void testisLanguage() throws Exception {
        locale = Locale.getDefault();
        node = new Object();
        variables = new KeywordVariables("keyword", new Object());
        name = new QName("prefix", "localName");
        parent = new VariablePointer(variables, name);
        jdomnodepointer = new JDOMNodePointer(parent, node);
        when(jdomnodepointer.getLanguage()).thenReturn("en");
        assertTrue(jdomnodepointer.isLanguage("en"));
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        assertTrue(jdomnodepointer.isLanguage("en"));
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        assertTrue(jdomnodepointer.isLanguage("en-US"));
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        assertFalse(jdomnodepointer.isLanguage("fr"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals1_BgdT4() {
        QName queName = new QName("qualifiedName");
        QName queName1 = new QName("qualifiedName");
        assertTrue(queName.equals(queName1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals2_dZws5() {
        QName queName = new QName("prefix", "localName");
        QName queName1 = new QName("prefix", "localName");
        assertTrue(queName.equals(queName1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals1_cVuL6() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        VariablePointer variablePointer1 = new VariablePointer(new QName("name"));
        assertTrue(variablePointer.equals(variablePointer1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals1_SwTd8() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"));
        JDOMNodePointer jDOMNodePointer1 = new JDOMNodePointer(new Object(), new Locale("en"));
        assertTrue(jDOMNodePointer.equals(jDOMNodePointer1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals2_RzTH9() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        JDOMNodePointer jDOMNodePointer1 = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        assertTrue(jDOMNodePointer.equals(jDOMNodePointer1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguage_MqqE0() {
        Element element = new Element("root");
        element.setAttribute("lang", "en");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);
        String language = pointer.getLanguage();
        assertEquals("en", language);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguageWithNamespace_dzoE1() {
        Element element = new Element("root", Namespace.XML_NAMESPACE);
        element.setAttribute("lang", "en");
        JDOMNodePointer pointer = new JDOMNodePointer(element, Locale.ENGLISH);
        String language = pointer.getLanguage();
        assertEquals("en", language);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguageWithParent_niQv2() {
        Element root = new Element("root");
        Element element = new Element("child");
        root.addContent(element);
        element.setAttribute("lang", "en");
        JDOMNodePointer parentPointer = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer pointer = new JDOMNodePointer(parentPointer, element);
        String language = pointer.getLanguage();
        assertEquals("en", language);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguageWithParentAndNamespace_RHkS3() {
        Element root = new Element("root");
        Element element = new Element("child", Namespace.XML_NAMESPACE);
        root.addContent(element);
        element.setAttribute("lang", "en");
        JDOMNodePointer parentPointer = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer pointer = new JDOMNodePointer(parentPointer, element);
        String language = pointer.getLanguage();
        assertEquals("en", language);
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
    public void testGetBaseValue_Xgkq0() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        Object baseValue = jDOMNodePointer.getBaseValue();
        assertNotNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValueWithLocale_CEzN2() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"));
        Object baseValue = jDOMNodePointer.getBaseValue();
        assertNotNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullPrefix_mRRX0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.getDefault());
        assertEquals(null, nodePointer.getNamespaceURI(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyPrefix_IbeS1() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.getDefault());
        assertEquals(null, nodePointer.getNamespaceURI(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonExistentPrefix_TqhG2() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.getDefault());
        assertEquals(null, nodePointer.getNamespaceURI("non-existent"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testXmlPrefix_XpeQ3() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.getDefault());
        assertEquals(Namespace.XML_NAMESPACE.getURI(), nodePointer.getNamespaceURI("xml"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDocumentRootPrefix_fqEL6() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Document(new Element("root")), Locale.getDefault());
        assertEquals(null, nodePointer.getNamespaceURI("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonElementNode_mZPo8() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Text("text"), Locale.getDefault());
        assertEquals(null, nodePointer.getNamespaceURI("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullLocale_BBeH9() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), null);
        assertEquals(null, nodePointer.getNamespaceURI("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithId_PBVx0() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Object(), Locale.getDefault(), "id1");
        assertEquals("id('id1')", pointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithParentAndNode_yFgv1() {
        JDOMNodePointer parent = new JDOMNodePointer(new Object(), Locale.getDefault());
        JDOMNodePointer pointer = new JDOMNodePointer(parent, new Object());
        assertEquals(parent.asPath(), pointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNodeAndLocale_xOpW2() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Object(), Locale.getDefault());
        assertEquals("", pointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute1_KcBr0() {
        Object n = new Element("root");
        String attrName = "attr1";
        Namespace ns = Namespace.getNamespace("ns1");
        String result = JDOMNodePointer.findEnclosingAttribute(n, attrName, ns);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute2_Tchg1() {
        Element e = new Element("root");
        e.setAttribute("attr1", "value1");
        Object n = e;
        String attrName = "attr1";
        Namespace ns = Namespace.getNamespace("ns1");
        String result = JDOMNodePointer.findEnclosingAttribute(n, attrName, ns);
        assertEquals("value1", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute3_Ieqw2() {
        Element e1 = new Element("root");
        e1.setAttribute("attr1", "value1");
        Element e2 = new Element("child");
        e2.setAttribute("attr2", "value2");
        e1.addContent(e2);
        Object n = e2;
        String attrName = "attr1";
        Namespace ns = Namespace.getNamespace("ns1");
        String result = JDOMNodePointer.findEnclosingAttribute(n, attrName, ns);
        assertEquals("value1", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute4_dxiv3() {
        Element e1 = new Element("root");
        e1.setAttribute("attr1", "value1");
        Element e2 = new Element("child");
        e2.setAttribute("attr2", "value2");
        e1.addContent(e2);
        Object n = e2;
        String attrName = "attr2";
        Namespace ns = Namespace.getNamespace("ns1");
        String result = JDOMNodePointer.findEnclosingAttribute(n, attrName, ns);
        assertEquals("value2", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute5_yVBP4() {
        Element e1 = new Element("root");
        e1.setAttribute("attr1", "value1");
        Element e2 = new Element("child");
        e2.setAttribute("attr2", "value2");
        e1.addContent(e2);
        Object n = e2;
        String attrName = "attr3";
        Namespace ns = Namespace.getNamespace("ns1");
        String result = JDOMNodePointer.findEnclosingAttribute(n, attrName, ns);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQNameConstructor1_vHff2() {
        QName qName = new QName("qualifiedName");
        assertNotNull(qName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQNameConstructor2_SQaG3() {
        QName qName = new QName("prefix", "localName");
        assertNotNull(qName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointerConstructor1_yXPb4() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        assertNotNull(variablePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointerConstructor2_COVy5() {
        VariablePointer variablePointer = new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name"));
        assertNotNull(variablePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeywordVariablesConstructor_aGNr6() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        assertNotNull(keywordVariables);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceResolverGetPrefix4_IMUI10() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String prefix = namespaceResolver.getPrefix("namespaceURI");
        assertNotNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceResolverGetNamespaceURI1_TBGW11() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String namespaceURI = namespaceResolver.getNamespaceURI("prefix");
        assertNotNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceResolverGetNamespaceContextPointer_Lkor12() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        Pointer namespaceContextPointer = namespaceResolver.getNamespaceContextPointer();
        assertNotNull(namespaceContextPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJDOMNodePointerGetNamespaceResolver_Etqg13() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"));
        NamespaceResolver namespaceResolver = jDOMNodePointer.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJDOMNodePointerGetNamespaceResolver2_aKBm14() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        NamespaceResolver namespaceResolver = jDOMNodePointer.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_1() throws Exception {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getContent().isEmpty()).thenReturn(true);
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getContent().isEmpty()).thenReturn(false);
        when(node instanceof Document).thenReturn(true);
        when(((Document) node).getContent().isEmpty()).thenReturn(true);
        when(node instanceof Document).thenReturn(true);
        when(((Document) node).getContent().isEmpty()).thenReturn(false);
        when(node instanceof Element).thenReturn(false);
        when(node instanceof Document).thenReturn(false);
        assertTrue(jdomnodepointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_2() throws Exception {
        node = mock(Object.class);
        jdomnodepointer = new JDOMNodePointer(node, Locale.getDefault());
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getContent().isEmpty()).thenReturn(true);
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getContent().isEmpty()).thenReturn(false);
        when(node instanceof Document).thenReturn(true);
        when(((Document) node).getContent().isEmpty()).thenReturn(true);
        when(node instanceof Document).thenReturn(true);
        when(((Document) node).getContent().isEmpty()).thenReturn(false);
        when(node instanceof Element).thenReturn(false);
        when(node instanceof Document).thenReturn(false);
        assertFalse(jdomnodepointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLanguage_1() throws Exception {
        locale = Locale.getDefault();
        node = new Object();
        variables = new KeywordVariables("keyword", new Object());
        name = new QName("prefix", "localName");
        parent = new VariablePointer(variables, name);
        jdomnodepointer = new JDOMNodePointer(parent, node);
        when(jdomnodepointer.getLanguage()).thenReturn("en");
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        assertTrue(jdomnodepointer.isLanguage("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLanguage_3() throws Exception {
        locale = Locale.getDefault();
        node = new Object();
        variables = new KeywordVariables("keyword", new Object());
        name = new QName("prefix", "localName");
        parent = new VariablePointer(variables, name);
        jdomnodepointer = new JDOMNodePointer(parent, node);
        when(jdomnodepointer.getLanguage()).thenReturn("en");
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        assertTrue(jdomnodepointer.isLanguage("en-US"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLanguage_4() throws Exception {
        locale = Locale.getDefault();
        node = new Object();
        variables = new KeywordVariables("keyword", new Object());
        name = new QName("prefix", "localName");
        parent = new VariablePointer(variables, name);
        jdomnodepointer = new JDOMNodePointer(parent, node);
        when(jdomnodepointer.getLanguage()).thenReturn("en");
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        when(jdomnodepointer.getLanguage()).thenReturn("en-US");
        assertFalse(jdomnodepointer.isLanguage("fr"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_TextNode_Null_NoAu1_eZHQ0() {
        final Object node = new Text("text");
        final Object value = null;
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, Locale.getDefault(), null);
        jDOMNodePointer.setValue(value);
        assertEquals("", ((Text) node).getText());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_TextNode_Empty_DXdG2_FotF0() {
        final Object node = new Text("text");
        final Object value = "";
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, Locale.getDefault());
        jDOMNodePointer.setValue(value);
        assertEquals("", ((Text) node).getText());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_Document_GXvC4_Rdyt0() {
        final Object node = new Element("element");
        final Object value = new Document(new Element("newElement"));
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, Locale.getDefault(), "id");
        jDOMNodePointer.setValue(value);
        assertEquals("newElement", ((Element) node).getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_ProcessingInstruction_BEsD7_CIcR0() {
        final Object node = new Element("element");
        final Object value = new ProcessingInstruction("target", "data");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, Locale.getDefault());
        jDOMNodePointer.setValue(value);
        assertEquals("target", ((Element) node).getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_Comment_wamh8_amXv0() {
        final Object node = new Element("element");
        final Object value = new Comment("new text");
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, Locale.getDefault());
        jDOMNodePointer.setValue(value);
        assertEquals("new text", ((Element) node).getText());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode_Other_rNND11_HmyL0() {
        final Object node = new Element("element");
        final Object value = new Object();
        final JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(node, Locale.getDefault());
        jDOMNodePointer.setValue(value);
        assertEquals("", ((Element) node).getText());
    }
}