/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocalFileHeader_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentLocalFileHeader_vcrW3() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    LocalFileHeader otherLocalFileHeader = new LocalFileHeader();
    boolean result = localFileHeader.equals(otherLocalFileHeader);
    assert !result;
}
}