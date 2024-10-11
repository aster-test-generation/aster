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
public class Aster_ZipMethod_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodByCode_FIvp0_1() {
        assertEquals(ZipMethod.STORED, ZipMethod.getMethodByCode(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodByCode_FIvp0_2() {
        assertEquals(ZipMethod.DEFLATED, ZipMethod.getMethodByCode(8));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodByCode_FIvp0_3() {
        assertEquals(ZipMethod.BZIP2, ZipMethod.getMethodByCode(12));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodByCode_FIvp0_4() {
        assertEquals(ZipMethod.JPEG, ZipMethod.getMethodByCode(96));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodByCode_FIvp0_6() {
        assertEquals(ZipMethod.WAVPACK, ZipMethod.getMethodByCode(97));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodByCode_FIvp0_7() {
        assertEquals(ZipMethod.PPMD, ZipMethod.getMethodByCode(98));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethodByCode_FIvp0_8() {
        assertEquals(ZipMethod.AES_ENCRYPTED, ZipMethod.getMethodByCode(99));}
}