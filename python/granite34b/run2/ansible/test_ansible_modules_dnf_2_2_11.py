import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_dnf_module_init(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf = DnfModule(module)
        self.assertTrue(dnf)

    def test_dnf_module_base(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf = DnfModule(module)
        base = dnf._base(conf_file=None, disable_gpg_check=False, disablerepo=None, enablerepo=None, installroot='/')
        self.assertTrue(base)

    def test_dnf_module_install(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf = DnfModule(module)
        base = dnf._base(conf_file=None, disable_gpg_check=False, disablerepo=None, enablerepo=None, installroot='/')
        result = dnf._install(base, name='httpd', state='present', disable_excludes='all')
        self.assertTrue(result)

    def test_dnf_module_remove(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf = DnfModule(module)
        base = dnf._base(conf_file=None, disable_gpg_check=False, disablerepo=None, enablerepo=None, installroot='/')
        result = dnf._remove(base, name='httpd', state='absent', autoremove=False, disable_excludes='all')
        self.assertTrue(result)

    def test_dnf_module_upgrade(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf = DnfModule(module)
        base = dnf._base(conf_file=None, disable_gpg_check=False, disablerepo=None, enablerepo=None, installroot='/')
        result = dnf._upgrade(base, name='*', state='latest', update_only=False, security=False, bugfix=False, disable_excludes='all')
        self.assertTrue(result)

    def test_dnf_module_list(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf = DnfModule(module)
        base = dnf._base(conf_file=None, disable_gpg_check=False, disablerepo=None, enablerepo=None, installroot='/')
        result = dnf._list(base, list='installed')
        self.assertTrue(result)

    def test_dnf_module_make_transaction(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf = DnfModule(module)
        base = dnf._base(conf_file=None, disable_gpg_check=False, disablerepo=None, enablerepo=None, installroot='/')
        transaction = dnf._make_transaction(base, name='httpd', state='present', disable_excludes='all')
        self.assertTrue(transaction)

if __name__ == '__main__':
    unittest.main()