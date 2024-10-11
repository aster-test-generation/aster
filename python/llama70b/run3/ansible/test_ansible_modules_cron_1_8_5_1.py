import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertIsNone(instance.cron_file)

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()
        self.assertIsNotNone(instance.lines)

    def test_add_env(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        decl = "FOO=bar"
        instance.add_env(decl)
        self.assertIn(decl, instance.lines)

    def test_add_env_insertafter(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        decl = "FOO=bar"
        insertafter = "BAZ=qux"
        instance.add_env(decl, insertafter=insertafter)
        self.assertIn(decl, instance.lines)
        self.assertGreater(instance.lines.index(decl), instance.lines.index(insertafter))

    def test_add_env_insertbefore(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        decl = "FOO=bar"
        insertbefore = "BAZ=qux"
        instance.add_env(decl, insertbefore=insertbefore)
        self.assertIn(decl, instance.lines)
        self.assertLess(instance.lines.index(decl), instance.lines.index(insertbefore))

    def test_find_env(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        decl = "FOO=bar"
        instance.lines = [decl]
        result = instance.find_env("FOO")
        self.assertEqual(result, [0])

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = str(instance)
        self.assertEqual(result, "CronTab instance")

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = repr(instance)
        self.assertEqual(result, "CronTab(module=AnsibleModule())")

if __name__ == '__main__':
    unittest.main()