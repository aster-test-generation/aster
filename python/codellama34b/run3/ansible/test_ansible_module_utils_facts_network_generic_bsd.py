import unittest
from ansible.module_utils.facts.network.generic_bsd import GenericBsdIfconfigNetwork
from ansible.module_utils.facts.network.base import Network



class TestGenericBsdIfconfigNetwork(unittest.TestCase):
    def test_populate(self):
        network_facts = {}
        ifconfig_path = self.get_bin_path('ifconfig')
        if ifconfig_path is None:
            return network_facts
        route_path = self.module.get_bin_path('route')
        if route_path is None:
            return network_facts
        default_ipv4, default_ipv6 = self.get_default_interfaces(route_path)
        interfaces, ips = self.get_interfaces_info(ifconfig_path)
        interfaces = self.detect_type_media(interfaces)
        self.merge_default_interface(default_ipv4, interfaces, 'ipv4')
        self.merge_default_interface(default_ipv6, interfaces, 'ipv6')
        network_facts['interfaces'] = sorted(list(interfaces.keys()))
        for iface in interfaces:
            network_facts[iface] = interfaces[iface]
        network_facts['default_ipv4'] = default_ipv4
        network_facts['default_ipv6'] = default_ipv6
        network_facts['all_ipv4_addresses'] = ips['all_ipv4_addresses']
        network_facts['all_ipv6_addresses'] = ips['all_ipv6_addresses']
        self.assertEqual(network_facts, {})

    def test_detect_type_media(self):
        interfaces = {}
        for iface in interfaces:
            if 'media' in interfaces[iface]:
                if 'ether' in interfaces[iface]['media'].lower():
                    interfaces[iface]['type'] = 'ether'
        self.assertEqual(interfaces, {})

    def test_get_default_interfaces(self):
        interface = {}
        for v in 'v4', 'v6':
            if v == 'v6' and not socket.has_ipv6:
                continue
            rc, out, err = self.module.run_command([route_path, '-n', 'get', 'default'])
            if not out:
                continue
            for line in out.splitlines():
                words = line.strip().split(': ')
                if len(words) > 1:
                    if words[0] == 'interface':
                        interface[v]['interface'] = words[1]
                    if words[0] == 'gateway':
                        interface[v]['gateway'] = words[1]
                    if words[0] == 'if address':
                        interface[v]['address'] = words[1]
                    if words[0] == 'local addr':
                        interface[v]['address'] = words[1]
        self.assertEqual(interface, {})

if __name__ == '__main__':
    unittest.main()