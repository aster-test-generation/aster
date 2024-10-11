import unittest
from ansible.module_utils.facts.system.selinux import *


class TestSelinuxFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = SelinuxFactCollector()
        result = instance.collect()
        self.assertIsNotNone(result)

    def test_name(self):
        instance = SelinuxFactCollector()
        result = instance.name
        self.assertEqual(result, 'selinux')

    def test__fact_ids(self):
        instance = SelinuxFactCollector()
        result = instance._fact_ids
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()