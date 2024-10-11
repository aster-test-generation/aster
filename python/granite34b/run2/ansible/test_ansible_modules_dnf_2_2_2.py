import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.yumdnf import YumDnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        from unittest.mock import MagicMock
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertEqual(dnf_module.allowerasing, False)
        self.assertEqual(dnf_module.nobest, False)

    def test_sanitize_dnf_error_msg_install(self):
        from unittest.mock import MagicMock
        dnf_module = DnfModule(module)
        spec = 'httpd'
        error = 'No package httpd available.'
        self.assertEqual(dnf_module._sanitize_dnf_error_msg_install(spec, error), 'No package httpd available.')

if __name__ == '__main__':
    unittest.main()