import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module)

    def test_is_lockfile_pid_valid(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.is_lockfile_pid_valid())

    def test_ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(dnf_module.dnf)

    def test_get_available_packages(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        packages = dnf_module.get_available_packages()
        self.assertTrue(packages)

    def test_get_installed_packages(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        packages = dnf_module.get_installed_packages()
        self.assertTrue(packages)

    def test_get_package_info(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        package_info = dnf_module.get_package_info()
        self.assertTrue(package_info)

    def test_install_packages(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.install_packages()
        self.assertTrue(result)

    def test_remove_packages(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.remove_packages()
        self.assertTrue(result)

    def test_update_packages(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.update_packages()
        self.assertTrue(result)

    def test_has_package(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.has_package()
        self.assertTrue(result)

    def test_has_packages(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.has_packages()
        self.assertTrue(result)

    def test_get_package_version(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        version = dnf_module.get_package_version()
        self.assertTrue(version)

    def test_get_package_versions(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        versions = dnf_module.get_package_versions()
        self.assertTrue(versions)

    def test_get_package_arch(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        arch = dnf_module.get_package_arch()
        self.assertTrue(arch)

    def test_get_package_arches(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        arches = dnf_module.get_package_arches()
        self.assertTrue(arches)

    def test_get_package_release(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        release = dnf_module.get_package_release()
        self.assertTrue(release)

    def test_get_package_releases(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        releases = dnf_module.get_package_releases()
        self.assertTrue(releases)

if __name__ == '__main__':
    unittest.main()