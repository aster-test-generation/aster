import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollector


class TestLinuxNetwork(unittest.TestCase):
    def test_populate(self):
        network = LinuxNetwork()
        collected_facts = {}
        result = network.populate(collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_default_interfaces(self):
        network = LinuxNetwork()
        ip_path = '/path/to/ip'
        collected_facts = {}
        result = network.get_default_interfaces(ip_path, collected_facts)
        self.assertIsInstance(result, tuple)
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], dict)
        self.assertIsInstance(result[1], dict)

    def test_get_interfaces_info(self):
        network = LinuxNetwork()
        ip_path = '/path/to/ip'
        default_ipv4 = {}
        default_ipv6 = {}
        result = network.get_interfaces_info(ip_path, default_ipv4, default_ipv6)
        self.assertIsInstance(result, tuple)
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], dict)
        self.assertIsInstance(result[1], dict)

if __name__ == '__main__':
    unittest.main()