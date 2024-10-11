# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.hpux as module_0

def test_case_0():
    try:
        float_0 = 471.55836
        h_p_u_x_hardware_0 = module_0.HPUXHardware(float_0)
        var_0 = h_p_u_x_hardware_0.populate()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'ansible_architecture'
        str_1 = 'ansible_distribution_version'
        str_2 = 'ia64'
        str_3 = 'B4.11.23'
        str_4 = {str_0: str_2, str_1: str_3}
        h_p_u_x_hardware_0 = module_0.HPUXHardware(str_1)
        var_0 = h_p_u_x_hardware_0.get_cpu_facts(str_4)
        var_1 = h_p_u_x_hardware_0.get_hw_facts()
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = True
        list_0 = [bool_0, bool_0, bool_0, bool_0]
        h_p_u_x_hardware_0 = module_0.HPUXHardware(bool_0)
        var_0 = h_p_u_x_hardware_0.get_memory_facts(list_0)
    except BaseException:
        pass

def test_case_3():
    try:
        var_0 = None
        str_0 = 'ansible_architecture'
        str_1 = 'ansible_distribution_version'
        str_2 = 'ia64'
        str_3 = 'B4.11.23'
        str_4 = {str_0: str_2, str_1: str_3}
        h_p_u_x_hardware_0 = module_0.HPUXHardware(var_0)
        var_1 = h_p_u_x_hardware_0.get_cpu_facts(str_4)
        var_2 = h_p_u_x_hardware_0.get_hw_facts(h_p_u_x_hardware_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'ansible_architecture'
        str_1 = 'ansible_distribution_version'
        str_2 = 'ia64'
        str_3 = 'B.11.23'
        str_4 = {str_0: str_2, str_1: str_3}
        h_p_u_x_hardware_0 = module_0.HPUXHardware(str_3)
        var_0 = h_p_u_x_hardware_0.get_cpu_facts(str_4)
    except BaseException:
        pass