/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DefaultBackingStoreSupplier_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGet_WVzB0() throws IOException {
        final Path dir = null;
        final DefaultBackingStoreSupplier supplier = new DefaultBackingStoreSupplier(dir);
        final ScatterGatherBackingStore store = supplier.get();
        assertNotNull(store);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWithDir_SBcJ1_1() throws IOException {
        final Path dir = Files.createTempDirectory("test");
        final DefaultBackingStoreSupplier supplier = new DefaultBackingStoreSupplier(dir);
        final ScatterGatherBackingStore store = supplier.get();
        assertNotNull(store);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWithDir_SBcJ1_2() throws IOException {
        final Path dir = Files.createTempDirectory("test");
        final DefaultBackingStoreSupplier supplier = new DefaultBackingStoreSupplier(dir);
        final ScatterGatherBackingStore store = supplier.get();
        assertTrue(Files.exists(dir));}
}