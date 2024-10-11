import unittest
from ansible.module_utils.facts.network.hurd import *


class TestHurdPfinetNetwork(unittest.TestCase):
    def test_assign_network_facts(self):
        instance = HurdPfinetNetwork(module)
        result = instance.assign_network_facts({}, '', '')
        self.assertEqual(result, {'interfaces': []})

    def test_populate(self):
        instance = HurdPfinetNetwork(module)
        result = instance.populate()
        self.assertEqual(result, {})

class TestHurdNetworkCollector(unittest.TestCase):
    def test_populate(self):
        instance = HurdNetworkCollector()
        result = instance.populate_network_metrics()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()