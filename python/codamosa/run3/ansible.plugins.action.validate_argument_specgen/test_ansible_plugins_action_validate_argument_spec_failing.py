# Automatically generated by Pynguin.
import ansible.plugins.action.validate_argument_spec as module_0

def test_case_0():
    try:
        float_0 = -1065.52297
        set_0 = set()
        tuple_0 = ()
        set_1 = {tuple_0, tuple_0}
        str_0 = '3m0l\t7:2 zaQa`'
        float_1 = -731.5
        list_0 = None
        bool_0 = None
        float_2 = 77.81
        tuple_1 = (list_0, bool_0, float_2)
        action_module_0 = module_0.ActionModule(set_1, tuple_0, str_0, float_1, tuple_1, set_1)
        var_0 = action_module_0.get_args_from_task_vars(float_0, set_0)
    except BaseException:
        pass

def test_case_1():
    try:
        dict_0 = {}
        bytes_0 = b'V\xb7\x99\x9c\xddz`?\x90\x9bi\xfdQ0\x81w\xa9\xc1*\x93'
        int_0 = -1217
        tuple_0 = (int_0,)
        tuple_1 = (bytes_0, tuple_0)
        set_0 = {int_0, tuple_1, int_0}
        tuple_2 = (set_0, tuple_0)
        dict_1 = {}
        action_module_0 = module_0.ActionModule(tuple_1, tuple_2, bytes_0, dict_1, set_0, tuple_1)
        var_0 = action_module_0.run(dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = 1047.8312
        float_1 = -698.732
        dict_0 = {float_1: float_1}
        list_0 = [dict_0, dict_0, dict_0]
        tuple_0 = (float_1, list_0)
        int_0 = 153
        set_0 = set()
        str_0 = '+>S`x\x0c'
        bool_0 = False
        str_1 = 'J405_d~w\x0b;(&)oF\\4m'
        int_1 = 347
        bytes_0 = b'\n\xbb7.\x81i\x011\x8e'
        action_module_0 = module_0.ActionModule(str_1, str_1, dict_0, int_1, bytes_0, int_1)
        action_module_1 = module_0.ActionModule(set_0, bool_0, tuple_0, int_0, action_module_0, set_0)
        bool_1 = False
        float_2 = -865.389
        str_2 = 'lscfg'
        str_3 = ''
        action_module_2 = module_0.ActionModule(float_0, bool_1, float_2, str_2, str_3, list_0)
        var_0 = action_module_2.run(str_0, action_module_1)
    except BaseException:
        pass

def test_case_3():
    try:
        int_0 = 1946
        str_0 = '^P8 yDH\x0b7o327le^'
        float_0 = -5.047487
        tuple_0 = None
        complex_0 = None
        float_1 = 510.04968598365906
        action_module_0 = module_0.ActionModule(int_0, str_0, float_0, tuple_0, complex_0, float_1)
        dict_0 = {tuple_0: action_module_0, str_0: float_0}
        var_0 = action_module_0.get_args_from_task_vars(dict_0, int_0)
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = 1047.8312
        dict_0 = {float_0: float_0}
        list_0 = [dict_0, dict_0, dict_0]
        tuple_0 = (float_0, list_0)
        int_0 = 111
        set_0 = set()
        bool_0 = False
        str_0 = 'J405_d~w\x0b;(&)oF\\4m'
        bytes_0 = b'\n\xbb7.\x81i\x011\x8e'
        action_module_0 = module_0.ActionModule(str_0, str_0, dict_0, int_0, bytes_0, int_0)
        action_module_1 = module_0.ActionModule(set_0, bool_0, tuple_0, int_0, action_module_0, set_0)
        bool_1 = False
        float_1 = -865.389
        str_1 = 'lscfg'
        str_2 = ''
        action_module_2 = module_0.ActionModule(float_0, bool_1, float_1, str_1, str_2, list_0)
        var_0 = action_module_1.get_args_from_task_vars(dict_0, dict_0)
    except BaseException:
        pass

def test_case_5():
    try:
        float_0 = 1047.8312
        dict_0 = {float_0: float_0}
        list_0 = [dict_0, dict_0, dict_0]
        tuple_0 = (float_0, list_0)
        int_0 = 111
        set_0 = set()
        str_0 = 'J405_d~w\x0b;(&)oF\\4m'
        bytes_0 = b'\n\xbb7.\x81i\x011\x8e'
        int_1 = 604800
        dict_1 = {}
        list_1 = [dict_1, int_1]
        bool_0 = False
        action_module_0 = module_0.ActionModule(list_0, list_1, tuple_0, bytes_0, dict_0, bool_0)
        action_module_1 = module_0.ActionModule(tuple_0, str_0, int_1, action_module_0, set_0, action_module_0)
        float_1 = -865.389
        str_1 = ''
        str_2 = '4T'
        action_module_2 = module_0.ActionModule(str_1, str_2, int_0, float_0, list_0, float_1)
        var_0 = action_module_1.get_args_from_task_vars(dict_0, list_1)
    except BaseException:
        pass