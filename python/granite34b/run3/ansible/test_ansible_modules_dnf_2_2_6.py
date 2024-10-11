import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_split_package_arch(self):
        dnf = DnfBase(AnsibleModule({}))
        self.assertEqual(dnf._split_package_arch('package.x86_64'), ('package', 'x86_64'))
        self.assertEqual(dnf._split_package_arch('package.noarch'), ('package', 'noarch'))
        self.assertEqual(dnf._split_package_arch('package'), ('package', None))

    def test_ensure_dnf(self):
        dnf = DnfBase(AnsibleModule({}))
        dnf._ensure_dnf()
        self.assertIsNotNone(dnf.dnf)

    def test_install_package(self):
        dnf = DnfModule(AnsibleModule({}))
        dnf._install_package('package')
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_remove_package(self):
        dnf = DnfBase(AnsibleModule({}))
        dnf._remove_package('package')
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_update_package(self):
        dnf = DnfBase(AnsibleModule({}))
        dnf._update_package('package')
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_list_packages(self):
        dnf = DnfBase(AnsibleModule({}))
        dnf._list_packages()
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_list_upgrades(self):
        dnf = DnfModule(AnsibleModule({}), MagicMock())
        dnf._list_upgrades()
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_list_available(self):
        dnf = DnfBase(AnsibleModule({}))
        dnf._list_available()
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_list_installed(self):
        dnf = DnfBase(AnsibleModule({}))
        dnf._list_installed()
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_list_repos(self):
        dnf = DnfModule(AnsibleModule({}))
        dnf._list_repos()
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_install_repo(self):
        dnf = DnfBase(AnsibleModule({}))
        dnf._install_repo('repo')
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_remove_repo(self):
        dnf = DnfBase(AnsibleModule({}))
        dnf._remove_repo('repo')
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_update_repo(self):
        dnf = DnfModule(AnsibleModule({}))
        dnf._update_repo('repo')
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_install_plugin(self):
        dnf = DnfBase(AnsibleModule({}))
        dnf._install_plugin('plugin')
        self.assertEqual(dnf.module.exit_json.call_count, 1)

    def test_remove_plugin(self):
        dnf = DnfModule(AnsibleModule({}), MagicMock())
        dnf._remove_plugin('plugin')
        self.assertEqual(dnf.module.exit_json.call_count, 1)

if __name__ == '__main__':
    unittest.main()