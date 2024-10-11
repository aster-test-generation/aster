import unittest
import os
from ansible.module_utils.facts.system.chroot import is_chroot, ChrootFactCollector


class TestChroot(unittest.TestCase):
    def test_is_chroot(self):
        self.assertTrue(is_chroot())

    def test_is_chroot_debian_chroot_set(self):
        os.environ['debian_chroot'] = 'True'
        self.assertTrue(is_chroot())

    def test_is_chroot_debian_chroot_not_set(self):
        os.environ.pop('debian_chroot', None)
        self.assertFalse(is_chroot())

    def test_is_chroot_proc_root(self):
        my_root = os.stat('/')
        proc_root = os.stat('/proc/1/root/.')
        self.assertNotEqual(my_root.st_ino, proc_root.st_ino)
        self.assertNotEqual(my_root.st_dev, proc_root.st_dev)
        self.assertTrue(is_chroot())

    def test_is_chroot_fs_root_ino(self):
        fs_root_ino = 2
        if os.environ.get('ANSIBLE_TEST_FS_ROOT_INO', None):
            fs_root_ino = int(os.environ['ANSIBLE_TEST_FS_ROOT_INO'])
        self.assertEqual(is_chroot(), fs_root_ino != my_root.st_ino)

    def test_chroot_fact_collector_collect(self):
        collector = ChrootFactCollector()
        facts = collector.collect()
        self.assertIn('is_chroot', facts)

    def test_chroot_fact_collector_collect_module(self):
        collector = ChrootFactCollector()
        module = {'get_bin_path': lambda x: '/bin/true'}
        facts = collector.collect(module=module)
        self.assertIn('is_chroot', facts)

    def test_chroot_fact_collector_collect_collected_facts(self):
        collector = ChrootFactCollector()
        collected_facts = {'is_chroot': True}
        facts = collector.collect(collected_facts=collected_facts)
        self.assertIn('is_chroot', facts)

if __name__ == '__main__':
    unittest.main()