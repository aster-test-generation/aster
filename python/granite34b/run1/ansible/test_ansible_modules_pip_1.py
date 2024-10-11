import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test_pip_install_package(self):
        package_name = "bottle"
        result = pip_install_package(package_name)
        self.assertEqual(result, "pip install bottle")

    def test_pip_install_package_with_version(self):
        package_name = "bottle"
        version = "0.11"
        result = pip_install_package(package_name, version)
        self.assertEqual(result, "pip install bottle==0.11")

    def test_pip_install_package_with_version_specifiers(self):
        package_name = "bottle"
        version_specifiers = ">0.10,<0.20,!=0.11"
        result = pip_install_package(package_name, version_specifiers)
        self.assertEqual(result, "pip install bottle>0.10,<0.20,!=0.11")

    def test_pip_install_package_with_extra_args(self):
        package_name = "bottle"
        extra_args = "--proxy=http://proxy.example.com"
        result = pip_install_package(package_name, extra_args=extra_args)
        self.assertEqual(result, "pip install bottle --proxy=http://proxy.example.com")

    def test_pip_install_package_with_editable(self):
        package_name = "git+https://github.com/example/package.git"
        result = pip_install_package(package_name, editable=True)
        self.assertEqual(result, "pip install -e git+https://github.com/example/package.git")

    def test_pip_install_package_with_chdir(self):
        package_name = "bottle"
        chdir = "/path/to/directory"
        result = pip_install_package(package_name, chdir=chdir)
        self.assertEqual(result, "cd /path/to/directory && pip install bottle")

    def test_pip_install_package_with_executable(self):
        package_name = "bottle"
        executable = "pip3"
        result = pip_install_package(package_name, executable=executable)
        self.assertEqual(result, "pip3 install bottle")

    def test_pip_install_package_with_umask(self):
        package_name = "bottle"
        umask = "0022"
        result = pip_install_package(package_name, umask=umask)
        self.assertEqual(result, "umask 0022 && pip install bottle")

    def test_pip_install_package_with_virtualenv(self):
        package_name = "bottle"
        virtualenv = "/path/to/virtualenv"
        result = pip_install_package(package_name, virtualenv=virtualenv)
        self.assertEqual(result, "pip install bottle --install-option=\"--prefix=/path/to/virtualenv\"")

    def test_pip_install_package_with_state_absent(self):
        package_name = "bottle"
        state = "absent"
        result = pip_install_package(package_name, state=state)
        self.assertEqual(result, "pip uninstall bottle")

    def test_pip_install_package_with_state_forcereinstall(self):
        package_name = "bottle"
        state = "forcereinstall"
        result = pip_install_package(package_name, state=state)
        self.assertEqual(result, "pip install bottle --ignore-installed")

    def test_pip_install_package_with_state_latest(self):
        package_name = "bottle"
        state = "latest"
        result = pip_install_package(package_name, state=state)
        self.assertEqual(result, "pip install bottle --upgrade")

    def test_pip_install_package_with_state_present(self):
        package_name = "bottle"
        state = "present"
        result = pip_install_package(package_name, state=state)
        self.assertEqual(result, "pip install bottle")

if __name__ == '__main__':
    unittest.main()