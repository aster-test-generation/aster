# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.hpux as module_0

def test_case_0():
    try:
        str_0 = 'QOLIA>t2x3[<=\t6#'
        h_p_u_x_hardware_0 = module_0.HPUXHardware(str_0)
        var_0 = h_p_u_x_hardware_0.populate()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '%s list-unit-files --no-pager --type service --all'
        h_p_u_x_hardware_0 = module_0.HPUXHardware(str_0)
        var_0 = h_p_u_x_hardware_0.get_hw_facts()
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '=?\noX\x0bDjOX\n#tP,'
        int_0 = -2146
        h_p_u_x_hardware_0 = module_0.HPUXHardware(int_0)
        h_p_u_x_hardware_1 = module_0.HPUXHardware(h_p_u_x_hardware_0)
        var_0 = h_p_u_x_hardware_1.get_cpu_facts(str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = False
        float_0 = -3319.0
        str_0 = None
        list_0 = []
        tuple_0 = ()
        tuple_1 = (list_0, tuple_0, bool_0, str_0)
        h_p_u_x_hardware_0 = module_0.HPUXHardware(tuple_1)
        var_0 = h_p_u_x_hardware_0.get_cpu_facts()
        h_p_u_x_hardware_1 = module_0.HPUXHardware(float_0, str_0)
        bool_1 = True
        h_p_u_x_hardware_2 = module_0.HPUXHardware(bool_1)
        var_1 = h_p_u_x_hardware_2.get_memory_facts(h_p_u_x_hardware_1)
    except BaseException:
        pass

def test_case_4():
    try:
        float_0 = 1446.4241
        h_p_u_x_hardware_collector_0 = module_0.HPUXHardwareCollector(float_0)
        str_0 = 'Sends a DELETE request. Returns :class:`HTTPResponse` object.\n\n        :arg url: URL to request\n        :kwargs \\*\\*kwargs: Optional arguments that ``open`` takes.\n        :returns: HTTPResponse\n        '
        bytes_0 = b'\x0bUl7\x8c\xf2\xc2\x82\rf\xa5\xeb\xbdo\x98\x97\n'
        tuple_0 = (str_0, bytes_0)
        bytes_1 = b'\x02J\xd3`\x8fo\x98n\x85\x10\xdeWP\xba\x9a\x9b\x84h\x93'
        h_p_u_x_hardware_0 = module_0.HPUXHardware(bytes_1)
        h_p_u_x_hardware_1 = module_0.HPUXHardware(h_p_u_x_hardware_0)
        var_0 = h_p_u_x_hardware_1.get_hw_facts(tuple_0)
    except BaseException:
        pass