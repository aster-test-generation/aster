import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_parse_spec_group_file(self):
        dnf_module = DnfModule(AnsibleModule)
        dnf_module.names = ['httpd', 'mariadb-server']
        pkg_specs, grp_specs, module_specs, filenames = dnf_module._parse_spec_group_file()
        self.assertEqual(pkg_specs, ['httpd', 'mariadb-server'])
        self.assertEqual(grp_specs, [])
        self.assertEqual(module_specs, [])
        self.assertEqual(filenames, [])

if __name__ == '__main__':
    unittest.main()