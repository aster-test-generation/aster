import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip()
        self.assertIsInstance(pip, Pip)

    def test_pip_get_bin_path(self):
        pip = Pip()
        pip.executable = '/usr/bin/pip'
        self.assertEqual(pip.get_bin_path(), '/usr/bin/pip')

    def test_pip_get_package_version(self):
        pip = Pip()
        self.assertEqual(pip.get_package_version('ansible'), None)

    def test_pip_get_installed_version(self):
        pip = Pip()
        self.assertEqual(pip.get_installed_version('ansible'), None)

    def test_pip_get_installed_version_with_version(self):
        pip = Pip()
        self.assertEqual(pip.get_installed_version('ansible', version='2.5.1'), None)

    def test_pip_get_installed_version_with_version_and_state(self):
        pip = Pip()
        self.assertEqual(pip.get_installed_version('ansible', version='2.5.1', state='present'), None)

    def test_pip_get_installed_version_with_version_and_state_absent(self):
        pip = Pip()
        self.assertEqual(pip.get_installed_version('ansible', version='2.5.1', state='absent'), None)

    def test_pip_get_installed_version_with_version_and_state_forcereinstall(self):
        pip = Pip()
        self.assertEqual(pip.get_installed_version('ansible', version='2.5.1', state='forcereinstall'), None)

    def test_pip_get_installed_version_with_version_and_state_latest(self):
        pip = Pip()
        self.assertEqual(pip.get_installed_version('ansible', version='2.5.1', state='latest'), None)

    def test_pip_get_installed_version_with_version_and_state_present(self):
        pip = Pip()
        self.assertEqual(pip.get_installed_version('ansible', version='2.5.1', state='present'), None)

    def test_pip_get_package_to_install(self):
        pip = Pip()
        self.assertEqual(pip.get_package_to_install('ansible'), 'ansible')

    def test_pip_get_package_to_install_with_version(self):
        pip = Pip()
        self.assertEqual(pip.get_package_to_install('ansible', version='2.5.1'), 'ansible==2.5.1')

    def test_pip_get_package_to_install_with_version_and_state_absent(self):
        pip = Pip()
        self.assertEqual(pip.get_package_to_install('ansible', version='2.5.1', state='absent'), 'ansible==2.5.1')

    def test_pip_get_package_to_install_with_version_and_state_forcereinstall(self):
        pip = Pip()
        self.assertEqual(pip.get_package_to_install('ansible', version='2.5.1', state='forcereinstall'), 'ansible==2.5.1')

    def test_pip_get_package_to_install_with_version_and_state_latest(self):
        pip = Pip()
        self.assertEqual(pip.get_package_to_install('ansible', version='2.5.1', state='latest'), 'ansible')

    def test_pip_get_package_to_install_with_version_and_state_present(self):
        pip = Pip()
        self.assertEqual(pip.get_package_to_install('ansible', version='2.5.1', state='present'), 'ansible==2.5.1')

    def test_pip_get_package_to_install_with_version_and_state_present_and_editable(self):
        pip = Pip()
        self.assertEqual(pip.get_package_to_install('ansible', version='2.5.1', state='present', editable=True), '-e ansible==2.5.1')

if __name__ == '__main__':
    unittest.main()