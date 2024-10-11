import unittest
from ansible.module_utils.facts.network.hurd import *


class TestHurdPfinetNetwork(unittest.TestCase):
    def test_assign_network_facts(self):
        instance = HurdPfinetNetwork(module)
        network_facts = {}
        fsysopts_path = "fsysopts_path"
        socket_path = "socket_path"
        result = instance.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertEqual(result, network_facts)

    def test_populate(self):
        instance = HurdPfinetNetwork(module)
        collected_facts = {}
        result = instance.populate(collected_facts)
        self.assertEqual(result, {})

class TestHurdNetworkCollector(unittest.TestCase):
    def test_populate(self):
        instance = HurdNetworkCollector()
        collected_facts = {}
        result = instance.populate_facts(collected_facts)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()