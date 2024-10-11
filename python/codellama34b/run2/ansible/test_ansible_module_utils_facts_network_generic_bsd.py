import unittest
from ansible.module_utils.facts.network.generic_bsd import GenericBsdIfconfigNetwork



class TestGenericBsdIfconfigNetwork(unittest.TestCase):
    def test_populate(self):
        instance = GenericBsdIfconfigNetwork(module)
        result = instance.populate()
        self.assertIsNotNone(result)

    def test_detect_type_media(self):
        instance = GenericBsdIfconfigNetwork(module)
        interfaces = {'interface': {'media': 'media'}}
        result = instance.detect_type_media(interfaces)
        self.assertEqual(result, interfaces)

    def test_get_default_interfaces(self):
        instance = GenericBsdIfconfigNetwork(module)
        route_path = 'route'
        result = instance.get_default_interfaces(route_path)
        self.assertIsNotNone(result)

    def test_get_interfaces_info(self):
        instance = GenericBsdIfconfigNetwork(module)
        ifconfig_path = 'ifconfig'
        result = instance.get_interfaces_info(ifconfig_path)
        self.assertIsNotNone(result)

    def test_parse_interface_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['interface', 'flags', 'metric', 'mtu']
        result = instance.parse_interface_line(words)
        self.assertIsNotNone(result)

    def test_parse_options_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['options=options']
        current_if = {'device': 'device'}
        result = instance.parse_options_line(words, current_if)
        self.assertIsNone(result)

    def test_parse_nd6_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['nd6', 'options=options']
        current_if = {'device': 'device'}
        result = instance.parse_nd6_line(words, current_if)
        self.assertIsNone(result)

    def test_parse_ether_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['ether', 'macaddress']
        current_if = {'device': 'device'}
        result = instance.parse_ether_line(words, current_if)
        self.assertIsNone(result)

    def test_parse_media_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['media:', 'media', 'media_select', 'media_type']
        current_if = {'device': 'device'}
        result = instance.parse_media_line(words, current_if)
        self.assertIsNone(result)

    def test_parse_status_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['status:', 'status']
        current_if = {'device': 'device'}
        result = instance.parse_status_line(words, current_if)
        self.assertIsNone(result)

    def test_parse_lladdr_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['lladdr', 'lladdr']
        current_if = {'device': 'device'}
        result = instance.parse_lladdr_line(words, current_if)
        self.assertIsNone(result)

    def test_parse_inet_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['inet', 'address', 'netmask', 'broadcast']
        current_if = {'device': 'device'}
        ips = {'all_ipv4_addresses': []}
        result = instance.parse_inet_line(words, current_if, ips)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()