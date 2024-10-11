import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import yu


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(hasattr(dnf_module, 'with_modules'))

    def test_compare_evr(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._compare_evr('1.0', '1.0', '1.0', '1.1', '1.1', '1.1')
        self.assertEqual(result, 0)

    def test_compare_evr2(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._compare_evr('1.0', '1.0', '1.0', '1.2', '1.1', '1.1')
        self.assertLess(result, 0)

    def test_compare_evr3(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._compare_evr('1.2', '1.1', '1.1', '1.0', '1.0', '1.0')
        self.assertGreater(result, 0)

    def test_str(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = str(dnf_module)
        self.assertEqual(result, 'dnf')

    def test_repr(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = repr(dnf_module)
        self.assertEqual(result, 'dnf.DnfModule(AnsibleModule())')

    def test_eq(self):
        dnf_module1 = dnf.DnfModule(AnsibleModule())
        dnf_module2 = dnf.DnfModule(AnsibleModule())
        self.assertEqual(dnf_module1, dnf_module2)

    def test_ne(self):
        dnf_module1 = dnf.DnfModule(AnsibleModule())
        dnf_module2 = object()
        self.assertNotEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()