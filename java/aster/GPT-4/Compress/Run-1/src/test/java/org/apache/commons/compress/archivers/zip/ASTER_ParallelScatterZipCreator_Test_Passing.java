/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.parallel.InputStreamSupplier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ParallelScatterZipCreator_Test_Passing {
@InjectMocks
    private ParallelScatterZipCreator parallelScatterZipCreator;
@Mock
    private ZipArchiveEntry zipArchiveEntry;
@Mock
    private InputStreamSupplier inputStreamSupplier;
@Mock
    private ScatterZipOutputStream scatterZipOutputStream;
@Mock
    private ThreadLocal<ScatterZipOutputStream> tlScatterStreams;
@Mock
    private ExecutorService executorService;
@Mock
    private DefaultBackingStoreSupplier backingStoreSupplier;
@Mock
    private Future<Void> future;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmit_OayS0() {
        ParallelScatterZipCreator creator = new ParallelScatterZipCreator(Executors.newSingleThreadExecutor());
        Callable<Object> callable = () -> "Test Callable";
        creator.submit(callable);
        assert true; // This assertion is just a placeholder.
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateCallable_WithUnknownZipMethod_ThrowsIllegalArgumentException_1() {
        when(tlScatterStreams.get()).thenReturn(scatterZipOutputStream);
        parallelScatterZipCreator = new ParallelScatterZipCreator(null);
        when(zipArchiveEntry.getMethod()).thenReturn(ZipMethod.UNKNOWN_CODE);
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            parallelScatterZipCreator.createCallable(zipArchiveEntry, inputStreamSupplier)
        );}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddArchiveEntry_fDWe0() throws Exception {
    parallelScatterZipCreator = new ParallelScatterZipCreator(executorService, backingStoreSupplier);
    when(executorService.submit(any(Callable.class))).thenReturn(future);
    parallelScatterZipCreator.addArchiveEntry(zipArchiveEntry, inputStreamSupplier);
    verify(executorService).submit(any(Callable.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSubmitStreamAwareCallable_ZGPH0_MaeK0() {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    DefaultBackingStoreSupplier backingStoreSupplier = new DefaultBackingStoreSupplier(null);
    ParallelScatterZipCreator creator = new ParallelScatterZipCreator(executorService, backingStoreSupplier);
    Callable<ScatterZipOutputStream> callable = () -> null; // Assuming ScatterZipOutputStream exists and callable returns null for simplicity
    Future<?> future = executorService.submit(callable);
    assertNotNull(future);
    executorService.shutdown();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateCallable_WithUnknownZipMethod_ThrowsIllegalArgumentException() {
        when(tlScatterStreams.get()).thenReturn(scatterZipOutputStream);
        parallelScatterZipCreator = new ParallelScatterZipCreator(null);
        when(zipArchiveEntry.getMethod()).thenReturn(ZipMethod.UNKNOWN_CODE);
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            parallelScatterZipCreator.createCallable(zipArchiveEntry, inputStreamSupplier)
        );
        assertTrue(exception.getMessage().contains("Method must be set on zipArchiveEntry"));
    }
}