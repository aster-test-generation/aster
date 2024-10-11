import unittest
from ansible.module_utils.yumdnf import YumDnf
from ansible.module_utils import dnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = YumDnf()
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module)

    def test_split_package_arch(self):
        module = YumDnf()
        dnf_module = DnfModule(module)
        package_name = 'example-package.x86_64'
        name, arch = dnf_module._split_package_arch(package_name)
        self.assertEqual(name, 'example-package')
        self.assertEqual(arch, 'x86_64')

    def test_lockfile(self):
        module = YumDnf()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        module = YumDnf()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

    def test_with_modules(self):
        module = YumDnf()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.with_modules)

    def test_allowerasing(self):
        module = YumDnf()
        module.params['allowerasing'] = True
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_nobest(self):
        module = YumDnf()
        module.params['nobest'] = True
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.nobest)

if __name__ == '__main__':
    unittest.main()