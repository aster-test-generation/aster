/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
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
public class Aster_NamespacePointer_Test_Passing {
    private String prefix;
    private String namespaceURI;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithVariablePointer_TORW4_1() {
        VariablePointer variablePointer = new VariablePointer(new QName("prefix"));
        NamespacePointer namespacePointer = new NamespacePointer(variablePointer, "prefix");
        QName name = namespacePointer.getName();
        assertNotNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithVariablePointer_TORW4_2() {
        VariablePointer variablePointer = new VariablePointer(new QName("prefix"));
        NamespacePointer namespacePointer = new NamespacePointer(variablePointer, "prefix");
        QName name = namespacePointer.getName();
        assertEquals("prefix", name.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithVariablePointerAndKeywordVariables_EGVC5_1() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(variables, new QName("prefix"));
        NamespacePointer namespacePointer = new NamespacePointer(variablePointer, "prefix");
        QName name = namespacePointer.getName();
        assertNotNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithVariablePointerAndKeywordVariables_EGVC5_2() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(variables, new QName("prefix"));
        NamespacePointer namespacePointer = new NamespacePointer(variablePointer, "prefix");
        QName name = namespacePointer.getName();
        assertEquals("prefix", name.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithNullParent_SCGa8() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        QName name = namespacePointer.getName();
        assertNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithoutParent_IwGY2() {
        NamespacePointer namespace = new NamespacePointer(null, "prefix");
        String expected = "namespace::prefix";
        String actual = namespace.asPath();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeWithNullNodeTest_WkCu0_CWoI0() {
        NamespacePointer namespacePointer = new NamespacePointer(new DOMNodePointer(null, Locale.ENGLISH, "id"), "prefix");
        assertTrue(namespacePointer.testNode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeWithNullNodeTestAndNullLocale_GZVg4_OJlC0() {
        NamespacePointer namespacePointer = new NamespacePointer(new DOMNodePointer(null, null, "id"), "prefix");
        assertTrue(namespacePointer.testNode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithVariablePointer_zzjj5_gDEC0() {
        VariablePointer variablePointer = new VariablePointer(new QName("prefix", "localName"));
        NamespacePointer namespacePointer = new NamespacePointer(variablePointer, "prefix:localName");
        assertFalse(namespacePointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithVariablePointer_TORW4() {
        VariablePointer variablePointer = new VariablePointer(new QName("prefix"));
        NamespacePointer namespacePointer = new NamespacePointer(variablePointer, "prefix");
        QName name = namespacePointer.getName();
        assertNotNull(name);
        assertEquals("prefix", name.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithVariablePointerAndKeywordVariables_EGVC5() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(variables, new QName("prefix"));
        NamespacePointer namespacePointer = new NamespacePointer(variablePointer, "prefix");
        QName name = namespacePointer.getName();
        assertNotNull(name);
        assertEquals("prefix", name.getPrefix());
    }
}