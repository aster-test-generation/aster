# Automatically generated by Pynguin.
import ansible.executor.powershell.module_manifest as module_0

def test_case_0():
    try:
        p_s_module_dep_finder_0 = module_0.PSModuleDepFinder()
        var_0 = p_s_module_dep_finder_0.scan_exec_script(p_s_module_dep_finder_0)
    except BaseException:
        pass

def test_case_1():
    try:
        p_s_module_dep_finder_0 = module_0.PSModuleDepFinder()
        str_0 = 'mod1.Ssm1'
        bytes_0 = b'#Requires -Module Ansible.ModuleUtils.Util1\n#Requires -Module Ansible.ModuleUtils.Util2\n#Requires -Module Ansible.ModuleUtils.Util1'
        var_0 = p_s_module_dep_finder_0.scan_module(bytes_0, str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b''
        bool_0 = True
        tuple_0 = None
        p_s_module_dep_finder_0 = module_0.PSModuleDepFinder()
        var_0 = p_s_module_dep_finder_0.scan_module(bytes_0, bool_0, p_s_module_dep_finder_0, tuple_0)
        var_1 = p_s_module_dep_finder_0.scan_module(bytes_0, tuple_0, p_s_module_dep_finder_0)
        var_2 = p_s_module_dep_finder_0.scan_exec_script(p_s_module_dep_finder_0)
    except BaseException:
        pass