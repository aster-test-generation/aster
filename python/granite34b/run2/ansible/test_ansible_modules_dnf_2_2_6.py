import unittest
from ansible.module_utils.yumdnf import YumDnf
from ansible.module_utils.dnf_module import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = MagicMock()
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, YumDnf)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(dnf_module.with_modules)
        self.assertFalse(dnf_module.allowerasing)
        self.assertFalse(dnf_module.nobest)

    def test_packagename_dict(self):
        module = MagicMock()
        dnf_module = DnfModule(module)
        packagename = 'example-package.rpm'
        expected_result = {
            'name': 'example-package',
            'epoch': '0',
            'release': None,
            'version': None
        }
        result = dnf_module._packagename_dict(packagename)
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()