# Automatically generated by Pynguin.
import ansible.cli.adhoc as module_0

def test_case_0():
    try:
        int_0 = 1458
        ad_hoc_c_l_i_0 = module_0.AdHocCLI(int_0)
        var_0 = ad_hoc_c_l_i_0.init_parser()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '6'
        str_1 = '+I5\\\x0b.|J{*:'
        ad_hoc_c_l_i_0 = module_0.AdHocCLI(str_0, str_1)
        var_0 = ad_hoc_c_l_i_0.init_parser()
        int_0 = 40
        tuple_0 = ()
        float_0 = 2589.9
        set_0 = {tuple_0, float_0}
        ad_hoc_c_l_i_1 = module_0.AdHocCLI(int_0, set_0)
        var_1 = ad_hoc_c_l_i_1.init_parser()
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b'\xb9\xac\xf5\x85\x9a\x87]X\xf7<'
        set_0 = {bytes_0}
        str_0 = '!53kdWj\\zNtyo1\x0b3-'
        ad_hoc_c_l_i_0 = module_0.AdHocCLI(str_0)
        var_0 = ad_hoc_c_l_i_0.post_process_args(set_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '('
        ad_hoc_c_l_i_0 = module_0.AdHocCLI(str_0)
        var_0 = ad_hoc_c_l_i_0.init_parser()
        var_1 = ad_hoc_c_l_i_0.post_process_args(str_0)
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = -313.31582
        bool_0 = True
        ad_hoc_c_l_i_0 = module_0.AdHocCLI(bool_0)
        ad_hoc_c_l_i_1 = module_0.AdHocCLI(ad_hoc_c_l_i_0)
        ad_hoc_c_l_i_2 = module_0.AdHocCLI(float_0)
        var_0 = ad_hoc_c_l_i_2.run()
    except BaseException:
        pass