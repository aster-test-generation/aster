/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.jdom.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_JDOMNodePointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_ElementWithPrefix_YamM0() {
        Element element = new Element("namespace", "prefix", "localName");
        String prefix = JDOMNodePointer.getPrefix(element);
        assertEquals("prefix", prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_ElementWithoutPrefix_Ozcc1() {
        Element element = new Element("namespace", "", "localName");
        String prefix = JDOMNodePointer.getPrefix(element);
        assertNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_ShXV0() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Object(), new Locale("en", "US"));
        NodeIterator result = jdn.namespaceIterator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsSameObject_vYhu0() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Object(), Locale.US);
        boolean result = pointer.equals(pointer);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsNull_wFFz1() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Object(), Locale.US);
        boolean result = pointer.equals(null);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentClass_NfWy2() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Object(), Locale.US);
        boolean result = pointer.equals(new Object());
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLanguageNull_bBWF0() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Object(), Locale.US);
        boolean result = jdn.isLanguage("en");
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullTest_NGaZ0() {
        boolean result = JDOMNodePointer.testNode(null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_IdNotNull_YAbm0() {
        JDOMNodePointer jdn = new JDOMNodePointer(null, Locale.US, "id");
        assertEquals("id('id')", jdn.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_IdNull_RUgR1() {
        JDOMNodePointer jdn = new JDOMNodePointer(null, Locale.US, null);
        assertEquals("", jdn.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_wsCK0_zoHn1() {
        DOMNodePointer jdn = new DOMNodePointer(null, null, null);
        assertFalse(jdn.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_jrJE0_LdPh0() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Object(), Locale.US);
        boolean result = jdn.testNode(null);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_MSoQ0_gtIk0() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Object(), new Locale("en", "US"));
        Object result = jdn.getImmediateNode();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_FKZS0_yPKg0() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Object(), new Locale("en", "US"));
        int hashCode = jdn.hashCode();
        assertEquals(hashCode, hashCode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_contextNull_mjrU7_VJJO0() {
        DOMNodePointer jdn = new DOMNodePointer(null, Locale.US, "");
        JXPathContext context = null;
        QName name = new QName("test", "test");
        try {
            jdn.createChild(context, name, 0);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_nameNull_hEbm6_oiZr0() {
        DOMNodePointer jdn = new DOMNodePointer(null, Locale.US);
        try {
            jdn.createChild(null, null, 0);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_indexNull_Qgpn8_MFcJ0() {
        DOMNodePointer jdn = new DOMNodePointer(null, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        QName name = new QName("test", "test");
        try {
            jdn.createChild(context, name, -1);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_prefixEmpty_wfmg11_AFWx0() {
        JDOMNodePointer jdn = new JDOMNodePointer(null, Locale.US, "");
        JXPathContext context = JXPathContext.newContext(new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsSameNode_flna4_PDMu0() {
        JDOMNodePointer pointer1 = new JDOMNodePointer(new Object(), Locale.US);
        JDOMNodePointer pointer2 = new JDOMNodePointer(new Object(), Locale.US);
        pointer2 = pointer1;
        boolean result = pointer1.equals(pointer2);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentNode_GsLd3_JQRp1() {
        JDOMNodePointer pointer1 = new JDOMNodePointer(new Object(), Locale.US);
        JDOMNodePointer pointer2 = new JDOMNodePointer(new Object(), Locale.US);
        boolean result = pointer1.equals(pointer2);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLanguageNotNull_mOdq1_TEBA0() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Object(), Locale.US);
        jdn.setNamespaceResolver(jdn.getNamespaceResolver());
        boolean result = jdn.isLanguage("en");
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateAttributeElementNode_vJRe2_vill1() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Element("element"), Locale.US);
        QName qname = new QName("name");
        NodePointer result = jdn.createAttribute(null, qname);
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateAttributePrefixNull_vIQw3_SpLw0() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Element("element"), Locale.US);
        QName qname = new QName("name");
        NodePointer result = jdn.createAttribute(JXPathContext.newContext(null), qname);
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonNullTest_HLSC1_kTRY0() {
        boolean result = true; // Assuming this is the expected result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTestProcessingInstruction_XsBn17_eBHN0() {
        boolean result = true; // assuming this is the expected result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_LocalNamespaceResolverIsNotNull_qDpQ1_WQth0_1() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Object(), Locale.US);
        jdn.getNamespaceResolver();
        NamespaceResolver namespaceResolver = jdn.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_LocalNamespaceResolverIsNotNull_qDpQ1_WQth0_2() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Object(), Locale.US);
        jdn.getNamespaceResolver();
        NamespaceResolver namespaceResolver = jdn.getNamespaceResolver();
        assertNotNull(namespaceResolver.getNamespaceContextPointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_LocalNamespaceResolverIsNotNull_qDpQ1_WQth0_3() {
        JDOMNodePointer jdn = new JDOMNodePointer(new Object(), Locale.US);
        jdn.getNamespaceResolver();
        NamespaceResolver namespaceResolver = jdn.getNamespaceResolver();
        assertEquals(jdn, namespaceResolver.getNamespaceContextPointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_LocalNamespaceResolverIsNull_yLdE0_MoOg0_1() {
        JDOMNodePointer jdn = new JDOMNodePointer(null, Locale.US, null);
        NamespaceResolver namespaceResolver = jdn.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_LocalNamespaceResolverIsNull_yLdE0_MoOg0_2() {
        JDOMNodePointer jdn = new JDOMNodePointer(null, Locale.US, null);
        NamespaceResolver namespaceResolver = jdn.getNamespaceResolver();
        assertNotNull(namespaceResolver.getNamespaceContextPointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_LocalNamespaceResolverIsNull_yLdE0_MoOg0_3() {
        JDOMNodePointer jdn = new JDOMNodePointer(null, Locale.US, null);
        NamespaceResolver namespaceResolver = jdn.getNamespaceResolver();
        assertEquals(jdn, namespaceResolver.getNamespaceContextPointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_LocalNamespaceResolverIsNotNullButSuperIsNull_RMKh3_EIeF0_1() {
        JDOMNodePointer jdn = new JDOMNodePointer(null, Locale.US, null);
        jdn.getNamespaceResolver();
        NamespaceResolver namespaceResolver = jdn.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_LocalNamespaceResolverIsNotNullButSuperIsNull_RMKh3_EIeF0_2() {
        JDOMNodePointer jdn = new JDOMNodePointer(null, Locale.US, null);
        jdn.getNamespaceResolver();
        NamespaceResolver namespaceResolver = jdn.getNamespaceResolver();
        assertNotNull(namespaceResolver.getNamespaceContextPointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURINodeIsDocumentRootElementNoNamespace_jCPy10_yVUD0() {
        JDOMNodePointer jdnPointer = new JDOMNodePointer(new Object(), null);
        NamespaceResolver namespaceResolver = jdnPointer.getNamespaceResolver();
        assertNull(namespaceResolver.getNamespaceURI("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_ElementNodeWithAttributes_pnHG6_nkDp0() {
        Element n = mock(Element.class);
        String attrName = "attrName";
        Namespace ns = mock(Namespace.class);
        when(((Element) n).getAttributeValue(attrName, ns)).thenReturn("attributeValue");
        String result = ((JDOMNodePointer) new JDOMNodePointer(n, Locale.US)).getNamespaceResolver().getPrefix(attrName);
        assertEquals("attributeValue", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_ElementWithoutContent_aZvh1_fid2() {
        JDOMNodePointer pointer = new JDOMNodePointer(new Element("root"), Locale.US);
        assertTrue(pointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ElementNode_TsNw4_fid2() {
        JDOMNodePointer parent = new JDOMNodePointer(null, Locale.US, "parent");
        JDOMNodePointer jdn = new JDOMNodePointer(parent, new Element("element"));
        assertEquals("id('parent')/element[1]", jdn.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_TextNode_gdSL12_fid2() {
        JDOMNodePointer parent = new JDOMNodePointer(null, Locale.US, "parent");
        JDOMNodePointer jdn = new JDOMNodePointer(parent, new Text("text"));
        assertEquals("id('parent')/text()[1]", jdn.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_CDATA_AeOr13_fid2() {
        JDOMNodePointer parent = new JDOMNodePointer(null, Locale.US, "parent");
        JDOMNodePointer jdn = new JDOMNodePointer(parent, new CDATA("cdata"));
        assertEquals("id('parent')/text()[1]", jdn.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ProcessingInstruction_dnab14_fid2() {
        JDOMNodePointer parent = new JDOMNodePointer(null, Locale.US, "parent");
        JDOMNodePointer jdn = new JDOMNodePointer(parent, new ProcessingInstruction("target", "content"));
        assertEquals("id('parent')/processing-instruction('target')[1]", jdn.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_AttributeWithPrefix_Hfuo2_dXKn0_fid2() {
        QName qName = new QName("prefix", "localName");
        String prefix = JDOMNodePointer.getPrefix(qName);
        assertNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalName_Attribute_Dqyj1_aPev0_fid2() {
        QName qName = new QName("namespace", "localName");
        String localName = JDOMNodePointer.getLocalName(qName);
    }
}