import unittest
from ansible.module_utils.facts.network.generic_bsd import GenericBsdIfconfigNetwork



class TestGenericBsdIfconfigNetwork(unittest.TestCase):
    def test_populate(self):
        instance = GenericBsdIfconfigNetwork(module)
        result = instance.populate()
        self.assertIsNotNone(result)

    def test_detect_type_media(self):
        instance = GenericBsdIfconfigNetwork(module)
        interfaces = {'device': 'eth0', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        result = instance.detect_type_media(interfaces)
        self.assertIsNotNone(result)

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
        words = ['eth0', 'flags=8843<UP,BROADCAST,RUNNING,SIMPLEX,MULTICAST>', 'mtu 1500']
        result = instance.parse_interface_line(words)
        self.assertIsNotNone(result)

    def test_parse_options_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['options=80000<LINKSTATE>']
        current_if = {'device': 'eth0', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        result = instance.parse_options_line(words, current_if)
        self.assertIsNotNone(result)

    def test_parse_nd6_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['nd6 options=29<PERFORMNUD,IFDISABLED,AUTO_LINKLOCAL>']
        current_if = {'device': 'eth0', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        result = instance.parse_nd6_line(words, current_if)
        self.assertIsNotNone(result)

    def test_parse_ether_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['ether 00:11:22:33:44:55']
        current_if = {'device': 'eth0', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        result = instance.parse_ether_line(words, current_if)
        self.assertIsNotNone(result)

    def test_parse_media_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['media: Ethernet autoselect (1000baseT <full-duplex>)']
        current_if = {'device': 'eth0', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        result = instance.parse_media_line(words, current_if)
        self.assertIsNotNone(result)

    def test_parse_status_line(self):
        instance = GenericBsdIfconfigNetwork(module)
        words = ['status: active']
        current_if = {'device': 'eth0', 'ipv4': [], 'ipv6': [], 'type': 'unknown'}
        result = instance.parse_status_line(words, current_if)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()