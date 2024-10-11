/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExtraFieldUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateExtraFieldNoDefaultNull_Affc0() {
        ZipShort headerId = null;
        ZipExtraField result = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateExtraFieldNoDefaultNotNull_PDcq1() {
        ZipShort headerId = new ZipShort(1);
        ZipExtraField result = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testRegisterWithNull_SPos1() {
        assertThrows(IllegalArgumentException.class, () -> ExtraFieldUtils.register(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testRegisterWithNonSubclass_NjHA2() {
        assertThrows(IllegalArgumentException.class, () -> ExtraFieldUtils.register(Integer.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMergeCentralDirectoryDataWithNoExtraFields_lNGg0_1() {
        ZipExtraField[] data = new ZipExtraField[0];
        byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(data);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMergeCentralDirectoryDataWithNoExtraFields_lNGg0_2() {
        ZipExtraField[] data = new ZipExtraField[0];
        byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(data);
        assertTrue(result.length == 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateExtraFieldWithValidHeaderId_mitW0() {
        ZipShort headerId = new ZipShort(1);
        ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
        assertNotNull(field);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateExtraFieldWithInvalidHeaderId_TxSU1() {
        ZipShort headerId = new ZipShort(65535);
        ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
        assertNotNull(field);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParse_mgDl0_qVOw0() {
    byte[] data = new byte[10]; // Replace with actual data
    ZipExtraField[] result = null;
    try {
        result = ExtraFieldUtils.parse(data);
    } catch (ZipException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMergeCentralDirectoryDataWithNoExtraFields_lNGg0() {
        ZipExtraField[] data = new ZipExtraField[0];
        byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(data);
        assertNotNull(result);
        assertTrue(result.length == 0);
}
}