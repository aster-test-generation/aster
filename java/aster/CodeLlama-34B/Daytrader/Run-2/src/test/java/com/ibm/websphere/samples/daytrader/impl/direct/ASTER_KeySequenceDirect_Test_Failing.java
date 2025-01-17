/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.sql.Connection;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_KeySequenceDirect_Test_Failing {
  private static HashMap<String, Collection<?>> keyMap = new HashMap<String, Collection<?>>();

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_inGlobalTxn_fVjA2_CUxd0() {
    Connection conn = mock(Connection.class);
    String keyName = "keyName";
    boolean inSession = false;
    boolean inGlobalTxn = true;
    try {
      Integer nextID = KeySequenceDirect.getNextID(conn, keyName, inSession, inGlobalTxn);
      assertNotNull(nextID);
    } catch (Exception e) {
      fail("Exception thrown: " + e.toString());
    }
  }
}