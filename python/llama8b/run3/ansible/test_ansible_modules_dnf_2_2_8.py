import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.ansible_module import AnsibleModule


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

    def test_allowerasing(self):
        module = AnsibleModule()
        module.params['allowerasing'] = True
        dnf_module = dnf.DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_nobest(self):
        module = AnsibleModule()
        module.params['nobest'] = True
        dnf_module = dnf.DnfModule(module)
        self.assertTrue(dnf_module.nobest)

    def test_get_best_parsable_locale(self):
        locale = get_best_parsable_locale(AnsibleModule())
        self.assertIsInstance(locale, str)

    def test_has_respawned(self):
        self.assertTrue(has_respawned())

    def test_probe_interpreters_for_module(self):
        interpreters = probe_interpreters_for_module(['/usr/libexec/platform-python', '/usr/bin/python3', '/usr/bin/python2', '/usr/bin/python'])
        self.assertIsInstance(interpreters, list)

    def test_respawn_module(self):
        interpreter = '/usr/bin/python'
        respawn_module(interpreter)
        self.assertTrue(True)

    def test_yumdnf_argument_spec(self):
        spec = yumdnf_argument_spec()
        self.assertIsInstance(spec, dict)

    def test_YumDnf(self):
        yumdnf = YumDnf(AnsibleModule())
        self.assertIsInstance(yumdnf, YumDnf)

if __name__ == '__main__':
    unittest.main()