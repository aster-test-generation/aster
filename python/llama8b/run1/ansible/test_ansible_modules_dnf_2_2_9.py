import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import yu


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_configure_base(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        base = dnf_module.base
        conf_file = 'path/to/conf/file'
        disable_gpg_check = True
        installroot = '/path/to/installroot'
        dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)
        self.assertEqual(base.conf.config_file_path, conf_file)
        self.assertFalse(base.conf.gpgcheck)
        self.assertEqual(base.conf.installroot, installroot)

    def test_configure_base_with_exclude(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        base = dnf_module.base
        conf_file = 'path/to/conf/file'
        disable_gpg_check = True
        installroot = '/path/to/installroot'
        exclude = ['package1', 'package2']
        dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot, exclude=exclude)
        self.assertEqual(base.conf.exclude, exclude)

    def test_configure_base_with_disable_excludes(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        base = dnf_module.base
        conf_file = 'path/to/conf/file'
        disable_gpg_check = True
        installroot = '/path/to/installroot'
        disable_excludes = 'main'
        dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot, disable_excludes=disable_excludes)
        self.assertEqual(base.conf.disable_excludes, [disable_excludes])

    def test_configure_base_with_releasever(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        base = dnf_module.base
        conf_file = 'path/to/conf/file'
        disable_gpg_check = True
        installroot = '/path/to/installroot'
        releasever = '6'
        dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot, releasever=releasever)
        self.assertEqual(base.conf.substitutions['releasever'], releasever)

    def test_configure_base_with_nobest(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        base = dnf_module.base
        conf_file = 'path/to/conf/file'
        disable_gpg_check = True
        installroot = '/path/to/installroot'
        nobest = True
        dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot, nobest=nobest)
        self.assertFalse(base.conf.best)

    def test_configure_base_with_download_only(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        base = dnf_module.base
        conf_file = 'path/to/conf/file'
        disable_gpg_check = True
        installroot = '/path/to/installroot'
        download_only = True
        download_dir = '/path/to/download/dir'
        dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot, download_only=download_only, download_dir=download_dir)
        self.assertTrue(base.conf.downloadonly)
        self.assertEqual(base.conf.destdir, download_dir)

    def test_configure_base_with_cacheonly(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        base = dnf_module.base
        conf_file = 'path/to/conf/file'
        disable_gpg_check = True
        installroot = '/path/to/installroot'
        cacheonly = True
        dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot, cacheonly=cacheonly)
        self.assertTrue(base.conf.cacheonly)

if __name__ == '__main__':
    unittest.main()