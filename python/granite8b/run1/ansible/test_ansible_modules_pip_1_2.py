import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip()
        self.assertIsInstance(pip, Pip)

    def test_pip_get_bin_path(self):
        pip = Pip()
        pip.executable = '/usr/bin/pip'
        self.assertEqual(pip._get_bin_path(), '/usr/bin/pip')

    def test_pip_get_executable(self):
        pip = Pip()
        self.assertEqual(pip._get_executable(), 'pip')

    def test_pip_get_name_from_url(self):
        pip = Pip()
        self.assertEqual(pip._get_name_from_url('https://example.com/example.tar.gz'), 'example')

    def test_pip_get_name_from_requirements_file(self):
        pip = Pip()
        self.assertEqual(pip._get_name_from_requirements_file('requirements.txt'), 'requirements.txt')

    def test_pip_get_package_info(self):
        pip = Pip()
        self.assertEqual(pip._get_package_info('ansible'), {'name': 'ansible', 'version': None})

    def test_pip_get_package_to_install(self):
        pip = Pip()
        self.assertEqual(pip._get_package_to_install('ansible'), 'ansible')

    def test_pip_get_packages_to_install(self):
        pip = Pip()
        self.assertEqual(pip._get_packages_to_install(['ansible', 'boto']), ['ansible', 'boto'])

    def test_pip_get_version_from_package(self):
        pip = Pip()
        self.assertEqual(pip._get_version_from_package('ansible'), None)

    def test_pip_get_version_from_requirements_file(self):
        pip = Pip()
        self.assertEqual(pip._get_version_from_requirements_file('requirements.txt'), None)

    def test_pip_is_version_installed(self):
        pip = Pip()
        self.assertFalse(pip._is_version_installed('ansible', '1.0.0'))

    def test_pip_is_version_match(self):
        pip = Pip()
        self.assertTrue(pip._is_version_match('1.0.0', '1.0.0'))

    def test_pip_is_version_match_with_operator(self):
        pip = Pip()
        self.assertTrue(pip._is_version_match('1.0.0', '>=1.0.0'))
        self.assertFalse(pip._is_version_match('1.0.0', '<1.0.0'))

    def test_pip_is_version_match_with_operator_and_version(self):
        pip = Pip()
        self.assertTrue(pip._is_version_match('1.0.0', '>=1.0.0,<=1.0.0'))
        self.assertFalse(pip._is_version_match('1.0.0', '>=1.0.1,<=1.0.0'))

    def test_pip_is_version_match_with_operator_and_version_range(self):
        pip = Pip()
        self.assertTrue(pip._is_version_match('1.0.0', '>=1.0.0,<1.0.1'))
        self.assertFalse(pip._is_version_match('1.0.0', '>=1.0.1,<1.0.0'))

    def test_pip_is_version_match_with_operator_and_version_range_and_extra_info(self):
        pip = Pip()
        self.assertTrue(pip._is_version_match('1.0.0 (from -r requirements.txt (line 1)) (python 2.7)', '>=1.0.0,<1.0.1'))
        self.assertFalse(pip._is_version_match('1.0.0 (from -r requirements.txt (line 1)) (python 2.7)', '>=1.0.1,<1.0.0'))

if __name__ == '__main__':
    unittest.main()