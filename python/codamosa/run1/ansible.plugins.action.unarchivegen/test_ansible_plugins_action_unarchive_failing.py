# Automatically generated by Pynguin.
import ansible.plugins.action.unarchive as module_0

def test_case_0():
    try:
        int_0 = -702
        float_0 = 868.0
        bytes_0 = b'\\\xe0F\x8f\xee'
        str_0 = '\rSqc~h_rtGq\\NN=<k\r'
        bool_0 = False
        bytes_1 = b'\xe5\xe10\x86}<\xd6(p\x93\x15F'
        dict_0 = {bytes_0: str_0, str_0: float_0, str_0: bool_0}
        action_module_0 = module_0.ActionModule(int_0, bytes_0, str_0, bool_0, bytes_1, dict_0)
        str_1 = 'MnW`e='
        action_module_1 = module_0.ActionModule(int_0, float_0, action_module_0, float_0, dict_0, str_1)
        var_0 = action_module_1.run()
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = 1.5
        set_0 = {float_0, float_0, float_0}
        list_0 = [float_0, float_0]
        bytes_0 = b'\xe8\xc9\xed\xfee'
        float_1 = -124.03
        tuple_0 = (bytes_0, float_1)
        list_1 = [float_1, tuple_0, bytes_0]
        dict_0 = {}
        int_0 = 1487
        int_1 = -1108
        bool_0 = False
        str_0 = '-jl.<?`>u[kS~ly<`90l'
        str_1 = 'I;i,+{,JQ(qr+L'
        action_module_0 = module_0.ActionModule(dict_0, int_0, int_1, bool_0, str_0, str_1)
        action_module_1 = module_0.ActionModule(tuple_0, list_1, tuple_0, action_module_0, int_0, int_0)
        var_0 = action_module_1.run(set_0, list_0)
    except BaseException:
        pass