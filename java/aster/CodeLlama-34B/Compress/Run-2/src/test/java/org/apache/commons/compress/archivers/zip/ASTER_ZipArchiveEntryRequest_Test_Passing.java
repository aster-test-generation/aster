/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.InputStream;
import org.apache.commons.compress.parallel.InputStreamSupplier;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
public class Aster_ZipArchiveEntryRequest_Test_Passing {
private ZipArchiveEntry zipArchiveEntry;
private InputStreamSupplier payloadSupplier;
private int method;
ZipArchiveEntryRequest ziparchiveentryrequest;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateZipArchiveEntryRequestWithNonNullZipArchiveEntryAndNonNullInputStreamSupplier_ITeE1_XEPz0_1() {
    ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("test.txt");
    InputStreamSupplier payloadSupplier = mock(InputStreamSupplier.class);
    InputStream inputStream = mock(InputStream.class);
    when(payloadSupplier.get()).thenReturn(inputStream);
    ZipArchiveEntryRequest request = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry, payloadSupplier);
    assertEquals(zipArchiveEntry, request.getZipArchiveEntry());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateZipArchiveEntryRequestWithNonNullZipArchiveEntryAndNonNullInputStreamSupplier_ITeE1_XEPz0_2() {
    ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("test.txt");
    InputStreamSupplier payloadSupplier = mock(InputStreamSupplier.class);
    InputStream inputStream = mock(InputStream.class);
    when(payloadSupplier.get()).thenReturn(inputStream);
    ZipArchiveEntryRequest request = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry, payloadSupplier);
    assertEquals(inputStream, request.getPayloadStream());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateZipArchiveEntryRequestWithNonNullZipArchiveEntryAndNonNullInputStreamSupplier_ITeE1_XEPz0_3() {
    ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("test.txt");
    InputStreamSupplier payloadSupplier = mock(InputStreamSupplier.class);
    InputStream inputStream = mock(InputStream.class);
    when(payloadSupplier.get()).thenReturn(inputStream);
    ZipArchiveEntryRequest request = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry, payloadSupplier);
    assertEquals(zipArchiveEntry.getMethod(), request.getMethod());}
}