import unittest
from ansible.module_utils.facts.network.generic_bsd import GenericBsdIfconfigNetwork


class TestGenericBsdIfconfigNetwork(unittest.TestCase):
    def test_detect_type_media(self):
        network = GenericBsdIfconfigNetwork(module=None)
        interfaces = {'eth0': {'media': 'ether'}}
        interfaces = network.detect_type_media(interfaces)
        self.assertEqual(interfaces['eth0']['type'], 'ether')

    def test_get_default_interfaces(self):
        network = GenericBsdIfconfigNetwork(module=None)
        route_path = '/path/to/route'
        interface = network.get_default_interfaces(route_path)
        self.assertEqual(interface['interface'], 'eth0')
        self.assertEqual(interface['gateway'], '192.168.1.1')
        self.assertEqual(interface['address'], '192.168.1.100')

    def test_get_interfaces_info(self):
        network = GenericBsdIfconfigNetwork(module=self.module)
        ifconfig_path = '/path/to/ifconfig'
        interfaces, ips = network.get_interfaces_info(ifconfig_path)
        self.assertEqual(interfaces['eth0']['device'], 'eth0')
        self.assertEqual(interfaces['eth0']['flags'], ['UP', 'BROADCAST', 'SMART', 'RUNNING', 'SIMPLEX', 'MULTICAST'])
        self.assertEqual(interfaces['eth0']['mtu'], '1500')
        self.assertEqual(interfaces['eth0']['macaddress'], '00:11:22:33:44:55')
        self.assertEqual(interfaces['eth0']['type'], 'ether')
        self.assertEqual(interfaces['eth0']['ipv4'][0]['address'], '192.168.1.100')
        self.assertEqual(interfaces['eth0']['ipv4'][0]['netmask'], '255.255.255.0')
        self.assertEqual(interfaces['eth0']['ipv4'][0]['broadcast'], '192.168.1.255')
        self.assertEqual(interfaces['eth0']['ipv6'][0]['address'], 'fe80::20c:29ff:fe9b:b1e0')
        self.assertEqual(interfaces['eth0']['ipv6'][0]['prefix'], '64')
        self.assertEqual(interfaces['eth0']['ipv6'][0]['scope'], 'link')
        self.assertEqual(ips['all_ipv4_addresses'], ['192.168.1.100'])
        self.assertEqual(ips['all_ipv6_addresses'], ['fe80::20c:29ff:fe9b:b1e0'])

if __name__ == '__main__':
    unittest.main()