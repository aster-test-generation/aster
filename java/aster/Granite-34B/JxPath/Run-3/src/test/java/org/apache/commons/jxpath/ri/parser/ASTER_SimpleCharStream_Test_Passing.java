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

public class Aster_SimpleCharStream_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testReInitWithReaderAndStartLineAndStartColumn_DeYm0() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        stream.ReInit(new java.io.StringReader(""), 1, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testReInitWithReader_ovsB4() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        stream.ReInit(new java.io.StringReader(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testReInitWithReaderAndStartLineAndStartColumnAndBufferSize_QQoO5() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 0, 0, 0);
        stream.ReInit(new java.io.StringReader(""), 0, 0, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitWithReaderAndStartLineAndStartColumn_esEs0_1() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        stream.ReInit(new java.io.StringReader("test"), 2, 2);
        assertEquals(2, stream.getBeginLine());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitWithReaderAndStartLineAndStartColumn_esEs0_2() throws Exception {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("test"), 1, 1);
        stream.ReInit(new java.io.StringReader("test"), 2, 2);
        assertEquals(2, stream.getBeginColumn());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getColumnTest18_DKbP17() throws Exception {
    }
}