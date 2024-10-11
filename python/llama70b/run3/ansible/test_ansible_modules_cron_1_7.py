import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertIsNotNone(instance.cron_cmd)

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()
        self.assertIsNotNone(instance.lines)

    def test_add_job(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.add_job('test_job', 'ls -alh > /dev/null')
        self.assertIn('test_job', instance.lines)
        self.assertIn('ls -alh > /dev/null', instance.lines)

    def test_do_comment(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.do_comment('test_job')
        self.assertEqual(result, '# test_job')

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = str(instance)
        self.assertEqual(result, 'CronTab instance')

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = repr(instance)
        self.assertEqual(result, 'CronTab(module=AnsibleModule, user=None, cron_file=None)')

if __name__ == '__main__':
    unittest.main()