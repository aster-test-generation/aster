/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ScatterStatistics_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithCompressionElapsed_eOlp1() {
        ScatterStatistics scatterStatistics = new ScatterStatistics(100, 0);
        String actualResult = scatterStatistics.toString();
        String expectedResult = "compressionElapsed=100ms, mergingElapsed=0ms";
        assertEquals(expectedResult, actualResult);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithMergingElapsed_VrlX2() {
        ScatterStatistics scatterStatistics = new ScatterStatistics(0, 100);
        String actualResult = scatterStatistics.toString();
        String expectedResult = "compressionElapsed=0ms, mergingElapsed=100ms";
        assertEquals(expectedResult, actualResult);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithBothElapsed_ioHl3() {
        ScatterStatistics scatterStatistics = new ScatterStatistics(100, 100);
        String actualResult = scatterStatistics.toString();
        String expectedResult = "compressionElapsed=100ms, mergingElapsed=100ms";
        assertEquals(expectedResult, actualResult);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNegativeElapsed_QiJc4() {
        ScatterStatistics scatterStatistics = new ScatterStatistics(-100, -100);
        String actualResult = scatterStatistics.toString();
        String expectedResult = "compressionElapsed=-100ms, mergingElapsed=-100ms";
        assertEquals(expectedResult, actualResult);
    }
}