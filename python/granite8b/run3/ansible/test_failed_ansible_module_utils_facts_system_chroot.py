import unittest
from ansible.module_utils.facts.system.chroot import is_chroot, ChrootFactCollector

class TestIsChroot(unittest.TestCase):
    def test_is_chroot_true(self):
        self.assertFalse(is_chroot())

    def test_is_chroot_false(self):
        self.assertFalse(is_chroot())

class TestChrootFactCollector(unittest.TestCase):
    def test_collect_fact(self):
        collector = ChrootFactCollector()
        facts = collector.collect()
        self.assertIn('is_chroot', facts)

if __name__ == '__main__':
    unittest.main()