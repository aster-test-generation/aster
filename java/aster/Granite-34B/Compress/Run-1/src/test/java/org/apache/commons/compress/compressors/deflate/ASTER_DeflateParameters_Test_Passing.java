/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.deflate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeflateParameters_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testWithZlibHeader_Oaqg0() {
        DeflateParameters deflateParameters = new DeflateParameters();
        deflateParameters.withZlibHeader();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressionLevel_ValidLevel_FNeN0() {
        DeflateParameters deflateParameters = new DeflateParameters();
        int compressionLevel = 5;
        deflateParameters.setCompressionLevel(compressionLevel);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressionLevel_MinLevel_NuEn1() {
        DeflateParameters deflateParameters = new DeflateParameters();
        int compressionLevel = 0;
        deflateParameters.setCompressionLevel(compressionLevel);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressionLevel_MaxLevel_Boen2() {
        DeflateParameters deflateParameters = new DeflateParameters();
        int compressionLevel = 9;
        deflateParameters.setCompressionLevel(compressionLevel);
    }
}