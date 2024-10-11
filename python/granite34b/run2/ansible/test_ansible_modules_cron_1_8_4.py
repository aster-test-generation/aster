import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        module = None
        user = 'test_user'
        cron_file = 'test_cron_file'
        cron_tab = CronTab(user=user, module=module, cron_file=cron_file)
        self.assertEqual(cron_tab.module, module)
        self.assertEqual(cron_tab.user, user)
        self.assertEqual(cron_tab.root, False)
        self.assertEqual(cron_tab.lines, None)
        self.assertTrue('ansible' in cron_tab.ansible)
        self.assertEqual(cron_tab.n_existing, '')
        self.assertTrue('crontab' in cron_tab.cron_cmd)
        if cron_file:
            self.assertEqual(cron_tab.cron_file, cron_file)
            self.assertEqual(cron_tab.b_cron_file, to_bytes(cron_file, errors='surrogate_or_strict'))
        else:
            self.assertEqual(cron_tab.cron_file, None)
        cron_tab.read()

    def test_do_remove_job(self):
        lines = []
        comment = 'test_comment'
        job = 'test_job'
        cron_tab = CronTab(user=None)
        result = cron_tab.do_remove_job(lines, comment, job)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()