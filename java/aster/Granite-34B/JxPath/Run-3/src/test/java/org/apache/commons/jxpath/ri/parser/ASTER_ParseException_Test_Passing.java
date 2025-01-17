/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ParseException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMessageWithNoCurrentToken_imLq2() throws Exception {
        int[][] expectedTokenSequences = {{1, 2, 3}, {4, 5, 6}};
        String[] tokenImage = {"token1", "token2", "token3", "token4", "token5", "token6"};
        ParseException exception = new ParseException(null, expectedTokenSequences, tokenImage);
        String message = exception.getMessage();
        String expectedMessage = "Encountered \"<EOF>\" at line 1, column 1.\n" +
            "Was expecting one of:\n" +
            "    token1 token2 token3 ...\n" +
            "    token4 token5 token6 ...";
        assertEquals(expectedMessage, message);
    }
}