/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.jar;
import java.security.cert.Certificate;
import java.util.jar.Attributes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JarArchiveEntry_Test_Passing {
JarArchiveEntry jararchiveentry;
Attributes attributes;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCertificates_1() throws Exception{
        jararchiveentry = new JarArchiveEntry("test");
        Certificate[] certificates = jararchiveentry.getCertificates();
        assertNotNull(certificates);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCertificates_2() throws Exception{
        jararchiveentry = new JarArchiveEntry("test");
        Certificate[] certificates = jararchiveentry.getCertificates();
        assertEquals(0, certificates.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCertificates_MxRT0() throws Exception {
    JarArchiveEntry jarArchiveEntry = new JarArchiveEntry("name");
    Certificate[] certificates = jarArchiveEntry.getCertificates();
    assertNull(certificates);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetManifestAttributes_1() throws Exception{
        attributes = mock(Attributes.class);
        jararchiveentry = new JarArchiveEntry("test");
        when(jararchiveentry.getManifestAttributes()).thenReturn(attributes);
        Attributes result = jararchiveentry.getManifestAttributes();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetManifestAttributes_2() throws Exception{
        attributes = mock(Attributes.class);
        jararchiveentry = new JarArchiveEntry("test");
        when(jararchiveentry.getManifestAttributes()).thenReturn(attributes);
        Attributes result = jararchiveentry.getManifestAttributes();
        assertEquals(attributes, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetManifestAttributes_pziR0() throws Exception {
    JarArchiveEntry jarArchiveEntry = new JarArchiveEntry("name");
    Attributes attributes = jarArchiveEntry.getManifestAttributes();
    assertNull(attributes);
}
}