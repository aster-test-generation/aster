import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.module, module)
        self.assertEqual(cron_tab.user, None)
        self.assertEqual(cron_tab.root, os.getuid() == 0)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertEqual(cron_tab.lines, [])

    def test_render(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.lines = ['cron1', 'cron2']
        result = cron_tab.render()
        self.assertEqual(result, 'cron1\ncron2\n')

    def test_read_cron_file(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module, cron_file='test_file')
        cron_tab.read()
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test_file')

    def test_read_cron_file_abs_path(self):
        from ansible.module_utils.basic import AnsibleModule
        cron_tab = CronTab(module, cron_file='/path/to/test_file')
        cron_tab.read()
        self.assertEqual(cron_tab.cron_file, '/path/to/test_file')

    def test_read_cron_file_non_abs_path(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module, cron_file='test_file')
        cron_tab.read()
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test_file')

    def test_get_cron_cmd(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.get_cron_cmd(), module.get_bin_path('crontab', required=True))

    def test_get_cron_cmd_abs_path(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.get_cron_cmd(), module.get_bin_path('crontab', required=True))

    def test_get_cron_cmd_non_abs_path(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.get_cron_cmd(), module.get_bin_path('crontab', required=True))

if __name__ == '__main__':
    unittest.main()