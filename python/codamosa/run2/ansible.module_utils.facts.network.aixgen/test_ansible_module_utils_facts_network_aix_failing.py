# Automatically generated by Pynguin.
import ansible.module_utils.facts.network.aix as module_0

def test_case_0():
    try:
        a_i_x_network_collector_0 = module_0.AIXNetworkCollector()
        str_0 = 'NQ\x0bg;)) 2 \nzv'
        int_0 = -890
        a_i_x_network_0 = module_0.AIXNetwork(int_0)
        var_0 = a_i_x_network_0.get_default_interfaces(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = ';OJ<%`g;LJN}%gv'
        tuple_0 = ()
        a_i_x_network_0 = module_0.AIXNetwork(tuple_0)
        str_1 = '!vw~B/3wdJm8'
        var_0 = a_i_x_network_0.parse_interface_line(str_1)
        var_1 = a_i_x_network_0.get_interfaces_info(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        list_0 = []
        bytes_0 = b'\x1b\x8f\xd7\xfa\x9f\x18o\x9c\x94\xd4\x8e'
        a_i_x_network_0 = module_0.AIXNetwork(bytes_0)
        var_0 = a_i_x_network_0.parse_interface_line(list_0)
    except BaseException:
        pass