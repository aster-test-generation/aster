# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.darwin as module_0

def test_case_0():
    try:
        darwin_hardware_collector_0 = module_0.DarwinHardwareCollector()
        bytes_0 = b'\xbe]#\x12\xa6n\x9d\xb3\xe0\x9c\xe8V\xe4P\xf3@'
        tuple_0 = (darwin_hardware_collector_0, bytes_0)
        darwin_hardware_0 = module_0.DarwinHardware(tuple_0)
        var_0 = darwin_hardware_0.populate()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '\ni6V'
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
        float_0 = -919.2
        str_1 = 'Unable to use "%s" as a search parameter: %s'
        darwin_hardware_collector_0 = module_0.DarwinHardwareCollector(float_0, str_1)
        darwin_hardware_0 = module_0.DarwinHardware(dict_0, darwin_hardware_collector_0)
        var_0 = darwin_hardware_0.get_system_profile()
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = True
        tuple_0 = (bool_0,)
        list_0 = []
        darwin_hardware_0 = module_0.DarwinHardware(tuple_0, list_0)
        var_0 = darwin_hardware_0.get_mac_facts()
    except BaseException:
        pass

def test_case_3():
    try:
        int_0 = -2485
        darwin_hardware_0 = module_0.DarwinHardware(int_0)
        var_0 = darwin_hardware_0.get_cpu_facts()
    except BaseException:
        pass

def test_case_4():
    try:
        bytes_0 = b'Q\x81[\xa7`\xf3\xe4\tr0\xdc\x00>ya'
        darwin_hardware_0 = module_0.DarwinHardware(bytes_0)
        var_0 = darwin_hardware_0.get_memory_facts()
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = '\x0bZ-Dx/AqXRJn/SX[\x0c'
        darwin_hardware_0 = module_0.DarwinHardware(str_0)
        var_0 = darwin_hardware_0.get_uptime_facts()
    except BaseException:
        pass