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

    def test__update_job(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.lines = ["existing line"]
        result = instance._update_job("test job", "new job", lambda x, y, z: x.append(y + " " + z))
        self.assertTrue(result)
        self.assertEqual(instance.lines, ["existing line", "# test job new job"])

    def test_do_comment(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.do_comment("test job")
        self.assertEqual(result, "# test job")

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = str(instance)
        self.assertEqual(result, "CronTab instance")

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = repr(instance)
        self.assertEqual(result, "CronTab(module=<AnsibleModule object at 0x...>, user=None, cron_file=None)")

if __name__ == '__main__':
    unittest.main()