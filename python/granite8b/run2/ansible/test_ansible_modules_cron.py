import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_do_comment(self):
        cron_tab = CronTab(None)
        name = "test_job"
        comment = cron_tab.do_comment(name)
        self.assertEqual(comment, f"{cron_tab.ansible}{name}")

    def test_read(self):
        cron_tab = CronTab(None)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_write_to_tempfile(self):
        cron_tab = CronTab(None)
        cron_tab.read()
        with tempfile.NamedTemporaryFile(mode="w+", delete=False) as f:
            cron_tab.write_to_tempfile(f)
            self.assertTrue(os.path.exists(f.name))

if __name__ == '__main__':
    unittest.main()