/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ParseException_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_ElementLastElementNotZero_FuVC2() {
        ParseException parseException = new ParseException(new Token(), new int[][]{{1, 2}, {3, 4}}, new String[]{"a", "b", "c", "d"});
        String message = parseException.getMessage();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMessage_ExpectedTokenSequencesLengthOne_mTMA8() {
        ParseException parseException = new ParseException(new Token(), new int[][]{{1, 2}}, new String[]{"a", "b", "c", "d"});
        String message = parseException.getMessage();
    }
}