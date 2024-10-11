import os
import unittest
from ansible.module_utils.facts.system.chroot import is_chroot, ChrootFactCollector


class TestIsChroot(unittest.TestCase):
    def test_is_chroot_true(self):
        os.environ['debian_chroot'] = 'true'
        self.assertTrue(is_chroot())

    def test_is_chroot_false(self):
        os.environ.pop('debian_chroot', None)
        self.assertFalse(is_chroot())

class TestChrootFactCollector(unittest.TestCase):
    def test_collect_is_chroot_true(self):
        os.environ['debian_chroot'] = 'true'
        collector = ChrootFactCollector()
        result = collector.collect()
        self.assertEqual(result, {'is_chroot': True})

    def test_collect_is_chroot_false(self):
        os.environ.pop('debian_chroot', None)
        collector = ChrootFactCollector()
        result = collector.collect()
        self.assertEqual(result, {'is_chroot': False})

if __name__ == '__main__':
    unittest.main()