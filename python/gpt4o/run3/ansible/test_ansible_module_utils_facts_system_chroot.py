import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.system.chroot import is_chroot, ChrootFactCollector


class TestIsChrootFunction(unittest.TestCase):
    @patch('os.environ.get')
    def test_is_chroot_debian_chroot(self, mock_get):
        mock_get.return_value = True
        result = is_chroot()
        self.assertTrue(result)

    @patch('os.stat')
    def test_is_chroot_not_chroot(self, mock_stat):
        mock_stat.side_effect = [MagicMock(st_ino=1, st_dev=1), MagicMock(st_ino=1, st_dev=1)]
        result = is_chroot()
        self.assertFalse(result)

    @patch('os.stat')
    def test_is_chroot_chroot(self, mock_stat):
        mock_stat.side_effect = [MagicMock(st_ino=1, st_dev=1), MagicMock(st_ino=2, st_dev=2)]
        result = is_chroot()
        self.assertTrue(result)

    @patch('os.stat')
    def test_is_chroot_exception(self, mock_stat):
        mock_stat.side_effect = [MagicMock(st_ino=1, st_dev=1), Exception]
        result = is_chroot()
        self.assertTrue(result)

    @patch('os.stat')
    @patch('ansible.module_utils.facts.system.chroot.is_chroot')
    def test_is_chroot_with_module(self, mock_is_chroot, mock_stat):
        mock_stat.side_effect = [MagicMock(st_ino=1, st_dev=1), Exception]
        mock_module = MagicMock()
        mock_module.get_bin_path.return_value = '/usr/bin/stat'
        mock_module.run_command.return_value = (0, 'btrfs', '')
        result = is_chroot(mock_module)
        self.assertTrue(result)

class TestChrootFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = ChrootFactCollector()
        mock_module = MagicMock()
        collected_facts = {}
        result = collector.collect(mock_module, collected_facts)
        self.assertIn('is_chroot', result)

if __name__ == '__main__':
    unittest.main()