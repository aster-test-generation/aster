/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0016_CertificateIdForCentralDirectory_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRecordCount_VQKC0() throws Exception {
        X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory = new X0016_CertificateIdForCentralDirectory();
        int result = x0016_CertificateIdForCentralDirectory.getRecordCount();
        assertEquals(0, result);
    }
}