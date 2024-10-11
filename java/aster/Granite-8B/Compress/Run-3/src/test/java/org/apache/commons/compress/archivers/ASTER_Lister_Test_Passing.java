/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lister_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGoWithIOException_uxas1_1() {
        Lister lister = new Lister();
        String[] args = {"path/to/directory"};
        IOException exception = new IOException("Error message");
        IOException expectedException = new IOException("Error message");
        assertEquals(expectedException,
                assertThrows(IOException.class, () -> lister.go()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGoWithArchiveException_ZanZ2_1() {
        Lister lister = new Lister();
        String[] args = {"path/to/directory"};
        ArchiveException exception = new ArchiveException("Error message");
        ArchiveException expectedException = new ArchiveException("Error message");
        assertEquals(expectedException,
                assertThrows(ArchiveException.class, () -> lister.go()));}
}