# Automatically generated by Pynguin.
import ansible.plugins.callback.oneline as module_0

def test_case_0():
    try:
        float_0 = -1472.0
        str_0 = 'service_enable_rcconf() requires rcconf_file, rcconf_key and rcconf_value'
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_failed(float_0, str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        callback_module_0 = module_0.CallbackModule()
        dict_0 = {}
        var_0 = callback_module_0.v2_runner_on_ok(dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        callback_module_0 = module_0.CallbackModule()
        callback_module_1 = module_0.CallbackModule()
        var_0 = callback_module_1.v2_runner_on_unreachable(callback_module_0)
    except BaseException:
        pass

def test_case_3():
    try:
        dict_0 = {}
        callback_module_0 = module_0.CallbackModule()
        var_0 = callback_module_0.v2_runner_on_skipped(dict_0)
    except BaseException:
        pass