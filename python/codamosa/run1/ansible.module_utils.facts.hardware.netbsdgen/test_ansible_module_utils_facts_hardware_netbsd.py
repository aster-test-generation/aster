# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.netbsd as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = 'KF+25P/D|HHuo'
    net_b_s_d_hardware_0 = module_0.NetBSDHardware(str_0)
    var_0 = net_b_s_d_hardware_0.get_cpu_facts()

def test_case_2():
    bool_0 = False
    bytes_0 = b'[\xbc\xc8\xd6\xb3\xf4\xec\xc8\xbfs\xe3X\xa5\xfb\x98\x82\xfaq\x1e'
    net_b_s_d_hardware_0 = module_0.NetBSDHardware(bool_0, bytes_0)
    var_0 = net_b_s_d_hardware_0.get_memory_facts()