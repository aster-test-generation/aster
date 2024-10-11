/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DefaultBackingStoreSupplier_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_withNullDir_bANc0() throws IOException {
    DefaultBackingStoreSupplier supplier = new DefaultBackingStoreSupplier(null);
    ScatterGatherBackingStore store = supplier.get();
    assertNotNull(store);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_withDir_NhUj1() throws IOException {
    Path dir = Files.createTempDirectory("test");
    DefaultBackingStoreSupplier supplier = new DefaultBackingStoreSupplier(dir);
    ScatterGatherBackingStore store = supplier.get();
    assertNotNull(store);
}
}