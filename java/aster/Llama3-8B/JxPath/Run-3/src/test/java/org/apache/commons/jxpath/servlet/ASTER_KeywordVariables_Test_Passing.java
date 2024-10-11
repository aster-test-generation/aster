/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_KeywordVariables_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariableTrue_dBxE0() throws Exception {
        KeywordVariables keywordVariables = new KeywordVariables("variable", null);
        boolean result = keywordVariables.isDeclaredVariable("variable");
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariableFalse_UsCV1() throws Exception {
        KeywordVariables keywordVariables = new KeywordVariables("variable", null);
        boolean result = keywordVariables.isDeclaredVariable("otherVariable");
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableDeclaredVariable_LvYo0() throws Exception {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", "object");
        Object result = keywordVariables.getVariable("variable");
        assertEquals("object", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableUndeclaredVariable_KjGZ1() throws Exception {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", "object");
        Object result = keywordVariables.getVariable("undeclaredVariable");
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUndeclareVariable_Tugf0() throws Exception {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", "object");
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> keywordVariables.undeclareVariable("variable"));
        assert exception.getMessage().equals("Cannot undeclare keyword variables.");
    }
}