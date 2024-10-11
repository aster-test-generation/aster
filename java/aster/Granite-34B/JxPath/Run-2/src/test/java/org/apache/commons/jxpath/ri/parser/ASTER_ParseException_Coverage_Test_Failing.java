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

public class Aster_ParseException_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getMessage_whenSpecialConstructor_thenConstructedMessageReturned_bTwF1() {
        ParseException parseException = new ParseException();
        parseException.specialConstructor = true;
        String expected = "expected";
        parseException.expectedTokenSequences = new int[][]{{1, 2, 3}};
        parseException.tokenImage = new String[]{"a", "b", "c"};
        parseException.eol = "eol";
        parseException.currentToken = new Token();
        parseException.currentToken.next = new Token();
        parseException.currentToken.next.beginLine = 1;
        parseException.currentToken.next.beginColumn = 1;
        parseException.currentToken.next.image = "image";
        String actual = parseException.getMessage();
        assertEquals(expected, actual);
    }
}