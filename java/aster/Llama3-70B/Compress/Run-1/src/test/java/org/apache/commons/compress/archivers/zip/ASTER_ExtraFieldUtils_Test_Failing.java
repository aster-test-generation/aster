/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExtraFieldUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_withoutImplementation_ZVyN1_fid1() {
    ZipShort headerId = new ZipShort((short) 1);
    ZipExtraField result = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_NullElement_CRHz7() {
    ZipExtraField[] dataArray = new ZipExtraField[] {null};
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(dataArray);
    assertArrayEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_NullArray_LIIY8() {
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(null);
    assertArrayEquals(new byte[0], result);
}
}