/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeServletAction_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoMarketSummary_CmMb0() throws javax.servlet.ServletException, java.io.IOException {
        TradeServletAction action = new TradeServletAction();
        action.doMarketSummary(null, null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWelcome1_TkBO0() throws javax.servlet.ServletException, java.io.IOException {
        TradeServletAction action = new TradeServletAction();
        action.doWelcome(null, null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWelcome3_RFgD2() throws javax.servlet.ServletException, java.io.IOException {
        TradeServletAction action = new TradeServletAction();
        action.doWelcome(null, new MockHttpServletRequest(), null, "status");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoAccountUpdate1_nAdh0() throws javax.servlet.ServletException, java.io.IOException {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid1";
        String password = "pwd1";
        String cpassword = "pwd2";
        String fullName = "fn1";
        String address = "ad1";
        String creditcard = "cc1";
        String email = "em1";
        tAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
        assertEquals(true, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoAccountUpdate2_LuLM1() throws javax.servlet.ServletException, java.io.IOException {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid1";
        String password = "pwd1";
        String cpassword = "pwd1";
        String fullName = "fn1";
        String address = "ad1";
        String creditcard = "cc1";
        String email = "em1";
        tAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
        assertEquals(true, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoAccountUpdate7_icnf6() throws javax.servlet.ServletException, java.io.IOException {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid1";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegister1_ihbk0() throws javax.servlet.ServletException, java.io.IOException {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid1";
        String passwd = "passwd";
        String cpasswd = "passwd";
        String fullname = "fullname";
        String ccn = "ccn";
        String openBalanceString = "1000.0";
        String email = "email";
        String address = "address";
        tAction.doRegister(ctx, req, resp, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
        String results = (String) req.getAttribute("results");
        assertEquals("results should be null", null, results);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWelcome2_bBMe1() throws javax.servlet.ServletException, java.io.IOException {
        TradeServletAction action = new TradeServletAction();
        action.doWelcome(null, null, null, "status");
    }
}