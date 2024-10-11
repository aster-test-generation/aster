import unittest
from ansible.modules.cron import CronTab

class TestCronTab(unittest.TestCase):
    def test_init(self):
        cron_tab = CronTab(None)
        self.assertEqual(cron_tab.root, True)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, 'ansible')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, 'crontab')
        self.assertEqual(cron_tab.cron_file, None)
        self.assertEqual(cron_tab.b_cron_file, None)

    def test_read(self):
        cron_tab = CronTab(None)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)
        self.assertGreater(len(cron_tab.lines), 0)

    def test_write_to_file(self):
        cron_tab = CronTab(None)
        cron_tab.read()
        with tempfile.NamedTemporaryFile() as temp_file:
            cron_tab.write_to_file(temp_file.name)
            with open(temp_file.name, 'r') as f:
                lines = f.readlines()
                self.assertEqual(len(lines), len(cron_tab.lines))
                for line in lines:
                    self.assertIn(line, cron_tab.lines)

if __name__ == '__main__':
    unittest.main()