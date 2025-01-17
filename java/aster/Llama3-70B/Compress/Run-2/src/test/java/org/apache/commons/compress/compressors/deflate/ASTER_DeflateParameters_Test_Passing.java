/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.deflate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeflateParameters_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressionLevel_MinLevel_EAYu0() throws Exception {
    DeflateParameters deflateParameters = new DeflateParameters();
    deflateParameters.setCompressionLevel(DeflateParameters.MIN_LEVEL);
    assertEquals(DeflateParameters.MIN_LEVEL, deflateParameters.getCompressionLevel());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressionLevel_MaxLevel_PANP1() throws Exception {
    DeflateParameters deflateParameters = new DeflateParameters();
    deflateParameters.setCompressionLevel(DeflateParameters.MAX_LEVEL);
    assertEquals(DeflateParameters.MAX_LEVEL, deflateParameters.getCompressionLevel());
}
}