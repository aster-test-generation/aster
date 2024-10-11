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
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicPropertyPointer_Test_Passing {
    @Mock
    private DynamicPropertyHandler handler;
    @Mock
    private ValueUtils valueUtils;
    @Mock
    private PageContextHandler pageContextHandler;
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private VariablePointer variablePointer;
    @Mock
    private QName qName;
    private DynamicPropertyPointer dynamicPropertyPointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActualProperty() {
        dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        // Arrange
        boolean expected = true;
        // Act
        boolean actual = dynamicPropertyPointer.isActualProperty();
        // Assert
        assertEquals(expected, actual);
    }
}