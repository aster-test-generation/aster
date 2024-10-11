/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicPropertyPointer_Test_Failing {
    private DynamicPropertyHandler handler;
    DynamicPropertyPointer dynamicpropertypointer;
    private String[] names;
    private String name;
    private JXPathContext context;
    private Object value;
    private NodePointer nodePointer;
    private Object baseValue;
    private int index;
    private String propertyName;
    private Object bean;
    private String requiredPropertyName;
    @Mock
    DOMNodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBaseValueWithKeywordVariablesTest_Arej1() {
        PageContextHandler handler = new PageContextHandler();
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer parent = new VariablePointer(variables, new QName("name"));
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
        Object result = dynamicPropertyPointer.getBaseValue();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithKeywordVariables_KYyD3_xGYC0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(variablePointer, new PageContextHandler());
        String result = dynamicPropertyPointer.asPath();
        assert result != null;
    }
}