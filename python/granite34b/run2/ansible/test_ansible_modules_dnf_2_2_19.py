import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_dnf_module_init(self):
        module = None
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module)

    def test_dnf_module_install_remote_rpms(self):
        module = None
        dnf_module = DnfModule(module)
        filenames = ['file1.rpm', 'file2.rpm']
        dnf_module._install_remote_rpms(filenames)
        self.assertEqual(dnf_module.rpms_to_install, filenames)

    def test_dnf_module_install_local_rpms(self):
        module = None
        dnf_module = DnfModule(module)
        filenames = ['file1.rpm', 'file2.rpm']
        dnf_module._install_local_rpms(filenames)
        self.assertEqual(dnf_module.rpms_to_install, filenames)

    def test_dnf_module_install_packages(self):
        module = None
        dnf_module = DnfModule(module)
        packages = ['package1', 'package2']
        dnf_module._install_packages(packages)
        self.assertEqual(dnf_module.packages_to_install, packages)

    def test_dnf_module_remove_packages(self):
        module = None
        dnf_module = DnfModule(module)
        packages = ['package1', 'package2']
        dnf_module._remove_packages(packages)
        self.assertEqual(dnf_module.packages_to_remove, packages)

    def test_dnf_module_update_packages(self):
        module = None
        dnf_module = DnfModule(module)
        packages = ['package1', 'package2']
        dnf_module._update_packages(packages)
        self.assertEqual(dnf_module.packages_to_update, packages)

    def test_dnf_module_upgrade_system(self):
        module = None
        dnf_module = DnfModule(module)
        dnf_module._upgrade_system()
        self.assertEqual(dnf_module.system_upgraded, True)

    def test_dnf_module_autoremove_packages(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module._autoremove_packages()
        self.assertEqual(dnf_module.autoremoved, True)

    def test_dnf_module_clean_packages(self):
        module = None
        dnf_module = DnfModule(module)
        dnf_module._clean_packages()
        self.assertEqual(dnf_module.cleaned, True)

    def test_dnf_module_download_packages(self):
        module = None
        dnf_module = DnfModule(module)
        packages = ['package1', 'package2']
        dnf_module._download_packages(packages)
        self.assertEqual(dnf_module.downloaded_packages, packages)

    def test_dnf_module_download_rpms(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        rpms = ['rpm1', 'rpm2']
        dnf_module._download_rpms(rpms)
        self.assertEqual(dnf_module.downloaded_rpms, rpms)

    def test_dnf_module_download_rpms_from_url(self):
        module = None
        dnf_module = DnfModule(module)
        url = 'http://example.com/rpms'
        dnf_module._download_rpms_from_url(url)
        self.assertEqual(dnf_module.downloaded_rpms_from_url, url)

if __name__ == '__main__':
    unittest.main()