# Automatically generated by Pynguin.
import ansible.module_utils.facts.network.darwin as module_0

def test_case_0():
    try:
        str_0 = '<claimed'
        str_1 = 'type>'
        str_2 = [str_1, str_1, str_1]
        str_3 = '!% h'
        str_4 = {str_3: str_0}
        darwin_network_0 = module_0.DarwinNetwork(str_4, str_4)
        var_0 = darwin_network_0.parse_media_line(str_2, str_4, str_4)
        darwin_network_collector_0 = module_0.DarwinNetworkCollector()
        str_5 = 'B~Pr$`\r.'
        var_1 = darwin_network_0.parse_media_line(darwin_network_collector_0, str_5, darwin_network_collector_0)
    except BaseException:
        pass

def test_case_1():
    try:
        var_0 = {}
        str_0 = 'foo'
        darwin_network_0 = module_0.DarwinNetwork(var_0, var_0)
        str_1 = '<unknown'
        str_2 = 'type>'
        str_3 = [str_2, str_1, var_0, str_2]
        var_1 = {}
        var_2 = {}
        tuple_0 = None
        darwin_network_1 = module_0.DarwinNetwork(tuple_0, tuple_0)
        darwin_network_2 = module_0.DarwinNetwork(str_0, str_0)
        var_3 = darwin_network_2.parse_media_line(str_3, var_1, var_2)
    except BaseException:
        pass