import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_get_envnames(self):
        cron_tab = CronTab(None)
        cron_tab.lines = [
            'PATH=/usr/local/bin:/usr/bin:/bin',
            'MY_VAR=value',
            'ANOTHER_VAR=another_value'
        ]
        envnames = cron_tab.get_envnames()
        self.assertEqual(envnames, ['PATH', 'MY_VAR', 'ANOTHER_VAR'])

if __name__ == '__main__':
    unittest.main()