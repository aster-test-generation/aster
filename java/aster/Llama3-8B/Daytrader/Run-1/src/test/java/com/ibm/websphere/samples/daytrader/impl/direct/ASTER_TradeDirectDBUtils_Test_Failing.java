/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import java.io.InputStream;
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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeDirectDBUtils_Test_Failing {
    @Mock
    private DataSource datasource;
    @Mock
    private Connection connection;
    @Mock
    private PreparedStatement preparedstatement;
    @Mock
    private ResultSet resultset;
    private TradeDirectDBUtils tradedirectdbutils;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_4() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 0, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(3, runStatsData.getSumLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_5() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 0, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(4, runStatsData.getSumLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_6() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 0, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(5, runStatsData.getHoldingCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_7() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 0, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(6, runStatsData.getOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_8() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 0, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(7, runStatsData.getBuyOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_9() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 0, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(8, runStatsData.getSellOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_10() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 0, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(9, runStatsData.getCancelledOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_11() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(10, runStatsData.getOpenOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_1() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getTradeUserCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_2() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getNewUserCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_3() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getTradeStockCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_4() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getSumLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_5() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getSumLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_6() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getHoldingCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_7() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_8() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getBuyOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_9() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getSellOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_10() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getCancelledOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_11() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getOpenOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0_12() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getDeletedOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_1() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getTradeUserCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_2() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getNewUserCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_3() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getTradeStockCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_4() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getSumLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_5() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getSumLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_6() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getHoldingCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_7() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_8() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getBuyOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_9() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getSellOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_10() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getCancelledOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_11() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getOpenOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1_12() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getDeletedOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckDBProductName_KUBK0() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        String dbProductName = tradeDirectDBUtils.checkDBProductName();
        assert dbProductName != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testbuildDB() throws Exception {
        datasource = mock(DataSource.class);
        connection = mock(Connection.class);
        preparedstatement = mock(PreparedStatement.class);
        resultset = mock(ResultSet.class);
        tradedirectdbutils = new TradeDirectDBUtils();
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(datasource.getConnection()).thenReturn(connection);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        java.io.PrintWriter out = mock(java.io.PrintWriter.class);
        InputStream ddlFile = mock(InputStream.class);
        tradedirectdbutils.buildDB(out, ddlFile);
        verify(out, times(1)).println("TradeBuildDB: Building DayTrader Database...");
        verify(out, times(1)).println("TradeBuildDB: **** Creating 100 Quotes ****");
        verify(out, times(1)).println("TradeBuildDB: **** Registering 100 Users **** ");
        verify(out, times(1)).println("</BODY>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(1, runStatsData.getNewUserCount());
        assertEquals(1, runStatsData.getTradeUserCount());
        assertEquals(1, runStatsData.getTradeStockCount());
        assertEquals(3, runStatsData.getSumLoginCount());
        assertEquals(4, runStatsData.getSumLogoutCount());
        assertEquals(5, runStatsData.getHoldingCount());
        assertEquals(6, runStatsData.getOrderCount());
        assertEquals(7, runStatsData.getBuyOrderCount());
        assertEquals(8, runStatsData.getSellOrderCount());
        assertEquals(9, runStatsData.getCancelledOrderCount());
        assertEquals(10, runStatsData.getOpenOrderCount());
        assertEquals(1, runStatsData.getDeletedOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeDeleteAll_sDcr0() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(true);
        assertEquals(0, runStatsData.getTradeUserCount());
        assertEquals(0, runStatsData.getNewUserCount());
        assertEquals(0, runStatsData.getTradeStockCount());
        assertEquals(0, runStatsData.getSumLoginCount());
        assertEquals(0, runStatsData.getSumLogoutCount());
        assertEquals(0, runStatsData.getHoldingCount());
        assertEquals(0, runStatsData.getOrderCount());
        assertEquals(0, runStatsData.getBuyOrderCount());
        assertEquals(0, runStatsData.getSellOrderCount());
        assertEquals(0, runStatsData.getCancelledOrderCount());
        assertEquals(0, runStatsData.getOpenOrderCount());
        assertEquals(0, runStatsData.getDeletedOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTradeNoDeleteAll_CIFi1() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        RunStatsDataBean runStatsData = tradeDirectDBUtils.resetTrade(false);
        assertEquals(0, runStatsData.getTradeUserCount());
        assertEquals(0, runStatsData.getNewUserCount());
        assertEquals(0, runStatsData.getTradeStockCount());
        assertEquals(0, runStatsData.getSumLoginCount());
        assertEquals(0, runStatsData.getSumLogoutCount());
        assertEquals(0, runStatsData.getHoldingCount());
        assertEquals(0, runStatsData.getOrderCount());
        assertEquals(0, runStatsData.getBuyOrderCount());
        assertEquals(0, runStatsData.getSellOrderCount());
        assertEquals(0, runStatsData.getCancelledOrderCount());
        assertEquals(0, runStatsData.getOpenOrderCount());
        assertEquals(0, runStatsData.getDeletedOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_1_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(1, runStatsData.getNewUserCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_2_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(1, runStatsData.getTradeUserCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_3_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(1, runStatsData.getTradeStockCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_4_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(3, runStatsData.getSumLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_5_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(4, runStatsData.getSumLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_6_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(5, runStatsData.getHoldingCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_7_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(6, runStatsData.getOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_8_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(7, runStatsData.getBuyOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_9_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(8, runStatsData.getSellOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_10_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(9, runStatsData.getCancelledOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_11_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(10, runStatsData.getOpenOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testresetTrade_12_fid3() throws Exception {
        tradedirectdbutils = new TradeDirectDBUtils();
        Field field_datasource = TradeDirectDBUtils.class.getDeclaredField("datasource");
        field_datasource.setAccessible(true);
        field_datasource.set(tradedirectdbutils, datasource);
        when(datasource.getConnection()).thenReturn(connection);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedstatement);
        when(preparedstatement.executeUpdate()).thenReturn(1);
        when(preparedstatement.executeQuery()).thenReturn(resultset);
        when(resultset.next()).thenReturn(true).thenReturn(false);
        when(resultset.getInt(any(String.class))).thenReturn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        RunStatsDataBean runStatsData = tradedirectdbutils.resetTrade(true);
        assertEquals(1, runStatsData.getDeletedOrderCount());
    }
}