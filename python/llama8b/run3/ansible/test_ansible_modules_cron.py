import unittest
from ansible.modules.cron import CronTab
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.text.converters import to_bytes, to_native
from ansible.module_utils.six.moves import shlex_quote


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule()
        self.crontab = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.crontab.module, self.module)
        self.assertIsNone(self.crontab.user)
        self.assertTrue(self.crontab.root)
        self.assertIsNone(self.crontab.lines)
        self.assertEqual(self.crontab.cron_cmd, self.module.get_bin_path('crontab', required=True))

    def test_read(self):
        self.crontab.read()
        self.assertIsNotNone(self.crontab.lines)

    def test_do_comment(self):
        result = self.crontab.do_comment('test')
        self.assertEqual(result, '%s%s' % (self.crontab.ansible, 'test'))

    def test__init__(self):
        with self.assertRaises(AttributeError):
            CronTab(None, user='test', cron_file='test')

    def test__str__(self):
        result = str(self.crontab)
        self.assertEqual(result, 'CronTab')

    def test__repr__(self):
        result = repr(self.crontab)
        self.assertEqual(result, 'CronTab(%s)' % self.module.get_bin_path('crontab', required=True))

    def test__eq__(self):
        crontab2 = CronTab(self.module)
        self.assertEqual(self.crontab, crontab2)

    def test__ne__(self):
        crontab2 = object()
        self.assertNotEqual(self.crontab, crontab2)

if __name__ == '__main__':
    unittest.main()