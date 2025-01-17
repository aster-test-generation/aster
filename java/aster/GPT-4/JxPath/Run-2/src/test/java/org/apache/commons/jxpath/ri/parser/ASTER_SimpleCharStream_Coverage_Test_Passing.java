/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SimpleCharStream_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn_bufposGreaterThanOrEqualToTokenBegin_uPlz0_1() {
        java.io.StringReader reader = new java.io.StringReader("abcdef");
        SimpleCharStream stream = new SimpleCharStream(reader, 1, 1, 6);
        stream.bufpos = 5;
        stream.tokenBegin = 3;
        stream.inBuf = 0;
        stream.bufsize = 6;
        stream.bufline = new int[]{1, 1, 1, 1, 1, 1};
        stream.bufcolumn = new int[]{1, 2, 3, 4, 5, 6};
        stream.adjustBeginLineColumn(2, 3);
        assertEquals(2, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn_bufposLessThanTokenBegin_zLXE1_1() {
        java.io.StringReader reader = new java.io.StringReader("abcdef");
        SimpleCharStream stream = new SimpleCharStream(reader, 1, 1, 6);
        stream.bufpos = 1;
        stream.tokenBegin = 4;
        stream.inBuf = 0;
        stream.bufsize = 6;
        stream.bufline = new int[]{1, 1, 1, 1, 1, 1};
        stream.bufcolumn = new int[]{1, 2, 3, 4, 5, 6};
        stream.adjustBeginLineColumn(2, 3);
        assertEquals(2, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn_LineChangeInLoop_RVus3_1() {
        java.io.StringReader reader = new java.io.StringReader("abc\ndef");
        SimpleCharStream stream = new SimpleCharStream(reader, 1, 1, 7);
        stream.bufpos = 3;
        stream.tokenBegin = 0;
        stream.inBuf = 0;
        stream.bufsize = 7;
        stream.bufline = new int[]{1, 1, 1, 2, 2, 2, 2};
        stream.bufcolumn = new int[]{1, 2, 3, 1, 2, 3, 4};
        stream.adjustBeginLineColumn(2, 3);
        assertEquals(3, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn_NewLineIncrement_zyck4_1() {
        java.io.StringReader reader = new java.io.StringReader("abc\ndef");
        SimpleCharStream stream = new SimpleCharStream(reader, 1, 1, 7);
        stream.bufpos = 6;
        stream.tokenBegin = 3;
        stream.inBuf = 0;
        stream.bufsize = 7;
        stream.bufline = new int[]{1, 1, 1, 2, 2, 2, 2};
        stream.bufcolumn = new int[]{1, 2, 3, 1, 2, 3, 4};
        stream.adjustBeginLineColumn(2, 3);
        assertEquals(3, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadCharWithBufPosEqualsBufSize_uXfR1_Mcii0() throws Exception {
    java.io.StringReader reader = new java.io.StringReader("abc");
    SimpleCharStream stream = new SimpleCharStream(reader);
    stream.inBuf = 1;
    stream.buffer = new char[]{'a', 'b', 'c'};
    stream.bufpos = 2; // Set bufpos to last index
    stream.bufsize = 3; // bufsize equals buffer length
    char result = stream.readChar();
    assertEquals('a', result); // Expect wrap-around to start of buffer
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn_bufposGreaterThanOrEqualToTokenBegin_uPlz0_2_fid1() {
        java.io.StringReader reader = new java.io.StringReader("abcdef");
        SimpleCharStream stream = new SimpleCharStream(reader, 1, 1, 6);
        stream.bufpos = 5;
        stream.tokenBegin = 3;
        stream.inBuf = 0;
        stream.bufsize = 6;
        stream.bufline = new int[]{1, 1, 1, 1, 1, 1};
        stream.bufcolumn = new int[]{1, 2, 3, 4, 5, 6};
        stream.adjustBeginLineColumn(2, 3);
        assertEquals(5, stream.column);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdjustBeginLineColumn_WhileLoopCondition_Mtgq2_2_fid1() {
        java.io.StringReader reader = new java.io.StringReader("abcdef");
        SimpleCharStream stream = new SimpleCharStream(reader, 1, 1, 6);
        stream.bufpos = 5;
        stream.tokenBegin = 0;
        stream.inBuf = 0;
        stream.bufsize = 6;
        stream.bufline = new int[]{1, 1, 1, 1, 1, 1};
        stream.bufcolumn = new int[]{1, 2, 3, 4, 5, 6};
        stream.adjustBeginLineColumn(2, 3);
        assertEquals(3, stream.column);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReInitWithNullStream_bttO1_JAqs0_fid1() {
    try {
        SimpleCharStream stream = new SimpleCharStream((java.io.InputStream) null);
        stream.ReInit((java.io.Reader) null);
        fail("Expected an exception to be thrown");
    } catch (NullPointerException e) {
        assertNotNull(e);
    }
}
}