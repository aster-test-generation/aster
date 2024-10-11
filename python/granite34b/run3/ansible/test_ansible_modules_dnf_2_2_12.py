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

    def test_init(self):
        self.assertEqual(self.dnf.module, self.module)
        self.assertEqual(self.dnf.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf.pkg_mgr_name, 'dnf')
        self.assertEqual(self.dnf.with_modules, False)
        self.assertEqual(self.dnf.allowerasing, False)
        self.assertEqual(self.dnf.nobest, False)

    def test_list_items(self):
        self.dnf.base = MagicMock()
        self.dnf.base.sack = MagicMock()
        self.dnf.base.repos = MagicMock()
        self.dnf.base.repos.iter_enabled.return_value = [MagicMock(id='enabled_repo')]
        self.dnf.base.sack.query.return_value = MagicMock()
        self.dnf.base.sack.query.return_value.installed.return_value = [MagicMock()]
        self.dnf.base.sack.query.return_value.upgrades.return_value = [MagicMock()]
        self.dnf.base.sack.query.return_value.available.return_value = [MagicMock()]
        self.dnf._package_dict = MagicMock(return_value={'package_info': 'info'})

        self.dnf.list_items('installed')
        self.dnf.list_items('upgrades')
        self.dnf.list_items('available')
        self.dnf.list_items('repos')
        self.dnf.list_items('repositories')

        self.assertEqual(self.module.exit_json.call_count, 5)
        self.assertEqual(self.module.exit_json.call_args_list[0][1]['results'], [{'package_info': 'info'}])
        self.assertEqual(self.module.exit_json.call_args_list[1][1]['results'], [{'package_info': 'info'}])
        self.assertEqual(self.module.exit_json.call_args_list[2][1]['results'], [{'package_info': 'info'}])
        self.assertEqual(self.module.exit_json.call_args_list[3][1]['results'], [{'repoid': 'enabled_repo', 'state': 'enabled'}])
        self.assertEqual(self.module.exit_json.call_args_list[4][1]['results'], [{'repoid': 'enabled_repo', 'state': 'enabled'}])

if __name__ == '__main__':
    unittest.main()