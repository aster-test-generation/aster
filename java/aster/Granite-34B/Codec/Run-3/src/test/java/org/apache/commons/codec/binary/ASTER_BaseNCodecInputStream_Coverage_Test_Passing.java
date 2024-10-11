/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BaseNCodecInputStream_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset_wtaw0() throws IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    baseNCodecInputStream.reset();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailable1_EDnp0() throws IOException {
	BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
	int actual = baseNCodecInputStream.available();
	int expected = 0;
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailable2_YuwN1() throws IOException {
	BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
	int actual = baseNCodecInputStream.available();
	int expected = 1;
	assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_IhaB0() throws IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
    int r = baseNCodecInputStream.read();
    assertEquals(0, r);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead1_VbXd1() throws IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
    int r = baseNCodecInputStream.read(new byte[0], 0, 0);
    assertEquals(0, r);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead2_CrTw2() throws IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
    byte[] bytes = new byte[1];
    int r = baseNCodecInputStream.read(bytes, 0, 0);
    assertEquals(0, r);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead3_MlVf3() throws IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
    byte[] bytes = new byte[1];
    int r = baseNCodecInputStream.read(bytes, 0, 1);
    assertEquals(1, r);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead5_SOuI5() throws IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
    byte[] bytes = new byte[1];
    int r = baseNCodecInputStream.read(bytes, 1, 1);
    assertEquals(1, r);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead8_OjFu8() throws IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, false);
    byte[] bytes = new byte[1];
    int r = baseNCodecInputStream.read(bytes, 1, 0);
    assertEquals(0, r);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithNegativeLength_tzlE0() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(-1L);
    assertEquals(0, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithZeroLength_DCuV1() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(0L);
    assertEquals(0, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength_fjWj2() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(1L);
    assertEquals(1, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength2_NYMt3() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(100L);
    assertEquals(100, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength3_RJhS4() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(1000L);
    assertEquals(1000, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength4_RrJl5() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(10000L);
    assertEquals(10000, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength5_DcpA6() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(100000L);
    assertEquals(100000, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength6_kDSG7() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(1000000L);
    assertEquals(1000000, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength7_VAss8() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(10000000L);
    assertEquals(10000000, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength8_vFPa9() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(100000000L);
    assertEquals(100000000, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength9_gLBH10() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(1000000000L);
    assertEquals(1000000000, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength10_cqOT11() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(10000000000L);
    assertEquals(10000000000L, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength11_EmUe12() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(100000000000L);
    assertEquals(100000000000L, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLength12_Shuj13() throws java.io.IOException {
    BaseNCodecInputStream baseNCodecInputStream = new BaseNCodecInputStream(null, null, true);
    long actual = baseNCodecInputStream.skip(1000000000000L);
    assertEquals(1000000000000L, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMark_FMnB0() {
    BaseNCodecInputStream stream = new BaseNCodecInputStream(null, null, false);
    stream.mark(0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkWithReadLimit_qLIm1() {
    BaseNCodecInputStream stream = new BaseNCodecInputStream(null, null, false);
    stream.mark(100);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkAfterMark_LNht2() {
    BaseNCodecInputStream stream = new BaseNCodecInputStream(null, null, false);
    stream.mark(0);
    stream.mark(0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkAfterReset_Rsqu3_bFuA0() throws IOException {
    BaseNCodecInputStream stream = new BaseNCodecInputStream(null, null, false);
    stream.mark(0);
    stream.reset();
    stream.mark(0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkAfterMarkAndReset_uAFF5_iLTJ0() throws IOException {
    BaseNCodecInputStream stream = new BaseNCodecInputStream(null, null, false);
    stream.mark(0);
    stream.mark(0);
    stream.reset();
    stream.mark(0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkAfterMarkAndClose_pCfa6_DCyx0() throws IOException {
    BaseNCodecInputStream stream = new BaseNCodecInputStream(null, null, false);
    stream.mark(0);
    stream.mark(0);
    stream.close();
    stream.mark(0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkAfterMarkResetMarkResetAndClose_tXAF10_uRhV0() throws IOException {
    BaseNCodecInputStream stream = new BaseNCodecInputStream(null, null, false);
    stream.mark(0);
    stream.mark(0);
    stream.reset();
    stream.mark(0);
    stream.reset();
    stream.close();
    stream.mark(0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkAfterMarkResetMarkResetMarkResetAndClose_qRtm12_JbdD0() throws IOException {
    BaseNCodecInputStream stream = new BaseNCodecInputStream(null, null, false);
    stream.mark(0);
    stream.mark(0);
    stream.reset();
    stream.mark(0);
    stream.reset();
    stream.mark(0);
    stream.reset();
    stream.close();
    stream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkAfterMarkResetMarkResetMarkAndClose_khid11_WvYX0() throws IOException {
    BaseNCodecInputStream stream = new BaseNCodecInputStream(null, null, false);
    stream.mark(0);
    stream.mark(0);
    stream.reset();
    stream.mark(0);
    stream.reset();
    stream.mark(0);
    stream.close();
    try {
        stream.reset();
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkAfterMarkResetMarkResetMarkResetMarkAndClose_Jqov13_HtKS0() throws IOException {
    BaseNCodecInputStream stream = new BaseNCodecInputStream(null, null, false);
    stream.mark(0);
    stream.mark(0);
    stream.reset();
    stream.mark(0);
    stream.reset();
    stream.mark(0);
    stream.reset();
    stream.mark(0);
    stream.close();
    try {
        stream.reset();
    } catch (IOException e) {
    }
}
}