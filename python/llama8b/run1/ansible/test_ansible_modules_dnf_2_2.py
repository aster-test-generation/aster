import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible_collections community.general.plugins.module_utils.dnf import DnfModul


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(dnf_module.with_modules)

    def test_parse_spec_group_file(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        names = ['httpd', 'mariadb-server']
        pkg_specs, grp_specs, module_specs, filenames = dnf_module._parse_spec_group_file(names)
        self.assertEqual(len(pkg_specs), 2)
        self.assertEqual(len(grp_specs), 0)
        self.assertEqual(len(module_specs), 0)
        self.assertEqual(len(filenames), 0)

    def test_whatprovides(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        name = 'httpd'
        pkg_spec = dnf_module._whatprovides(name)
        self.assertIsNotNone(pkg_spec)

    def test_read_comps(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module.base.read_comps()
        self.assertTrue(dnf_module.base.comps_loaded)

    def test_get_modules(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        grp_env_mdl_candidate = 'Development tools'
        mdl = dnf_module.module_base._get_modules(grp_env_mdl_candidate)
        self.assertIsNotNone(mdl)

    def test_get_modules_no_modules(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        grp_env_mdl_candidate = 'non-existent-group'
        mdl = dnf_module.module_base._get_modules(grp_env_mdl_candidate)
        self.assertIsNone(mdl)

    def test_str(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test_repr(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule({})'.format(dnf_module))

    def test_eq(self):
        module = AnsibleModule()
        dnf_module1 = DnfModule(module)
        dnf_module2 = DnfModule(module)
        self.assertEqual(dnf_module1, dnf_module2)

    def test_ne(self):
        module = AnsibleModule()
        dnf_module1 = DnfModule(module)
        dnf_module2 = object()
        self.assertNotEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()