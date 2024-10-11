/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TokenMgrError_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes0_CKSP0() {
        assertEquals("\\b", TokenMgrError.addEscapes("\b"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes1_YUVl1() {
        assertEquals("\\t", TokenMgrError.addEscapes("\t"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes2_tjxR2() {
        assertEquals("\\n", TokenMgrError.addEscapes("\n"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes3_tGsX3() {
        assertEquals("\\f", TokenMgrError.addEscapes("\f"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes4_tCZf4() {
        assertEquals("\\r", TokenMgrError.addEscapes("\r"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes5_VVWA5() {
        assertEquals("\\\"", TokenMgrError.addEscapes("\""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes6_PqWI6() {
        assertEquals("\\'", TokenMgrError.addEscapes("'"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes7_tddn7() {
        assertEquals("\\\\", TokenMgrError.addEscapes("\\"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddEscapes13_ChUW13_lKBz0() {
    assertEquals("\\u0005", String.valueOf((char) 5));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddEscapes17_wgDv17_noTF1() {
    assertEquals("\\u0009", new String(new char[] {(char) 9}));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddEscapes20_uAdV20_kTuH1() {
    assertEquals("\\u000c", String.valueOf((char) 12));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddEscapes21_paea21_XbDa1() {
    assertEquals("\\u000d", TokenMgrError.addEscapes(String.valueOf((char) 13)));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddEscapes23_qkLi23_vwJq1() {
    assertEquals("\\u000f", String.valueOf((char) 15));
}
}