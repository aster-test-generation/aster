# Automatically generated by Pynguin.
import ansible.plugins.action.pause as module_0

def test_case_0():
    try:
        bool_0 = True
        str_0 = 'ER#\t)9jHL#1`'
        str_1 = 'p(S3'
        set_0 = {str_0}
        float_0 = -825.22
        str_2 = None
        int_0 = -1169
        action_module_0 = module_0.ActionModule(str_0, str_1, set_0, float_0, str_2, int_0)
        str_3 = ',fxlQ'
        dict_0 = {bool_0: bool_0, bool_0: str_3}
        var_0 = module_0.timeout_handler(bool_0, dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = -1581.89
        set_0 = {float_0, float_0, float_0}
        var_0 = module_0.clear_line(set_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = -1568
        ansible_timeout_exceeded_0 = module_0.AnsibleTimeoutExceeded()
        list_0 = [int_0, int_0, int_0]
        var_0 = module_0.is_interactive(list_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = True
        var_0 = module_0.is_interactive(bool_0)
        bytes_0 = b''
        var_1 = module_0.is_interactive()
        dict_0 = {}
        str_0 = " Y?''"
        int_0 = 1879
        list_0 = [dict_0, str_0, dict_0]
        action_module_0 = module_0.ActionModule(dict_0, str_0, dict_0, int_0, list_0, bytes_0)
        str_1 = 'Operation\\s+?timed\\s+?out'
        set_0 = None
        tuple_0 = (bytes_0, set_0, bool_0, set_0)
        ansible_timeout_exceeded_0 = module_0.AnsibleTimeoutExceeded()
        tuple_1 = (tuple_0, ansible_timeout_exceeded_0)
        action_module_1 = module_0.ActionModule(action_module_0, str_1, action_module_0, tuple_1, bytes_0, int_0)
        var_2 = action_module_1.run()
    except BaseException:
        pass

def test_case_4():
    try:
        list_0 = []
        ansible_timeout_exceeded_0 = module_0.AnsibleTimeoutExceeded(*list_0)
        int_0 = -948
        list_1 = [list_0]
        bool_0 = False
        set_0 = set()
        action_module_0 = module_0.ActionModule(ansible_timeout_exceeded_0, int_0, list_1, list_0, bool_0, set_0)
        var_0 = action_module_0.run()
    except BaseException:
        pass

def test_case_5():
    try:
        float_0 = None
        int_0 = -916
        set_0 = set()
        list_0 = [set_0, float_0, int_0, float_0]
        bool_0 = False
        tuple_0 = (bool_0, list_0)
        bool_1 = True
        str_0 = '.lD4\t?W%kT(AFJ'
        dict_0 = {}
        bool_2 = False
        dict_1 = {}
        action_module_0 = module_0.ActionModule(str_0, dict_0, tuple_0, set_0, bool_2, dict_1)
        var_0 = action_module_0.run(bool_0, bool_1)
    except BaseException:
        pass

def test_case_6():
    try:
        bool_0 = False
        var_0 = module_0.is_interactive(bool_0)
        bytes_0 = b''
        var_1 = module_0.is_interactive()
        ansible_timeout_exceeded_0 = module_0.AnsibleTimeoutExceeded()
        str_0 = None
        str_1 = 'Zx=E1M<`W/\tM\x0cG"!'
        dict_0 = {str_0: str_0, str_0: str_0, str_1: str_0, str_0: str_0}
        var_2 = module_0.is_interactive()
        var_3 = module_0.is_interactive()
        var_4 = module_0.timeout_handler(bytes_0, dict_0)
    except BaseException:
        pass