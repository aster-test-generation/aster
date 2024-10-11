import os
import unittest
from ansible.module_utils.facts.system.chroot import ChrootFactCollector, is_chroot


class TestChrootFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = ChrootFactCollector()
        result = collector.collect()
        self.assertIn('is_chroot', result)

    def test_is_chroot(self):
        self.assertTrue(is_chroot())

    def test_is_chroot_debian_chroot_set(self):
        os.environ['debian_chroot'] = 'True'
        self.assertTrue(is_chroot())

    def test_is_chroot_debian_chroot_not_set(self):
        os.environ.pop('debian_chroot', None)
        self.assertFalse(is_chroot())

    def test_is_chroot_stat_command_available(self):
        collector = ChrootFactCollector()
        collector.module = {'get_bin_path': lambda x: '/bin/stat'}
        result = collector.collect()
        self.assertIn('is_chroot', result)

    def test_is_chroot_stat_command_unavailable(self):
        collector = ChrootFactCollector()
        collector.module = {'get_bin_path': lambda x: None}
        result = collector.collect()
        self.assertIn('is_chroot', result)

    def test_is_chroot_btrfs(self):
        collector = ChrootFactCollector()
        collector.module = {'get_bin_path': lambda x: '/bin/stat'}
        collector.stat_path = lambda x: 'btrfs'
        result = collector.collect()
        self.assertTrue(is_chroot(collector.module))

    def test_is_chroot_xfs(self):
        collector = ChrootFactCollector()
        collector.module = {'get_bin_path': lambda x: '/bin/stat'}
        collector.stat_path = lambda x: 'xfs'
        result = collector.collect()
        self.assertTrue(is_chroot(collector.module))

    def test_is_chroot_not_chroot(self):
        collector = ChrootFactCollector()
        collector.module = {'get_bin_path': lambda x: '/bin/stat'}
        collector.stat_path = lambda x: 'ext4'
        result = collector.collect()
        self.assertFalse(is_chroot(collector.module))

if __name__ == '__main__':
    unittest.main()