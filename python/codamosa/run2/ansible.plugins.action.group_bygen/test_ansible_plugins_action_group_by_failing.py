# Automatically generated by Pynguin.
import ansible.plugins.action.group_by as module_0

def test_case_0():
    try:
        bool_0 = True
        float_0 = -2656.82543
        list_0 = []
        bytes_0 = b'\x0bu\x0b\xe0e\xd6_\xfel\x17\xa6+V\x8d'
        str_0 = 'network_cli'
        action_module_0 = module_0.ActionModule(bool_0, float_0, list_0, bytes_0, float_0, str_0)
        var_0 = action_module_0.run()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'ES'
        str_1 = '#VdI'
        float_0 = -1399.1
        bytes_0 = b'm'
        tuple_0 = ()
        set_0 = None
        action_module_0 = module_0.ActionModule(str_0, str_1, float_0, bytes_0, tuple_0, set_0)
        int_0 = -65
        tuple_1 = (action_module_0, int_0, float_0)
        list_0 = []
        str_2 = 'e[4vJKpuD-h-XxFd(HO'
        dict_0 = {str_2: str_2, str_2: str_2, str_2: str_2}
        str_3 = 'x"$6*\ti3Pq=@'
        float_1 = -1924.08648
        float_2 = 3147.72
        str_4 = 'Vn >rx?1'
        str_5 = ';J`G#E\r'
        bytes_1 = b'9\x88\x8en\x92\xb3\xbb'
        int_1 = 1753
        action_module_1 = module_0.ActionModule(str_5, bytes_1, float_1, dict_0, dict_0, int_1)
        tuple_2 = (action_module_1, bytes_1, str_3)
        action_module_2 = module_0.ActionModule(str_3, float_1, dict_0, float_2, str_4, tuple_2)
        dict_1 = {str_2: tuple_2}
        action_module_3 = module_0.ActionModule(dict_0, action_module_2, dict_1, dict_0, str_3, str_5)
        var_0 = action_module_3.run(tuple_1, list_0)
    except BaseException:
        pass