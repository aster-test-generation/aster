# Automatically generated by Pynguin.
import ansible.plugins.action.assert as module_0

def test_case_0():
    try:
        int_0 = -4444
        bytes_0 = b'&\xec\xb1vUL\x11r$c\xee\x87\x18\xb9'
        tuple_0 = ()
        str_0 = 'q"3nWnAt'
        action_module_0 = module_0.ActionModule(str_0, int_0, bytes_0, tuple_0, str_0, str_0)
        var_0 = action_module_0.run()
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = -431
        bytes_0 = b'&\xec\xb1vUL\x11r$c\xee\x87\x18\xb9'
        tuple_0 = ()
        str_0 = 'q"3uW})At'
        action_module_0 = module_0.ActionModule(str_0, int_0, bytes_0, tuple_0, str_0, str_0)
        var_0 = action_module_0.run(bytes_0, bytes_0)
    except BaseException:
        pass