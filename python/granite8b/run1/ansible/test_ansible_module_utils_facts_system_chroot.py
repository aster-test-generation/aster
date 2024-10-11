import unittest
from ansible.module_utils.facts.system.chroot import is_chroot, ChrootFactCollector


class TestChrootFactCollector(unittest.TestCase):
    def test_is_chroot(self):
        self.assertFalse(is_chroot())
        self.assertTrue(is_chroot(module=None))

class TestChrootFactCollectorMethods(unittest.TestCase):
    def test_collect(self):
        collector = ChrootFactCollector()
        result = collector.collect(module=None, collected_facts={})
        self.assertIn('is_chroot', result)
        self.assertFalse(result['is_chroot'])

if __name__ == '__main__':
    unittest.main()