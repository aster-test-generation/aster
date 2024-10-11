import unittest
from ansible.module_utils.facts.network.hurd import HurdPfinetNetwork, HurdNetworkCollector


class TestHurdPfinetNetwork(unittest.TestCase):
    def test_assign_network_facts(self):
        network_facts = {}
        fsysopts_path = 'fsysopts'
        socket_path = '/servers/socket/inet'
        instance = HurdPfinetNetwork()
        result = instance.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, network_facts)

    def test_populate(self):
        collected_facts = {}
        instance = HurdPfinetNetwork()
        result = instance.populate(collected_facts)
        self.assertEqual(result, {})

    def test_assign_network_facts_with_socket_path_none(self):
        network_facts = {}
        fsysopts_path = 'fsysopts'
        socket_path = None
        instance = HurdPfinetNetwork()
        result = instance.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, {})

    def test_assign_network_facts_with_socket_path_not_exists(self):
        network_facts = {}
        fsysopts_path = 'fsysopts'
        socket_path = '/non/existent/path'
        instance = HurdPfinetNetwork()
        result = instance.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, {})

    def test_assign_network_facts_with_socket_path_inet6(self):
        network_facts = {}
        fsysopts_path = 'fsysopts'
        socket_path = '/servers/socket/inet6'
        instance = HurdPfinetNetwork()
        result = instance.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, {})

class TestHurdNetworkCollector(unittest.TestCase):
    def test_init(self):
        instance = HurdNetworkCollector()
        self.assertEqual(instance._platform, 'GNU')
        self.assertEqual(instance._fact_class, HurdPfinetNetwork)

if __name__ == '__main__':
    unittest.main()