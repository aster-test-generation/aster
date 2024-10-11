/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNamespaceIterator_Test_Passing {
    private int position = 0;
    DOMNamespaceIterator domnamespaceiterator;
    Node node;
    NodePointer nodepointer;
    private List attributes;
    private NodePointer parent;
    private Attr attr;
    private List list;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointer_bknN0() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        assertNotNull(variablePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointer2_jOnc1() {
        VariablePointer variablePointer = new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name"));
        assertNotNull(variablePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeywordVariables_bhKF2() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        assertNotNull(keywordVariables);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName_iHrQ6() {
        QName qName = new QName("qualifiedName");
        assertNotNull(qName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName2_GDWF7() {
        QName qName = new QName("prefix", "localName");
        assertNotNull(qName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_yZZG13_iCLV0() {
        NodePointer nodePointer = new DOMNodePointer(null, null, null);
        int length = nodePointer.getLength();
        assertTrue(length >= 0);
    }
}