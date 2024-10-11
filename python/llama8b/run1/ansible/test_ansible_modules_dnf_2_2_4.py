import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.basic import AnsibleModule, missing_required_li


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertFalse(dnf_module.allowerasing)
        self.assertFalse(dnf_module.nobest)

    def test_package_dict(self):
        package = {'name': 'package_name', 'arch': 'arch', 'epoch': 'epoch', 'release': 'release', 'version': 'version', 'repo': 'repo'}
        dnf_module = DnfModule(AnsibleModule())
        result = dnf_module._package_dict(package)
        self.assertEqual(result, {'name': 'package_name', 'arch': 'arch', 'epoch': 'epoch', 'release': 'release', 'version': 'version', 'repo': 'repo', 'envra': 'epoch:package_name-version-release.arch', 'nevra': 'epoch:package_name-version-release.arch', 'yumstate': 'available'})

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

    def test_init_without_allowerasing_and_nobest(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module.allowerasing)
        self.assertFalse(dnf_module.nobest)

if __name__ == '__main__':
    unittest.main()