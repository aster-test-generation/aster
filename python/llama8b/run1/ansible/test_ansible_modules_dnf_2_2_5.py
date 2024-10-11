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

    def test_split_package_arch(self):
        dnf_module = DnfModule(AnsibleModule())
        result = dnf_module._split_package_arch('package-name')
        self.assertEqual(result, ('package-name', None))

        result = dnf_module._split_package_arch('package-name.x86_64')
        self.assertEqual(result, ('package-name', 'x86_64'))

    def test__ensure_dnf(self):
        dnf_module = DnfModule(AnsibleModule())
        dnf_module._ensure_dnf()
        self.assertTrue(hasattr(dnf_module, 'with_modules'))

    def test__init__(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.allowerasing, False)
        self.assertEqual(dnf_module.nobest, False)

    def test_str_method(self):
        dnf_module = DnfModule(AnsibleModule())
        result = str(dnf_module)
        self.assertEqual(result, 'DnfModule')

    def test_repr_method(self):
        dnf_module = DnfModule(AnsibleModule())
        result = repr(dnf_module)
        self.assertEqual(result, 'DnfModule({})'.format(dnf_module.__dict__))

    def test_eq_method(self):
        dnf_module1 = DnfModule(AnsibleModule())
        dnf_module2 = DnfModule(AnsibleModule())
        self.assertTrue(dnf_module1 == dnf_module2)

        dnf_module3 = DnfModule(AnsibleModule(allowerasing=True))
        self.assertFalse(dnf_module1 == dnf_module3)

if __name__ == '__main__':
    unittest.main()