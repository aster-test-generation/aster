import unittest
from ansible.modules.pip import *

class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        self.assertIsInstance(module, AnsibleModule)

    def test_argument_spec(self):
        module = AnsibleModule()
        self.assertIsInstance(module.argument_spec, dict)

    def test_required_one_of(self):
        module = AnsibleModule()
        self.assertIsInstance(module.required_one_of, list)

    def test_mutually_exclusive(self):
        module = AnsibleModule()
        self.assertIsInstance(module.mutually_exclusive, list)

    def test_supports_check_mode(self):
        module = AnsibleModule()
        self.assertTrue(module.supports_check_mode)

class TestMain(unittest.TestCase):
    def test_main(self):
        main()

    def test_state_map(self):
        self.assertIsInstance(state_map, dict)

    def test_op_dict(self):
        self.assertIsInstance(op_dict, dict)

    def test_SPECIAL_PACKAGE_CHECKERS(self):
        self.assertIsInstance(_SPECIAL_PACKAGE_CHECKERS, dict)

    def test_VCS_RE(self):
        self.assertIsInstance(_VCS_RE, re.Pattern)

class TestPackage(unittest.TestCase):
    def test_init(self):
        package = Package('bottle')
        self.assertIsInstance(package, Package)

    def test_has_version_specifier(self):
        package = Package('bottle>0.10,<0.20,!=0.11')
        self.assertTrue(package.has_version_specifier)

    def test_recover_package_name(self):
        packages = _recover_package_name(['bottle>0.10,<0.20,!=0.11', 'django>1.11.0,<1.12.0'])
        self.assertIsInstance(packages, list)

    def test_is_vcs_url(self):
        self.assertTrue(_is_vcs_url('git+https://github.com/mattupstate/bottle.git'))

    def test_get_pip(self):
        module = AnsibleModule()
        env = '/tmp/virtualenv'
        executable = 'pip3'
        pip = _get_pip(module, env, executable)
        self.assertIsInstance(pip, str)

    def test_setup_virtualenv(self):
        module = AnsibleModule()
        env = '/tmp/virtualenv'
        chdir = '/tmp'
        out, err = setup_virtualenv(module, env, chdir, '', '')
        self.assertIsInstance(out, str)
        self.assertIsInstance(err, str)

    def test_get_packages(self):
        module = AnsibleModule()
        pip = 'pip3'
        chdir = '/tmp'
        pkg_cmd, out_pip, err_pip = _get_packages(module, pip, chdir)
        self.assertIsInstance(pkg_cmd, str)
        self.assertIsInstance(out_pip, str)
        self.assertIsInstance(err_pip, str)

    def test_is_present(self):
        module = AnsibleModule()
        package = Package('bottle')
        pkg_list = ['bottle 0.12.0']
        pkg_cmd = 'pip3 freeze'
        self.assertTrue(_is_present(module, package, pkg_list, pkg_cmd))

    def test_get_package_info(self):
        module = AnsibleModule()
        package = 'bottle'
        env = '/tmp/virtualenv'
        formatted_dep = _get_package_info(module, package, env)
        self.assertIsInstance(formatted_dep, str)

if __name__ == '__main__':
    unittest.main()