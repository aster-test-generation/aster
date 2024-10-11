/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeDirectDBUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCheckDBProductName_GpwJ0() throws Exception {
    TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
    String dbProductName = tradeDirectDBUtils.checkDBProductName();
    assertNotNull(dbProductName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuildDB_NullDDLFile_ZJun0() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        java.io.PrintWriter out = new java.io.PrintWriter(System.out);
        InputStream ddlFile = null;
        tradeDirectDBUtils.buildDB(out, ddlFile);
        assertEquals("TradeBuildDB: **** Unable to parse DDL file for the specified database ****</BR></BODY>", out.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseDDLToBuffer_SingleSQLStatement_YRIw1_MdHd0() throws Exception {
    TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
    String ddl = "CREATE TABLE test (id INT);";
    java.io.InputStream ddlFile = new java.io.ByteArrayInputStream(ddl.getBytes());
    Object[] result = tradeDirectDBUtils.parseDDLToBuffer(ddlFile);
    assertArrayEquals(new Object[] {"CREATE TABLE test (id INT);"}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseDDLToBuffer_MultiLineSQLStatement_XVxg4_MNKU0() throws Exception {
    TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
    String ddl = "CREATE TABLE test (\n" +
                 "  id INT,\n" +
                 "  name VARCHAR(255)\n" +
                 ");";
    java.io.InputStream ddlFile = new java.io.ByteArrayInputStream(ddl.getBytes("UTF-8"));
    Object[] result = tradeDirectDBUtils.parseDDLToBuffer(ddlFile);
    assertArrayEquals(new Object[] {"CREATE TABLE test ( id INT, name VARCHAR(255) )"}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseDDLToBuffer_CommentedLine_ziLU3_xcfi0() throws Exception {
    TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
    String ddl = "# This is a comment\nCREATE TABLE test (id INT);";
    java.io.InputStream ddlFile = new java.io.ByteArrayInputStream(ddl.getBytes("UTF-8"));
    Object[] result = tradeDirectDBUtils.parseDDLToBuffer(ddlFile);
    assertArrayEquals(new Object[] {"CREATE TABLE test (id INT)"}, result);
}
}