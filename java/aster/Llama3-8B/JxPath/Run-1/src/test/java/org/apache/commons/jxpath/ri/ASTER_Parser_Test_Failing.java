/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Parser_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseExpressionInvalidSymbol_JKiY1_gBCf0() {
        String expression = "expression invalid symbol";
        try {
            Parser.parseExpression(expression, null);
            fail("Expected JXPathInvalidSyntaxException");
        } catch (JXPathInvalidSyntaxException e) {
            assertEquals("Invalid XPath: 'expression invalid symbol'. Invalid symbol ' ' at the beginning of the expression", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseExpressionSyntaxError_Ynwa2_DlZS0() {
        String expression = "expression syntax error";
        try {
            Parser.parseExpression(expression, null);
            fail("Expected JXPathInvalidSyntaxException");
        } catch (JXPathInvalidSyntaxException e) {
            assertEquals("Invalid XPath: 'expression syntax error'. Syntax error ", e.getMessage());
        }
    }
}