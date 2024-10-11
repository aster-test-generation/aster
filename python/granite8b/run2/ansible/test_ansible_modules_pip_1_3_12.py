import unittest
from ansible_collections.ansible.utils.plugins.module_utils.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip()
        self.assertIsInstance(pip, Pip)

    def test_pip_get_executable(self):
        pip = Pip()
        executable = pip.get_executable()
        self.assertIsInstance(executable, str)

    def test_pip_get_pip_cmd(self):
        pip = Pip()
        pip_cmd = pip.get_pip_cmd()
        self.assertIsInstance(pip_cmd, list)

    def test_pip_get_package_info(self):
        pip = Pip()
        package_info = pip.get_package_info('ansible')
        self.assertIsInstance(package_info, dict)

    def test_pip_get_installed_version(self):
        pip = Pip()
        version = pip.get_installed_version('ansible')
        self.assertIsInstance(version, str)

    def test_pip_get_installed_version_not_installed(self):
        pip = Pip()
        version = pip.get_installed_version('this_package_does_not_exist')
        self.assertIsNone(version)

    def test_pip_is_installed(self):
        pip = Pip()
        is_installed = pip.is_installed('ansible')
        self.assertIsInstance(is_installed, bool)

    def test_pip_is_installed_not_installed(self):
        pip = Pip()
        is_installed = pip.is_installed('this_package_does_not_exist')
        self.assertFalse(is_installed)

    def test_pip_is_up_to_date(self):
        pip = Pip()
        is_up_to_date = pip.is_up_to_date('ansible', '2.5.1')
        self.assertIsInstance(is_up_to_date, bool)

    def test_pip_is_up_to_date_not_installed(self):
        pip = Pip()
        is_up_to_date = pip.is_up_to_date('this_package_does_not_exist', '2.5.1')
        self.assertFalse(is_up_to_date)

    def test_pip_is_up_to_date_out_of_date(self):
        pip = Pip()
        is_up_to_date = pip.is_up_to_date('ansible', '1.0.0')
        self.assertFalse(is_up_to_date)

    def test_pip_install(self):
        pip = Pip()
        result = pip.install('ansible')
        self.assertIsInstance(result, dict)

    def test_pip_install_with_version(self):
        pip = Pip()
        result = pip.install('ansible', version='2.5.1')
        self.assertIsInstance(result, dict)

    def test_pip_install_with_extra_args(self):
        pip = Pip()
        result = pip.install('ansible', extra_args='--no-cache-dir')
        self.assertIsInstance(result, dict)

    def test_pip_install_with_editable(self):
        pip = Pip()
        result = pip.install('ansible', editable=True)
        self.assertIsInstance(result, dict)

    def test_pip_uninstall(self):
        pip = Pip()
        result = pip.uninstall('ansible')
        self.assertIsInstance(result, dict)

    def test_pip_uninstall_with_version(self):
        pip = Pip()
        result = pip.uninstall('ansible', version='2.5.1')
        self.assertIsInstance(result, dict)

    def test_pip_uninstall_with_extra_args(self):
        pip = Pip()
        result = pip.uninstall('ansible', extra_args='--no-cache-dir')
        self.assertIsInstance(result, dict)

    def test_pip_download(self):
        pip = Pip()
        result = pip.download('ansible')
        self.assertIsInstance(result, dict)

    def test_pip_download_with_version(self):
        pip = Pip()
        result = pip.download('ansible', version='2.5.1')
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()