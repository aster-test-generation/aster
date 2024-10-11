import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule, to_text


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

    def test_sanitize_dnf_error_msg_install_no_package_matched(self):
        error_msg = 'no package matched'
        result = self.dnf_module._sanitize_dnf_error_msg_install('test-package', error_msg)
        self.assertEqual(result, 'No package test-package available.')

    def test_sanitize_dnf_error_msg_install_no_match_for_argument(self):
        error_msg = 'No match for argument: test-package'
        result = self.dnf_module._sanitize_dnf_error_msg_install('test-package', error_msg)
        self.assertEqual(result, 'No package test-package available.')

    def test_sanitize_dnf_error_msg_install_other_error(self):
        error_msg = 'Some other error'
        result = self.dnf_module._sanitize_dnf_error_msg_install('test-package', error_msg)
        self.assertEqual(result, 'Some other error')

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