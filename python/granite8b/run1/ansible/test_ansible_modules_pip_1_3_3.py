import unittest
from ansible_collections.ansible.utils.plugins.module_utils.pip import Pip
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_install_package(self):
        pip = Pip()
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_version(self):
        pip = Pip()
        result = pip.install('ansible==2.5.1')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_multiple_versions(self):
        pip = Pip()
        result = pip.install(['ansible>2.5.0,<2.6.0', 'bottle>0.10,<0.20,!=0.11'])
        self.assertEqual(result, 0)

    def test_pip_install_package_with_proxy(self):
        pip = Pip()
        pip.executable = 'pip2'
        pip.proxy = 'http://proxy.example.com'
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_executable(self):
        pip = Pip()
        pip.executable = 'pip3'
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_umask(self):
        pip = Pip()
        pip.umask = '0022'
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_virtualenv(self):
        pip = Pip()
        pip.virtualenv = '/tmp/virtualenv'
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_requirements_file(self):
        pip = Pip()
        pip.requirements = '/srv/git/project/requirements.txt'
        result = pip.install()
        self.assertEqual(result, 0)

    def test_pip_install_package_with_editable_option(self):
        pip = Pip()
        pip.editable = True
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_chdir_option(self):
        pip = Pip()
        pip.chdir = '/path/to/directory'
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_state_option(self):
        pip = Pip()
        pip.state = 'present'
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_install_package_with_extra_args_option(self):
        pip = Pip()
        pip.extra_args = '--no-cache-dir'
        result = pip.install('ansible')
        self.assertEqual(result, 0)

class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip(module_args={})
        self.assertIsInstance(pip, Pip)

    def test_pip_install(self):
        pip = Pip(module_args={'name': 'ansible'})
        result = pip.install()
        self.assertEqual(result['name'], 'ansible')

    def test_pip_uninstall(self):
        pip = Pip(module_args={'name': 'ansible'})
        result = pip.uninstall()
        self.assertEqual(result['name'], 'ansible')

    def test_pip_upgrade(self):
        pip = Pip(module_args={'name': 'ansible'})
        result = pip.upgrade()
        self.assertEqual(result['name'], 'ansible')

    def test_pip_list(self):
        pip = Pip(module_args={})
        result = pip.list()
        self.assertIsInstance(result, list)

    def test_pip_download(self):
        pip = Pip(module_args={'name': 'ansible'})
        result = pip.download()
        self.assertEqual(result['name'], 'ansible')

    def test_pip_freeze(self):
        pip = Pip(module_args={})
        result = pip.freeze()
        self.assertIsInstance(result, list)

    def test_pip_main(self):
        result = Pip.main()
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()