/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DefaultBackingStoreSupplier_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDefaultBackingStoreSupplierGet_VOJG0() throws IOException {
        DefaultBackingStoreSupplier defaultBackingStoreSupplier = new DefaultBackingStoreSupplier(null);
        ScatterGatherBackingStore scatterGatherBackingStore = defaultBackingStoreSupplier.get();
        assertNotNull(scatterGatherBackingStore);
    }
}