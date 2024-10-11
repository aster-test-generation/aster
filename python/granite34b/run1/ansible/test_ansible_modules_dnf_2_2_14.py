import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_is_newer_version_installed(self):
        dnf_module = DnfModule(AnsibleModule)
        pkg_name = 'example_package'
        result = dnf_module._is_newer_version_installed(pkg_name)
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()