import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_cron_tab_init(self):
        cron_tab = CronTab(None)
        self.assertIsInstance(cron_tab, CronTab)

    def test_cron_tab_write(self):
        cron_tab = CronTab(None)
        cron_tab.write()
        self.assertEqual(cron_tab.lines, [])

    def test_cron_tab_render(self):
        cron_tab = CronTab(None)
        cron_tab.render()
        self.assertEqual(cron_tab.lines, [])

    def test_cron_tab__write_execute(self):
        cron_tab = CronTab(None)
        cron_tab._write_execute()
        self.assertEqual(cron_tab.lines, [])

    def test_cron_tab_set_default_selinux_context(self):
        cron_tab = CronTab(None)
        cron_tab.set_default_selinux_context()
        self.assertEqual(cron_tab.lines, [])

if __name__ == '__main__':
    unittest.main()