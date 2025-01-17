/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNodePointer_Test_Passing {
    private Object node;
    JDOMNodePointer jdomnodepointer;
    private String id;
    private NamespaceResolver localNamespaceResolver;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIteratorWithNullNodeAndLocaleAndId_Ziuh10() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithJDOMNodePointer_ibjl3() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Object(), new Locale("en"), "id");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithNull_yfaE4() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(null, new QName("prefix", "localName"));
        assertNull(jdomNodePointer.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_Element_uigz0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("test"), Locale.ENGLISH);
        assertTrue(nodePointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_Document_cqyE1() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Document(), Locale.ENGLISH);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_Other_sIfj2() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_NullPointer_sPio6() {
        NodePointer pointer = null;
        Object node = new Element("test");
        NodeTest test = new NodeNameTest(new QName("test"));
        assertTrue(JDOMNodePointer.testNode(pointer, node, test));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_NullNodeAndPointer_UeNg7() {
        NodePointer pointer = null;
        Object node = null;
        NodeTest test = new NodeNameTest(new QName("test"));
        assertFalse(JDOMNodePointer.testNode(pointer, node, test));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_NullTestAndPointerAndNode_oNzF10() {
        NodePointer pointer = null;
        Object node = null;
        NodeTest test = null;
        assertTrue(JDOMNodePointer.testNode(pointer, node, test));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueElementWithTextAndChildrenAndTrimAndNoSpace_gfze11() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("test"), new Locale("en_US"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguageWithNullParent_kKys3() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(null, new Object());
        String language = jdomNodePointer.getLanguage();
        assertNull(language);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithNonElementNonProcessingInstructionNode_suaF3_PLvf0() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Text("text"), Locale.ENGLISH);
        QName name = jdomNodePointer.getName();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithEmptyString_hSoq5_tKTB0() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new QName("prefix", "localName"), new Locale("en-US"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueElement_bumw0_YsJB1() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Element("test"), new Locale("en_US"));
        String expected = "test";
        Object actual = nodePointer.getValue();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueComment_pWxe1_rXRb0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Comment("test"), new Locale("en_US"));
        String expected = "test";
        String actual = (String) nodePointer.getValue();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueText_CKBr2_HZWC0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Text("test"), new Locale("en_US"));
        String expected = "test";
        String actual = (String) nodePointer.getValue();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueProcessingInstruction_qRRh3_Zrxy0() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new ProcessingInstruction("test", ""), new Locale("en_US"));
        String expected = "test";
        String actual = (String) nodePointer.getValue();
    }
}