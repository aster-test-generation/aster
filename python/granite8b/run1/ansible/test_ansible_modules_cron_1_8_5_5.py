import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_do_remove_env(self):
        cron_tab = CronTab(None)
        lines = ['# my_env="value"', 'PATH=/usr/bin:$PATH']
        decl = 'my_env'
        result = cron_tab.do_remove_env(lines, decl)
        expected = ['PATH=/usr/bin:$PATH']
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()