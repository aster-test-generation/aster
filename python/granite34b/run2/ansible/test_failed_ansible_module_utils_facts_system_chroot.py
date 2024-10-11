import unittest
from ansible.module_utils.facts.system.chroot import is_chroot, ChrootFactCollector

class TestIsChroot(unittest.TestCase):
    def test_is_chroot(self):
        self.assertFalse(is_chroot())

class TestChrootFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = ChrootFactCollector()
        result = collector.collect()
        self.assertEqual(result, {'is_chroot': False})

if __name__ == '__main__':
    unittest.main()