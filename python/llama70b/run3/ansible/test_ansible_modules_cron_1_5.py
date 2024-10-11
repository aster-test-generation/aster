import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertIsNotNone(instance.cron_cmd)

    def test_write(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.lines = ["test line"]
        with tempfile.NamedTemporaryFile() as f:
            instance.write(f.name)
            with open(f.name, 'r') as fh:
                self.assertEqual(fh.read(), "test line\n")

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.cron_file = "test_cron_file"
        with open("test_cron_file", 'w') as f:
            f.write("test line")
        instance.read()
        self.assertEqual(instance.lines, ["test line"])

    def test_render(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.lines = ["test line"]
        self.assertEqual(instance.render(), "test line\n")

    def test__write_execute(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertEqual(instance._write_execute("test_path"), "crontab test_path")

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertEqual(str(instance), "CronTab instance")

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertEqual(repr(instance), "CronTab(module=AnsibleModule())")

if __name__ == '__main__':
    unittest.main()