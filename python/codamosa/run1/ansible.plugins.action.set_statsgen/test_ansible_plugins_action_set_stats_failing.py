# Automatically generated by Pynguin.
import ansible.plugins.action.set_stats as module_0

def test_case_0():
    try:
        int_0 = 461
        bytes_0 = b'\x81\xf4 V{\xaaJFa\x0f'
        bytes_1 = b'h\x0f\xe6\xb2'
        dict_0 = {bytes_1: bytes_1}
        bool_0 = True
        tuple_0 = (bool_0, dict_0)
        list_0 = [tuple_0, bytes_1, bool_0]
        action_module_0 = module_0.ActionModule(bytes_1, dict_0, tuple_0, list_0, dict_0, bytes_1)
        var_0 = action_module_0.run(int_0, bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = 837.645857
        int_0 = 32602
        bool_0 = False
        dict_0 = {bool_0: int_0, int_0: int_0, bool_0: bool_0}
        tuple_0 = (bool_0, dict_0)
        int_1 = 6015
        str_0 = 'L|e"=n@!Xb{%La2smB'
        bool_1 = True
        action_module_0 = module_0.ActionModule(int_0, tuple_0, int_1, str_0, tuple_0, bool_1)
        var_0 = action_module_0.run(float_0)
    except BaseException:
        pass