import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

    def test__init__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

    def test__ensure_dnf(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(hasattr(dnf_module, 'with_modules'))

    def test_sanitize_dnf_error_msg_remove(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        spec = 'httpd'
        error = 'no package matched'
        result, msg = dnf_module._sanitize_dnf_error_msg_remove(spec, error)
        self.assertFalse(result)
        self.assertEqual(msg, 'httpd is not installed')

    def test_str(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test_repr(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule(module)')

    def test_eq(self):
        from ansible.module_utils.basic import AnsibleModule
        module2 = AnsibleModule({'name': 'httpd', 'state': 'present'})
        dnf_module1 = DnfModule(module1)
        dnf_module2 = DnfModule(module2)
        self.assertEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()