/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import com.ibm.websphere.samples.daytrader.util.MDBStats;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeDirectDBUtils_Coverage_Test_Failing {
    private DataSource datasource;
    TradeDirectDBUtils tradedirectdbutils;
    Connection connection;
    PreparedStatement preparedstatement;
    ResultSet resultset;
@BeforeEach
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade_MDBStatsReset_CyCL1() throws Exception {
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(false);
        verify(MDBStats.getInstance(), times(1)).reset();
    }
}