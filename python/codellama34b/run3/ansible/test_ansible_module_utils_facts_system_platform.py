import unittest
from ansible.module_utils.facts.system.platform import *


class TestPlatformFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = PlatformFactCollector()
        result = instance.collect()
        self.assertIsNotNone(result)

    def test_name(self):
        instance = PlatformFactCollector()
        result = instance.name
        self.assertEqual(result, 'platform')

    def test__fact_ids(self):
        instance = PlatformFactCollector()
        result = instance._fact_ids
        self.assertIsNotNone(result)


if __name__ == '__main__':
    unittest.main()