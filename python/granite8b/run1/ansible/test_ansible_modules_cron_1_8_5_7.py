import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_find_job(self):
        cron_tab = CronTab(None)
        cron_tab.lines = [
            '# comment',
            '0 5,2 * * ls -alh > /dev/null',
            '0 1,3 * * ls -alh > /dev/null',
            '0 4,6 * * ls -alh > /dev/null',
            '# ansible: name=check dirs',
            '0 5,2 * * ls -alh > /dev/null',
        ]
        job = '0 5,2 * * ls -alh > /dev/null'
        result = cron_tab.find_job('check dirs', job)
        self.assertEqual(result, ['# ansible: name=check dirs', '0 5,2 * * ls -alh > /dev/null', True])

if __name__ == '__main__':
    unittest.main()