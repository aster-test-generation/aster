# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.aix as module_0

def test_case_0():
    try:
        float_0 = -1665.0
        a_i_x_hardware_0 = module_0.AIXHardware(float_0)
        var_0 = a_i_x_hardware_0.populate()
    except BaseException:
        pass

def test_case_1():
    try:
        bytes_0 = b'\xd6\xd1\xe6\x08\x88\xdc\x82\x11\xf4\xa7\xc0F\xd3S\x0e\xc8T\xde\x9d\xc2'
        a_i_x_hardware_0 = module_0.AIXHardware(bytes_0)
        var_0 = a_i_x_hardware_0.get_memory_facts()
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '!*,'
        bool_0 = False
        a_i_x_hardware_0 = module_0.AIXHardware(str_0, bool_0)
        var_0 = a_i_x_hardware_0.get_dmi_facts()
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b'+\x9c'
        int_0 = 1415
        a_i_x_hardware_collector_0 = module_0.AIXHardwareCollector(int_0)
        a_i_x_hardware_0 = module_0.AIXHardware(a_i_x_hardware_collector_0)
        a_i_x_hardware_1 = module_0.AIXHardware(bytes_0)
        var_0 = a_i_x_hardware_1.get_vgs_facts()
    except BaseException:
        pass

def test_case_4():
    try:
        a_i_x_hardware_collector_0 = module_0.AIXHardwareCollector()
        list_0 = [a_i_x_hardware_collector_0, a_i_x_hardware_collector_0, a_i_x_hardware_collector_0]
        tuple_0 = (list_0,)
        a_i_x_hardware_0 = module_0.AIXHardware(tuple_0)
        var_0 = a_i_x_hardware_0.get_mount_facts()
    except BaseException:
        pass

def test_case_5():
    try:
        int_0 = -3573
        bytes_0 = b'\xe5\x11\x1c\xbdI\x92\x97\x1e'
        tuple_0 = (bytes_0,)
        list_0 = [int_0, int_0, int_0, tuple_0]
        a_i_x_hardware_0 = module_0.AIXHardware(tuple_0, list_0)
        a_i_x_hardware_1 = module_0.AIXHardware(int_0, a_i_x_hardware_0)
        var_0 = a_i_x_hardware_1.get_device_facts()
    except BaseException:
        pass