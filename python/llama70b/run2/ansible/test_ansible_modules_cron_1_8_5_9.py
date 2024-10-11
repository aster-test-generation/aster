import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertIsNone(instance.cron_file)

    def test_get_cron_job(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.get_cron_job('0', '5,2', '*', '*', '*', 'ls -alh > /dev/null', False, False)
        self.assertEqual(result, '0 5,2 * * * ls -alh > /dev/null')

    def test_get_cron_job_disabled(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.get_cron_job('0', '5,2', '*', '*', '*', 'ls -alh > /dev/null', False, True)
        self.assertEqual(result, '# 0 5,2 * * * ls -alh > /dev/null')

    def test_get_cron_job_special(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.get_cron_job(None, None, None, None, None, 'ls -alh > /dev/null', '@hourly', False)
        self.assertEqual(result, '@hourly ls -alh > /dev/null')

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()  # This method doesn't return anything, so we can't assert a value
        self.assertIsNotNone(instance.lines)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = str(instance)
        self.assertEqual(result, 'CronTab instance')

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = repr(instance)
        self.assertEqual(result, 'CronTab(module=AnsibleModule())')

if __name__ == '__main__':
    unittest.main()