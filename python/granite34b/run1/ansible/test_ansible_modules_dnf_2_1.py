import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.urls import fetch_file
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertIsInstance(dnf, DnfModule)

    def test_ensure_dnf(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        dnf._ensure_dnf()
        self.assertIsNotNone(dnf.dnf)

    def test_lockfile(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertEqual(dnf.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertEqual(dnf.pkg_mgr_name, 'dnf')

    def test_with_modules(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        try:
            self.assertTrue(dnf.with_modules)
        except AttributeError:
            self.assertFalse(dnf.with_modules)

    def test_allowerasing(self):
        module = AnsibleModule( yumdnf_argument_spec )
        dnf = DnfModule(module)
        self.assertEqual(dnf.allowerasing, module.params['allowerasing'])

    def test_nobest(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertEqual(dnf.nobest, module.params['nobest'])

class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module)

    def test_ensure_dnf(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(dnf_module.dnf)

    def test_get_available_packages(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        packages = dnf_module.get_available_packages()
        self.assertTrue(packages)

    def test_get_installed_packages(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        packages = dnf_module.get_installed_packages()
        self.assertTrue(packages)

    def test_get_updates(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        updates = dnf_module.get_updates()
        self.assertTrue(updates)

    def test_install(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        result = dnf_module.install()
        self.assertTrue(result)

    def test_remove(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        result = dnf_module.remove()
        self.assertTrue(result)

    def test_upgrade(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        result = dnf_module.upgrade()
        self.assertTrue(result)

    def test_list_transactions(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        transactions = dnf_module.list_transactions()
        self.assertTrue(transactions)

    def test_has_transactions(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        has_transactions = dnf_module.has_transactions()
        self.assertTrue(has_transactions)

if __name__ == '__main__':
    unittest.main()