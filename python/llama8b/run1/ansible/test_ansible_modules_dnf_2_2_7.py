import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.basic import AnsibleModule, errors 


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
        self.assertTrue(dnf_module.with_modules)

    def test_compare_evr(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._compare_evr('1.0', '1.0', '1.0', '2.0', '2.0', '2.0')
        self.assertEqual(result, 1)

    def test_compare_evr_equal(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._compare_evr('1.0', '1.0', '1.0', '1.0', '1.0', '1.0')
        self.assertEqual(result, 0)

    def test_compare_evr_greater(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._compare_evr('1.0', '1.0', '1.0', '0.9', '0.9', '0.9')
        self.assertEqual(result, 1)

    def test_compare_evr_less(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._compare_evr('1.0', '1.0', '1.0', '1.1', '1.1', '1.1')
        self.assertEqual(result, -1)

    def test_allowerasing(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        self.assertFalse(dnf_module.allowerasing)
        module.params['allowerasing'] = True
        dnf_module = dnf.DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_nobest(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        self.assertFalse(dnf_module.nobest)
        module.params['nobest'] = True
        dnf_module = dnf.DnfModule(module)
        self.assertTrue(dnf_module.nobest)

if __name__ == '__main__':
    unittest.main()