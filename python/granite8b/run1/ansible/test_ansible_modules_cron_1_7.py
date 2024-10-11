import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_add_job(self):
        cron_tab = CronTab(None)
        cron_tab.lines = []
        cron_tab.add_job('test_job', 'echo "Hello, World!"')
        self.assertEqual(len(cron_tab.lines), 2)
        self.assertEqual(cron_tab.lines[0], '# test_job')
        self.assertEqual(cron_tab.lines[1], 'echo "Hello, World!"')

    def test_do_comment(self):
        cron_tab = CronTab(None)
        self.assertEqual(cron_tab.do_comment('test_job'), '# test_job')

    def test_read(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['# test_job', 'echo "Hello, World!"']
        cron_tab.read()
        self.assertEqual(len(cron_tab.lines), 2)
        self.assertEqual(cron_tab.lines[0], '# test_job')
        self.assertEqual(cron_tab.lines[1], 'echo "Hello, World!"')

    def test_write_to_file(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['# test_job', 'echo "Hello, World!"']
        with tempfile.NamedTemporaryFile(mode='w+', delete=False) as temp_file:
            cron_tab.write_to_file(temp_file.name)
            with open(temp_file.name, 'r') as f:
                self.assertEqual(f.readlines(), ['# test_job', 'echo "Hello, World!"'])

if __name__ == '__main__':
    unittest.main()