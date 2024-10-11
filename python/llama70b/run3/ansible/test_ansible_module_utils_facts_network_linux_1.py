import unittest
from ansible.module_utils.facts.network.linux import LinuxNetworkCollecto


class TestLinuxNetwork(unittest.TestCase):
    def test___init__(self):
        instance = LinuxNetwork()
        self.assertIsInstance(instance, LinuxNetwork)

    def test_populate(self):
        instance = LinuxNetwork()
        collected_facts = {'ansible_os_family': 'RedHat', 'ansible_distribution_version': '4.0'}
        result = instance.populate(collected_facts)
        self.assertIsInstance(result, dict)

    def test_get_default_interfaces(self):
        instance = LinuxNetwork()
        ip_path = '/path/to/ip'
        collected_facts = {'ansible_os_family': 'RedHat', 'ansible_distribution_version': '4.0'}
        result = instance.get_default_interfaces(ip_path, collected_facts)
        self.assertIsInstance(result, tuple)

    def test_get_interfaces_info(self):
        instance = LinuxNetwork()
        ip_path = '/path/to/ip'
        default_ipv4 = {'interface': 'eth0', 'address': '192.168.1.1'}
        default_ipv6 = {'interface': 'eth0', 'address': '2001:0db8:85a3:0000:0000:8a2e:0370:7334'}
        result = instance.get_interfaces_info(ip_path, default_ipv4, default_ipv6)
        self.assertIsInstance(result, tuple)

    def test___get_ethtool_data(self):
        instance = LinuxNetwork()
        device = 'eth0'
        result = instance._LinuxNetwork__get_ethtool_data(device)
        self.assertIsInstance(result, dict)

    def test___parse_ip_output(self):
        instance = LinuxNetwork()
        output = 'inet 192.168.1.1/24 brd 192.168.1.255 scope global eth0'
        secondary = False
        result = instance._LinuxNetwork__parse_ip_output(output, secondary)
        self.assertIsNone(result)

    def test___str__(self):
        instance = LinuxNetwork()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = LinuxNetwork()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestNetworkCollector(unittest.TestCase):
    def test___init__(self):
        instance = NetworkCollector()
        self.assertIsInstance(instance, NetworkCollector)

if __name__ == '__main__':
    unittest.main()