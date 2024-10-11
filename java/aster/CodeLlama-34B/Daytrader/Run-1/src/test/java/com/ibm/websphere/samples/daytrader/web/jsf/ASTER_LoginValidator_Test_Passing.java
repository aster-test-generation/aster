/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.util.concurrent.TimeUnit;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_LoginValidator_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testValidate_ValidUsername_naWW0() {
    LoginValidator validator = new LoginValidator();
    FacesContext context = mock(FacesContext.class);
    UIComponent component = mock(UIComponent.class);
    Object value = "uid:1234";
    validator.validate(context, component, value);
    assertTrue(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testValidate_InvalidUsername_FjfH1() {
    LoginValidator validator = new LoginValidator();
    FacesContext context = mock(FacesContext.class);
    UIComponent component = mock(UIComponent.class);
    Object value = "uid:";
    try {
      validator.validate(context, component, value);
      fail("Expected ValidatorException to be thrown");
    } catch (ValidatorException e) {
      assertTrue(e instanceof ValidatorException);
    }
  }
}