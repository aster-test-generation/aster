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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_KeySequenceDirect_Test_Failing {
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
    public void testgetNextID() throws Exception {
        keyMap = new HashMap<String, Collection<?>>();
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        // setup
        String keyName = "testKey";
        boolean inSession = true;
        boolean inGlobalTxn = true;
        Integer expectedID = 1;
        // when
        Integer actualID = keysequencedirect.getNextID(connection, keyName, inSession, inGlobalTxn);
        // then
        verify(preparedstatement, times(1)).executeQuery();
        assertEquals(expectedID, actualID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextID_GlobalTxn_riSH2() throws Exception {
        Connection conn = null; // Initialize connection object
        String keyName = "testKey";
        boolean inSession = true;
        boolean inGlobalTxn = true;
        Integer nextID = KeySequenceDirect.getNextID(conn, keyName, inSession, inGlobalTxn);
        assert nextID != null;
    }
}