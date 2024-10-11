import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule


class TestDnfModule(unittest.TestCase):
    def test_dnf_module_init(self):
        module = AnsibleModule( yumdnf_argument_spec )
        dnf = DnfModule(module)
        self.assertTrue(dnf)

    def test_dnf_module_lockfile(self):
        module = AnsibleModule( yumdnf_argument_spec )
        dnf = DnfModule(module)
        self.assertEqual(dnf.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_dnf_module_pkg_mgr_name(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertEqual(dnf.pkg_mgr_name, 'dnf')

    def test_dnf_module_with_modules(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertFalse(dnf.with_modules)

    def test_dnf_module_allowerasing(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertFalse(dnf.allowerasing)

    def test_dnf_module_nobest(self):
        module = AnsibleModule( yumdnf_argument_spec )
        dnf = DnfModule(module)
        self.assertFalse(dnf.nobest)

    def test_dnf_module_configure_base(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        base = dnf._base
        conf = base.conf
        self.assertEqual(conf.config_file_path, '/etc/dnf/dnf.conf')
        self.assertFalse(conf.gpgcheck)
        self.assertTrue(conf.assumeyes)
        self.assertEqual(conf.installroot, '/')
        self.assertEqual(conf.substitutions['releasever'], '1.0')
        self.assertEqual(conf.strict, 0)
        self.assertFalse(conf.best)
        self.assertFalse(conf.downloadonly)
        self.assertFalse(conf.cacheonly)
        self.assertTrue(conf.clean_requirements_on_remove)
        self.assertTrue(conf.install_weak_deps)

if __name__ == '__main__':
    unittest.main()