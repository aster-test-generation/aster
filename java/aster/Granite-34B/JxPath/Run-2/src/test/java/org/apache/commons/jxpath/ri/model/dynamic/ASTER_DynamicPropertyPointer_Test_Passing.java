/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.PageContextHandler;
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
public class Aster_DynamicPropertyPointer_Test_Passing {
    private DynamicPropertyHandler handler;
    DynamicPropertyPointer dynamicpropertypointer;
    private String[] names;
    private String name;
    private String requiredPropertyName;
    @Mock
    private Object bean;
    @Mock
    private PageContextHandler pageContextHandler;
    @Mock
    private DOMNodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_VBPY3() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        PageContextHandler pageContextHandler = new PageContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(variablePointer, pageContextHandler);
        boolean result = dynamicPropertyPointer.isContainer();
        assert result == true;
    }
}