# Automatically generated by Pynguin.
import ansible.module_utils.facts.network.hurd as module_0

def test_case_0():
    try:
        int_0 = -67
        dict_0 = {int_0: int_0, int_0: int_0}
        hurd_network_collector_0 = module_0.HurdNetworkCollector()
        hurd_pfinet_network_0 = module_0.HurdPfinetNetwork(hurd_network_collector_0)
        var_0 = hurd_pfinet_network_0.assign_network_facts(int_0, int_0, dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = -2230.0896
        dict_0 = {float_0: float_0, float_0: float_0}
        hurd_pfinet_network_0 = module_0.HurdPfinetNetwork(dict_0)
        var_0 = hurd_pfinet_network_0.populate()
    except BaseException:
        pass