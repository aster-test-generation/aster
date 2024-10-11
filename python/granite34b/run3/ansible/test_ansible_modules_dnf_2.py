import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=yumdnf_argument_spec(), supports_check_mode=True)
        dnf = DnfModule(module)
        self.assertEqual(dnf.module, module)
        self.assertEqual(dnf.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf.with_modules, False)
        self.assertEqual(dnf.allowerasing, False)
        self.assertEqual(dnf.nobest, False)

    def test_run(self):
        module = AnsibleModule(argument_spec=yumdnf_argument_spec(), supports_check_mode=True)
        dnf = DnfModule(module)
        dnf.autoremove = True
        dnf.download_dir = '/path/to/download'
        dnf.update_cache = True
        dnf.names = ['package1', 'package2']
        dnf.state = 'latest'
        dnf.list = 'installed'
        dnf.base = dnf._base(dnf.conf_file, dnf.disable_gpg_check, dnf.disablerepo, dnf.enablerepo, dnf.installroot)
        dnf.module.exit_json(msg='Cache updated', changed=False, results=[], rc=0)

    def test_list_items(self):
        module = AnsibleModule(argument_spec(), supports_check_mode=True)
        dnf = DnfModule(module)
        dnf.base = dnf._base(dnf.conf_file, dnf.disable_gpg_check, dnf.disablerepo, dnf.enablerepo, dnf.installroot)
        dnf.list_items('installed')

    def test_ensure(self):
        module = AnsibleModule(argument_spec(), supports_check_mode=True)
        dnf = DnfModule(module)
        dnf.base = dnf._base(dnf.conf_file, dnf.disable_gpg_check, dnf.disablerepo, dnf.enablerepo, dnf.installroot)
        dnf.ensure()

if __name__ == '__main__':
    unittest.main()