# Automatically generated by Pynguin.
import ansible.errors as module_0
import ansible.plugins.action.include_vars as module_1

def test_case_0():
    try:
        ansible_error_0 = module_0.AnsibleError()
        str_0 = '!&z1le33RgX^p'
        bool_0 = False
        action_module_0 = module_1.ActionModule(ansible_error_0, str_0, ansible_error_0, bool_0, str_0, bool_0)
        var_0 = action_module_0.run()
    except BaseException:
        pass

def test_case_1():
    try:
        ansible_error_0 = module_0.AnsibleError()
        str_0 = 'tl-%&;q$:\x0bm'
        set_0 = {ansible_error_0, str_0, ansible_error_0, str_0, str_0}
        bool_0 = True
        action_module_0 = module_1.ActionModule(ansible_error_0, str_0, set_0, bool_0, str_0, bool_0)
        var_0 = action_module_0.run(set_0, set_0)
    except BaseException:
        pass