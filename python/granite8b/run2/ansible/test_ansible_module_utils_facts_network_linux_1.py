import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollector


class TestLinuxNetwork(unittest.TestCase):
    def test_populate(self):
        network = LinuxNetwork()
        result = network.populate()
        self.assertIsInstance(result, dict)
        self.assertIn('interfaces', result)
        self.assertIn('default_ipv4', result)
        self.assertIn('default_ipv6', result)
        self.assertIn('all_ipv4_addresses', result)
        self.assertIn('all_ipv6_addresses', result)

    def test_get_default_interfaces(self):
        network = LinuxNetwork()
        result = network.get_default_interfaces()
        self.assertIsInstance(result, tuple)
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], dict)
        self.assertIsInstance(result[1], dict)
        self.assertIn('interface', result[0])
        self.assertIn('address', result[0])
        self.assertIn('gateway', result[0])
        self.assertIn('interface', result[1])
        self.assertIn('address', result[1])
        self.assertIn('gateway', result[1])

    def test_get_interfaces_info(self):
        network = LinuxNetwork()
        result = network.get_interfaces_info()
        self.assertIsInstance(result, tuple)
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], dict)
        self.assertIsInstance(result[1], dict)
        self.assertIn('device', result[0])
        self.assertIn('macaddress', result[0])
        self.assertIn('mtu', result[0])
        self.assertIn('active', result[0])
        self.assertIn('module', result[0])
        self.assertIn('type', result[0])
        self.assertIn('all_ipv4_addresses', result[1])
        self.assertIn('all_ipv6_addresses', result[1])

if __name__ == '__main__':
    unittest.main()