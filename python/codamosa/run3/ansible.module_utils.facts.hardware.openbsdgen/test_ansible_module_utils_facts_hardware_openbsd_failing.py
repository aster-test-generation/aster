# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.openbsd as module_0

def test_case_0():
    try:
        bool_0 = True
        open_b_s_d_hardware_0 = module_0.OpenBSDHardware(bool_0)
        var_0 = open_b_s_d_hardware_0.populate()
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = 590
        float_0 = -427.353858
        open_b_s_d_hardware_0 = module_0.OpenBSDHardware(int_0, float_0)
        var_0 = open_b_s_d_hardware_0.get_memory_facts()
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = 100.0
        open_b_s_d_hardware_0 = module_0.OpenBSDHardware(float_0)
        open_b_s_d_hardware_collector_0 = module_0.OpenBSDHardwareCollector()
        var_0 = open_b_s_d_hardware_0.get_uptime_facts()
    except BaseException:
        pass

def test_case_3():
    try:
        int_0 = 2870
        open_b_s_d_hardware_0 = module_0.OpenBSDHardware(int_0)
        var_0 = open_b_s_d_hardware_0.get_processor_facts()
    except BaseException:
        pass

def test_case_4():
    try:
        list_0 = []
        open_b_s_d_hardware_0 = module_0.OpenBSDHardware(list_0)
        var_0 = open_b_s_d_hardware_0.get_device_facts()
    except BaseException:
        pass

def test_case_5():
    try:
        float_0 = -3744.2834
        open_b_s_d_hardware_0 = module_0.OpenBSDHardware(float_0)
        var_0 = open_b_s_d_hardware_0.get_dmi_facts()
    except BaseException:
        pass