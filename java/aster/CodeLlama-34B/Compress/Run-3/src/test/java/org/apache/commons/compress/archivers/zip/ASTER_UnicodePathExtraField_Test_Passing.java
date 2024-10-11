/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnicodePathExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithDifferentValue_iKZs1() {
    UnicodePathExtraField unicodePathExtraField = new UnicodePathExtraField("test", new byte[0], 0, 0);
    ZipShort zipShort = unicodePathExtraField.getHeaderId();
    assertNotEquals(1234, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNullValue_rMhZ2() {
    UnicodePathExtraField unicodePathExtraField = new UnicodePathExtraField("test", new byte[0], 0, 0);
    ZipShort zipShort = unicodePathExtraField.getHeaderId();
    assertNull(zipShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithEmptyValue_TTzx3() {
    UnicodePathExtraField unicodePathExtraField = new UnicodePathExtraField("test", new byte[0], 0, 0);
    ZipShort zipShort = unicodePathExtraField.getHeaderId();
    assertEquals(0, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNonZeroOffset_rsda4() {
    UnicodePathExtraField unicodePathExtraField = new UnicodePathExtraField("test", new byte[0], 1, 0);
    ZipShort zipShort = unicodePathExtraField.getHeaderId();
    assertEquals(1, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNonZeroLength_kKBM5() {
    UnicodePathExtraField unicodePathExtraField = new UnicodePathExtraField("test", new byte[0], 0, 1);
    ZipShort zipShort = unicodePathExtraField.getHeaderId();
    assertEquals(1, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNonZeroOffsetAndLength_ocZo6() {
    UnicodePathExtraField unicodePathExtraField = new UnicodePathExtraField("test", new byte[0], 1, 1);
    ZipShort zipShort = unicodePathExtraField.getHeaderId();
    assertEquals(2, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNonZeroOffsetAndLengthAndDifferentValue_ttbV7() {
    UnicodePathExtraField unicodePathExtraField = new UnicodePathExtraField("test", new byte[0], 1, 1);
    ZipShort zipShort = unicodePathExtraField.getHeaderId();
    assertNotEquals(1234, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNonZeroOffsetAndLengthAndNullValue_uLQe8() {
    UnicodePathExtraField unicodePathExtraField = new UnicodePathExtraField("test", new byte[0], 1, 1);
    ZipShort zipShort = unicodePathExtraField.getHeaderId();
    assertNull(zipShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNonZeroOffsetAndLengthAndEmptyValue_dsXL9() {
    UnicodePathExtraField unicodePathExtraField = new UnicodePathExtraField("test", new byte[0], 1, 1);
    ZipShort zipShort = unicodePathExtraField.getHeaderId();
    assertEquals(0, zipShort.getValue());
}
}