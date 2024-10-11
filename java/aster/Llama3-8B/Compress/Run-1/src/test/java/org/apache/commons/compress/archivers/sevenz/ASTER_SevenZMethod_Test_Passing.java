/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZMethod_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testByIdInvalidId_brQw2() {
    byte[] id = new byte[] {1, 2, 3};
    SevenZMethod result = SevenZMethod.byId(id);
    assert result == null;
}
}