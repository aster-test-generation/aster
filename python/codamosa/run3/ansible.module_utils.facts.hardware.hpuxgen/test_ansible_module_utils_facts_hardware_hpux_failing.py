# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.hpux as module_0

def test_case_0():
    try:
        float_0 = -1368.6
        h_p_u_x_hardware_0 = module_0.HPUXHardware(float_0)
        var_0 = h_p_u_x_hardware_0.populate()
    except BaseException:
        pass

def test_case_1():
    try:
        h_p_u_x_hardware_collector_0 = module_0.HPUXHardwareCollector()
        h_p_u_x_hardware_0 = module_0.HPUXHardware(h_p_u_x_hardware_collector_0)
        var_0 = h_p_u_x_hardware_0.get_hw_facts()
    except BaseException:
        pass

def test_case_2():
    try:
        var_0 = None
        h_p_u_x_hardware_0 = module_0.HPUXHardware(var_0)
        str_0 = 'ansible_architecture'
        str_1 = 'ansible_distribution_version'
        str_2 = 'ia64'
        str_3 = 'B.11.31'
        str_4 = {str_0: str_2, str_1: str_3}
        var_1 = h_p_u_x_hardware_0.get_cpu_facts(str_4)
    except BaseException:
        pass

def test_case_3():
    try:
        float_0 = 1000.0
        str_0 = 'token'
        tuple_0 = (float_0, str_0)
        tuple_1 = (tuple_0,)
        h_p_u_x_hardware_collector_0 = module_0.HPUXHardwareCollector()
        h_p_u_x_hardware_0 = module_0.HPUXHardware(h_p_u_x_hardware_collector_0)
        set_0 = {h_p_u_x_hardware_0, h_p_u_x_hardware_collector_0, h_p_u_x_hardware_collector_0}
        list_0 = [set_0, h_p_u_x_hardware_collector_0, h_p_u_x_hardware_collector_0, set_0]
        list_1 = [list_0, h_p_u_x_hardware_collector_0, list_0, h_p_u_x_hardware_collector_0]
        float_1 = 3044.98861
        h_p_u_x_hardware_1 = module_0.HPUXHardware(list_1, float_1)
        var_0 = h_p_u_x_hardware_1.get_memory_facts(tuple_1)
    except BaseException:
        pass

def test_case_4():
    try:
        dict_0 = {}
        list_0 = [dict_0, dict_0]
        int_0 = -2264
        h_p_u_x_hardware_0 = module_0.HPUXHardware(int_0)
        var_0 = h_p_u_x_hardware_0.get_hw_facts(list_0)
    except BaseException:
        pass

def test_case_5():
    try:
        var_0 = None
        h_p_u_x_hardware_0 = module_0.HPUXHardware(var_0)
        str_0 = 'ansible_architecture'
        str_1 = 'ia64'
        str_2 = 'ansible_machine'
        str_3 = {str_0: str_1, str_1: str_1, str_2: str_1}
        var_1 = h_p_u_x_hardware_0.get_cpu_facts(str_3)
    except BaseException:
        pass