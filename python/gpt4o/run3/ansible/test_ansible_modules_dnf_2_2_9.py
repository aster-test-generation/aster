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
        self.dnf_module = ConcreteDnfModule(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    def test_configure_base(self):
        base = MagicMock()
        conf_file = '/path/to/conf'
        disable_gpg_check = True
        installroot = '/install/root'

        with patch('os.access', return_value=True):
            self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)

        conf = base.conf
        self.assertEqual(conf.config_file_path, conf_file)
        self.assertEqual(conf.debuglevel, 0)
        self.assertFalse(conf.gpgcheck)
        self.assertFalse(conf.localpkg_gpgcheck)
        self.assertTrue(conf.assumeyes)
        self.assertEqual(conf.installroot, installroot)
        self.assertTrue(conf.clean_requirements_on_remove)
        self.assertTrue(conf.install_weak_deps)

    def test_configure_base_no_conf_file(self):
        base = MagicMock()
        conf_file = '/path/to/conf'
        disable_gpg_check = True
        installroot = '/install/root'

        with patch('os.access', return_value=False):
            with self.assertRaises(Exception):
                self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)

    def test_configure_base_no_excludes(self):
        base = MagicMock()
        conf_file = None
        disable_gpg_check = True
        installroot = '/install/root'

        self.dnf_module.exclude = ['pkg1', 'pkg2']
        self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)

        conf = base.conf
        self.assertIn('pkg1', conf.exclude)
        self.assertIn('pkg2', conf.exclude)

    def test_configure_base_disable_excludes(self):
        base = MagicMock()
        conf_file = None
        disable_gpg_check = True
        installroot = '/install/root'

        self.dnf_module.disable_excludes = 'main'
        self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)

        conf = base.conf
        self.assertIn('main', conf.disable_excludes)

    def test_configure_base_releasever(self):
        base = MagicMock()
        conf_file = None
        disable_gpg_check = True
        installroot = '/install/root'

        self.dnf_module.releasever = '8'
        self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)

        conf = base.conf
        self.assertEqual(conf.substitutions['releasever'], '8')

    def test_configure_base_skip_broken(self):
        base = MagicMock()
        conf_file = None
        disable_gpg_check = True
        installroot = '/install/root'

        self.dnf_module.skip_broken = True
        self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)

        conf = base.conf
        self.assertEqual(conf.strict, 0)

    def test_configure_base_nobest(self):
        base = MagicMock()
        conf_file = None
        disable_gpg_check = True
        installroot = '/install/root'

        self.dnf_module.nobest = True
        self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)

        conf = base.conf
        self.assertEqual(conf.best, 0)

    def test_configure_base_download_only(self):
        base = MagicMock()
        conf_file = None
        disable_gpg_check = True
        installroot = '/install/root'

        self.dnf_module.download_only = True
        self.dnf_module.download_dir = '/download/dir'
        self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)

        conf = base.conf
        self.assertTrue(conf.downloadonly)
        self.assertEqual(conf.destdir, '/download/dir')

    def test_configure_base_cacheonly(self):
        base = MagicMock()
        conf_file = None
        disable_gpg_check = True
        installroot = '/install/root'

        self.dnf_module.cacheonly = True
        self.dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)

        conf = base.conf
        self.assertTrue(conf.cacheonly)

if __name__ == '__main__':
    unittest.main()