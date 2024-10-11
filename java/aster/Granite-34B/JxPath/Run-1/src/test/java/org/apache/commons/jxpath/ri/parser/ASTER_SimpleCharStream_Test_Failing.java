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

public class Aster_SimpleCharStream_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getBeginLine_withReader_shouldReturnCorrectValue_Qela0() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        assertEquals(1, stream.getBeginLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getBeginLine_withReaderAndStartLine_shouldReturnCorrectValue_Zrrg2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 2, 1);
        assertEquals(2, stream.getBeginLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWithWrapAroundTrue_wvde0_ILGJ0_1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        stream.ExpandBuff(true);
        assertEquals(2048, stream.bufsize);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWithWrapAroundTrue_wvde0_ILGJ0_2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        stream.ExpandBuff(true);
        assertEquals(2048, stream.available);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWithWrapAroundTrue_wvde0_ILGJ0_3() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        stream.ExpandBuff(true);
        assertEquals(0, stream.tokenBegin);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWithWrapAroundFalse_XNvk1_ajEP0_1() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        stream.ExpandBuff(false);
        assertEquals(2048, stream.bufsize);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpandBuffWithWrapAroundFalse_XNvk1_ajEP0_2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        stream.ExpandBuff(false);
        assertEquals(2048, stream.available);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getBeginLine_withReaderAndStartLine_shouldReturnCorrectValue_Zrrg2_fid2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 0, 1);
        assertEquals(2, stream.getBeginLine());
    }
}