import os
import unittest
from ansible.module_utils.facts.facts import Facts
from ansible.module_utils.facts.collector import BaseFactCollector


class TestChrootFactCollector(unittest.TestCase):
    def test_is_chroot(self):
        collector = ChrootFactCollector()
        result = collector.collect()
        self.assertEqual(result['is_chroot'], True)

    def test_collect(self):
        collector = ChrootFactCollector()
        result = collector.collect()
        self.assertEqual(result['is_chroot'], True)

if __name__ == '__main__':
    unittest.main()