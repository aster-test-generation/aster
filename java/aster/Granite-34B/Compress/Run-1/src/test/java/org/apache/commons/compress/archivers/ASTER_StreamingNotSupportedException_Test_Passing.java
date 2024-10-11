/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_StreamingNotSupportedException_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFormatTest_QnYr0() {
        StreamingNotSupportedException streamingNotSupportedException = new StreamingNotSupportedException("mp4");
        String format = streamingNotSupportedException.getFormat();
        assertEquals("mp4", format);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFormatTest2_Sosh1() {
        StreamingNotSupportedException streamingNotSupportedException = new StreamingNotSupportedException("mov");
        String format = streamingNotSupportedException.getFormat();
        assertEquals("mov", format);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFormatTest3_Enyg2() {
        StreamingNotSupportedException streamingNotSupportedException = new StreamingNotSupportedException("avi");
        String format = streamingNotSupportedException.getFormat();
        assertEquals("avi", format);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFormatTest4_Gmoc3() {
        StreamingNotSupportedException streamingNotSupportedException = new StreamingNotSupportedException("mkv");
        String format = streamingNotSupportedException.getFormat();
        assertEquals("mkv", format);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFormatTest5_HEgf4() {
        StreamingNotSupportedException streamingNotSupportedException = new StreamingNotSupportedException("flv");
        String format = streamingNotSupportedException.getFormat();
        assertEquals("flv", format);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFormatTest6_tgzN5() {
        StreamingNotSupportedException streamingNotSupportedException = new StreamingNotSupportedException("mp3");
        String format = streamingNotSupportedException.getFormat();
        assertEquals("mp3", format);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFormatTest7_LEdT6() {
        StreamingNotSupportedException streamingNotSupportedException = new StreamingNotSupportedException("wav");
        String format = streamingNotSupportedException.getFormat();
        assertEquals("wav", format);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFormatTest8_GdSz7() {
        StreamingNotSupportedException streamingNotSupportedException = new StreamingNotSupportedException("aac");
        String format = streamingNotSupportedException.getFormat();
        assertEquals("aac", format);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFormatTest9_Bjky8() {
        StreamingNotSupportedException streamingNotSupportedException = new StreamingNotSupportedException("ogg");
        String format = streamingNotSupportedException.getFormat();
        assertEquals("ogg", format);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFormatTest10_Ojld9() {
        StreamingNotSupportedException streamingNotSupportedException = new StreamingNotSupportedException("pdf");
        String format = streamingNotSupportedException.getFormat();
        assertEquals("pdf", format);
    }
}