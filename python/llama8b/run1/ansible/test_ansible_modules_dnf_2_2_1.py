import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import dnf as dnf_module_utils


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

    def test_ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module._ensure_dnf())

    def test_is_lockfile_pid_valid(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.is_lockfile_pid_valid())

    def test_allowerasing(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.allowerasing)

    def test_nobest(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.nobest)

    def test_with_modules(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.with_modules)

    def test_lockfile(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

if __name__ == '__main__':
    unittest.main()