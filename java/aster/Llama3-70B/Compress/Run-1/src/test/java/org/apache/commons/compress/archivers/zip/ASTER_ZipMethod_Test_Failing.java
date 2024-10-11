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
public class Aster_ZipMethod_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode_EXPANDING_LEVEL_4_UYfp5_qJiz0() {
    ZipMethod zipMethod = ZipMethod.EXPANDING_LEVEL_4;
    assertEquals(4, zipMethod.getCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCode_PKWARE_IMPLODING_cBZK10_sPVH0() {
    ZipMethod zipMethod = ZipMethod.PKWARE_IMPLODING;
    assertEquals(98, zipMethod.getCode());
}
}