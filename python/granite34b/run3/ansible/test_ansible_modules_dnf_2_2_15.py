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
    def test_mark_package_install(self):
        module = AnsibleModule(argument_spec=dict(
        dnf_module = DnfModule(module)
        pkg_spec = 'example_package'
        result = dnf_module._mark_package_install(pkg_spec)
        self.assertEqual(result['failed'], False)
        self.assertEqual(result['msg'], '')
        self.assertEqual(result['failure'], '')
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['results'], [])

if __name__ == '__main__':
    unittest.main()