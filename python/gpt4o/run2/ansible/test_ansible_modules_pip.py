import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):

    @patch('ansible.modules.pip.AnsibleModule')
    def test_main(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'state': 'present',
            'name': ['bottle'],
            'version': None,
            'requirements': None,
            'virtualenv': None,
            'virtualenv_site_packages': False,
            'virtualenv_command': 'virtualenv',
            'virtualenv_python': None,
            'extra_args': None,
            'editable': False,
            'chdir': None,
            'executable': None,
            'umask': None
        }
        mock_module.check_mode = False
        mock_module.run_command.return_value = (0, 'Successfully installed', '')

        main()

        mock_module.exit_json.assert_called_with(
            changed=True,
            cmd=['pip', 'install', 'bottle'],
            name=['bottle'],
            version=None,
            state='present',
            requirements=None,
            virtualenv=None,
            stdout='Successfully installed',
            stderr=''
        )

    def test__get_pip(self):
        module = MagicMock()
        module.params = {'executable': None}
        result = _get_pip(module, None, None)
        self.assertEqual(result, 'pip')

    def test__is_vcs_url(self):
        result = _is_vcs_url('git+https://github.com/ansible/ansible.git')
        self.assertTrue(result)

    def test__recover_package_name(self):
        result = _recover_package_name(['bottle==0.12', 'django>1.11.0,<1.12.0'])
        self.assertEqual(result, ['bottle==0.12', 'django>1.11.0,<1.12.0'])

    def test__get_packages(self):
        module = MagicMock()
        module.run_command.return_value = (0, 'bottle==0.12\ndjango==1.11.1', '')
        result = _get_packages(module, 'pip', '/tmp')
        self.assertEqual(result, ('pip freeze', 'bottle==0.12\ndjango==1.11.1', ''))

    def test__is_present(self):
        module = MagicMock()
        package = Package('bottle==0.12')
        pkg_list = ['bottle==0.12', 'django==1.11.1']
        result = _is_present(module, package, pkg_list, 'pip freeze')
        self.assertTrue(result)

    def test__get_package_info(self):
        module = MagicMock()
        module.run_command.return_value = (0, 'bottle==0.12', '')
        result = _get_package_info(module, 'bottle', None)
        self.assertEqual(result, 'bottle==0.12')

    def test__fail(self):
        module = MagicMock()
        with self.assertRaises(SystemExit):
            _fail(module, 'pip install bottle', 'output', 'error')

    def test_Package(self):
        pkg = Package('bottle==0.12')
        self.assertEqual(pkg.name, 'bottle')
        self.assertEqual(pkg.version, '0.12')
        self.assertTrue(pkg.has_version_specifier)

    def test_Package_str(self):
        pkg = Package('bottle==0.12')
        self.assertEqual(str(pkg), 'bottle==0.12')

    def test_Package_repr(self):
        pkg = Package('bottle==0.12')
        self.assertEqual(repr(pkg), 'Package(bottle==0.12)')

    def test_Package_eq(self):
        pkg1 = Package('bottle==0.12')
        pkg2 = Package('bottle==0.12')
        self.assertTrue(pkg1 == pkg2)

if __name__ == '__main__':
    unittest.main()