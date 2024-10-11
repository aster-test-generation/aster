import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        cron_tab = CronTab(None)
        self.assertEqual(cron_tab.root, True)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '# ANsible managed: ')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, 'crontab')
        self.assertEqual(cron_tab.cron_file, None)
        self.assertEqual(cron_tab.b_cron_file, None)

    def test__update_job(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['# comment', 'some line', 'another line']
        self.assertTrue(cron_tab._update_job('name', 'job', lambda newlines, comment, job: newlines.append(comment)))
        self.assertEqual(cron_tab.lines, ['# comment', 'some line', 'another line', '# ANsible managed: name', 'job'])

if __name__ == '__main__':
    unittest.main()