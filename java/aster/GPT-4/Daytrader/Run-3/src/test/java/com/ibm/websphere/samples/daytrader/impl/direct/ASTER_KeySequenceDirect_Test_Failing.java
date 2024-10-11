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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_KeySequenceDirect_Test_Failing {
  private static HashMap<String, Collection<?>> keyMap = new HashMap<>();
  Connection connection;
  PreparedStatement preparedStatement;
  ResultSet resultSet;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_2() throws Exception {
    connection = mock(Connection.class);
    preparedStatement = mock(PreparedStatement.class);
    resultSet = mock(ResultSet.class);
    // Mocking the static map from KeySequenceDirect
    keyMap.clear();
    // Setup
    String keyName = "testKey";
    boolean inSession = false;
    boolean inGlobalTxn = false;
    ArrayList<Integer> idBlock = new ArrayList<>();
    idBlock.add(1);
    keyMap.put(keyName, idBlock);
    when(connection.prepareStatement(any(String.class))).thenReturn(preparedStatement);
    when(preparedStatement.executeQuery()).thenReturn(resultSet);
    when(resultSet.next()).thenReturn(true);
    when(resultSet.getInt(1)).thenReturn(1);
    // Action
    Integer nextID = KeySequenceDirect.getNextID(connection, keyName, inSession, inGlobalTxn);
    // Assertion
    // Verify interactions
    verify(connection).prepareStatement(any(String.class));
    verify(preparedStatement).executeQuery();
    assertEquals(1, nextID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_3() throws Exception {
    connection = mock(Connection.class);
    preparedStatement = mock(PreparedStatement.class);
    resultSet = mock(ResultSet.class);
    // Mocking the static map from KeySequenceDirect
    keyMap.clear();
    // Setup
    String keyName = "testKey";
    boolean inSession = false;
    boolean inGlobalTxn = false;
    ArrayList<Integer> idBlock = new ArrayList<>();
    idBlock.add(1);
    keyMap.put(keyName, idBlock);
    when(connection.prepareStatement(any(String.class))).thenReturn(preparedStatement);
    when(preparedStatement.executeQuery()).thenReturn(resultSet);
    when(resultSet.next()).thenReturn(true);
    when(resultSet.getInt(1)).thenReturn(1);
    // Action
    Integer nextID = KeySequenceDirect.getNextID(connection, keyName, inSession, inGlobalTxn);
    // Assertion
    // Verify interactions
    verify(connection).prepareStatement(any(String.class));
    verify(preparedStatement).executeQuery();
    assertTrue(keyMap.containsKey(keyName));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID() throws Exception {
    connection = mock(Connection.class);
    preparedStatement = mock(PreparedStatement.class);
    resultSet = mock(ResultSet.class);
    // Mocking the static map from KeySequenceDirect
    keyMap.clear();
    // Setup
    String keyName = "testKey";
    boolean inSession = false;
    boolean inGlobalTxn = false;
    ArrayList<Integer> idBlock = new ArrayList<>();
    idBlock.add(1);
    keyMap.put(keyName, idBlock);
    when(connection.prepareStatement(any(String.class))).thenReturn(preparedStatement);
    when(preparedStatement.executeQuery()).thenReturn(resultSet);
    when(resultSet.next()).thenReturn(true);
    when(resultSet.getInt(1)).thenReturn(1);
    // Action
    Integer nextID = KeySequenceDirect.getNextID(connection, keyName, inSession, inGlobalTxn);
    // Assertion
    assertNotNull(nextID);
    assertEquals(1, nextID);
    assertTrue(keyMap.containsKey(keyName));
    assertEquals(0, keyMap.get(keyName).size()); // Assuming the ID is consumed and removed
    // Verify interactions
    verify(connection).prepareStatement(any(String.class));
    verify(preparedStatement).executeQuery();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_BlockExhausted_wXhr2() throws Exception {
    Connection conn = mock(Connection.class);
    PreparedStatement stmt = mock(PreparedStatement.class);
    ResultSet rs = mock(ResultSet.class);
    when(conn.prepareStatement(anyString())).thenReturn(stmt);
    when(stmt.executeQuery()).thenReturn(rs);
    when(rs.next()).thenReturn(true, true, false, true);
    when(rs.getInt("keyval")).thenReturn(20, 30);
    when(stmt.executeUpdate()).thenReturn(1);
    Integer firstResult = KeySequenceDirect.getNextID(conn, "exhaustedKey", false, false);
    Integer secondResult = KeySequenceDirect.getNextID(conn, "exhaustedKey", false, false);
    assertNotNull(firstResult);
    assertNotNull(secondResult);
    assertEquals(Integer.valueOf(20), firstResult);
    assertEquals(Integer.valueOf(30), secondResult);
  }
}