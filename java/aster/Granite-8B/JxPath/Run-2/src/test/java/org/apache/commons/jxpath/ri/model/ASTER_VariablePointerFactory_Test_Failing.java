/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.servlet.KeywordVariables;
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
public class Aster_VariablePointerFactory_Test_Failing {
    private VariablePointerFactory variablePointerFactory;
    private KeywordVariables keywordVariables;
    private VariablePointer variablePointer;
    private NodePointer parent;
    private NodePointer nodePointer;
    @Mock
    private JXPathContext context;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_MXAR0() {
        VariablePointerFactory factory = new VariablePointerFactory();
        int order = factory.getOrder();
        assertEquals(1, order);
    }
}