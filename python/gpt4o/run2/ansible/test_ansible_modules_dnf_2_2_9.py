import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'allowerasing': False,
            'nobest': False
        }
        self.dnf_module = DnfModuleImplementation(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    @patch('os.access', return_value=True)
    def test_configure_base(self, mock_os_access):
        base = MagicMock()
        conf_file = '/path/to/conf'
        disable_gpg_check = False
        installroot = '/'

        self.dnf_module.exclude = ['pkg1']
        self.dnf_module.disable_excludes = 'main'
        self.dnf_module.releasever = '8'
        self.dnf_module.skip_broken = True
        self.dnf_module.download_only = True
        self.dnf_module.download_dir = '/download/dir'
        self.dnf_module.cacheonly = True
        self.dnf_module.autoremove = True
        self.dnf_module.install_weak_deps = True

        self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)

        conf = base.conf
        self.assertEqual(conf.config_file_path, conf_file)
        self.assertEqual(conf.debuglevel, 0)
        self.assertTrue(conf.gpgcheck)
        self.assertTrue(conf.localpkg_gpgcheck)
        self.assertTrue(conf.assumeyes)
        self.assertEqual(conf.installroot, installroot)
        self.assertIn('pkg1', conf.exclude)
        self.assertIn('main', conf.disable_excludes)
        self.assertEqual(conf.substitutions['releasever'], '8')
        self.assertEqual(conf.strict, 0)
        self.assertEqual(conf.best, 0)
        self.assertTrue(conf.downloadonly)
        self.assertEqual(conf.destdir, '/download/dir')
        self.assertTrue(conf.cacheonly)
        self.assertTrue(conf.clean_requirements_on_remove)
        self.assertTrue(conf.install_weak_deps)

    @patch('os.access', return_value=False)
    def test_configure_base_fail(self, mock_os_access):
        base = MagicMock()
        conf_file = '/path/to/conf'
        disable_gpg_check = False
        installroot = '/'

        with self.assertRaises(Exception) as context:
            self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)
        
        self.assertIn('cannot read configuration file', str(context.exception))

if __name__ == '__main__':
    unittest.main()