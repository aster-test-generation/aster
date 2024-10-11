import unittest
from ansible.module_utils.facts.network.hurd import HurdPfinetNetwork, HurdNetworkCollector


class TestHurdPfinetNetwork(unittest.TestCase):
    def test_init(self):
        instance = HurdPfinetNetwork()
        self.assertIsInstance(instance, HurdPfinetNetwork)

    def test_assign_network_facts(self):
        instance = HurdPfinetNetwork()
        network_facts = {}
        fsysopts_path = '/path/to/fsysopts'
        socket_path = '/path/to/socket'
        result = instance.assign_network_facts(network_facts, fsysopts_path, socket_path)
        self.assertIsInstance(result, dict)

    def test_populate(self):
        instance = HurdPfinetNetwork()
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_platform(self):
        instance = HurdPfinetNetwork()
        self.assertEqual(instance.platform, 'GNU')

    def test_socket_dir(self):
        instance = HurdPfinetNetwork()
        self.assertEqual(instance._socket_dir, '/servers/socket/')

    def test_str_method(self):
        instance = HurdPfinetNetwork()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = HurdPfinetNetwork()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = HurdPfinetNetwork()
        instance2 = HurdPfinetNetwork()
        self.assertEqual(instance1, instance2)

class TestHurdNetworkCollector(unittest.TestCase):
    def test_init(self):
        instance = HurdNetworkCollector()
        self.assertIsInstance(instance, HurdNetworkCollector)

    def test_platform(self):
        instance = HurdNetworkCollector()
        self.assertEqual(instance._platform, 'GNU')

    def test_fact_class(self):
        instance = HurdNetworkCollector()
        self.assertEqual(instance._fact_class, HurdPfinetNetwork)

    def test_str_method(self):
        instance = HurdNetworkCollector()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = HurdNetworkCollector()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = HurdNetworkCollector()
        instance2 = HurdNetworkCollector()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()