import unittest
from ansible.module_utils.facts.system.chroot import *


class TestChrootFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = ChrootFactCollector()
        result = instance.collect()
        self.assertEqual(result, {'is_chroot': None})

    def test_name(self):
        instance = ChrootFactCollector()
        result = instance.name
        self.assertEqual(result, 'chroot')

    def test_fact_ids(self):
        instance = ChrootFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, set(['is_chroot']))

class TestIsChroot(unittest.TestCase):
    def test_is_chroot(self):
        result = is_chroot()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()