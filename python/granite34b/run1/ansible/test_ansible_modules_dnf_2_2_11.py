import unittest
from ansible.module_utils import dnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = MagicMock()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertEqual(dnf_module.allowerasing, False)
        self.assertEqual(dnf_module.nobest, False)

    def test__base(self):
        module = MagicMock()
        dnf_module = DnfModule(module)
        conf_file = '/path/to/conf_file'
        disable_gpg_check = True
        disablerepo = 'repo1,repo2'
        enablerepo = 'repo3,repo4'
        installroot = '/path/to/installroot'
        base = dnf_module._base(conf_file, disable_gpg_check, disablerepo, enablerepo, installroot)
        self.assertEqual(base.conf.config_file, conf_file)
        self.assertEqual(base.conf.disable_gpg_check, disable_gpg_check)
        self.assertEqual(base.conf.installroot, installroot)
        self.assertEqual(base.conf.repos.disable_repos, ['repo1', 'repo2'])
        self.assertEqual(base.conf.repos.enable_repos, ['repo3', 'repo4'])
        self.assertEqual(base.conf.plugins.disable_plugins, set())
        self.assertEqual(base.conf.plugins.enable_plugins, set())

if __name__ == '__main__':
    unittest.main()