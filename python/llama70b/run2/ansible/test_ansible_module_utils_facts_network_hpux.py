import unittest
from ansible.module_utils.facts.network.hpux import HPUXNetwork, HPUXNetworkCollector


class TestHPUXNetwork(unittest.TestCase):
    def test_init(self):
        instance = HPUXNetwork()
        self.assertIsInstance(instance, HPUXNetwork)

    def test_populate(self):
        instance = HPUXNetwork()
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_default_interfaces(self):
        instance = HPUXNetwork()
        result = instance.get_default_interfaces()
        self.assertIsInstance(result, dict)

    def test_get_interfaces_info(self):
        instance = HPUXNetwork()
        result = instance.get_interfaces_info()
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = HPUXNetwork()
        result = instance.__str__()
        self.assertEqual(result, "HPUXNetwork")

    def test_repr_method(self):
        instance = HPUXNetwork()
        result = instance.__repr__()
        self.assertEqual(result, "HPUXNetwork()")

class TestHPUXNetworkCollector(unittest.TestCase):
    def test_init(self):
        instance = HPUXNetworkCollector()
        self.assertIsInstance(instance, HPUXNetworkCollector)

    def test_fact_class(self):
        instance = HPUXNetworkCollector()
        self.assertEqual(instance._fact_class, HPUXNetwork)

    def test_platform(self):
        instance = HPUXNetworkCollector()
        self.assertEqual(instance._platform, 'HP-UX')

    def test_str_method(self):
        instance = HPUXNetworkCollector()
        result = instance.__str__()
        self.assertEqual(result, "HPUXNetworkCollector")

    def test_repr_method(self):
        instance = HPUXNetworkCollector()
        result = instance.__repr__()
        self.assertEqual(result, "HPUXNetworkCollector()")

if __name__ == '__main__':
    unittest.main()