import unittest
from ansible.module_utils import dnf


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'name': 'httpd',
            'state': 'present',
            'enablerepo': None,
            'disablerepo': None,
            'conf_file': None,
            'disable_gpg_check': False,
            'installroot': '/',
            'releasever': None,
            'autoremove': False,
            'exclude': None,
            'skip_broken': False,
            'update_cache': False,
            'update_only': False,
            'security': False,
            'bugfix': False,
            'enable_plugin': None,
            'disable_plugin': None,
            'disable_excludes': None,
            'validate_certs': True,
            'allow_downgrade': False,
            'install_repoquery': True,
            'download_only': False,
            'lock_timeout': 30,
            'install_weak_deps': True,
            'download_dir': None,
            'allowerasing': False,
            'nobest': False,
            'cacheonly': False
        }
        self.dnf_module = DnfModule(self.module)

    def test_mark_package_install(self):
        result = self.dnf_module._mark_package_install('httpd')
        self.assertEqual(result, {'failed': False, 'msg': '', 'failure': '', 'rc': 0})

    def test_mark_package_install_with_downgrade(self):
        self.module.params['allow_downgrade'] = True
        self.dnf_module = DnfModule(self.module)
        result = self.dnf_module._mark_package_install('httpd')
        self.assertEqual(result, {'failed': False, 'msg': '', 'failure': '', 'rc': 0})

    def test_mark_package_install_with_error(self):
        self.module.params['name'] = 'nonexistent_package'
        self.dnf_module = DnfModule(self.module)
        result = self.dnf_module._mark_package_install('nonexistent_package')
        self.assertEqual(result, {'failed': True, 'msg': 'No package nonexistent_package available.', 'failure': 'nonexistent_package No package nonexistent_package available.', 'rc': 1, 'results': []})

if __name__ == '__main__':
    unittest.main()