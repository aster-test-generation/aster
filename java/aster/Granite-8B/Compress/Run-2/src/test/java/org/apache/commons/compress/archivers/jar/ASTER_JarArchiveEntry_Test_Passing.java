/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.jar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.security.cert.Certificate;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.zip.ZipEntry;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JarArchiveEntry_Test_Passing {
@Mock
    private Certificate mockCertificate;
private JarArchiveEntry jarArchiveEntry;
@Mock
	Attributes attributes;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCertificates_Hyxn0() throws Exception {
        JarArchiveEntry jarArchiveEntry = new JarArchiveEntry("name");
        Certificate[] certificates = jarArchiveEntry.getCertificates();
        assertNotNull(certificates);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetManifestAttributes() throws Exception {
		jarArchiveEntry = new JarArchiveEntry("name");
		when(attributes.size()).thenReturn(1);
		when(attributes.getValue("key")).thenReturn("value");
		assertEquals("value", jarArchiveEntry.getManifestAttributes().getValue("key"));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJarArchiveEntryGetManifestAttributes_IFQC0() throws Exception {
        JarArchiveEntry jarArchiveEntry = new JarArchiveEntry("name");
        Attributes manifestAttributes = jarArchiveEntry.getManifestAttributes();
        assertNotNull(manifestAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJarArchiveEntryGetManifestAttributes2_SxBF1() throws Exception {
        JarArchiveEntry jarArchiveEntry = new JarArchiveEntry(new JarEntry("entry"));
        Attributes manifestAttributes = jarArchiveEntry.getManifestAttributes();
        assertNotNull(manifestAttributes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testJarArchiveEntryGetManifestAttributes4_oDvD3() throws Exception {
        JarArchiveEntry jarArchiveEntry = new JarArchiveEntry(new ZipEntry("entry"));
        Attributes manifestAttributes = jarArchiveEntry.getManifestAttributes();
        assertNotNull(manifestAttributes);
    }
}