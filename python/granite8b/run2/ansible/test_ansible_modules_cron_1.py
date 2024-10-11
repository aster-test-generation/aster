import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_cron_tab_init(self):
        cron_tab = CronTab(None)
        self.assertIsInstance(cron_tab, CronTab)

    def test_cron_tab_write(self):
        cron_tab = CronTab(None)
        cron_tab.write()

    def test_cron_tab_render(self):
        cron_tab = CronTab(None)
        rendered = cron_tab.render()
        self.assertIsInstance(rendered, str)

if __name__ == '__main__':
    unittest.main()