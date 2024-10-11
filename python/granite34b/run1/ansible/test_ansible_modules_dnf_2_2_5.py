import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_split_package_arch(self):
        dnf_module = DnfModule(AnsibleModule(argument_spec=yumdnf_argument_spec))
        self.assertEqual(dnf_module._split_package_arch('example_package.x86_64'), ('example_package', 'x86_64'))
        self.assertEqual(dnf_module._split_package_arch('example_package'), ('example_package', None))

if __name__ == '__main__':
    unittest.main()