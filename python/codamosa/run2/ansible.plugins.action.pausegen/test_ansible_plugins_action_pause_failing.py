# Automatically generated by Pynguin.
import ansible.plugins.action.pause as module_0

def test_case_0():
    try:
        str_0 = 'OracleLinux'
        list_0 = [str_0, str_0, str_0]
        set_0 = None
        var_0 = module_0.timeout_handler(list_0, set_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b'\x16\'\x88\x01\x13\xcd\xbb\x8d\r\nP\xa0"Yu'
        var_0 = module_0.clear_line(bytes_0)
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = -966.515
        var_0 = module_0.is_interactive(float_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = True
        bool_1 = True
        tuple_0 = (bool_0, bool_0, bool_1)
        set_0 = {bool_0, bool_1}
        bytes_0 = b''
        bytes_1 = b''
        str_0 = '0'
        action_module_0 = module_0.ActionModule(tuple_0, set_0, tuple_0, bytes_0, bytes_1, str_0)
        var_0 = action_module_0.run()
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'yra($wV\\GoZVn,o'
        list_0 = []
        str_1 = '\n    Transpose a list of arrays:\n    [1, 2, 3], [4, 5, 6] -> [1, 4], [2, 5], [3, 6]\n    Replace any empty spots in 2nd array with None:\n    [1, 2], [3] -> [1, 3], [2, None]\n    '
        dict_0 = {}
        bytes_0 = b'\x94l\xcb\x8f\x8e\x14\x9e'
        bytes_1 = b'O\x1f\xeb'
        tuple_0 = (bytes_1,)
        str_2 = 'F\x0bs'
        set_0 = {bytes_0, bytes_0, str_2}
        list_1 = [tuple_0]
        action_module_0 = module_0.ActionModule(str_1, dict_0, bytes_0, tuple_0, set_0, list_1)
        var_0 = action_module_0.run(str_0, list_0)
    except BaseException:
        pass

def test_case_5():
    try:
        var_0 = module_0.is_interactive()
        bytes_0 = b'F'
        bool_0 = True
        var_1 = module_0.is_interactive(bool_0)
        var_2 = module_0.is_interactive()
        var_3 = module_0.is_interactive(bool_0)
        var_4 = module_0.clear_line(bytes_0)
    except BaseException:
        pass

def test_case_6():
    try:
        var_0 = module_0.is_interactive()
        bool_0 = False
        var_1 = module_0.is_interactive(bool_0)
        var_2 = module_0.is_interactive()
        str_0 = '^p\rp(TIf=&L'
        var_3 = module_0.is_interactive(str_0)
    except BaseException:
        pass