import unittest
from ansible.module_utils.facts.network.hurd import HurdPfinetNetwork, HurdNetworkCollector


class TestHurdPfinetNetwork(unittest.TestCase):
    def test_assign_network_facts(self):
        network_facts = {}
        fsysopts_path = 'fsysopts_path'
        socket_path = 'socket_path'
        hurd_pfinet_network = HurdPfinetNetwork(module=None)
        result = hurd_pfinet_network.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, network_facts)

    def test_populate(self):
        collected_facts = {}
        hurd_pfinet_network = HurdPfinetNetwork(module=None)
        result = hurd_pfinet_network.populate(collected_facts)
        self.assertEqual(result, {})

class TestHurdNetworkCollector(unittest.TestCase):
    def test_populate(self):
        collected_facts = {}
        hurd_network_collector = HurdNetworkCollector(module=None)
        result = hurd_network_collector.populate(collected_facts)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()