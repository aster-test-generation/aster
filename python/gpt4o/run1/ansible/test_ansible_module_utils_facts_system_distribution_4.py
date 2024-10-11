import unittest
from unittest.mock import Mock
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFactCollector(unittest.TestCase):
    def test_init(self):
        instance = DistributionFactCollector()
        self.assertIsInstance(instance, DistributionFactCollector)

    def test_collect_no_module(self):
        instance = DistributionFactCollector()
        result = instance.collect()
        self.assertEqual(result, {})

    def test_collect_with_module(self):
        instance = DistributionFactCollector()
        mock_module = Mock()
        mock_distribution = Mock()
        mock_distribution.get_distribution_facts.return_value = {'key': 'value'}
        
        with unittest.mock.patch('ansible_collections.ansible.module_utils.facts.system.distribution.Distribution', return_value=mock_distribution):
            result = instance.collect(module=mock_module)
            self.assertEqual(result, {'key': 'value'})

if __name__ == '__main__':
    unittest.main()