import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule

class TestDnfModule(unittest.TestCase):
    def test_split_package_arch(self):
        dnf_module = DnfModule(AnsibleModule({}))
        self.assertEqual(dnf_module._split_package_arch('foo-1.0-x86_64'), ('foo', 'x86_64'))
        self.assertEqual(dnf_module._split_package_arch('foo-1.0-x86_64.rpm'), ('foo', 'x86_64'))
        self.assertEqual(dnf_module._split_package_arch('foo.x86_64'), ('foo', 'x86_64'))
        self.assertEqual(dnf_module._split_package_arch('foo.noarch'), ('foo', 'noarch'))
        self.assertEqual(dnf_module._split_package_arch('foo'), ('foo', None))

    def test_is_installed(self):
        dnf_module = DnfModule(AnsibleModule({}))
        self.assertTrue(dnf_module._is_installed('foo'))
        self.assertFalse(dnf_module._is_installed('bar'))

if __name__ == '__main__':
    unittest.main()