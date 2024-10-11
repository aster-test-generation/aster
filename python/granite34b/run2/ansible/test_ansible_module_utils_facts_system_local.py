import unittest
from ansible.module_utils.facts.system.local import LocalFactCollector


class TestLocalFactCollector(unittest.TestCase):
    def test_collect_with_module(self):
        local_facts = LocalFactCollector().collect(module=True)
        self.assertIsInstance(local_facts, dict)
        self.assertIn('local', local_facts)
        self.assertIsInstance(local_facts['local'], dict)

    def test_collect_without_module(self):
        local_facts = LocalFactCollector().collect()
        self.assertIsInstance(local_facts, dict)
        self.assertIn('local', local_facts)
        self.assertIsInstance(local_facts['local'], dict)

    def test_collect_with_fact_path(self):
        fact_path = '/path/to/fact'
        local_facts = LocalFactCollector().collect(module=True, collected_facts={'fact_path': fact_path})
        self.assertIsInstance(local_facts, dict)
        self.assertIn('local', local_facts)
        self.assertIsInstance(local_facts['local'], dict)
        self.assertIn('local', local_facts)
        self.assertIsInstance(local_facts['local'], dict)
        self.assertEqual(local_facts['local']['fact_path'], fact_path)

    def test_collect_without_fact_path(self):
        local_facts = LocalFactCollector().collect(module=True, collected_facts={})
        self.assertIsInstance(local_facts, dict)
        self.assertIn('local', local_facts)
        self.assertIsInstance(local_facts['local'], dict)
        self.assertNotIn('local', local_facts)
        self.assertNotIsInstance(local_facts['local'], dict)

if __name__ == '__main__':
    unittest.main()