# Automatically generated by Pynguin.
import ansible.plugins.action.debug as module_0

def test_case_0():
    try:
        list_0 = []
        bytes_0 = b''
        int_0 = 422
        action_module_0 = module_0.ActionModule(int_0, list_0, list_0, bytes_0, int_0, int_0)
        var_0 = action_module_0.run()
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = 620
        str_0 = '&S54'
        list_0 = [int_0, int_0]
        bool_0 = True
        str_1 = "$*5.Tg$*=yA'"
        action_module_0 = module_0.ActionModule(int_0, str_0, list_0, bool_0, list_0, str_1)
        bytes_0 = None
        str_2 = '- the configured path {0} does not exist.'
        var_0 = action_module_0.run(bytes_0, str_2)
    except BaseException:
        pass