/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0015_CertificateIdForFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRecordCount_KSqk0() throws Exception {
        X0015_CertificateIdForFile x0015_CertificateIdForFile = new X0015_CertificateIdForFile();
        int result = x0015_CertificateIdForFile.getRecordCount();
        assertEquals(0, result);
    }
}