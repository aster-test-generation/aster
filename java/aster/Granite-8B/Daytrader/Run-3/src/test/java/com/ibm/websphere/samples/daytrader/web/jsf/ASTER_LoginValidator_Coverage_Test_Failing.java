/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.util.concurrent.TimeUnit;
import javax.faces.validator.ValidatorException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_LoginValidator_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate2_Oqqy1() throws javax.faces.validator.ValidatorException {
        LoginValidator loginValidator = new LoginValidator();
        String value = "uid:12345678";
        try {
            loginValidator.validate(null, null, value);
            fail("Expected ValidatorException not thrown");
        } catch (ValidatorException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate3_qyPs2() throws javax.faces.validator.ValidatorException {
        LoginValidator loginValidator = new LoginValidator();
        String value = "uid:1234567890";
        try {
            loginValidator.validate(null, null, value);
            fail("Expected ValidatorException not thrown");
        } catch (ValidatorException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate4_vMZz3() throws javax.faces.validator.ValidatorException {
        LoginValidator loginValidator = new LoginValidator();
        String value = "uid:12345678901";
        try {
            loginValidator.validate(null, null, value);
            fail("Expected ValidatorException not thrown");
        } catch (ValidatorException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate5_vwhI4() throws javax.faces.validator.ValidatorException {
        LoginValidator loginValidator = new LoginValidator();
        String value = "uid:123456789012";
        try {
            loginValidator.validate(null, null, value);
            fail("Expected ValidatorException not thrown");
        } catch (ValidatorException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate6_IvCr5() throws javax.faces.validator.ValidatorException {
        LoginValidator loginValidator = new LoginValidator();
        String value = "uid:1234567890123";
        try {
            loginValidator.validate(null, null, value);
            fail("Expected ValidatorException not thrown");
        } catch (ValidatorException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate7_KNBW6() throws javax.faces.validator.ValidatorException {
        LoginValidator loginValidator = new LoginValidator();
        String value = "uid:12345678901234";
        try {
            loginValidator.validate(null, null, value);
            fail("Expected ValidatorException not thrown");
        } catch (ValidatorException e) {
        }
    }
}