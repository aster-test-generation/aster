/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.TimeUnit;
import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeDirectDBUtils_Test_Failing {
    @Mock
    private DataSource datasource;
    TradeDirectDBUtils tradedirectdbutils;
    Connection connection;
    PreparedStatement preparedstatement;
    ResultSet resultset;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcheckDBProductName() throws Exception {
        connection = mock(Connection.class);
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        String dbProductName = tradedirectdbutils.checkDBProductName();
        assertEquals("Oracle", dbProductName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckDBProductName_Hlvv0() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        String dbProductName = tradeDirectDBUtils.checkDBProductName();
        assertNotNull(dbProductName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseDDLToBuffer_Oqkj0() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        tradeDirectDBUtils.parseDDLToBuffer(null);
    }
}