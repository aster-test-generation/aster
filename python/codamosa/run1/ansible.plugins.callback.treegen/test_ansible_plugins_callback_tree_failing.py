# Automatically generated by Pynguin.
import ansible.plugins.callback.tree as module_0

def test_case_0():
    try:
        bytes_0 = b'u]\xed\x11\xb3\x82\xd1u\x0e\x15\xd7\x02'
        str_0 = None
        int_0 = -2695
        float_0 = 1737.757
        tuple_0 = (str_0, int_0, float_0)
        tuple_1 = (bytes_0, str_0, int_0, tuple_0)
        str_1 = ''
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.set_options(tuple_1, str_1)
    except BaseException:
        pass

def test_case_1():
    try:
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.write_tree_file(callback_module_0, callback_module_0)
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = -643.132
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_unreachable(float_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'D'
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_failed(str_0)
    except BaseException:
        pass

def test_case_4():
    try:
        callback_module_0 = None
        callback_module_1 = module_0.CallbackModule()
        var_0 = callback_module_1.v2_runner_on_ok(callback_module_0)
    except BaseException:
        pass