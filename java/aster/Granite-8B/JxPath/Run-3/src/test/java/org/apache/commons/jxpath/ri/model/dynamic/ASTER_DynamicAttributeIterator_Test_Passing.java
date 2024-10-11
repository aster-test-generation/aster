/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicAttributeIterator_Test_Passing {
    @Mock
    private BeanPointer beanPointer;
    @Mock
    private KeywordVariables keywordVariables;
    @Mock
    private JXPathBasicBeanInfo jXPathBasicBeanInfo;
    @Mock
    private Locale locale;
    @Mock
    private QName qName;
    @Mock
    private VariablePointer variablePointer;
    private DynamicAttributeIterator dynamicAttributeIterator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrepareForIndividualProperty_qazC0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        Locale locale = new Locale("");
        QName qName = new QName("");
        VariablePointer variablePointer = new VariablePointer(qName);
        KeywordVariables keywordVariables = new KeywordVariables("", null);
        JXPathBasicBeanInfo jXPathBasicBeanInfo = new JXPathBasicBeanInfo(null, false);
        JXPathBasicBeanInfo jXPathBasicBeanInfo1 = new JXPathBasicBeanInfo(null);
        JXPathBasicBeanInfo jXPathBasicBeanInfo2 = new JXPathBasicBeanInfo(null, null);
        DynamicAttributeIterator dynamicAttributeIterator = new DynamicAttributeIterator(null, qName);
        dynamicAttributeIterator.prepareForIndividualProperty("");
    }
}