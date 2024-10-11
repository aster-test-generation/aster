import unittest
from ansible.module_utils.facts.network.generic_bsd import GenericBsdIfconfigNetwork


class TestGenericBsdIfconfigNetwork(unittest.TestCase):
    def test_populate(self):
        network_facts = {}
        ifconfig_path = 'ifconfig'
        route_path = 'route'
        default_ipv4, default_ipv6 = 'default_ipv4', 'default_ipv6'
        interfaces, ips = {}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance = GenericBsdIfconfigNetwork()
        result = instance.populate(network_facts, collected_facts=None)
        self.assertEqual(result, network_facts)

    def test_detect_type_media(self):
        interfaces = {'interface1': {'media': 'ether'}}
        instance = GenericBsdIfconfigNetwork()
        result = instance.detect_type_media(interfaces)
        self.assertEqual(result, interfaces)

    def test_get_default_interfaces(self):
        route_path = 'route'
        instance = GenericBsdIfconfigNetwork()
        result = instance.get_default_interfaces(route_path)
        self.assertEqual(result, ({}, {}))

    def test_get_interfaces_info(self):
        ifconfig_path = 'ifconfig'
        ifconfig_options = '-a'
        instance = GenericBsdIfconfigNetwork()
        result = instance.get_interfaces_info(ifconfig_path, ifconfig_options)
        self.assertEqual(result, ({}, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}))

    def test_parse_interface_line(self):
        words = ['interface1', 'flags', 'options']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_interface_line(words)
        self.assertEqual(result, {'device': 'interface1', 'ipv4': [], 'ipv6': [], 'type': 'unknown', 'flags': 'options'})

    def test_parse_options_line(self):
        words = ['options', 'option1', 'option2']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_options_line(words, {}, {})
        self.assertEqual(result, {'options': ['option1', 'option2']})

    def test_parse_nd6_line(self):
        words = ['nd6', 'option1', 'option2']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_nd6_line(words, {}, {})
        self.assertEqual(result, {'options': ['option1', 'option2']})

    def test_parse_ether_line(self):
        words = ['ether', 'macaddress']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_ether_line(words, {}, {})
        self.assertEqual(result, {'macaddress': 'macaddress'})

    def test_parse_media_line(self):
        words = ['media', 'media_type']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_media_line(words, {}, {})
        self.assertEqual(result, {'media': 'media_type'})

    def test_parse_status_line(self):
        words = ['status', 'status_value']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_status_line(words, {}, {})
        self.assertEqual(result, {'status': 'status_value'})

    def test_parse_lladdr_line(self):
        words = ['lladdr', 'lladdr_value']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_lladdr_line(words, {}, {})
        self.assertEqual(result, {'lladdr': 'lladdr_value'})

    def test_parse_inet_line(self):
        words = ['inet', 'address', 'netmask']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_inet_line(words, {}, {})
        self.assertEqual(result, {'address': 'address', 'netmask': 'netmask'})

    def test_parse_inet6_line(self):
        words = ['inet6', 'address', 'prefix']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_inet6_line(words, {}, {})
        self.assertEqual(result, {'address': 'address', 'prefix': 'prefix'})

    def test_parse_tunnel_line(self):
        words = ['tunnel']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_tunnel_line(words, {}, {})
        self.assertEqual(result, {'type': 'tunnel'})

    def test_parse_unknown_line(self):
        words = ['unknown']
        instance = GenericBsdIfconfigNetwork()
        result = instance.parse_unknown_line(words, {}, {})
        self.assertEqual(result, {})

    def test_get_options(self):
        option_string = '<option1, option2>'
        instance = GenericBsdIfconfigNetwork()
        result = instance.get_options(option_string)
        self.assertEqual(result, ['option1', 'option2'])

if __name__ == '__main__':
    unittest.main()