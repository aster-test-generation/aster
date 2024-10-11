/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JDOMNodePointer_Coverage_Test_Failing {
    private Object node;
    JDOMNodePointer jdomnodepointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafForDocumentNode_gIos1() {
        Document document = new Document(new Element("test"));
        JDOMNodePointer pointer = new JDOMNodePointer(document, Locale.getDefault());
        assertTrue(pointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_kLVQ0() {
        Element element = new Element("test", "test");
        String prefix = JDOMNodePointer.getPrefix(element);
        assertEquals("test", prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_ZTci1() {
        Attribute attribute = new Attribute("test", "test");
        String prefix = JDOMNodePointer.getPrefix(attribute);
        assertEquals("test", prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue1_ZzMt0() {
        JDOMNodePointer node = new JDOMNodePointer(new Object(), new Locale("en"));
        String result = (String) node.getValue();
        assertEquals("result", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue2_gjnZ1() {
        JDOMNodePointer node = new JDOMNodePointer(new Object(), new Locale("en"), "id");
        String result = (String) node.getValue();
        assertEquals("result", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_GlVn3() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        NamespaceResolver namespaceResolver = jdomNodePointer.getNamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        namespaceResolver1.setNamespaceContextPointer(jdomNodePointer);
        assertEquals(namespaceResolver1, namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_PyEr4() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Object(), new Locale(""));
        NamespaceResolver namespaceResolver = jdomNodePointer.getNamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        namespaceResolver1.setNamespaceContextPointer(jdomNodePointer);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        assertEquals(namespaceResolver2, namespaceResolver1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_WWhv0() {
        JDOMNodePointer node = new JDOMNodePointer(new Document(), new Locale("en"), "id");
        assertEquals("xml uri", Namespace.XML_NAMESPACE.getURI(), node.getNamespaceURI("xml"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath1_pzkg0() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Object(), new Locale("en"));
        String actual = jdomNodePointer.asPath();
        assertEquals("id('id')", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild2_VkkB1_tLfH0() {
        JDOMNodePointer classUnderTesting = new JDOMNodePointer(new Object(), new Locale("en"));
        JXPathContext context = JXPathContext.newContext(new Object());
        QName name = new QName(" qualifiedName");
        int index = 0;
        NodePointer result = classUnderTesting.createChild(context, name, index);
    }
}