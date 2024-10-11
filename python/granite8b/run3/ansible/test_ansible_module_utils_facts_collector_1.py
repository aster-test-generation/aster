import unittest
from ansible.module_utils.facts.collector import BaseFactCollector


class TestBaseFactCollector(unittest.TestCase):
    def test_platform_match(self):
        instance = BaseFactCollector()
        result = instance.platform_match({'system': 'Linux'})
        self.assertEqual(result, None)

    def test_collect_with_namespace(self):
        instance = BaseFactCollector()
        result = instance.collect_with_namespace()
        self.assertEqual(result, {})

    def test_collect(self):
        instance = BaseFactCollector()
        result = instance.collect()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()