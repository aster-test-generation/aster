import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.basic import AnsibleModule, missing_required_li


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_list_items_installed(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        results = dnf_module.list_items('installed')
        self.assertIsInstance(results, list)

    def test_list_items_upgrades(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        results = dnf_module.list_items('upgrades')
        self.assertIsInstance(results, list)

    def test_list_items_available(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        results = dnf_module.list_items('available')
        self.assertIsInstance(results, list)

    def test_list_items_repos(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        results = dnf_module.list_items('repos')
        self.assertIsInstance(results, list)

    def test_list_items_command_error(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        with self.assertRaises(AttributeError):
            dnf_module.list_items('non_existent_command')

    def test_allowerasing(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.allowerasing)

    def test_nobest(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.nobest)

    def test_private_method(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        with self.assertRaises(NotImplementedError):
            dnf_module._private_method()

    def test_protected_method(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        with self.assertRaises(NotImplementedError):
            dnf_module._protected_method()

    def test_magic_method_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.__class__, DnfModule)

    def test_magic_method_str(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertIsInstance(str(dnf_module), str)

    def test_magic_method_repr(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertIsInstance(repr(dnf_module), str)

    def test_magic_method_eq(self):
        module = AnsibleModule()
        dnf_module1 = DnfModule(module)
        dnf_module2 = DnfModule(module)
        self.assertEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()