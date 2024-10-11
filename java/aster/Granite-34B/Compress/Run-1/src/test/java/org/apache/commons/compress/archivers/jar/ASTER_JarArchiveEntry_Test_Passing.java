/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.jar;
import java.security.cert.Certificate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JarArchiveEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCertificates_XAJT0() {
        JarArchiveEntry jarArchiveEntry = new JarArchiveEntry("name");
        Certificate[] certificates = jarArchiveEntry.getCertificates();
        assertEquals(null, certificates);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMethod1_PNtk0() {
        JarArchiveEntry jarArchiveEntry = new JarArchiveEntry("name");
        assertEquals(null, jarArchiveEntry.getManifestAttributes());
    }
}