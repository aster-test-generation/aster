# Automatically generated by Pynguin.
import ansible.module_utils.facts.hardware.netbsd as module_0

def test_case_0():
    pass

def test_case_1():
    int_0 = 1279
    net_b_s_d_hardware_0 = module_0.NetBSDHardware(int_0)
    var_0 = net_b_s_d_hardware_0.get_cpu_facts()

def test_case_2():
    dict_0 = {}
    net_b_s_d_hardware_0 = module_0.NetBSDHardware(dict_0)
    var_0 = net_b_s_d_hardware_0.get_memory_facts()