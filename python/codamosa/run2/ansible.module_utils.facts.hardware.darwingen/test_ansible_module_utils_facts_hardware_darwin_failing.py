# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.darwin as module_0

def test_case_0():
    try:
        int_0 = 419
        str_0 = 'O[P@K!sYp|M`:H]R[\ng'
        str_1 = '\r[e\tA.N\n\n L+'
        darwin_hardware_0 = module_0.DarwinHardware(str_0, str_1)
        var_0 = darwin_hardware_0.populate(int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = -1819.749574
        str_0 = '{lQPu,7TQH\x0b_'
        str_1 = 'L,'
        dict_0 = {str_1: str_1, float_0: str_0}
        darwin_hardware_0 = module_0.DarwinHardware(dict_0)
        var_0 = darwin_hardware_0.get_system_profile()
    except BaseException:
        pass

def test_case_2():
    try:
        darwin_hardware_collector_0 = module_0.DarwinHardwareCollector()
        darwin_hardware_0 = module_0.DarwinHardware(darwin_hardware_collector_0)
        var_0 = darwin_hardware_0.get_mac_facts()
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '#$Bz-\\^'
        set_0 = {str_0, str_0}
        darwin_hardware_0 = module_0.DarwinHardware(set_0)
        set_1 = {str_0, darwin_hardware_0}
        darwin_hardware_collector_0 = module_0.DarwinHardwareCollector(set_1)
        var_0 = darwin_hardware_0.get_cpu_facts()
    except BaseException:
        pass

def test_case_4():
    try:
        darwin_hardware_collector_0 = module_0.DarwinHardwareCollector()
        darwin_hardware_0 = module_0.DarwinHardware(darwin_hardware_collector_0)
        var_0 = darwin_hardware_0.get_memory_facts()
    except BaseException:
        pass

def test_case_5():
    try:
        darwin_hardware_collector_0 = None
        dict_0 = {darwin_hardware_collector_0: darwin_hardware_collector_0}
        darwin_hardware_collector_1 = module_0.DarwinHardwareCollector(dict_0)
        darwin_hardware_0 = module_0.DarwinHardware(darwin_hardware_collector_1)
        str_0 = 'local_action'
        darwin_hardware_1 = module_0.DarwinHardware(str_0)
        var_0 = darwin_hardware_1.get_uptime_facts()
    except BaseException:
        pass