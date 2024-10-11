/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import com.ibm.websphere.samples.daytrader.util.KeyBlock;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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
  public void testGetNextID_1() throws Exception {
    connection = mock(Connection.class);
    preparedStatement = mock(PreparedStatement.class);
    resultSet = mock(ResultSet.class);
    // Setup the static keyMap to be used in tests
    ArrayList<Integer> initialBlock = new ArrayList<>();
    initialBlock.add(1);
    initialBlock.add(2);
    initialBlock.add(3);
    keyMap.put("testKey", initialBlock);
    when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
    when(preparedStatement.executeQuery()).thenReturn(resultSet);
    // Assuming allocNewBlock simply returns a new block of IDs
    // For the purpose of this test, let's simulate the behavior
    ArrayList<Integer> newBlock = new ArrayList<>();
    newBlock.add(4);
    newBlock.add(5);
    newBlock.add(6);
    keyMap.put("newKey", newBlock);
    // Test getting an ID from an existing key
    Integer nextIDExistingKey = KeySequenceDirect.getNextID(connection, "testKey", false, false);
    // Test getting an ID from a new key which triggers allocNewBlock
    Integer nextIDNewKey = KeySequenceDirect.getNextID(connection, "newKey", false, false);
    // Verify the interactions with the mock objects
    verify(connection, atLeastOnce()).prepareStatement(anyString());
    verify(preparedStatement, never()).executeQuery(); // Assuming allocNewBlock does not execute a query
    assertEquals(1, nextIDExistingKey);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_2() throws Exception {
    connection = mock(Connection.class);
    preparedStatement = mock(PreparedStatement.class);
    resultSet = mock(ResultSet.class);
    // Setup the static keyMap to be used in tests
    ArrayList<Integer> initialBlock = new ArrayList<>();
    initialBlock.add(1);
    initialBlock.add(2);
    initialBlock.add(3);
    keyMap.put("testKey", initialBlock);
    when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
    when(preparedStatement.executeQuery()).thenReturn(resultSet);
    // Assuming allocNewBlock simply returns a new block of IDs
    // For the purpose of this test, let's simulate the behavior
    ArrayList<Integer> newBlock = new ArrayList<>();
    newBlock.add(4);
    newBlock.add(5);
    newBlock.add(6);
    keyMap.put("newKey", newBlock);
    // Test getting an ID from an existing key
    Integer nextIDExistingKey = KeySequenceDirect.getNextID(connection, "testKey", false, false);
    // Test getting an ID from a new key which triggers allocNewBlock
    Integer nextIDNewKey = KeySequenceDirect.getNextID(connection, "newKey", false, false);
    // Verify the interactions with the mock objects
    verify(connection, atLeastOnce()).prepareStatement(anyString());
    verify(preparedStatement, never()).executeQuery(); // Assuming allocNewBlock does not execute a query
    assertEquals(4, nextIDNewKey);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_ExistingKeyNoNewBlockNeeded_TlXW1_2() throws Exception {
    Connection conn = mock(Connection.class);
    PreparedStatement stmt = mock(PreparedStatement.class);
    ResultSet rs = mock(ResultSet.class);
    when(conn.prepareStatement(anyString())).thenReturn(stmt);
    when(stmt.executeQuery()).thenReturn(rs);
    when(rs.next()).thenReturn(true);
    when(rs.getInt("keyval")).thenReturn(10);
    KeyBlock block = new KeyBlock(10, 19);
    keyMap.put("existingKey", block);
    Integer result = KeySequenceDirect.getNextID(conn, "existingKey", true, true);
    assertEquals(Integer.valueOf(10), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_ExistingKeyNewBlockNeeded_owJb2_2() throws Exception {
    Connection conn = mock(Connection.class);
    PreparedStatement stmt = mock(PreparedStatement.class);
    ResultSet rs = mock(ResultSet.class);
    when(conn.prepareStatement(anyString())).thenReturn(stmt);
    when(stmt.executeQuery()).thenReturn(rs);
    when(rs.next()).thenReturn(true, true, false, true);
    when(rs.getInt("keyval")).thenReturn(20, 30);
    KeyBlock initialBlock = new KeyBlock(20, 29);
    keyMap.put("existingKey", initialBlock);
    Integer result = KeySequenceDirect.getNextID(conn, "existingKey", false, false);
    assertEquals(Integer.valueOf(30), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_NewKeyAllocated_JiJG0_afti0_2() throws Exception {
    Connection conn = mock(Connection.class);
    PreparedStatement stmt = mock(PreparedStatement.class);
    when(conn.prepareStatement(anyString())).thenReturn(stmt);
    ResultSet rs = mock(ResultSet.class);
    when(rs.next()).thenReturn(false, true);
    when(rs.getInt("keyval")).thenReturn(0);
    when(stmt.executeQuery()).thenReturn(rs);
    when(stmt.executeUpdate()).thenReturn(1);
    Integer result = KeySequenceDirect.getNextID(conn, "newKey", false, false);
    assertEquals(Integer.valueOf(0), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID() throws Exception {
    connection = mock(Connection.class);
    preparedStatement = mock(PreparedStatement.class);
    resultSet = mock(ResultSet.class);
    // Setup the static keyMap to be used in tests
    ArrayList<Integer> initialBlock = new ArrayList<>();
    initialBlock.add(1);
    initialBlock.add(2);
    initialBlock.add(3);
    keyMap.put("testKey", initialBlock);
    when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
    when(preparedStatement.executeQuery()).thenReturn(resultSet);
    // Assuming allocNewBlock simply returns a new block of IDs
    // For the purpose of this test, let's simulate the behavior
    ArrayList<Integer> newBlock = new ArrayList<>();
    newBlock.add(4);
    newBlock.add(5);
    newBlock.add(6);
    keyMap.put("newKey", newBlock);
    // Test getting an ID from an existing key
    Integer nextIDExistingKey = KeySequenceDirect.getNextID(connection, "testKey", false, false);
    assertEquals(1, nextIDExistingKey);
    // Test getting an ID from a new key which triggers allocNewBlock
    Integer nextIDNewKey = KeySequenceDirect.getNextID(connection, "newKey", false, false);
    assertEquals(4, nextIDNewKey);
    // Verify the interactions with the mock objects
    verify(connection, atLeastOnce()).prepareStatement(anyString());
    verify(preparedStatement, never()).executeQuery(); // Assuming allocNewBlock does not execute a query
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_ExistingKeyNoNewBlockNeeded_TlXW1() throws Exception {
    Connection conn = mock(Connection.class);
    PreparedStatement stmt = mock(PreparedStatement.class);
    ResultSet rs = mock(ResultSet.class);
    when(conn.prepareStatement(anyString())).thenReturn(stmt);
    when(stmt.executeQuery()).thenReturn(rs);
    when(rs.next()).thenReturn(true);
    when(rs.getInt("keyval")).thenReturn(10);
    KeyBlock block = new KeyBlock(10, 19);
    keyMap.put("existingKey", block);
    Integer result = KeySequenceDirect.getNextID(conn, "existingKey", true, true);
    assertNotNull(result);
    assertEquals(Integer.valueOf(10), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_ExistingKeyNewBlockNeeded_owJb2() throws Exception {
    Connection conn = mock(Connection.class);
    PreparedStatement stmt = mock(PreparedStatement.class);
    ResultSet rs = mock(ResultSet.class);
    when(conn.prepareStatement(anyString())).thenReturn(stmt);
    when(stmt.executeQuery()).thenReturn(rs);
    when(rs.next()).thenReturn(true, true, false, true);
    when(rs.getInt("keyval")).thenReturn(20, 30);
    KeyBlock initialBlock = new KeyBlock(20, 29);
    keyMap.put("existingKey", initialBlock);
    Integer result = KeySequenceDirect.getNextID(conn, "existingKey", false, false);
    assertNotNull(result);
    assertEquals(Integer.valueOf(30), result);
  }
}