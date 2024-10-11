import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import dnf as dnf_modul


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

    def test_package_dict(self):
        package = {'name': 'package_name', 'arch': 'x86_64', 'epoch': '1', 'release': '1', 'version': '1.0', 'repo': 'repo_id'}
        dnf_module = DnfModule(AnsibleModule())
        result = dnf_module._package_dict(package)
        self.assertEqual(result, {'name': 'package_name', 'arch': 'x86_64', 'epoch': '1', 'release': '1', 'version': '1.0', 'repo': 'repo_id', 'envra': '1:package_name-1.0-1.x86_64', 'nevra': '1:package_name-1.0-1.x86_64', 'yumstate': 'available'})

    def test_init_with_allowerasing(self):
        module = AnsibleModule()
        module.params['allowerasing'] = True
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_init_with_nobest(self):
        module = AnsibleModule()
        module.params['nobest'] = True
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.nobest)

    def test_str(self):
        dnf_module = DnfModule(AnsibleModule())
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test_repr(self):
        dnf_module = DnfModule(AnsibleModule())
        self.assertEqual(repr(dnf_module), 'DnfModule({})'.format(dnf_module.__dict__))

    def test_eq(self):
        dnf_module1 = DnfModule(AnsibleModule())
        dnf_module2 = DnfModule(AnsibleModule())
        self.assertEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()