import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        from unittest.mock import MagicMock
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        self.assertEqual(cron_tab.module, module)
        self.assertEqual(cron_tab.user, user)
        self.assertEqual(cron_tab.root, False)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test_file')
        self.assertEqual(cron_tab.b_cron_file, b'/etc/cron.d/test_file')

    def test_read(self):
        from unittest.mock import MagicMock
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        cron_tab.read()
        self.assertEqual(cron_tab.lines, ['test_line1', 'test_line2'])

    def test_write(self):
        from unittest.mock import MagicMock
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        cron_tab.write()
        module.assert_called_with(' cron_file', 'w')

    def test_has_entry(self):
        from unittest.mock import MagicMock
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        cron_tab.has_entry('test_entry')
        self.assertEqual(cron_tab.has_entry('test_entry'), True)

    def test_remove_entry(self):
        from unittest.mock import MagicMock
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        cron_tab.remove_entry('test_entry')
        self.assertEqual(cron_tab.remove_entry('test_entry'), True)

    def test_add_entry(self):
        from unittest.mock import MagicMock
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        cron_tab.add_entry('test_entry')
        self.assertEqual(cron_tab.add_entry('test_entry'), True)

    def test_flush_handlers(self):
        from unittest.mock import MagicMock
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        cron_tab.flush_handlers()
        self.assertEqual(cron_tab.flush_handlers(), True)

if __name__ == '__main__':
    unittest.main()