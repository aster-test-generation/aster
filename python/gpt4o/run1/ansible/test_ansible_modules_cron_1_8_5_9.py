import unittest
from ansible.modules.cron import CronTab
from ansible.module_utils.basic import AnsibleModule


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(argument_spec={})
        self.cron_tab = CronTab(self.module, user='testuser', cron_file='/etc/cron.d/testcron')

    def test_init(self):
        self.assertEqual(self.cron_tab.user, 'testuser')
        self.assertTrue(self.cron_tab.root)
        self.assertIsNone(self.cron_tab.lines)
        self.assertIsNotNone(self.cron_tab.cron_cmd)
        self.assertEqual(self.cron_tab.cron_file, '/etc/cron.d/testcron')

    def test_get_cron_job(self):
        result = self.cron_tab.get_cron_job('0', '5,2', '*', '*', '*', 'ls -alh > /dev/null', None, False)
        self.assertEqual(result, '0 5,2 * * * ls -alh > /dev/null')

    def test_get_cron_job_with_special(self):
        result = self.cron_tab.get_cron_job('*', '*', '*', '*', '*', 'ls -alh > /dev/null', 'reboot', False)
        self.assertEqual(result, '@reboot ls -alh > /dev/null')

    def test_get_cron_job_with_disabled(self):
        result = self.cron_tab.get_cron_job('0', '5,2', '*', '*', '*', 'ls -alh > /dev/null', None, True)
        self.assertEqual(result, '#0 5,2 * * * ls -alh > /dev/null')

    def test_get_cron_job_with_special_and_disabled(self):
        result = self.cron_tab.get_cron_job('*', '*', '*', '*', '*', 'ls -alh > /dev/null', 'reboot', True)
        self.assertEqual(result, '#@reboot ls -alh > /dev/null')

    def test_get_cron_job_with_cron_file(self):
        self.cron_tab.cron_file = '/etc/cron.d/testcron'
        result = self.cron_tab.get_cron_job('0', '5,2', '*', '*', '*', 'ls -alh > /dev/null', None, False)
        self.assertEqual(result, '0 5,2 * * * testuser ls -alh > /dev/null')

    def test_get_cron_job_with_special_and_cron_file(self):
        self.cron_tab.cron_file = '/etc/cron.d/testcron'
        result = self.cron_tab.get_cron_job('*', '*', '*', '*', '*', 'ls -alh > /dev/null', 'reboot', False)
        self.assertEqual(result, '@reboot testuser ls -alh > /dev/null')

    def test_get_cron_job_with_disabled_and_cron_file(self):
        self.cron_tab.cron_file = '/etc/cron.d/testcron'
        result = self.cron_tab.get_cron_job('0', '5,2', '*', '*', '*', 'ls -alh > /dev/null', None, True)
        self.assertEqual(result, '#0 5,2 * * * testuser ls -alh > /dev/null')

    def test_get_cron_job_with_special_disabled_and_cron_file(self):
        self.cron_tab.cron_file = '/etc/cron.d/testcron'
        result = self.cron_tab.get_cron_job('*', '*', '*', '*', '*', 'ls -alh > /dev/null', 'reboot', True)
        self.assertEqual(result, '#@reboot testuser ls -alh > /dev/null')

if __name__ == '__main__':
    unittest.main()