/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.apache.commons.compress.parallel.InputStreamSupplier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ParallelScatterZipCreator_Test_Passing {
@Mock
	ExecutorService mockExecutorService;
@Mock
	DefaultBackingStoreSupplier mockDefaultBackingStoreSupplier;
@Mock
	InputStreamSupplier mockInputStreamSupplier;
@Mock
	ZipArchiveEntry mockZipArchiveEntry;
ParallelScatterZipCreator parallelscatterzipcreator;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateCallable_NullExecutorService_NCYh1() {
        try {
            ParallelScatterZipCreator parallelScatterZipCreator = new ParallelScatterZipCreator(null, null, 1);
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateCallable_NullBackingStoreSupplier_MyJk2() {
        try {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            ParallelScatterZipCreator parallelScatterZipCreator = new ParallelScatterZipCreator(executorService, null, 1);
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateCallable_CompressionLevelBelowMinimum_GjNP3() {
        try {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            DefaultBackingStoreSupplier backingStoreSupplier = new DefaultBackingStoreSupplier(null);
            ParallelScatterZipCreator parallelScatterZipCreator = new ParallelScatterZipCreator(executorService, backingStoreSupplier, -1);
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateCallable_CompressionLevelAboveMaximum_gwtA4() {
        try {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            DefaultBackingStoreSupplier backingStoreSupplier = new DefaultBackingStoreSupplier(null);
            ParallelScatterZipCreator parallelScatterZipCreator = new ParallelScatterZipCreator(executorService, backingStoreSupplier, 10);
        } catch (IllegalArgumentException e) {
        }
    }
}