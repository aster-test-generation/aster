/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarFile;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200PackerAdapter_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPackWithNullInputs_WZvL0_1() throws Exception {
    Pack200PackerAdapter adapter = new Pack200PackerAdapter();
    JarFile jarFile = null;
    OutputStream outputStream = null;
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        adapter.pack(jarFile, outputStream);
    });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFirePropertyChange_NullPropertyName_LukN14() throws IOException {
    Pack200PackerAdapter adapter = new Pack200PackerAdapter();
    String oldValue = "oldValue";
    String newValue = "newValue";
    try {
        adapter.firePropertyChange(null, oldValue, newValue);
        fail("Expected IOException");
    } catch (NullPointerException e) {
    }
}
}