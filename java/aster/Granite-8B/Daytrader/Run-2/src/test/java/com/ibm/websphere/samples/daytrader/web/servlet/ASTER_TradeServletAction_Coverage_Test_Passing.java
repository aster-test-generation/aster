/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeServletAction_Coverage_Test_Passing {
    private TradeServletAction tradeServletAction;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoHome1_bROZ0() throws Exception {
	TradeServletAction tAction = new TradeServletAction();
	ServletContext ctx = mock(ServletContext.class);
	HttpServletRequest req = mock(HttpServletRequest.class);
	HttpServletResponse resp = mock(HttpServletResponse.class);
	String userID = "user1";
	String results = "results1";
	tAction.doHome(ctx, req, resp, userID, results);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoHome11_vbsk10() throws Exception {
	TradeServletAction tAction = new TradeServletAction();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoRegister4_BmEV3() throws Exception {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user4";
    String passwd = "passwd4";
    String cpasswd = "passwd4";
    String fullname = "fullname4";
    String ccn = "ccn4";
    String openBalanceString = "400.0";
    String email = "email4";
    String address = "address4";
    tradeServletAction.doRegister(ctx, req, resp, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
    verify(ctx).log("TradeAction:doRegister -- user=" + userID + " was created");
}
}