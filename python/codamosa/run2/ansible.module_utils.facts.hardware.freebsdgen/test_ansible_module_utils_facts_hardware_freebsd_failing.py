# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.freebsd as module_0

def test_case_0():
    try:
        str_0 = "cal'ing kinit with pexpect for principal %s"
        free_b_s_d_hardware_0 = module_0.FreeBSDHardware(str_0)
        var_0 = free_b_s_d_hardware_0.populate()
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = 1276.505175
        free_b_s_d_hardware_0 = module_0.FreeBSDHardware(float_0)
        var_0 = free_b_s_d_hardware_0.get_memory_facts()
    except BaseException:
        pass

def test_case_2():
    try:
        free_b_s_d_hardware_collector_0 = module_0.FreeBSDHardwareCollector()
        bool_0 = True
        free_b_s_d_hardware_0 = module_0.FreeBSDHardware(bool_0)
        free_b_s_d_hardware_1 = module_0.FreeBSDHardware(free_b_s_d_hardware_collector_0)
        var_0 = free_b_s_d_hardware_1.get_uptime_facts()
    except BaseException:
        pass

def test_case_3():
    try:
        int_0 = 2169
        str_0 = ',j!'
        list_0 = [str_0]
        list_1 = [int_0, int_0, list_0]
        list_2 = [list_1, int_0, list_0]
        free_b_s_d_hardware_0 = module_0.FreeBSDHardware(int_0, list_2)
        var_0 = free_b_s_d_hardware_0.get_dmi_facts()
    except BaseException:
        pass