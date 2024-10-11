import unittest
from ansible.modules import pip


class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        instance = pip.AnsibleModule()
        self.assertIsInstance(instance, pip.AnsibleModule)

    def test___str__(self):
        instance = pip.AnsibleModule()
        result = instance.__str__()
        self.assertEqual(result, "AnsibleModule")

    def test___repr__(self):
        instance = pip.AnsibleModule()
        result = instance.__repr__()
        self.assertEqual(result, "AnsibleModule()")

    def test_is_executable(self):
        result = pip.is_executable("/usr/bin/pip")
        self.assertTrue(result)

    def test_missing_required_lib(self):
        result = pip.missing_required_lib("setuptools")
        self.assertFalse(result)

class TestPipModule(unittest.TestCase):
    def test___init__(self):
        instance = pip.PipModule()
        self.assertIsInstance(instance, pip.PipModule)

    def test___str__(self):
        instance = pip.PipModule()
        result = instance.__str__()
        self.assertEqual(result, "PipModule")

    def test___repr__(self):
        instance = pip.PipModule()
        result = instance.__repr__()
        self.assertEqual(result, "PipModule()")

    def test_run_command(self):
        instance = pip.PipModule()
        result = instance.run_command(["pip", "install", "bottle"])
        self.assertEqual(result, 0)

    def test__is_package_name(self):
        result = pip._is_package_name("bottle")
        self.assertTrue(result)

    def test__VCS_RE(self):
        result = pip._VCS_RE.match("svn+https://example.com")
        self.assertIsNotNone(result)

    def test_op_dict(self):
        result = pip.op_dict['>='](1, 2)
        self.assertFalse(result)

class TestSpecialPackageCheckers(unittest.TestCase):
    def test_setuptools(self):
        result = pip._SPECIAL_PACKAGE_CHECKERS['setuptools']
        self.assertEqual(result, 'import setuptools; print(setuptools.__version__)')

    def test_pip(self):
        result = pip._SPECIAL_PACKAGE_CHECKERS['pip']
        self.assertEqual(result, 'import pkg_resources; print(pkg_resources.get_distribution("pip").version)')

if __name__ == '__main__':
    unittest.main()