/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DefaultBackingStoreSupplier_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWithNullDirectory_uUjD0() throws IOException {
        Path dir = null;
        DefaultBackingStoreSupplier supplier = new DefaultBackingStoreSupplier(dir);
        ScatterGatherBackingStore result = supplier.get();
    }
}