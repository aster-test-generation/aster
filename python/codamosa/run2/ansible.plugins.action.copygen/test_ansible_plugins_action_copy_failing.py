# Automatically generated by Pynguin.
import ansible.plugins.action.copy as module_0

def test_case_0():
    try:
        bytes_0 = b'\xab$p"Lk\xb7>\x85\x15\xa4[\x9b\x06K\xeb\xb7\x10;'
        set_0 = {bytes_0, bytes_0}
        str_0 = 'ansible_job_id'
        bool_0 = True
        list_0 = [bytes_0, set_0]
        action_module_0 = module_0.ActionModule(bytes_0, set_0, str_0, set_0, bool_0, list_0)
        var_0 = action_module_0.run()
    except BaseException:
        pass

def test_case_1():
    try:
        bool_0 = True
        list_0 = [bool_0, bool_0]
        str_0 = '`n&) '
        str_1 = 'W%S+kdM{uQ@&at)T7fA'
        set_0 = {bool_0}
        dict_0 = {}
        action_module_0 = module_0.ActionModule(str_1, set_0, str_1, list_0, set_0, dict_0)
        var_0 = action_module_0.run(str_0, list_0)
    except BaseException:
        pass