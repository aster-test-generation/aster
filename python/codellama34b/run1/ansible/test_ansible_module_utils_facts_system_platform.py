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
        self.assertEqual(result, "platform")

    def test_fact_ids(self):
        instance = PlatformFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, set(['system',
                                      'kernel',
                                      'kernel_version',
                                      'machine',
                                      'python_version',
                                      'architecture',
                                      'machine_id']))

if __name__ == '__main__':
    unittest.main()