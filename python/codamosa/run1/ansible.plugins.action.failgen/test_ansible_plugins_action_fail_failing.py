# Automatically generated by Pynguin.
import ansible.plugins.action.fail as module_0

def test_case_0():
    try:
        bytes_0 = b'\xe76M\xd1\xab\xb2DN\x18i'
        str_0 = 'vL(G&MBeB:L|YJd?GX'
        str_1 = 'cHx'
        str_2 = ''
        str_3 = '-[Y 2,s&\x0bK.ta\x0c'
        bool_0 = True
        dict_0 = {str_2: str_2}
        str_4 = '@~'
        float_0 = 3980.6638
        tuple_0 = (dict_0, str_4, float_0, str_3)
        action_module_0 = module_0.ActionModule(str_1, str_2, str_2, str_3, bool_0, tuple_0)
        var_0 = action_module_0.run(bytes_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = -1422
        str_0 = '} '
        list_0 = []
        float_0 = 512.0
        float_1 = -1639.898
        int_1 = -606
        bool_0 = True
        set_0 = set()
        bytes_0 = b'\xf1\xb16:\x94\x0eu\xa2]d\xd4\xc6_\\$'
        tuple_0 = (bytes_0,)
        bytes_1 = b'\ri\x19'
        action_module_0 = module_0.ActionModule(int_1, bool_0, set_0, tuple_0, bool_0, bytes_1)
        dict_0 = {float_1: int_1, float_0: tuple_0}
        action_module_1 = module_0.ActionModule(float_1, action_module_0, list_0, dict_0, bool_0, set_0)
        action_module_2 = module_0.ActionModule(int_0, str_0, list_0, float_0, list_0, action_module_1)
        var_0 = action_module_2.run()
    except BaseException:
        pass