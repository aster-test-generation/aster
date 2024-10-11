import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible_collections community.general.plugins.module_utils.dnf import DnfModul


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(dnf_module.with_modules)

    def test_allowerasing(self):
        module = AnsibleModule()
        module.params['allowerasing'] = True
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_nobest(self):
        module = AnsibleModule()
        module.params['nobest'] = True
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.nobest)

    def test_private_method(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        with self.assertRaises(ImportError):
            dnf_module.__private_method()

    def test_protected_method(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        with self.assertRaises(ImportError):
            dnf_module._protected_method()

    def test_magic_method_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.__init__(module), None)

    def test_magic_method_str(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test_magic_method_repr(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule({})'.format(module))

    def test_magic_method_eq(self):
        module1 = AnsibleModule()
        module2 = AnsibleModule()
        dnf_module1 = DnfModule(module1)
        dnf_module2 = DnfModule(module2)
        self.assertEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()