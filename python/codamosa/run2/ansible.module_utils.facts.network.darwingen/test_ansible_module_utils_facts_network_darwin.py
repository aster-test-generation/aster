# Automatically generated by Pynguin.
import ansible.module_utils.facts.network.darwin as module_0

def test_case_0():
    darwin_network_collector_0 = module_0.DarwinNetworkCollector()

def test_case_1():
    str_0 = 'type>'
    str_1 = 'opt1'
    str_2 = 'opt2'
    str_3 = [str_1, str_0, str_0, str_1, str_2]
    str_4 = 'name'
    str_5 = {str_4: str_3}
    darwin_network_0 = module_0.DarwinNetwork(str_5, str_2)
    var_0 = darwin_network_0.parse_media_line(str_3, str_5, str_5)

def test_case_2():
    str_0 = 'media'
    str_1 = 'autoelect'
    str_2 = [str_0, str_1]
    var_0 = {}
    darwin_network_0 = module_0.DarwinNetwork(str_2, str_2)
    var_1 = darwin_network_0.parse_media_line(str_2, var_0, darwin_network_0)
    str_3 = [str_0, str_1, str_1]
    var_2 = {}
    var_3 = {}
    darwin_network_1 = module_0.DarwinNetwork(var_0, var_0)
    var_4 = darwin_network_1.parse_media_line(str_3, var_2, var_3)
    str_4 = '<unknown'
    str_5 = 'type>'
    str_6 = [str_0, str_4, str_5]
    var_5 = {}
    darwin_network_2 = module_0.DarwinNetwork(darwin_network_1, darwin_network_1)
    var_6 = darwin_network_2.parse_media_line(str_6, var_5, str_3)

def test_case_3():
    var_0 = {}
    str_0 = 'foo'
    darwin_network_0 = module_0.DarwinNetwork(var_0, var_0)
    str_1 = '<unknown'
    str_2 = 'type>'
    str_3 = [str_2, str_1, str_2]
    var_1 = {}
    var_2 = {}
    tuple_0 = None
    darwin_network_1 = module_0.DarwinNetwork(tuple_0, tuple_0)
    darwin_network_2 = module_0.DarwinNetwork(str_0, str_0)
    var_3 = darwin_network_2.parse_media_line(str_3, var_1, var_2)