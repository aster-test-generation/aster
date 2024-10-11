import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test_get_pip_path(self):
        module = AnsibleModule()
        pip_path = get_pip_path(module)
        self.assertIsNotNone(pip_path)

    def test_get_virtualenv_cmd(self):
        module = AnsibleModule()
        virtualenv_cmd = get_virtualenv_cmd(module)
        self.assertIsNotNone(virtualenv_cmd)

    def test_get_extra_args(self):
        module = AnsibleModule()
        extra_args = get_extra_args(module)
        self.assertIsNotNone(extra_args)

    def test_get_umask(self):
        module = AnsibleModule()
        umask = get_umask(module)
        self.assertIsNotNone(umask)

    def test_get_state(self):
        module = AnsibleModule()
        state = get_state(module)
        self.assertIsNotNone(state)

    def test_get_name(self):
        module = AnsibleModule()
        name = get_name(module)
        self.assertIsNotNone(name)

    def test_get_requirements(self):
        module = AnsibleModule()
        requirements = get_requirements(module)
        self.assertIsNotNone(requirements)

    def test_get_editable(self):
        module = AnsibleModule()
        editable = get_editable(module)
        self.assertIsNotNone(editable)

    def test_get_chdir(self):
        module = AnsibleModule()
        chdir = get_chdir(module)
        self.assertIsNotNone(chdir)

    def test_get_executable(self):
        module = AnsibleModule()
        executable = get_executable(module)
        self.assertIsNotNone(executable)

    def test_get_virtualenv(self):
        module = AnsibleModule()
        virtualenv = get_virtualenv(module)
        self.assertIsNotNone(virtualenv)

    def test_get_virtualenv_site_packages(self):
        module = AnsibleModule()
        virtualenv_site_packages = get_virtualenv_site_packages(module)
        self.assertIsNotNone(virtualenv_site_packages)

    def test_get_virtualenv_command(self):
        module = AnsibleModule()
        virtualenv_command = get_virtualenv_command(module)
        self.assertIsNotNone(virtualenv_command)

    def test_get_virtualenv_python(self):
        module = AnsibleModule()
        virtualenv_python = get_virtualenv_python(module)
        self.assertIsNotNone(virtualenv_python)

    def test_get_pip_cmd(self):
        module = AnsibleModule()
        pip_cmd = get_pip_cmd(module)
        self.assertIsNotNone(pip_cmd)

    def test_get_pip_version(self):
        module = AnsibleModule()
        pip_version = get_pip_version(module)
        self.assertIsNotNone(pip_version)

    def test_get_package_version(self):
        module = AnsibleModule()
        package_version = get_package_version(module)
        self.assertIsNotNone(package_version)

    def test_get_package_info(self):
        module = AnsibleModule()
        package_info = get_package_info(module)
        self.assertIsNotNone(package_info)

    def test_get_package_list(self):
        module = AnsibleModule()
        package_list = get_package_list(module)
        self.assertIsNotNone(package_list)

    def test_get_package_state(self):
        module = AnsibleModule()
        package_state = get_package_state(module)
        self.assertIsNotNone(package_state)

    def test_get_package_install_state(self):
        module = AnsibleModule()
        package_install_state = get_package_install_state(module)
        self.assertIsNotNone(package_install_state)

    def test_get_package_latest_version(self):
        module = AnsibleModule()
        package_latest_version = get_package_latest_version(module)
        self.assertIsNotNone(package_latest_version)

    def test_get_package_required_version(self):
        module = AnsibleModule()
        package_required_version = get_package_required_version(module)
        self.assertIsNotNone(package_required_version)

    def test_get_package_names(self):
        module = AnsibleModule()
        package_names = get_package_names(module)
        self.assertIsNotNone(package_names)

if __name__ == '__main__':
    unittest.main()