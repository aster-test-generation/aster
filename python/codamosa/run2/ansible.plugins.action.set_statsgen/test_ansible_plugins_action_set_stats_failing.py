# Automatically generated by Pynguin.
import ansible.plugins.action.set_stats as module_0

def test_case_0():
    try:
        tuple_0 = ()
        list_0 = [tuple_0]
        str_0 = 'vM'
        tuple_1 = (tuple_0, list_0, str_0, str_0)
        int_0 = 401
        bool_0 = False
        bool_1 = True
        int_1 = -1675
        action_module_0 = module_0.ActionModule(tuple_1, int_0, bool_0, tuple_0, bool_1, int_1)
        var_0 = action_module_0.run()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '&E7p/H1psm'
        str_1 = '-$y=`~,<I3\x0b=^'
        bytes_0 = b'\x80\xf2G\xb4\x18'
        float_0 = 1090.54
        tuple_0 = ()
        set_0 = {tuple_0, bytes_0, tuple_0, tuple_0}
        float_1 = -2596.00823
        dict_0 = {tuple_0: bytes_0, float_1: float_0, float_1: float_0}
        action_module_0 = module_0.ActionModule(bytes_0, float_0, tuple_0, set_0, dict_0, set_0)
        bool_0 = False
        int_0 = -663
        action_module_1 = module_0.ActionModule(action_module_0, tuple_0, bool_0, int_0, bytes_0, set_0)
        tuple_1 = (action_module_1,)
        list_0 = [bytes_0]
        float_2 = -2604.31
        action_module_2 = module_0.ActionModule(bytes_0, action_module_0, float_0, dict_0, float_2, float_0)
        action_module_3 = module_0.ActionModule(tuple_1, list_0, list_0, bytes_0, bytes_0, action_module_0)
        var_0 = action_module_3.run(str_0, str_1)
    except BaseException:
        pass