/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import java.util.regex.Matcher;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LoginValidator_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testValidate_MatcherDoesNotMatch_cSyG3_Wkoj0() throws ValidatorException {
    LoginValidator loginValidator = new LoginValidator();
    Matcher matcher = mock(Matcher.class);
    loginValidator.matcher = matcher;
    when(matcher.matches()).thenReturn(false);
    FacesContext facesContext = mock(FacesContext.class);
    UIComponent uiComponent = mock(UIComponent.class);
    Object value = "testValue";
    try {
        loginValidator.validate(facesContext, uiComponent, value);
        fail("Expected ValidatorException");
    } catch (ValidatorException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testValidate_MatcherMatches_vuFI2_VChf0() throws javax.faces.validator.ValidatorException {
    Matcher matcher = mock(Matcher.class);
    LoginValidator loginValidator = new LoginValidator();
    loginValidator.matcher = matcher;
    when(matcher.matches()).thenReturn(true);
    FacesContext facesContext = mock(FacesContext.class);
    UIComponent uiComponent = mock(UIComponent.class);
    Object value = "test";
    loginValidator.validate(facesContext, uiComponent, value);
    verify(facesContext, never()).addMessage(anyString(), any(FacesMessage.class));
    verifyNoMoreInteractions(facesContext, uiComponent, matcher);
}
}