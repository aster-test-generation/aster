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
    public void testDoneCompletesWithoutError_VDmR3() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        stream.Done();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoneSetsBufferToNull_Bmjo0_cqTV0() {
    SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
    stream.Done();
    assertNull(stream.buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoneSetsBuflineToNull_CniY1_zwKq0() {
    SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
    stream.Done();
    assertNull(stream.bufline, "Bufline should be null after calling Done");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoneSetsBufcolumnToNull_BvfG2_NVig0() {
    SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
    stream.Done();
    assertNull(stream.bufcolumn, "Bufcolumn should be null after calling Done");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadCharWithInBufGreaterThanZero_uWWO0_HAYA0() throws java.io.IOException {
    java.io.StringReader reader = new java.io.StringReader("abc");
    SimpleCharStream stream = new SimpleCharStream(reader);
    stream.inBuf = 1; // inBuf > 0
    stream.bufpos = 0;
    stream.buffer = new char[]{'a', 'b', 'c'};
    stream.bufsize = 3;
    char result = stream.readChar();
    assert result == 'b'; // Expected to read 'b' as it moves bufpos to 1
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadCharWithBufposEqualsBufsize_pIUx1_DFxi0() throws java.io.IOException {
    java.io.StringReader reader = new java.io.StringReader("abc");
    SimpleCharStream stream = new SimpleCharStream(reader);
    stream.inBuf = 1;
    stream.bufpos = 2; // bufpos == bufsize - 1
    stream.buffer = new char[]{'a', 'b', 'c'};
    stream.bufsize = 3;
    char result = stream.readChar();
    assert result == 'a'; // Expected to wrap around to 'a' at position 0
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReInitWithNullInputStream_yiNl1_iusU0_fid1() {
    SimpleCharStream scs = new SimpleCharStream(new java.io.StringReader(""));
    try {
        scs.ReInit((java.io.InputStream) null, 1, 1, 4096);
        fail("Expected a NullPointerException to be thrown");
    } catch (NullPointerException e) {
        assertNotNull(e);
    }
}
}