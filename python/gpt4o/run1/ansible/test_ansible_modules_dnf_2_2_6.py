import unittest
from ansible.modules.dnf import DnfModule
from ansible.module_utils.basic import AnsibleModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec={
                'allowerasing': {'type': 'bool', 'default': False},
                'nobest': {'type': 'bool', 'default': False}
            }
        )
        self.dnf_module = DnfModule(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    def test_packagename_dict_rpm(self):
        result = self.dnf_module._packagename_dict('example-1.0-1.noarch.rpm')
        expected = {'name': 'example', 'epoch': '0', 'release': '1.noarch', 'version': '1.0'}
        self.assertEqual(result, expected)

    def test_packagename_dict_no_rpm(self):
        result = self.dnf_module._packagename_dict('example-1.0-1.noarch')
        expected = {'name': 'example', 'epoch': '0', 'release': '1.noarch', 'version': '1.0'}
        self.assertEqual(result, expected)

    def test_packagename_dict_invalid(self):
        result = self.dnf_module._packagename_dict('invalid-package-name')
        self.assertIsNone(result)

    def test_packagename_dict_with_epoch(self):
        result = self.dnf_module._packagename_dict('1:example-1.0-1.noarch.rpm')
        expected = {'name': 'example', 'epoch': '1', 'release': '1.noarch', 'version': '1.0'}
        self.assertEqual(result, expected)

    def test_packagename_dict_with_arch(self):
        result = self.dnf_module._packagename_dict('example-1.0-1.x86_64.rpm')
        expected = {'name': 'example', 'epoch': '0', 'release': '1.x86_64', 'version': '1.0'}
        self.assertEqual(result, expected)

    def test_packagename_dict_with_colon_in_name(self):
        result = self.dnf_module._packagename_dict('1:example-1.0-1.noarch.rpm')
        expected = {'name': 'example', 'epoch': '1', 'release': '1.noarch', 'version': '1.0'}
        self.assertEqual(result, expected)

    def test_packagename_dict_invalid_version(self):
        result = self.dnf_module._packagename_dict('example-abc-1.noarch.rpm')
        self.assertIsNone(result)

    def test_packagename_dict_attribute_error(self):
        with self.assertRaises(AttributeError):
            self.dnf_module._packagename_dict(None)

if __name__ == '__main__':
    unittest.main()