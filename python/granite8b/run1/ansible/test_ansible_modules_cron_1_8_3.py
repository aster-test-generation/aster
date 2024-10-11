import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_remove_job(self):
        cron_tab = CronTab(None)
        cron_tab.lines = [
            "0 5,2 * * ls -alh > /dev/null",
            "# Another job",
            "0 1,3 * * ls -alh > /dev/null",
        ]
        cron_tab.n_existing = 2
        cron_tab.remove_job("check dirs")
        self.assertEqual(cron_tab.lines, [
            "# Another job",
            "0 1,3 * * ls -alh > /dev/null",
        ])

if __name__ == '__main__':
    unittest.main()