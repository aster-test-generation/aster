/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FileNameUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getExtension_EmptyFileName_ReturnsNull_WHIX1() {
    String fileName = "";
    String expected = null;
    String actual = FileNameUtils.getExtension(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getExtension_NoExtension_ReturnsNull_JHqx2() {
    String fileName = "filename";
    String expected = null;
    String actual = FileNameUtils.getExtension(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getExtension_InvalidFileName_ReturnsNull_vPMF5() {
    String fileName = "filename.";
    String expected = null;
    String actual = FileNameUtils.getExtension(fileName);
    assertEquals(expected, actual);
}
}