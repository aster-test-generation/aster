import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_dnf_module_init(self):
        module = None
        dnf = DnfModule(module)
        self.assertEqual(dnf.module, module)
        self.assertEqual(dnf.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf.with_modules, False)
        self.assertEqual(dnf.allowerasing, False)
        self.assertEqual(dnf.nobest, False)

    def test_dnf_module_configure_base(self):
        class Base:
        conf_file = '/path/to/conf_file'
        disable_gpg_check = True
        installroot = '/'
        dnf = DnfModule(AnsibleModule())
        dnf._configure_base(base, conf_file, disable_gpg_check, installroot)
        self.assertEqual(base.conf.config_file_path, conf_file)
        self.assertEqual(base.conf.gpgcheck, False)
        self.assertEqual(base.conf.localpkg_gpgcheck, False)
        self.assertEqual(base.conf.assumeyes, True)
        self.assertEqual(base.conf.installroot, installroot)
        self.assertEqual(base.conf.substitutions['releasever'], None)
        self.assertEqual(base.conf.strict, 0)
        self.assertEqual(base.conf.best, 0)
        self.assertEqual(base.conf.downloadonly, False)
        self.assertEqual(base.conf.cacheonly, False)
        self.assertEqual(base.conf.clean_requirements_on_remove, False)
        self.assertEqual(base.conf.install_weak_deps, True)

    def test_dnf_module_install_packages(self):
        dnf = DnfModule(AnsibleModule())
        packages = ['package1', 'package2']
        dnf.install_packages(packages)
        self.assertEqual(dnf.install_result, 'success')

    def test_dnf_module_remove_packages(self):
        from ansible.module_utils.basic import AnsibleModule
        packages = ['package1', 'package2']
        dnf.remove_packages(packages)
        self.assertEqual(dnf.remove_result, 'success')

    def test_dnf_module_update_packages(self):
        dnf = DnfBase(AnsibleModule())
        packages = ['package1', 'package2']
        dnf.update_packages(packages)
        self.assertEqual(dnf.update_result, 'success')

    def test_dnf_module_upgrade_system(self):
        dnf = DnfModule(AnsibleModule())
        dnf.upgrade_system()
        self.assertEqual(dnf.upgrade_result, 'success')

    def test_dnf_module_autoremove_packages(self):
        dnf = DnfModule(AnsibleModule())
        dnf.autoremove_packages()
        self.assertEqual(dnf.autoremove_result, 'success')

    def test_dnf_module_list_installed_packages(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf.list_installed_packages()
        self.assertEqual(dnf.list_result, 'success')

    def test_dnf_module_list_available_packages(self):
        dnf = DnfBase(AnsibleModule())
        dnf.list_available_packages()
        self.assertEqual(dnf.list_result, 'success')

    def test_dnf_module_list_updates(self):
        dnf = DnfBase(AnsibleModule())
        dnf.list_updates()
        self.assertEqual(dnf.list_result, 'success')

if __name__ == '__main__':
    unittest.main()