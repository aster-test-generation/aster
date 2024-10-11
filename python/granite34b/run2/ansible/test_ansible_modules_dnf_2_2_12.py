import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        self.dnf = DnfModule(self.module)

    def test_list_items(self):
        self.dnf.list_items('installed')
        self.dnf.list_items('upgrades')
        self.dnf.list_items('available')
        self.dnf.list_items('repos')
        self.dnf.list_items('repositories')
        packages = dnf.subject.Subject('command').get_best_query(self.base.sack)
        results = [self.dnf._package_dict(package) for package in packages]
        self.module.exit_json(msg='', results=results)

if __name__ == '__main__':
    unittest.main()