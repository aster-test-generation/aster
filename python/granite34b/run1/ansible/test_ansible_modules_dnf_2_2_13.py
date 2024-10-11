import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_split_package_arch(self):
        dnf = DnfBase(AnsibleModule)
        name, arch = dnf._split_package_arch('example_package.x86_64')
        self.assertEqual(name, 'example_package')
        self.assertEqual(arch, 'x86_64')

    def test_is_installed(self):
        dnf = DnfModule(AnsibleModule)
        installed = dnf._is_installed('example_package')
        self.assertTrue(installed)

    def test_install_package(self):
        dnf = DnfModule(AnsibleModule)
        result = dnf.install_package('example_package')
        self.assertEqual(result, 'Package installed successfully')

    def test_remove_package(self):
        dnf = DnfBase(AnsibleModule)
        result = dnf.remove_package('example_package')
        self.assertEqual(result, 'Package removed successfully')

    def test_update_package(self):
        dnf = DnfModule(AnsibleModule)
        result = dnf.update_package('example_package')
        self.assertEqual(result, 'Package updated successfully')

    def test_list_packages(self):
        dnf = DnfModule(AnsibleModule)
        packages = dnf.list_packages()
        self.assertTrue('example_package' in packages)

    def test_list_updates(self):
        dnf = DnfModule(AnsibleModule)
        updates = dnf.list_updates()
        self.assertTrue('example_package' in updates)

    def test_clean_metadata(self):
        dnf = DnfModule(AnsibleModule)
        result = dnf.clean_metadata()
        self.assertEqual(result, 'Metadata cleaned successfully')

    def test_install_repoquery(self):
        dnf = DnfBase(AnsibleModule)
        result = dnf.install_repoquery()
        self.assertEqual(result, 'Repoquery installed successfully')

    def test_download_package(self):
        dnf = DnfModule(AnsibleModule)
        result = dnf.download_package('example_package')
        self.assertEqual(result, 'Package downloaded successfully')

    def test_install_weak_deps(self):
        dnf = DnfModule(AnsibleModule)
        result = dnf.install_weak_deps()
        self.assertEqual(result, 'Weak dependencies installed successfully')

    def test_lock_timeout(self):
        dnf = DnfBase(AnsibleModule)
        result = dnf.lock_timeout()
        self.assertEqual(result, 30)

    def test_install_weak_deps(self):
        dnf = DnfBase(AnsibleModule)
        result = dnf.install_weak_deps()
        self.assertEqual(result, 'Weak dependencies installed successfully')

    def test_allowerasing(self):
        dnf = DnfBase(AnsibleModule)
        result = dnf.allowerasing()
        self.assertEqual(result, False)

    def test_nobest(self):
        dnf = DnfModule(AnsibleModule)
        result = dnf.nobest()
        self.assertEqual(result, False)

    def test_cacheonly(self):
        dnf = DnfModule(AnsibleModule)
        result = dnf.cacheonly()
        self.assertEqual(result, False)

class TestDnfModule(unittest.TestCase):
    def test_split_package_arch(self):
        dnf_module = DnfModule(AnsibleModule({}))
        self.assertEqual(dnf_module._split_package_arch('foo-1.0-x86_64'), ('foo', 'x86_64'))
        self.assertEqual(dnf_module._split_package_arch('foo-1.0-x86_64.rpm'), ('foo', 'x86_64'))
        self.assertEqual(dnf_module._split_package_arch('foo.x86_64'), ('foo', 'x86_64'))
        self.assertEqual(dnf_module._split_package_arch('foo.noarch'), ('foo', 'noarch'))
        self.assertEqual(dnf_module._split_package_arch('foo'), ('foo', None))

    def test_is_installed(self):
        dnf_module = DnfModule(AnsibleModule({}))
        self.assertTrue(dnf_module._is_installed('foo'))
        self.assertFalse(dnf_module._is_installed('bar'))

if __name__ == '__main__':
    unittest.main()