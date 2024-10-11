/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SnappyCompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateParameterBuilder_KxCi0_1_fid1() {
    Parameters.Builder builder = SnappyCompressorOutputStream.createParameterBuilder(1024);
    Parameters params = builder.build();
    assertEquals(3, params.getMinBackReferenceLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateParameterBuilder_KxCi0_2() {
    Parameters.Builder builder = SnappyCompressorOutputStream.createParameterBuilder(1024);
    Parameters params = builder.build();
    assertEquals(65535, params.getMaxBackReferenceLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateParameterBuilder_KxCi0_3() {
    Parameters.Builder builder = SnappyCompressorOutputStream.createParameterBuilder(1024);
    Parameters params = builder.build();
    assertEquals(1024, params.getMaxOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateParameterBuilder_KxCi0() {
    Parameters.Builder builder = SnappyCompressorOutputStream.createParameterBuilder(1024);
    Parameters params = builder.build();
    assertEquals(3, params.getMinBackReferenceLength());
    assertEquals(65535, params.getMaxBackReferenceLength());
    assertEquals(1024, params.getMaxOffset());
    assertEquals(1024, params.getMaxLiteralLength());
}
}