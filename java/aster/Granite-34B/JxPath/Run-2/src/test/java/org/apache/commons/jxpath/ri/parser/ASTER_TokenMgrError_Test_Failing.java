/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TokenMgrError_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testLexicalErrorEOFSeen_arPz0() {
        String result = TokenMgrError.LexicalError(true, 0, 10, 20, "errorAfter", 'a');
        String expected = "Lexical error at line 10, column 20.  Encountered: \"<EOF>\" (65535), after : \"errorAfter\"";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }
}