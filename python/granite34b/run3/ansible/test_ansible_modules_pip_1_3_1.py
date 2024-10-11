import unittest
from ansible.module_utils.pip import *


class TestPipModule(unittest.TestCase):
    def test_is_package_name(self):
        self.assertTrue(_is_package_name('bottle'))
        self.assertFalse(_is_package_name('>0.10'))
        self.assertFalse(_is_package_name('==0.10'))

    def test_get_pip_path(self):
        self.assertEqual(get_pip_path(), 'pip')

    def test_get_virtualenv_cmd(self):
        self.assertEqual(get_virtualenv_cmd(), 'virtualenv')

    def test_get_extra_args(self):
        self.assertEqual(get_extra_args(), '')

    def test_get_umask(self):
        self.assertEqual(get_umask(), '0022')

    def test_get_state(self):
        self.assertEqual(get_state(), 'present')

    def test_get_chdir(self):
        self.assertEqual(get_chdir(), '')

    def test_get_executable(self):
        self.assertEqual(get_executable(), '')

    def test_get_requirements(self):
        self.assertEqual(get_requirements(), '')

    def test_get_name(self):
        self.assertEqual(get_name(), [])

    def test_get_version(self):
        self.assertEqual(get_version(), '')

    def test_get_virtualenv(self):
        self.assertEqual(get_virtualenv(), '')

    def test_get_virtualenv_site_packages(self):
        self.assertEqual(get_virtualenv_site_packages(), False)

    def test_get_virtualenv_command(self):
        self.assertEqual(get_virtualenv_command(), 'virtualenv')

    def test_get_virtualenv_python(self):
        self.assertEqual(get_virtualenv_python(), '')

    def test_get_editable(self):
        self.assertEqual(get_editable(), False)

    def test_get_pip_version(self):
        self.assertEqual(get_pip_version(), '20.0.2')

    def test_get_pip_version_info(self):
        self.assertEqual(get_pip_version_info(), (20, 0, 2))

    def test_get_pip_version_tuple(self):
        self.assertEqual(get_pip_version_tuple(), (20, 0, 2))

    def test_get_pip_version_info_tuple(self):
        self.assertEqual(get_pip_version_info_tuple(), (20, 0, 2))

    def test_get_pip_version_tuple_str(self):
        self.assertEqual(get_pip_version_tuple_str(), '20.0.2')

    def test_get_pip_version_info_tuple_str(self):
        self.assertEqual(get_pip_version_info_tuple_str(), '20.0.2')

    def test_get_pip_version_tuple_str_split(self):
        self.assertEqual(get_pip_version_tuple_str_split(), '20.0.2')

    def test_get_pip_version_info_tuple_str_split(self):
        self.assertEqual(get_pip_version_info_tuple_str_split(), '20.0.2')

    def test_get_pip_version_tuple_str_split_list(self):
        self.assertEqual(get_pip_version_tuple_str_split_list(), ['20', '0', '2'])

    def test_get_pip_version_info_tuple_str_split_list(self):
        self.assertEqual(get_pip_version_info_tuple_str_split_list(), ['20', '0', '2'])

    def test_get_pip_version_tuple_str_split_list_int(self):
        self.assertEqual(get_pip_version_tuple_str_split_list_int(), [20, 0, 2])

    def test_get_pip_version_info_tuple_str_split_list_int(self):
        self.assertEqual(get_pip_version_info_tuple_str_split_list_int(), [20, 0, 2])

if __name__ == '__main__':
    unittest.main()