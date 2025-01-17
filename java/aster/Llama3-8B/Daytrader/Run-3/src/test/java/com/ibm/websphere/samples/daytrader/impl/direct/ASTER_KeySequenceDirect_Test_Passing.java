/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collection;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_KeySequenceDirect_Test_Passing {
private static HashMap<String, Collection<?>> keyMap = new HashMap<String, Collection<?>>();
@Mock
    private Connection connection;
@Mock
    private PreparedStatement preparedstatement;
@Mock
    private ResultSet resultset;
@InjectMocks
    private KeySequenceDirect keysequencedirect;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNextID() throws Exception{
        keyMap = new HashMap<String, Collection<?>>();
        keysequencedirect = new KeySequenceDirect();
        // Set up the mock resultset
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1);
        // Set up the mock prepared statement
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        // Set up the mock connection
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        // Call the method to test
        Integer nextID = keysequencedirect.getNextID(connection, "keyName", true, true);
        // Verify the result
        assertEquals(1, nextID);
    }
}