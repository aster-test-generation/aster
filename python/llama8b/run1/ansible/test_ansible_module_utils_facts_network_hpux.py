import unittest
from ansible.module_utils.facts.network.hpux import HPUXNetwork, HPUXNetworkCollector


class TestHPUXNetwork(unittest.TestCase):
    def test_populate(self):
        network = HPUXNetwork()
        collected_facts = {'some_fact': 'some_value'}
        result = network.populate(collected_facts)
        self.assertIsInstance(result, dict)
        self.assertIn('interfaces', result)

    def test_get_default_interfaces(self):
        network = HPUXNetwork()
        result = network.get_default_interfaces()
        self.assertIsInstance(result, dict)
        self.assertIn('default_interface', result)
        self.assertIn('default_gateway', result)

    def test_get_interfaces_info(self):
        network = HPUXNetwork()
        result = network.get_interfaces_info()
        self.assertIsInstance(result, dict)
        self.assertIn('lan0', result)
        self.assertIn('lan1', result)

    def test___init__(self):
        network = HPUXNetwork()
        self.assertEqual(network.platform, 'HP-UX')

    def test___str__(self):
        network = HPUXNetwork()
        result = str(network)
        self.assertEqual(result, 'HPUXNetwork')

    def test___repr__(self):
        network = HPUXNetwork()
        result = repr(network)
        self.assertEqual(result, 'HPUXNetwork()')

class TestHPUXNetworkCollector(unittest.TestCase):
    def test___init__(self):
        collector = HPUXNetworkCollector()
        self.assertEqual(collector._fact_class, HPUXNetwork)
        self.assertEqual(collector._platform, 'HP-UX')

if __name__ == '__main__':
    unittest.main()