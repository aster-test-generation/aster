# Automatically generated by Pynguin.
import mimesis.builtins.en as module_0

def test_case_0():
    try:
        u_s_a_spec_provider_0 = module_0.USASpecProvider()
        str_0 = u_s_a_spec_provider_0.tracking_number()
        str_1 = '\\*v\x0b}K4=Bc45%v1bZB'
        str_2 = u_s_a_spec_provider_0.ssn()
        u_s_a_spec_provider_1 = module_0.USASpecProvider()
        str_3 = u_s_a_spec_provider_1.tracking_number(str_1)
    except BaseException:
        pass