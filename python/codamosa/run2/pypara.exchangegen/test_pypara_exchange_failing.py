# Automatically generated by Pynguin.
import pypara.exchange as module_0

def test_case_0():
    try:
        str_0 = '_Dcs6'
        str_1 = 'A@'
        list_0 = [str_0, str_0, str_1, str_1]
        f_x_rate_0 = module_0.FXRate(*list_0)
        f_x_rate_1 = f_x_rate_0.__invert__()
    except BaseException:
        pass