import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict(
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertEqual(dnf_module.allowerasing, False)
        self.assertEqual(dnf_module.nobest, False)

    def test_run(self):
        module = AnsibleModule(argument_spec=dict(
        dnf_module = DnfModule(module)
        dnf_module.autoremove = True
        dnf_module.download_dir = '/path/to/download/dir'
        dnf_module.update_cache = True
        dnf_module.names = ['package1', 'package2']
        dnf_module.list = 'installed'
        dnf_module.state = 'latest'
        dnf_module.base = dnf_module._base(dnf_module.conf_file, dnf_module.disable_gpg_check, dnf_module.disablerepo, dnf_module.enablerepo, dnf_module.installroot)
        dnf_module.list_items(dnf_module.list)
        dnf_module.ensure()

class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule( yumdnf_argument_spec(), supports_check_mode=True)
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertEqual(dnf_module.allowerasing, False)
        self.assertEqual(dnf_module.nobest, False)

    def test_run(self):
        module = AnsibleModule(yumdnf_argument_spec(), supports_check_mode=True)
        dnf_module = DnfModule(module)
        dnf_module.autoremove = True
        dnf_module.download_dir = '/path/to/download/dir'
        dnf_module.update_cache = True
        dnf_module.names = ['package1', 'package2']
        dnf_module.list = 'installed'
        dnf_module.state = None
        dnf_module.base = dnf_module._base(dnf_module.conf_file, dnf_module.disable_gpg_check, dnf_module.disablerepo, dnf_module.enablerepo, dnf_module.installroot)
        dnf_module.module.exit_json.assert_called_once_with(msg='Cache updated', changed=False, results=[], rc=0)

if __name__ == '__main__':
    unittest.main()