/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnknownLocationException_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMessage_yQtL0() {
    UnLocode unlocode = new UnLocode("USNYC");
    UnknownLocationException exception = new UnknownLocationException(unlocode);
    String message = exception.getMessage();
    assertEquals("No location with UN locode USNYC exists in the system.", message);
}
}