# Automatically generated by Pynguin.
import ansible.module_utils.facts.network.hurd as module_0

def test_case_0():
    try:
        str_0 = '85r?ts'
        bytes_0 = b'Z'
        float_0 = None
        bool_0 = False
        hurd_pfinet_network_0 = module_0.HurdPfinetNetwork(bool_0)
        var_0 = hurd_pfinet_network_0.assign_network_facts(str_0, bytes_0, float_0)
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = 1
        hurd_pfinet_network_0 = module_0.HurdPfinetNetwork(int_0)
        var_0 = hurd_pfinet_network_0.populate()
    except BaseException:
        pass