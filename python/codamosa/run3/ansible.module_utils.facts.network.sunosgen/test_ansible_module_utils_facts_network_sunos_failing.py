# Automatically generated by Pynguin.
import ansible.module_utils.facts.network.sunos as module_0

def test_case_0():
    try:
        tuple_0 = ()
        list_0 = [tuple_0, tuple_0, tuple_0]
        bytes_0 = b'k'
        sun_o_s_network_0 = module_0.SunOSNetwork(bytes_0)
        var_0 = sun_o_s_network_0.get_interfaces_info(list_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = 2178.239
        bytes_0 = b'/t\x0e.Q\xfa\xa6\xb2\xfe'
        int_0 = False
        bytes_1 = b'0:P\xe0x\x7ft\xea\x90'
        sun_o_s_network_collector_0 = module_0.SunOSNetworkCollector()
        dict_0 = {bytes_1: sun_o_s_network_collector_0, sun_o_s_network_collector_0: sun_o_s_network_collector_0}
        tuple_0 = (bytes_1, sun_o_s_network_collector_0, dict_0)
        sun_o_s_network_0 = module_0.SunOSNetwork(tuple_0)
        var_0 = sun_o_s_network_0.parse_ether_line(float_0, bytes_0, int_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = ':[G[hLt\x0bu[Z/\r2]tK7'
        set_0 = {str_0, str_0}
        int_0 = -1066
        sun_o_s_network_0 = module_0.SunOSNetwork(int_0)
        tuple_0 = ()
        sun_o_s_network_collector_0 = module_0.SunOSNetworkCollector()
        list_0 = [tuple_0, tuple_0, sun_o_s_network_collector_0, sun_o_s_network_collector_0]
        sun_o_s_network_1 = module_0.SunOSNetwork(list_0)
        var_0 = sun_o_s_network_1.parse_ether_line(str_0, set_0, sun_o_s_network_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'o-y5+\rQ/\rc|/~='
        bool_0 = True
        dict_0 = None
        int_0 = -5
        sun_o_s_network_0 = module_0.SunOSNetwork(str_0)
        tuple_0 = (sun_o_s_network_0,)
        sun_o_s_network_1 = module_0.SunOSNetwork(int_0, tuple_0)
        sun_o_s_network_collector_0 = module_0.SunOSNetworkCollector(bool_0, dict_0)
        sun_o_s_network_2 = module_0.SunOSNetwork(sun_o_s_network_collector_0)
        str_1 = 'S^J;\\xyByZ]F#*(_DG\x0bd'
        var_0 = sun_o_s_network_2.parse_interface_line(str_1, sun_o_s_network_collector_0, str_0)
    except BaseException:
        pass