import unittest
from ansible.module_utils.facts.system.apparmor import *


class TestApparmorFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = ApparmorFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)

    def test_name(self):
        instance = ApparmorFactCollector()
        result = instance.name
        self.assertEqual(result, 'apparmor')

    def test__fact_ids(self):
        instance = ApparmorFactCollector()
        result = instance._fact_ids
        self.assertIsInstance(result, set)

if __name__ == '__main__':
    unittest.main()