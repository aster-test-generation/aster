import unittest
from ansible.modules.pip import PipModule, _get_cmd_options, SETUPTOOLS_IMP_ERR, _SPECIAL_PACKAGE_CHECKERS, op_dict, _VCS_RE


class TestPipModule(unittest.TestCase):
    def test___init__(self):
        instance = PipModule()
        self.assertIsInstance(instance, PipModule)

    def test_run_command(self):
        instance = PipModule()
        result = instance.run_command(['pip', '--version'])
        self.assertEqual(result[0], 0)

    def test_main(self):
        instance = PipModule()
        result = instance.main()
        self.assertEqual(result, {'changed': False, 'msg': ''})

    def test__get_cmd_options(self):
        instance = PipModule()
        result = _get_cmd_options(instance, 'pip')
        self.assertIsInstance(result, list)

    def test__get_package_info(self):
        instance = PipModule()
        result = instance._get_package_info('bottle')
        self.assertIsInstance(result, dict)

    def test__install_package(self):
        instance = PipModule()
        result = instance._install_package('bottle')
        self.assertEqual(result, {'changed': True, 'msg': ''})

    def test__uninstall_package(self):
        instance = PipModule()
        result = instance._uninstall_package('bottle')
        self.assertEqual(result, {'changed': True, 'msg': ''})

    def test__virtualenv_create(self):
        instance = PipModule()
        result = instance._virtualenv_create('/tmp/virtualenv')
        self.assertEqual(result, {'changed': True, 'msg': ''})

    def test__virtualenv_activate(self):
        instance = PipModule()
        result = instance._virtualenv_activate('/tmp/virtualenv')
        self.assertEqual(result, {'changed': True, 'msg': ''})

    def test__virtualenv_deactivate(self):
        instance = PipModule()
        result = instance._virtualenv_deactivate('/tmp/virtualenv')
        self.assertEqual(result, {'changed': True, 'msg': ''})

    def test__get_virtualenv_python(self):
        instance = PipModule()
        result = instance._get_virtualenv_python('/tmp/virtualenv')
        self.assertIsInstance(result, str)

    def test__get_virtualenv_site_packages(self):
        instance = PipModule()
        result = instance._get_virtualenv_site_packages('/tmp/virtualenv')
        self.assertIsInstance(result, bool)

    def test__get_virtualenv_command(self):
        instance = PipModule()
        result = instance._get_virtualenv_command('/tmp/virtualenv')
        self.assertIsInstance(result, str)

    def test___str__(self):
        instance = PipModule()
        result = instance.__str__()
        self.assertEqual(result, 'PipModule')

    def test___repr__(self):
        instance = PipModule()
        result = instance.__repr__()
        self.assertEqual(result, 'PipModule()')

class Test_get_cmd_options(unittest.TestCase):
    def test_get_cmd_options(self):
        result = _get_cmd_options(PipModule(), 'pip')
        self.assertIsInstance(result, list)

class Test_SETUPTOOLS_IMP_ERR(unittest.TestCase):
    def test_SETUPTOOLS_IMP_ERR(self):
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

class Test_SPECIAL_PACKAGE_CHECKERS(unittest.TestCase):
    def test_SPECIAL_PACKAGE_CHECKERS(self):
        self.assertIsInstance(_SPECIAL_PACKAGE_CHECKERS, dict)

class Test_op_dict(unittest.TestCase):
    def test_op_dict(self):
        self.assertIsInstance(op_dict, dict)

class Test_VCS_RE(unittest.TestCase):
    def test_VCS_RE(self):
        self.assertIsInstance(_VCS_RE, re.Pattern)

if __name__ == '__main__':
    unittest.main()