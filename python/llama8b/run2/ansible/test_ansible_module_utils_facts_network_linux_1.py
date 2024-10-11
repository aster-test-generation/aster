import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollecto


class TestLinuxNetwork(unittest.TestCase):
    def test_init(self):
        instance = LinuxNetwork()
        self.assertIsInstance(instance, LinuxNetwork)

    def test_populate(self):
        instance = LinuxNetwork()
        collected_facts = {}
        network_facts = instance.populate(collected_facts)
        self.assertIsInstance(network_facts, dict)

    def test_get_default_interfaces(self):
        instance = LinuxNetwork()
        default_ipv4, default_ipv6 = instance.get_default_interfaces(None)
        self.assertIsInstance(default_ipv4, dict)
        self.assertIsInstance(default_ipv6, dict)

    def test_get_interfaces_info(self):
        instance = LinuxNetwork()
        interfaces, ips = instance.get_interfaces_info(None, None, None)
        self.assertIsInstance(interfaces, dict)
        self.assertIsInstance(ips, dict)

    def test_parse_ip_output(self):
        instance = LinuxNetwork()
        output = "inet 192.168.1.1/24 brd 192.168.1.255"
        address, netmask, broadcast, network = instance.parse_ip_output(output)
        self.assertEqual(address, "192.168.1.1")
        self.assertEqual(netmask, "24")
        self.assertEqual(broadcast, "192.168.1.255")
        self.assertEqual(network, "192.168.1.0")

    def test_get_ethtool_data(self):
        instance = LinuxNetwork()
        data = instance.get_ethtool_data("eth0")
        self.assertIsInstance(data, dict)

    def test_new_interfaces(self):
        instance = LinuxNetwork()
        interfaces = {"eth0": {"device": "eth0"}}
        new_interfaces = instance.new_interfaces(interfaces)
        self.assertIsInstance(new_interfaces, dict)

    def test_str_method(self):
        instance = LinuxNetwork()
        result = str(instance)
        self.assertEqual(result, "LinuxNetwork")

    def test_repr_method(self):
        instance = LinuxNetwork()
        result = repr(instance)
        self.assertEqual(result, "LinuxNetwork()")

    def test_eq_method(self):
        instance1 = LinuxNetwork()
        instance2 = LinuxNetwork()
        self.assertEqual(instance1, instance2)

    def test_private_method(self):
        instance = LinuxNetwork()
        with self.assertRaises(NotImplementedError):
            instance._private_method()

    def test_protected_method(self):
        instance = LinuxNetwork()
        with self.assertRaises(NotImplementedError):
            instance._protected_method()

if __name__ == '__main__':
    unittest.main()