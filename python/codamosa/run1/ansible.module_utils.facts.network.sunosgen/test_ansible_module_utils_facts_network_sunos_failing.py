# Automatically generated by Pynguin.
import ansible.module_utils.facts.network.sunos as module_0

def test_case_0():
    try:
        set_0 = set()
        sun_o_s_network_0 = module_0.SunOSNetwork(set_0)
        str_0 = 'internal error: aliases must be a list or tuple'
        bool_0 = None
        set_1 = set()
        sun_o_s_network_collector_0 = module_0.SunOSNetworkCollector()
        tuple_0 = (str_0, bool_0, set_1, sun_o_s_network_collector_0)
        sun_o_s_network_1 = module_0.SunOSNetwork(tuple_0)
        var_0 = sun_o_s_network_1.get_interfaces_info(sun_o_s_network_0)
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = 2
        bool_0 = True
        bytes_0 = b''
        dict_0 = {bool_0: bool_0, bytes_0: int_0, int_0: bool_0, int_0: bytes_0}
        sun_o_s_network_0 = module_0.SunOSNetwork(dict_0)
        str_0 = 'i*}\t&'
        sun_o_s_network_collector_0 = module_0.SunOSNetworkCollector()
        set_0 = {int_0, bool_0}
        sun_o_s_network_1 = module_0.SunOSNetwork(sun_o_s_network_collector_0, set_0)
        str_1 = 'EkKK:u:w'
        bool_1 = False
        sun_o_s_network_2 = module_0.SunOSNetwork(bool_1)
        var_0 = sun_o_s_network_2.parse_interface_line(str_0, sun_o_s_network_1, str_1)
    except BaseException:
        pass

def test_case_2():
    try:
        var_0 = {}
        sun_o_s_network_0 = module_0.SunOSNetwork(var_0)
        str_0 = 'flags=2001000849<UP,LOOPBACK,RUNNING,MULTICAST,IPv4,VIRTUAL>'
        str_1 = [str_0, str_0]
        var_1 = sun_o_s_network_0.parse_interface_line(str_1, str_1, var_0)
    except BaseException:
        pass

def test_case_3():
    try:
        float_0 = 1783.43
        str_0 = ']\x0cF7:/&T(`8,ZV%iy'
        list_0 = None
        sun_o_s_network_0 = module_0.SunOSNetwork(float_0)
        var_0 = sun_o_s_network_0.parse_ether_line(float_0, str_0, list_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bytes_0 = None
        dict_0 = {bytes_0: bytes_0}
        str_0 = 'YW)RUDD#Q;\n'
        bool_0 = True
        tuple_0 = (bytes_0, dict_0, str_0, bool_0)
        sun_o_s_network_0 = module_0.SunOSNetwork(tuple_0)
        sun_o_s_network_1 = module_0.SunOSNetwork(dict_0)
        sun_o_s_network_collector_0 = None
        var_0 = sun_o_s_network_0.parse_ether_line(str_0, tuple_0, sun_o_s_network_collector_0)
    except BaseException:
        pass

def test_case_5():
    try:
        var_0 = {}
        sun_o_s_network_0 = module_0.SunOSNetwork(var_0)
        str_0 = 'flags=2001000849<UPLOOPBACK,RUNNING,MULTICAST,IPv4,VIRTUAL>'
        str_1 = [str_0, str_0]
        var_1 = sun_o_s_network_0.parse_interface_line(str_1, str_1, var_0)
    except BaseException:
        pass