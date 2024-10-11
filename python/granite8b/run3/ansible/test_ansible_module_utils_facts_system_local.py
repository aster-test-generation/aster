import unittest
from ansible.module_utils.facts.system.local import LocalFactCollector


class TestLocalFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = LocalFactCollector()
        local_facts = collector.collect()
        self.assertIn('local', local_facts)
        local = local_facts['local']
        self.assertIn('fact_base', local)
        fact = local['fact_base']
        self.assertEqual(fact, 'expected_value')

    def test_private_method(self):
        collector = LocalFactCollector()
        result = collector._private_method(1)
        self.assertEqual(result, 2)

    def test_protected_method(self):
        collector = LocalFactCollector()
        result = collector._protected_method(1)
        self.assertEqual(result, 3)

    def test_magic_method(self):
        collector = LocalFactCollector()
        result = collector.__str__()
        self.assertEqual(result, 'LocalFactCollector')

if __name__ == '__main__':
    unittest.main()