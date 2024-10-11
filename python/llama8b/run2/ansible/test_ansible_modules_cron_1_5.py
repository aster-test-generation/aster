import unittest
from ansible.modules.cron import CronTab
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.text.converters import to_bytes
from tempfile import mkstemp
from os import unlink, chmod
from os.path import join, isabs
from six.moves import shlex_quote


class TestCronTab(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.module, module)
        self.assertIsNone(cron_tab.user)
        self.assertTrue(cron_tab.root)
        self.assertIsNone(cron_tab.lines)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))

    def test_read(self):
        module = Ansiline
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_write(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        backup_file = mkstemp()[1]
        cron_tab.write(backup_file)
        unlink(backup_file)
        self.assertTrue(isabs(cron_tab.cron_file))

    def test_render(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.render(), '')

    def test__write_execute(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        path = mkstemp()[1]
        cron_tab._write_execute(path)
        unlink(path)

    def test_set_default_selinux_context(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        cron_tab.set_default_selinux_context('path', False)

    def test_module_fail_json(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        cron_tab.module.fail_json(msg='error')

    def test_module_run_command(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        rc, out, err = cron_tab.module.run_command('command', use_unsafe_shell=True)
        self.assertEqual(rc, 0)

    def test_to_bytes(self):
        cron_tab = CronTab(AnsibleModule())
        self.assertEqual(to_bytes('string', errors='surrogate_or_strict'), b'string')

    def test_shlex_quote(self):
        cron_tab = CronTab(AnsibleModule())
        self.assertEqual(shlex_quote('string'), "'string'")

    def test_join(self):
        cron_tab = CronTab(AnsibleModule())
        self.assertEqual(join('/etc/cron.d', 'file'), '/etc/cron.d/file')

    def test_isabs(self):
        cron_tab = CronTab(AnsibleModule())
        self.assertTrue(isabs('/etc/cron.d/file'))
        self.assertFalse(isabs('file'))

if __name__ == '__main__':
    unittest.main()