/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContextEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeWebContextListener_Test_Passing {
    TradeWebContextListener tradewebcontextlistener;
    ServletContextEvent servletcontextevent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void contextInitialized(ServletContextEvent event)
    {
        Log.trace("TradeWebContextListener contextInitialized -- initializing TradeDirect");
        Properties prop = new Properties();
        InputStream stream = event.getServletContext().getResourceAsStream("/properties/daytrader.properties");
        try {
            prop.load(stream);
            System.out.println("Settings from daytrader.properties: " + prop);
            if (System.getenv("RUNTIME_MODE") != null) {
                TradeConfig.setRunTimeMode(Integer.parseInt(System.getenv("RUNTIME_MODE")));
            } else {
                TradeConfig.setRunTimeMode(Integer.parseInt(prop.getProperty("runtimeMode")));
            }
            System.out.print("Running in " + TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()] + " Mode");
            if (System.getenv("ORDER_PROCESSING_MODE") != null) {
                TradeConfig.setOrderProcessingMode(Integer.parseInt(System.getenv("ORDER_PROCESSING_MODE")));
            } else {
                TradeConfig.setOrderProcessingMode(Integer.parseInt(prop.getProperty("orderProcessingMode")));
            }
            System.out.print("Running in " + TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()] + " Order Processing Mode");
            if (System.getenv("MAX_USERS") != null) {
                TradeConfig.setMAX_USERS(Integer.parseInt(System.getenv("MAX_USERS")));
            } else {
                TradeConfig.setMAX_USERS(Integer.parseInt(prop.getProperty("maxUsers")));
            }
            System.out.print("MAX_USERS = " + TradeConfig.getMAX_USERS() + " users");
            if (System.getenv("MAX_QUOTES") != null) {
                TradeConfig.setMAX_QUOTES(Integer.parseInt(System.getenv("MAX_QUOTES")));
            } else {
                TradeConfig.setMAX_QUOTES(Integer.parseInt(prop.getProperty("maxQuotes")));
            }
            System.out.print("MAX_QUOTES = " + TradeConfig.getMAX_QUOTES() + " quotes");
            if (System.getenv("PUBLISH_QUOTES") != null) {
                TradeConfig.setPublishQuotePriceChange(Boolean.parseBoolean(System.getenv("PUBLISH_QUOTES")));
            } else {
                TradeConfig.setPublishQuotePriceChange(Boolean.parseBoolean(prop.getProperty("publishQuotePriceChange")));
            }
            if (System.getenv("DISPLAY_ORDER_ALERTS") != null) {
                TradeConfig.setDisplayOrderAlerts(Boolean.parseBoolean(System.getenv("DISPLAY_ORDER_ALERTS")));
            } else {
                TradeConfig.setDisplayOrderAlerts(Boolean.parseBoolean(prop.getProperty("displayOrderAlerts")));
            }
            if (System.getenv("WEB_INTERFACE") != null) {
                TradeConfig.setWebInterface(Integer.parseInt(System.getenv("WEB_INTERFACE")));
            } else {
                TradeConfig.setWebInterface(Integer.parseInt(prop.getProperty("webInterface")));
            }
            if (System.getenv("LIST_QUOTE_PRICE_CHANGE_FREQUENCY") != null) {
                TradeConfig.setListQuotePriceChangeFrequency(Integer.parseInt(System.getenv("LIST_QUOTE_PRICE_CHANGE_FREQUENCY")));
            } else {
                TradeConfig.setListQuotePriceChangeFrequency(Integer.parseInt(prop.getProperty("listQuotePriceChangeFrequency")));
            }
            TradeConfig.setPrimIterations(Integer.parseInt(prop.getProperty("primIterations")));
            TradeConfig.setMarketSummaryInterval(Integer.parseInt(prop.getProperty("marketSummaryInterval")));
            TradeConfig.setLongRun(Boolean.parseBoolean(prop.getProperty("longRun")));
        } catch (Exception e) {
            System.out.println("daytrader.properties not found");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void contextInitialized_fid2(ServletContextEvent event)
    {
        Log.trace("TradeWebContextListener contextInitialized_fid2 -- initializing TradeDirect");
        Properties prop = new Properties();
        InputStream stream = event.getServletContext().getResourceAsStream("/properties/daytrader.properties");
        try {
            prop.load(stream);
            System.out.println("Settings from daytrader.properties: " + prop);
            if (System.getenv("RUNTIME_MODE") != null) {
                TradeConfig.setRunTimeMode(Integer.parseInt(System.getenv("RUNTIME_MODE")));
            } else {
                TradeConfig.setRunTimeMode(Integer.parseInt(prop.getProperty("runtimeMode")));
            }
            System.out.print("Running in " + TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()] + " Mode");
            if (System.getenv("ORDER_PROCESSING_MODE") != null) {
                TradeConfig.setOrderProcessingMode(Integer.parseInt(System.getenv("ORDER_PROCESSING_MODE")));
            } else {
                TradeConfig.setOrderProcessingMode(Integer.parseInt(prop.getProperty("orderProcessingMode")));
            }
            System.out.print("Running in " + TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()] + " Order Processing Mode");
            if (System.getenv("MAX_USERS") != null) {
                TradeConfig.setMAX_USERS(Integer.parseInt(System.getenv("MAX_USERS")));
            } else {
                TradeConfig.setMAX_USERS(Integer.parseInt(prop.getProperty("maxUsers")));
            }
            System.out.print("MAX_USERS = " + TradeConfig.getMAX_USERS() + " users");
            if (System.getenv("MAX_QUOTES") != null) {
                TradeConfig.setMAX_QUOTES(Integer.parseInt(System.getenv("MAX_QUOTES")));
            } else {
                TradeConfig.setMAX_QUOTES(Integer.parseInt(prop.getProperty("maxQuotes")));
            }
            System.out.print("MAX_QUOTES = " + TradeConfig.getMAX_QUOTES() + " quotes");
            if (System.getenv("PUBLISH_QUOTES") != null) {
                TradeConfig.setPublishQuotePriceChange(Boolean.parseBoolean(System.getenv("PUBLISH_QUOTES")));
            } else {
                TradeConfig.setPublishQuotePriceChange(Boolean.parseBoolean(prop.getProperty("publishQuotePriceChange")));
            }
            if (System.getenv("DISPLAY_ORDER_ALERTS") != null) {
                TradeConfig.setDisplayOrderAlerts(Boolean.parseBoolean(System.getenv("DISPLAY_ORDER_ALERTS")));
            } else {
                TradeConfig.setDisplayOrderAlerts(Boolean.parseBoolean(prop.getProperty("displayOrderAlerts")));
            }
            if (System.getenv("WEB_INTERFACE") != null) {
                TradeConfig.setWebInterface(Integer.parseInt(System.getenv("WEB_INTERFACE")));
            } else {
                TradeConfig.setWebInterface(Integer.parseInt(prop.getProperty("webInterface")));
            }
            if (System.getenv("LIST_QUOTE_PRICE_CHANGE_FREQUENCY") != null) {
                TradeConfig.setListQuotePriceChangeFrequency(Integer.parseInt(System.getenv("LIST_QUOTE_PRICE_CHANGE_FREQUENCY")));
            } else {
                TradeConfig.setListQuotePriceChangeFrequency(Integer.parseInt(prop.getProperty("listQuotePriceChangeFrequency")));
            }
            TradeConfig.setPrimIterations(Integer.parseInt(prop.getProperty("primIterations")));
            TradeConfig.setMarketSummaryInterval(Integer.parseInt(prop.getProperty("marketSummaryInterval")));
            TradeConfig.setLongRun(Boolean.parseBoolean(prop.getProperty("longRun")));
        } catch (Exception e) {
            System.out.println("daytrader.properties not found");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void contextInitialized_fid3(ServletContextEvent event)
    {
        Log.trace("TradeWebContextListener contextInitialized_fid3 -- initializing TradeDirect");
        Properties prop = new Properties();
        InputStream stream = event.getServletContext().getResourceAsStream("/properties/daytrader.properties");
        try {
            prop.load(stream);
            System.out.println("Settings from daytrader.properties: " + prop);
            if (System.getenv("RUNTIME_MODE") != null) {
                TradeConfig.setRunTimeMode(Integer.parseInt(System.getenv("RUNTIME_MODE")));
            } else {
                TradeConfig.setRunTimeMode(Integer.parseInt(prop.getProperty("runtimeMode")));
            }
            System.out.print("Running in " + TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()] + " Mode");
            if (System.getenv("ORDER_PROCESSING_MODE") != null) {
                TradeConfig.setOrderProcessingMode(Integer.parseInt(System.getenv("ORDER_PROCESSING_MODE")));
            } else {
                TradeConfig.setOrderProcessingMode(Integer.parseInt(prop.getProperty("orderProcessingMode")));
            }
            System.out.print("Running in " + TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()] + " Order Processing Mode");
            if (System.getenv("MAX_USERS") != null) {
                TradeConfig.setMAX_USERS(Integer.parseInt(System.getenv("MAX_USERS")));
            } else {
                TradeConfig.setMAX_USERS(Integer.parseInt(prop.getProperty("maxUsers")));
            }
            System.out.print("MAX_USERS = " + TradeConfig.getMAX_USERS() + " users");
            if (System.getenv("MAX_QUOTES") != null) {
                TradeConfig.setMAX_QUOTES(Integer.parseInt(System.getenv("MAX_QUOTES")));
            } else {
                TradeConfig.setMAX_QUOTES(Integer.parseInt(prop.getProperty("maxQuotes")));
            }
            System.out.print("MAX_QUOTES = " + TradeConfig.getMAX_QUOTES() + " quotes");
            if (System.getenv("PUBLISH_QUOTES") != null) {
                TradeConfig.setPublishQuotePriceChange(Boolean.parseBoolean(System.getenv("PUBLISH_QUOTES")));
            } else {
                TradeConfig.setPublishQuotePriceChange(Boolean.parseBoolean(prop.getProperty("publishQuotePriceChange")));
            }
            if (System.getenv("DISPLAY_ORDER_ALERTS") != null) {
                TradeConfig.setDisplayOrderAlerts(Boolean.parseBoolean(System.getenv("DISPLAY_ORDER_ALERTS")));
            } else {
                TradeConfig.setDisplayOrderAlerts(Boolean.parseBoolean(prop.getProperty("displayOrderAlerts")));
            }
            if (System.getenv("WEB_INTERFACE") != null) {
                TradeConfig.setWebInterface(Integer.parseInt(System.getenv("WEB_INTERFACE")));
            } else {
                TradeConfig.setWebInterface(Integer.parseInt(prop.getProperty("webInterface")));
            }
            if (System.getenv("LIST_QUOTE_PRICE_CHANGE_FREQUENCY") != null) {
                TradeConfig.setListQuotePriceChangeFrequency(Integer.parseInt(System.getenv("LIST_QUOTE_PRICE_CHANGE_FREQUENCY")));
            } else {
                TradeConfig.setListQuotePriceChangeFrequency(Integer.parseInt(prop.getProperty("listQuotePriceChangeFrequency")));
            }
            TradeConfig.setPrimIterations(Integer.parseInt(prop.getProperty("primIterations")));
            TradeConfig.setMarketSummaryInterval(Integer.parseInt(prop.getProperty("marketSummaryInterval")));
            TradeConfig.setLongRun(Boolean.parseBoolean(prop.getProperty("longRun")));
        } catch (Exception e) {
            System.out.println("daytrader.properties not found");
        }
    }
}