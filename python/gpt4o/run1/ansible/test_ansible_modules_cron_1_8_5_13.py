import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.crontab = CronTab(self.module)

    def test_init_with_cron_file(self):
        with patch('os.path.isabs', return_value=True):
            crontab = CronTab(self.module, cron_file='/etc/cron.d/test')
            self.assertEqual(crontab.cron_file, '/etc/cron.d/test')
            self.assertEqual(crontab.b_cron_file, b'/etc/cron.d/test')

    def test_init_without_cron_file(self):
        crontab = CronTab(self.module)
        self.assertIsNone(crontab.cron_file)

    def test_update_env(self):
        self.crontab.lines = ['FOO=bar', 'BAZ=qux']
        def addenvfunction(newlines, decl):
            newlines.append(decl)
        self.crontab._update_env('FOO', 'FOO=newvalue', addenvfunction)
        self.assertEqual(self.crontab.lines, ['FOO=newvalue', 'BAZ=qux'])

    def test_update_env_no_match(self):
        self.crontab.lines = ['FOO=bar', 'BAZ=qux']
        def addenvfunction(newlines, decl):
            newlines.append(decl)
        self.crontab._update_env('NOT_EXIST', 'NOT_EXIST=newvalue', addenvfunction)
        self.assertEqual(self.crontab.lines, ['FOO=bar', 'BAZ=qux'])

    def test_str_method(self):
        result = self.crontab.__str__()
        self.assertEqual(result, str(self.crontab))

    def test_repr_method(self):
        result = self.crontab.__repr__()
        self.assertEqual(result, repr(self.crontab))

if __name__ == '__main__':
    unittest.main()