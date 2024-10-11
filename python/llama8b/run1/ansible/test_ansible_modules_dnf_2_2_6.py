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

    def test_packagename_dict(self):
        dnf_module = DnfModule(AnsibleModule())
        result = dnf_module._packagename_dict('httpd-2.4.7-1.el7.x86_64.rpm')
        self.assertEqual(result, {'name': 'httpd', 'epoch': '0', 'release': '1', 'version': '2.4.7'})

    def test_packagename_dict_invalid(self):
        dnf_module = DnfModule(AnsibleModule())
        result = dnf_module._packagename_dict('invalid-package')
        self.assertIsNone(result)

    def test_split_package_arch(self):
        dnf_module = DnfModule(AnsibleModule())
        arch, package = dnf_module._split_package_arch('httpd-2.4.7-1.el7.x86_64.rpm')
        self.assertEqual(arch, 'x86_64')
        self.assertEqual(package, 'httpd-2.4.7-1.el7')

    def test_split_package_arch_invalid(self):
        dnf_module = DnfModule(AnsibleModule())
        arch, package = dnf_module._split_package_arch('invalid-package')
        self.assertIsNone(arch)
        self.assertIsNone(package)

    def test__init__(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)

    def test__str__(self):
        dnf_module = DnfModule(AnsibleModule())
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test__repr__(self):
        dnf_module = DnfModule(AnsibleModule())
        self.assertEqual(repr(dnf_module), 'DnfModule({})'.format(dnf_module.module))

    def test__eq__(self):
        dnf_module1 = DnfModule(AnsibleModule())
        dnf_module2 = DnfModule(AnsibleModule())
        self.assertEqual(dnf_module1, dnf_module2)

    def test_allowerasing(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.allowerasing)
        module.params['allowerasing'] = True
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_nobest(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.nobest)
        module.params['nobest'] = True
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.nobest)

if __name__ == '__main__':
    unittest.main()