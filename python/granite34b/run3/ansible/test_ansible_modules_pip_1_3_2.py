import unittest
import ansible.module_utils.pip
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test_pip_get_installed_version(self):
        self.assertEqual(pip_get_installed_version('pip'), '20.0.2')

    def test_pip_get_required_version(self):
        self.assertEqual(pip_get_required_version('pip'), '20.0.2')

    def test_pip_get_version(self):
        self.assertEqual(pip_get_version(), '20.0.2')

    def test_pip_get_executable(self):
        self.assertEqual(pip_get_executable(), 'pip')

    def test_pip_get_extra_args(self):
        self.assertEqual(pip_get_extra_args(), '')

    def test_pip_get_umask(self):
        self.assertEqual(pip_get_umask(), '0022')

    def test_pip_get_state(self):
        self.assertEqual(pip_get_state(), 'present')

    def test_pip_get_name(self):
        self.assertEqual(pip_get_name(), 'bottle')

    def test_pip_get_version(self):
        self.assertEqual(pip_get_version(), '0.11')

    def test_pip_get_virtualenv(self):
        self.assertEqual(pip_get_virtualenv(), '/tmp/virtualenv')

    def test_pip_get_virtualenv_site_packages(self):
        self.assertEqual(pip_get_virtualenv_site_packages(), False)

    def test_pip_get_virtualenv_command(self):
        self.assertEqual(pip_get_virtualenv_command(), 'virtualenv')

    def test_pip_get_virtualenv_python(self):
        self.assertEqual(pip_get_virtualenv_python(), 'python3.5')

    def test_pip_get_requirements(self):
        self.assertEqual(pip_get_requirements(), '/srv/git/project/requirements.txt')

    def test_pip_get_editable(self):
        self.assertEqual(pip_get_editable(), False)

    def test_pip_get_chdir(self):
        self.assertEqual(pip_get_chdir(), '/path/to/directory')

    def test_pip_get_executable(self):
        self.assertEqual(pip_get_executable(), 'pip3.3')

    def test_pip_get_names(self):
        self.assertEqual(pip_get_names(), ['django>1.11.0,<1.12.0', 'bottle>0.10,<0.20,!=0.11'])

    def test_pip_get_names_from_requirements(self):
        self.assertEqual(pip_get_names_from_requirements(), ['django>1.11.0,<1.12.0', 'bottle>0.10,<0.20,!=0.11'])

    def test_pip_get_names_from_file(self):
        self.assertEqual(pip_get_names_from_file(), ['django>1.11.0,<1.12.0', 'bottle>0.10,<0.20,!=0.11'])

    def test_pip_get_names_from_editable(self):
        self.assertEqual(pip_get_names_from_editable(), ['django>1.11.0,<1.12.0', 'bottle>0.10,<0.20,!=0.11'])

    def test_pip_get_names_from_name(self):
        self.assertEqual(pip_get_names_from_name(), ['django>1.11.0,<1.12.0', 'bottle>0.10,<0.20,!=0.11'])

    def test_pip_get_names_from_url(self):
        self.assertEqual(pip_get_names_from_url(), ['django>1.11.0,<1.12.0', 'bottle>0.10,<0.20,!=0.11'])

class TestPipModule(unittest.TestCase):
    def test_private_method(self):
        instance = ExampleClass()
        result = instance._ExampleClass__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        instance = ExampleClass()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_str_method(self):
        instance = ExampleClass()
        result = instance.__str__()
        self.assertEqual(result, "ExampleClass")

    def test_repr_method(self):
        instance = ExampleClass()
        result = instance.__repr__()
        self.assertEqual(result, "ExampleClass(1)")

if __name__ == '__main__':
    unittest.main()