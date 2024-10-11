/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ZipArchiveEntryRequest_Test_Passing {
private ZipArchiveEntry zipArchiveEntry;
@Mock
    private ZipArchiveEntry zipArchiveEntryMock;
private InputStreamSupplier payloadSupplier;
@Mock
    private InputStreamSupplier payloadSupplierMock;
private ZipArchiveEntryRequest ziparchiveentryrequest;
private int method;
@Mock
    private ZipArchiveEntryRequest zipArchiveEntryRequest;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateZipArchiveEntryRequest_1() throws Exception {
        zipArchiveEntry = mock(ZipArchiveEntry.class);
        payloadSupplier = mock(InputStreamSupplier.class);
        ZipArchiveEntryRequest request = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry, payloadSupplier);
        assertEquals(zipArchiveEntry, request.getZipArchiveEntry());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetMethod() throws Exception {
        method = 1;
        when(zipArchiveEntryRequest.getMethod()).thenReturn(method);
        assertEquals(method, zipArchiveEntryRequest.getMethod());
    }
}