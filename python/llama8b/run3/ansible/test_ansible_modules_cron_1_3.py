import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.module, module)
        self.assertIsNone(cron_tab.user)
        self.assertTrue(cron_tab.root)
        self.assertIsNone(cron_tab.lines)
        self.assertIsNone(cron_tab.ansible)
        self.assertIsNone(cron_tab.n_existing)
        self.assertIsNone(cron_tab.cron_file)
        self.assertIsNone(cron_tab.b_cron_file)
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))

    def test_read(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_read_user_execute(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab._read_user_execute(), 'crontab -l')

    def test_split_lines(self):
        lines = ['line1', 'line2', 'line3']
        self.assertEqual(CronTab.split_lines(lines), ['line1', 'line2', 'line3'])

    def test_split_lines_with_comments(self):
        lines = ['line1', '# comment', 'line2', 'line3']
        self.assertEqual(CronTab.split_lines(lines), ['line1', 'line2', 'line3'])

    def test_split_lines_with_empty_lines(self):
        lines = ['line1', '', 'line2', 'line3']
        self.assertEqual(CronTab.split_lines(lines), ['line1', 'line2', 'line3'])

    def test_split_lines_with_multiple_comments(self):
        lines = ['line1', '# comment1', '# comment2', 'line2', 'line3']
        self.assertEqual(CronTab.split_lines(lines), ['line1', 'line2', 'line3'])

    def test_split_lines_with_comments_and_empty_lines(self):
        lines = ['line1', '# comment1', '', '# comment2', 'line2', 'line3']
        self.assertEqual(CronTab.split_lines(lines), ['line1', 'line2', 'line3'])

    def test_split_lines_with_comments_and_empty_lines_and_multiple_comments(self):
        lines = ['line1', '# comment1', '', '# comment2', '# comment3', 'line2', 'line3']
        self.assertEqual(CronTab.split_lines(lines), ['line1', 'line2', 'line3'])

if __name__ == '__main__':
    unittest.main()