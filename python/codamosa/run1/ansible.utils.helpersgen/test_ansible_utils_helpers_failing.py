# Automatically generated by Pynguin.
import ansible.utils.helpers as module_0

def test_case_0():
    try:
        str_0 = 'K$kgW{'
        str_1 = '3`{0JLU%'
        dict_0 = {str_1: str_1}
        var_0 = module_0.pct_to_int(str_0, str_1, dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'im+g'
        var_0 = module_0.object_to_dict(str_0)
        var_1 = module_0.deduplicate_list(str_0)
        float_0 = -2199.3283572898467
        list_0 = [str_0, float_0]
        var_2 = module_0.object_to_dict(float_0, list_0)
        bytes_0 = b"\xb1\x15\xe1\x01/\xe2-Tv\xd2\x90(\x8b\xf1\xdd'F\xd3"
        var_3 = module_0.deduplicate_list(bytes_0)
        int_0 = 1274
        var_4 = module_0.object_to_dict(float_0, int_0)
        var_5 = module_0.object_to_dict(float_0)
        str_1 = 'z=UCh3`,b\t9Z#Q*%'
        bool_0 = False
        var_6 = module_0.pct_to_int(str_1, bool_0)
    except BaseException:
        pass