# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.freebsd as module_0

def test_case_0():
    try:
        set_0 = None
        bytes_0 = b'\xd9\xf1\xaes'
        free_b_s_d_hardware_0 = module_0.FreeBSDHardware(bytes_0)
        var_0 = free_b_s_d_hardware_0.populate(set_0)
    except BaseException:
        pass

def test_case_1():
    try:
        free_b_s_d_hardware_collector_0 = module_0.FreeBSDHardwareCollector()
        bytes_0 = b'7pQ'
        float_0 = 1610.13602
        free_b_s_d_hardware_0 = module_0.FreeBSDHardware(bytes_0, float_0)
        var_0 = free_b_s_d_hardware_0.get_cpu_facts()
    except BaseException:
        pass

def test_case_2():
    try:
        free_b_s_d_hardware_collector_0 = module_0.FreeBSDHardwareCollector()
        int_0 = -2134
        int_1 = 2431
        free_b_s_d_hardware_collector_1 = module_0.FreeBSDHardwareCollector(int_1)
        dict_0 = {int_0: int_0, int_0: int_0}
        free_b_s_d_hardware_0 = module_0.FreeBSDHardware(dict_0)
        var_0 = free_b_s_d_hardware_0.get_device_facts()
        free_b_s_d_hardware_1 = module_0.FreeBSDHardware(free_b_s_d_hardware_0)
        var_1 = free_b_s_d_hardware_1.get_memory_facts()
    except BaseException:
        pass

def test_case_3():
    try:
        free_b_s_d_hardware_collector_0 = module_0.FreeBSDHardwareCollector()
        str_0 = '!'
        free_b_s_d_hardware_0 = module_0.FreeBSDHardware(str_0)
        var_0 = free_b_s_d_hardware_0.get_uptime_facts()
    except BaseException:
        pass

def test_case_4():
    try:
        free_b_s_d_hardware_collector_0 = module_0.FreeBSDHardwareCollector()
        free_b_s_d_hardware_collector_1 = module_0.FreeBSDHardwareCollector(free_b_s_d_hardware_collector_0)
        free_b_s_d_hardware_0 = module_0.FreeBSDHardware(free_b_s_d_hardware_collector_1)
        var_0 = free_b_s_d_hardware_0.get_dmi_facts()
    except BaseException:
        pass