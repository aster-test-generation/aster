import unittest
from ansible.module_utils.facts.network.generic_bsd import GenericBsdIfconfigNetwork


class TestGenericBsdIfconfigNetwork(unittest.TestCase):
    def test_init(self):
        instance = GenericBsdIfconfigNetwork()
        self.assertIsInstance(instance, GenericBsdIfconfigNetwork)

    def test_platform(self):
        instance = GenericBsdIfconfigNetwork()
        self.assertEqual(instance.platform, 'Generic_BSD_Ifconfig')

    def test_populate(self):
        instance = GenericBsdIfconfigNetwork()
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_detect_type_media(self):
        instance = GenericBsdIfconfigNetwork()
        interfaces = {'iface1': {'media': 'ether'}}
        result = instance.detect_type_media(interfaces)
        self.assertEqual(result['iface1']['type'], 'ether')

    def test_get_default_interfaces(self):
        instance = GenericBsdIfconfigNetwork()
        route_path = '/path/to/route'
        result = instance.get_default_interfaces(route_path)
        self.assertIsInstance(result, tuple)

    def test_get_interfaces_info(self):
        instance = GenericBsdIfconfigNetwork()
        ifconfig_path = '/path/to/ifconfig'
        result = instance.get_interfaces_info(ifconfig_path)
        self.assertIsInstance(result, tuple)

    def test_parse_interface_line(self):
        instance = GenericBsdIfconfigNetwork()
        words = ['iface1', 'flags', 'metric', 'mtu']
        result = instance.parse_interface_line(words)
        self.assertIsInstance(result, dict)

    def test_parse_options_line(self):
        instance = GenericBsdIfconfigNetwork()
        words = ['options', 'option1', 'option2']
        current_if = {'device': 'iface1'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_options_line(words, current_if, ips)
        self.assertIn('options', current_if)

    def test_parse_nd6_line(self):
        instance = GenericBsdIfconfigNetwork()
        words = ['nd6', 'option1', 'option2']
        current_if = {'device': 'iface1'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_nd6_line(words, current_if, ips)
        self.assertIn('options', current_if)

    def test_parse_ether_line(self):
        instance = GenericBsdIfconfigNetwork()
        words = ['ether', 'macaddress']
        current_if = {'device': 'iface1'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_ether_line(words, current_if, ips)
        self.assertIn('macaddress', current_if)

    def test_parse_media_line(self):
        instance = GenericBsdIfconfigNetwork()
        words = ['media', 'media_type']
        current_if = {'device': 'iface1'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_media_line(words, current_if, ips)
        self.assertIn('media', current_if)

    def test_parse_status_line(self):
        instance = GenericBsdIfconfigNetwork()
        words = ['status', 'status_value']
        current_if = {'device': 'iface1'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_status_line(words, current_if, ips)
        self.assertIn('status', current_if)

    def test_parse_lladdr_line(self):
        instance = GenericBsdIfconfigNetwork()
        words = ['lladdr', 'lladdr_value']
        current_if = {'device': 'iface1'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_lladdr_line(words, current_if, ips)
        self.assertIn('lladdr', current_if)

    def test_parse_inet_line(self):
        instance = GenericBsdIfconfigNetwork()
        words = ['inet', 'address', 'netmask', 'broadcast']
        current_if = {'device': 'iface1'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_inet_line(words, current_if, ips)
        self.assertIn('ipv4', current_if)

    def test_parse_inet6_line(self):
        instance = GenericBsdIfconfigNetwork()
        words = ['inet6', 'address', 'prefix']
        current_if = {'device': 'iface1'}
        ips = {'all_ipv4_addresses': [], 'all_ipv6_addresses': []}
        instance.parse_inet6_line(words, current_if, ips)
        self.assertIn('ipv6', current_if)

if __name__ == '__main__':
    unittest.main()