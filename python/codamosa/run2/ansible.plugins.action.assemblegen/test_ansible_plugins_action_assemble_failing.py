# Automatically generated by Pynguin.
import ansible.plugins.action.assemble as module_0

def test_case_0():
    try:
        bytes_0 = b'^'
        int_0 = -1387
        set_0 = {int_0, bytes_0, bytes_0}
        str_0 = 'interpreter disovery requir/d'
        action_module_0 = module_0.ActionModule(bytes_0, bytes_0, int_0, set_0, str_0, bytes_0)
        var_0 = action_module_0.run()
    except BaseException:
        pass