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
        self.assertIsInstance(fact, dict)

if __name__ == '__main__':
    unittest.main()