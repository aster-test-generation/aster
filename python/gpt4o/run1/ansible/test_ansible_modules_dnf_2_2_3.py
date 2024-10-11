import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule, to_native


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'allowerasing': True,
            'nobest': False
        }
        self.dnf_module = DnfModuleImplementation(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertTrue(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    def test_sanitize_dnf_error_msg_remove_no_package_matched(self):
        spec = 'test-package'
        error = 'no package matched'
        result = self.dnf_module._sanitize_dnf_error_msg_remove(spec, error)
        self.assertEqual(result, (False, 'test-package is not installed'))

    def test_sanitize_dnf_error_msg_remove_no_match_for_argument(self):
        spec = 'test-package'
        error = 'No match for argument: test-package'
        result = self.dnf_module._sanitize_dnf_error_msg_remove(spec, error)
        self.assertEqual(result, (False, 'test-package is not installed'))

    def test_sanitize_dnf_error_msg_remove_other_error(self):
        spec = 'test-package'
        error = 'some other error'
        result = self.dnf_module._sanitize_dnf_error_msg_remove(spec, error)
        self.assertEqual(result, (True, 'some other error'))

    def test_with_modules_attribute(self):
        with patch('ansible.modules.dnf.dnf.base.WITH_MODULES', True):
            dnf_module = DnfModule(self.module)
            self.assertTrue(dnf_module.with_modules)

        with patch('ansible.modules.dnf.dnf.base.WITH_MODULES', False):
            dnf_module = DnfModule(self.module)
            self.assertFalse(dnf_module.with_modules)

    def test_with_modules_attribute_missing(self):
        with patch('ansible.modules.dnf.dnf.base', new_callable=MagicMock) as mock_base:
            del mock_base.WITH_MODULES
            dnf_module = DnfModule(self.module)
            self.assertFalse(dnf_module.with_modules)

if __name__ == '__main__':
    unittest.main()