import os
import tempfile
from ansible.module_utils.cron import CronItem
import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = cron_module.AnsibleModule()
        self.cron_file = tempfile.NamedTemporaryFile(mode='w+', delete=False)
        self.cron_file.close()

    def tearDown(self):
        os.remove(self.cron_file.name)

    def test_cron_tab_init(self):
        cron_tab = cron_module.CronTab(self.module, cron_file=self.cron_file.name)
        self.assertEqual(cron_tab.cron_file, self.cron_file.name)

    def test_cron_tab_read(self):
        cron_tab = cron_module.CronTab(self.module, cron_file=self.cron_file.name)
        cron_tab.read()
        self.assertEqual(cron_tab.lines, [])

    def test_cron_tab_write(self):
        cron_tab = cron_module.CronTab(self.module, cron_file=self.cron_file.name)
        cron_tab.write()
        with open(self.cron_file.name, 'r') as f:
            self.assertEqual(f.read(), '')

    def test_cron_tab_add_cron_job(self):
        cron_tab = cron_module.CronTab(self.module, cron_file=self.cron_file.name)
        cron_tab.add_cron_job(name='test', minute='0', hour='0', job='echo "test"')
        cron_tab.write()
        with open(self.cron_file.name, 'r') as f:
            self.assertEqual(f.read(), '#ansible: test\n0 0 * * echo "test"\n')

    def test_cron_tab_add_cron_job_with_special_characters(self):
        cron_tab = cron_module.CronTab(self.module, cron_file=self.cron_file.name)
        cron_tab.add_cron_job(name='test', minute='0', hour='0', job='echo "test & special characters #$%*@!"')
        cron_tab.write()
        with open(self.cron_file.name, 'r') as f:
            self.assertEqual(f.read(), '#ansible: test\n0 0 * * echo "test &amp; special characters #$%*@!"\n')

    def test_cron_tab_add_cron_job_with_environment_variables(self):
        cron_tab = cron_module.CronTab(self.module, cron_file=self.cron_file.name)
        cron_tab.add_cron_job(name='test', minute='0', hour='0', job='echo "test"', env={'TEST_VAR': 'test_value'})
        cron_tab.write()
        with open(self.cron_file.name, 'r') as f:
            self.assertEqual(f.read(), '#ansible: test\n0 0 * * TEST_VAR=test_value echo "test"\n')

    def test_cron_tab_add_cron_job_with_comments(self):
        cron_tab = cron_module.CronTab(self.module, cron_file=self.cron_file.name)
        cron_tab.add_cron_job(name='test', minute='0', hour='0', job='echo "test"', comments=['This is a test'])
        cron_tab.write()
        with open(self.cron_file.name, 'r') as f:
            self.assertEqual(f.read(), '#ansible: test\n# This is a test\n0 0 * * echo "test"\n')

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