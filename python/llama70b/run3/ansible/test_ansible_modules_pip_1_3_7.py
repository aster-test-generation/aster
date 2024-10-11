import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test___init__(self):
        instance = PipModule()
        self.assertIsInstance(instance, PipModule)

    def test_documentation(self):
        self.assertIsInstance(DOCUMENTATION, str)

    def test_examples(self):
        self.assertIsInstance(EXAMPLES, str)

    def test_return(self):
        self.assertIsInstance(RETURN, str)

    def test_setuptools_imp_err(self):
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

    def test_special_package_checkers(self):
        self.assertIsInstance(_SPECIAL_PACKAGE_CHECKERS, dict)

    def test_vcs_re(self):
        self.assertIsInstance(_VCS_RE, re.Pattern)

    def test_op_dict(self):
        self.assertIsInstance(op_dict, dict)

    def test_have_pip_module(self):
        result = _have_pip_module()
        self.assertIsInstance(result, bool)

    def test__have_pip_module_private(self):
        result = PipModule()._PipModule__have_pip_module()
        self.assertIsInstance(result, bool)

    def test__load_params(self):
        instance = PipModule()
        result = instance._load_params()
        self.assertIsInstance(result, dict)

    def test__check_pip(self):
        instance = PipModule()
        result = instance._check_pip()
        self.assertIsInstance(result, bool)

    def test__install_packages(self):
        instance = PipModule()
        result = instance._install_packages([])
        self.assertIsInstance(result, dict)

    def test__uninstall_packages(self):
        instance = PipModule()
        result = instance._uninstall_packages([])
        self.assertIsInstance(result, dict)

    def test__get_pip_version(self):
        instance = PipModule()
        result = instance._get_pip_version()
        self.assertIsInstance(result, str)

    def test__get_package_version(self):
        instance = PipModule()
        result = instance._get_package_version('package')
        self.assertIsInstance(result, str)

    def test__get_virtualenv_python(self):
        instance = PipModule()
        result = instance._get_virtualenv_python()
        self.assertIsInstance(result, str)

    def test__create_virtualenv(self):
        instance = PipModule()
        result = instance._create_virtualenv()
        self.assertIsInstance(result, bool)

    def test__run_pip(self):
        instance = PipModule()
        result = instance._run_pip(['pip', 'install', 'package'])
        self.assertIsInstance(result, dict)

    def test_run(self):
        instance = PipModule()
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test_main(self):
        instance = PipModule()
        result = instance.main()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()