import unittest
from ansible.modules.cron import CronTab

class TestCronTab(unittest.TestCase):
    def test_remove_job(self):
        # Test case for removing a job
        cron = CronTab(module=None, user='testuser', cron_file='testfile')
        cron.lines = ['# some comment', '0 5,2 * * ls -alh > /dev/null', '0 5,2 * * rm -rf /']
        cron.remove_job('rm -rf /')
        self.assertEqual(cron.lines, ['# some comment', '0 5,2 * * ls -alh > /dev/null'])

if __name__ == '__main__':
    unittest.main()