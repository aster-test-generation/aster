# Automatically generated by Pynguin.
import ansible.plugins.action.yum as module_0

def test_case_0():
    try:
        dict_0 = {}
        int_0 = -2721
        bytes_0 = b'\x95\xb3uK\xd9'
        float_0 = -3557.4
        tuple_0 = ()
        bool_0 = False
        action_module_0 = module_0.ActionModule(dict_0, int_0, bytes_0, float_0, tuple_0, bool_0)
        float_1 = 0.0001
        action_module_1 = module_0.ActionModule(dict_0, dict_0, dict_0, action_module_0, float_1, bool_0)
        var_0 = action_module_1.run()
    except BaseException:
        pass