import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_is_empty(self):
        cron_tab = CronTab(None)
        cron_tab.lines = []
        self.assertTrue(cron_tab.is_empty())
        cron_tab.lines = [' ', '\t', '# comment', '']
        self.assertFalse(cron_tab.is_empty())

    def test_read(self):
        cron_tab = CronTab(None)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_write_to_file(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['line1', 'line2']
        with tempfile.NamedTemporaryFile(mode='w+', delete=False) as temp_file:
            cron_tab.write_to_file(temp_file.name)
            with open(temp_file.name, 'r') as file:
                content = file.read()
                self.assertEqual(content, 'line1\nline2\n')

if __name__ == '__main__':
    unittest.main()