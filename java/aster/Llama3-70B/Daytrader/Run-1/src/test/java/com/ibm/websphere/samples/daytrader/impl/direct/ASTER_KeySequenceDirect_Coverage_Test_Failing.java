/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

public class Aster_KeySequenceDirect_Coverage_Test_Failing {
  private static HashMap<String, Collection<?>> keyMap = new HashMap<String, Collection<?>>();
  KeySequenceDirect keysequencedirect;
  Connection connection;
  PreparedStatement preparedstatement;
  ResultSet resultset;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetNextID_noMoreIDs_XOTt2() throws Exception {
    String keyName = "testKey";
    boolean inSession = true;
    boolean inGlobalTxn = false;
    Collection<Integer> block = new ArrayList<>();
    block.add(1);
    keyMap.put(keyName, block);
    when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
    when(preparedstatement.executeQuery()).thenReturn(resultset);
    when(resultset.next()).thenReturn(true);
    when(resultset.getInt(1)).thenReturn(1);
    Integer nextID = KeySequenceDirect.getNextID(connection, keyName, inSession, inGlobalTxn);
    assertEquals(1, nextID.intValue());
    block.clear();
    nextID = KeySequenceDirect.getNextID(connection, keyName, inSession, inGlobalTxn);
    assertEquals(1, nextID.intValue()); // allocNewBlock should be called again
  }
}