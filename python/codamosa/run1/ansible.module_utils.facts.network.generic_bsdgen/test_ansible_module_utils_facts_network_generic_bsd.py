# Automatically generated by Pynguin.
import ansible.module_utils.facts.network.generic_bsd as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = 'J4dJ'
    bool_0 = True
    tuple_0 = (str_0, bool_0)
    dict_0 = {tuple_0: tuple_0, str_0: str_0, tuple_0: tuple_0, bool_0: bool_0}
    str_1 = 'kV)'
    generic_bsd_ifconfig_network_0 = module_0.GenericBsdIfconfigNetwork(bool_0)
    list_0 = [str_1, tuple_0, str_0, str_0]
    generic_bsd_ifconfig_network_1 = module_0.GenericBsdIfconfigNetwork(list_0)
    set_0 = {tuple_0, tuple_0}
    var_0 = generic_bsd_ifconfig_network_0.parse_unknown_line(list_0, dict_0, set_0)
    str_2 = 'dY~!E2$q4P!\x0ci40'
    generic_bsd_ifconfig_network_2 = module_0.GenericBsdIfconfigNetwork(str_2)
    var_1 = generic_bsd_ifconfig_network_0.parse_ether_line(dict_0, dict_0, tuple_0)

def test_case_2():
    str_0 = "|SpA'"
    set_0 = set()
    dict_0 = None
    list_0 = [set_0, str_0, dict_0, dict_0]
    tuple_0 = (str_0, set_0, list_0)
    float_0 = 1000.0
    set_1 = set()
    generic_bsd_ifconfig_network_0 = module_0.GenericBsdIfconfigNetwork(set_1)
    var_0 = generic_bsd_ifconfig_network_0.parse_unknown_line(tuple_0, float_0, dict_0)

def test_case_3():
    str_0 = 'v6'
    generic_bsd_ifconfig_network_0 = module_0.GenericBsdIfconfigNetwork(str_0)
    var_0 = generic_bsd_ifconfig_network_0.get_options(str_0)

def test_case_4():
    bool_0 = True
    generic_bsd_ifconfig_network_0 = module_0.GenericBsdIfconfigNetwork(bool_0)
    str_0 = "^_QHHWT7j\x0c&e=-uc'"
    var_0 = generic_bsd_ifconfig_network_0.merge_default_interface(str_0, bool_0, str_0)

def test_case_5():
    str_0 = 'N_|~Bg\x0cSj)=es\r)f\tvW'
    bytes_0 = b'j'
    generic_bsd_ifconfig_network_0 = module_0.GenericBsdIfconfigNetwork(bytes_0, bytes_0)
    var_0 = generic_bsd_ifconfig_network_0.parse_interface_line(str_0)

def test_case_6():
    bool_0 = False
    generic_bsd_ifconfig_network_0 = module_0.GenericBsdIfconfigNetwork(bool_0)
    str_0 = 'r&^ae[,"Q"\'!XVh/-AZG'
    str_1 = '4k:G-{k<[8@g2*'
    var_0 = generic_bsd_ifconfig_network_0.get_options(str_1)
    var_1 = generic_bsd_ifconfig_network_0.parse_interface_line(str_0)
    str_2 = "^_Q+HHT7j\x0c&e=W-uc'"
    str_3 = 'vn"E3Tw4#[.'
    var_2 = generic_bsd_ifconfig_network_0.merge_default_interface(str_2, bool_0, str_3)

def test_case_7():
    bool_0 = True
    generic_bsd_ifconfig_network_0 = module_0.GenericBsdIfconfigNetwork(bool_0)
    str_0 = 'r&^ae[,"Q"\'!XVh/-AZG'
    str_1 = '4k:G-{k<[>@g2*'
    var_0 = generic_bsd_ifconfig_network_0.get_options(str_1)
    var_1 = generic_bsd_ifconfig_network_0.parse_interface_line(str_0)