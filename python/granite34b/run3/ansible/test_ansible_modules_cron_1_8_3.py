import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_remove_job(self):
        # Test case for removing a job from the crontab
        cron = CronTab(module, user='user1')
        cron.lines = [
            '0 5,2 * * ls -alh > /dev/null',
            '1 3 * * echo "Hello, world!"',
            '2 4 * * rm -rf /tmp'
        ]
        cron.remove_job('check dirs')
        expected_lines = [
            '1 3 * * echo "Hello, world!"',
            '2 4 * * rm -rf /tmp'
        ]
        self.assertEqual(cron.lines, expected_lines)

    def test_add_job(self):
        # Test case for adding a job to the crontab
        cron = CronTab(module, user='user1')
        cron.lines = [
            '0 5,2 * * ls -alh > /dev/null',
            '1 3 * * echo "Hello, world!"'
        ]
        cron.add_job('check dirs', minute='0', hour='5,2', job='ls -alh > /dev/null')
        expected_lines = [
            '0 5,2 * * ls -alh > /dev/null',
            '1 3 * * echo "Hello, world!"',
            '0 5,2 * * ls -alh > /dev/null'
        ]
        self.assertEqual(cron.lines, expected_lines)

    def test_update_job(self):
        # Test case for updating a job in the crontab
        cron = CronTab(module, user='user1')
        cron.lines = [
            '0 5,2 * * ls -alh > /dev/null',
            '1 3 * * echo "Hello, world!"'
        ]
        cron.update_job('check dirs', minute='1', hour='3', job='echo "Hello, world!"')
        expected_lines = [
            '0 5,2 * * ls -alh > /dev/null',
            '1 3 * * echo "Hello, world!"'
        ]
        self.assertEqual(cron.lines, expected_lines)

class TestCronTab(unittest.TestCase):
    def test_remove_job(self):
        # Test case for removing a job
        cron = CronTab(module=None, user='testuser', cron_file='testfile')
        cron.lines = ['# some comment', '0 5,2 * * ls -alh > /dev/null', '0 5,2 * * rm -rf /']
        cron.remove_job('rm -rf /')
        self.assertEqual(cron.lines, ['# some comment', '0 5,2 * * ls -alh > /dev/null'])

if __name__ == '__main__':
    unittest.main()