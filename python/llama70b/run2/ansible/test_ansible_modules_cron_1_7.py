import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertIsNone(instance.cron_file)

    def test___init__with_user(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module, user='test_user')
        self.assertIsNotNone(instance.module)
        self.assertEqual(instance.user, 'test_user')
        self.assertIsNone(instance.cron_file)

    def test___init__with_cron_file(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module, cron_file='test_cron_file')
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertEqual(instance.cron_file, 'test_cron_file')

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()
        self.assertIsNotNone(instance.lines)

    def test_add_job(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.add_job('test_name', 'test_job')
        self.assertIn('test_name', instance.lines)
        self.assertIn('test_job', instance.lines)

    def test_do_comment(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.do_comment('test_name')
        self.assertEqual(result, '# test_name')

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = str(instance)
        self.assertEqual(result, 'CronTab instance')

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = repr(instance)
        self.assertEqual(result, 'CronTab(module=<AnsibleModule object>, user=None, cron_file=None)')

if __name__ == '__main__':
    unittest.main()