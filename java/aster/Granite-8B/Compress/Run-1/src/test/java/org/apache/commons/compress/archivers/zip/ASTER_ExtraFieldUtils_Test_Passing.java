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
public class Aster_ExtraFieldUtils_Test_Passing {
int start = 0;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateExtraFieldWithValidHeaderId_TYbz1_1() {
        ZipShort headerId = new ZipShort(1234);
        ZipExtraField result = ExtraFieldUtils.createExtraField(headerId);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateExtraFieldWithValidHeaderId_TYbz1_3() {
        ZipShort headerId = new ZipShort(1234);
        ZipExtraField result = ExtraFieldUtils.createExtraField(headerId);
        assertEquals(headerId, result.getHeaderId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateExtraFieldWithValidHeaderId_TYbz1_2_fid2() {
        ZipShort headerId = new ZipShort(1234);
        ZipExtraField result = ExtraFieldUtils.createExtraField(headerId);
        assertTrue(result instanceof UnrecognizedExtraField);}
}