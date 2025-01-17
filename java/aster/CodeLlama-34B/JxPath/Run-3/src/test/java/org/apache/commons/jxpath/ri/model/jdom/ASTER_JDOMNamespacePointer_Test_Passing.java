/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNamespacePointer_Test_Passing {
    private String prefix;
    @InjectMocks
    private JDOMNamespacePointer jdomnamespacepointer;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private Locale locale;
    private String namespaceURI;
    @Mock
    private QName name;
    @Mock
    private KeywordVariables variables;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullParent_uvit4() {
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(null, "prefix");
        int actual = jdomNamespacePointer.hashCode();
        int expected = "prefix".hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullParentAndNamespaceURI_kRSV5() {
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(null, "prefix", "namespaceURI");
        int actual = jdomNamespacePointer.hashCode();
        int expected = "prefix".hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullParentAndNullNamespaceURI_axvQ6() {
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(null, "prefix", null);
        int actual = jdomNamespacePointer.hashCode();
        int expected = "prefix".hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullParentAndEmptyPrefix_ihur11() {
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(null, "");
        int actual = jdomNamespacePointer.hashCode();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithoutParentAndPrefix_mCoY2() {
        JDOMNamespacePointer namespace = new JDOMNamespacePointer(null, "prefix");
        String path = namespace.asPath();
        assertEquals("namespace::prefix", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithVariablePointer_vlXI4() {
        VariablePointer variablePointer = new VariablePointer(new QName("prefix"));
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(variablePointer, "prefix");
        int length = jdomNamespacePointer.getLength();
        assertEquals(1, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithPrefixAndNamespaceURI_Eikc6_jzzS0() {
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(new DOMNodePointer(null, null, null), "prefix", "namespaceURI");
        int length = jdomNamespacePointer.getLength();
        assertEquals(1, length);
    }
}