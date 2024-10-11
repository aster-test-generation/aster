import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.text.converters import to_bytes, to_native
from ansible.module_utils.six.moves import shlex_quote
from ansible.modules.cron import *


class TestCron(unittest.TestCase):
    def test_cron_init(self):
        module = AnsibleModule()
        instance = Cron(module)
        self.assertEqual(instance.module, module)

    def test_cron_name(self):
        module = AnsibleModule()
        instance = Cron(module)
        result = instance._Cron__name("test_cron")
        self.assertEqual(result, "test_cron")

    def test_cron_minute(self):
        module = AnsibleModule()
        instance = Cron(module)
        result = instance._Cron__minute("0")
        self.assertEqual(result, "0")

    def test_cron_hour(self):
        module = AnsibleModule()
        instance = Cron(module)
        result = instance._Cron__hour("5,2")
        self.assertEqual(result, "5,2")

    def test_cron_job(self):
        module = AnsibleModule()
        instance = Cron(module)
        result = instance._Cron__job("ls -alh > /dev/null")
        self.assertEqual(result, "ls -alh > /dev/null")

    def test_cron_str(self):
        module = AnsibleModule()
        instance = Cron(module)
        result = instance.__str__()
        self.assertEqual(result, "Cron")

    def test_cron_repr(self):
        module = AnsibleModule()
        instance = Cron(module)
        result = instance.__repr__()
        self.assertEqual(result, "Cron({})".format(instance.module))

    def test_cron_eq(self):
        module = AnsibleModule()
        instance1 = Cron(module)
        instance2 = Cron(module)
        self.assertEqual(instance1, instance2)

    def test_cron_ne(self):
        module = AnsibleModule()
        instance1 = Cron(module)
        instance2 = object()
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()