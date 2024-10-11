import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_do_add_env(self):
        cron_tab = CronTab(None)
        lines = []
        cron_tab.do_add_env(lines, 'PATH=/usr/local/bin:/usr/bin:/bin')
        self.assertEqual(lines, ['PATH=/usr/local/bin:/usr/bin:/bin'])

if __name__ == '__main__':
    unittest.main()