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
public class Aster_X0016_CertificateIdForCentralDirectory_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getRecordCount_yACU0() throws Exception {
        X0016_CertificateIdForCentralDirectory x0016 = new X0016_CertificateIdForCentralDirectory();
        int result = x0016.getRecordCount();
        assertEquals(0, result);
    }
}