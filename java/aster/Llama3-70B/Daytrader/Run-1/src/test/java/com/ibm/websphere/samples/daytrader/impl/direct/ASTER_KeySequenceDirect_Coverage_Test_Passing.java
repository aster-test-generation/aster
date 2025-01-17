/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_KeySequenceDirect_Coverage_Test_Passing {
  private static HashMap<String, Collection<?>> keyMap = new HashMap<String, Collection<?>>();
  KeySequenceDirect keysequencedirect;
  Connection connection;
  PreparedStatement preparedstatement;
  ResultSet resultset;

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_bpaK0() throws Exception {
    connection = mock(Connection.class);
    preparedstatement = mock(PreparedStatement.class);
    resultset = mock(ResultSet.class);
    keysequencedirect = new KeySequenceDirect(); // initialize KeySequenceDirect object
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_fZUy0() throws Exception {
    connection = mock(Connection.class);
    preparedstatement = mock(PreparedStatement.class);
    resultset = mock(ResultSet.class);
    keysequencedirect = new KeySequenceDirect();
  }

  @Test
  public void testgetNextID_nPZE1() throws Exception {
    when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
    when(preparedstatement.executeQuery()).thenReturn(resultset);
  }
}