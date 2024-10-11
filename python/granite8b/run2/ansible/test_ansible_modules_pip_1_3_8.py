import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_install_package(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'])
        self.assertEqual(result, 0)

    def test_pip_install_package_with_version(self):
        pip = Pip(module=None)
        result = pip.install(['ansible==2.5.1'])
        self.assertEqual(result, 0)

    def test_pip_install_multiple_packages(self):
        pip = Pip(module=None)
        result = pip.install(['ansible', 'six'])
        self.assertEqual(result, 0)

    def test_pip_install_package_with_proxy(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], proxy_host='localhost', proxy_port=8080)
        self.assertEqual(result, 0)

    def test_pip_install_package_with_executable(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], executable='/usr/bin/pip3')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_umask(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], umask='0022')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_chdir(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], chdir='/path/to/directory')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_extra_args(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], extra_args='--no-cache-dir')
        self.assertEqual(result, 0)

    def test_pip_install_editable_package(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], editable=True)
        self.assertEqual(result, 0)

    def test_pip_install_package_with_virtualenv(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], virtualenv='/path/to/virtualenv')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_virtualenv_and_executable(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], virtualenv='/path/to/virtualenv', executable='/usr/bin/pip3')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_virtualenv_and_umask(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], virtualenv='/path/to/virtualenv', umask='0022')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_virtualenv_and_chdir(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], virtualenv='/path/to/virtualenv', chdir='/path/to/directory')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_virtualenv_and_extra_args(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], virtualenv='/path/to/virtualenv', extra_args='--no-cache-dir')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_virtualenv_and_editable(self):
        pip = Pip(module=None)
        result = pip.install(['ansible'], virtualenv='/path/to/virtualenv', editable=True)
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()