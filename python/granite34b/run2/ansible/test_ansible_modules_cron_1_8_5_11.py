import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_get_envnames(self):
        lines = [
            'ENV1=value1',
            'ENV2=value2',
            'ENV3=value3'
        ]
        cron_tab = CronTab(None, None, None)
        cron_tab.lines = lines
        envnames = cron_tab.get_envnames()
        self.assertEqual(envnames, ['ENV1', 'ENV2', 'ENV3'])

if __name__ == '__main__':
    unittest.main()