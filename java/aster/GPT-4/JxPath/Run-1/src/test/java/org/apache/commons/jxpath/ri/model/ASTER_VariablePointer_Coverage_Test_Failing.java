/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_VariablePointer_Coverage_Test_Failing {
    private NodePointer clonedNodePointer;
    private VariablePointer variablePointer;
    private QName qName;
@BeforeEach
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValueWithDefinedVariable_nEvd2_fsDS0() {
        QName qName = new QName("prefix", "localName");
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(keywordVariables, qName);
        assertNotNull(variablePointer.getBaseValue()); // This should not throw an exception
    }
}