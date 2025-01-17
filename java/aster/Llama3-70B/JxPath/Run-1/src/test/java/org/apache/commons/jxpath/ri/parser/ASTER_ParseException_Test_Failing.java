/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ParseException_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes4_oUqF3_fid1() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("Hello\u0000World");
        assert result.equals("Hello\\u0000World");
    }
}