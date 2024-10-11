import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test___init__(self):
        instance = PipModule()
        self.assertIsInstance(instance, AnsibleModule)

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

    def test_recover_package_name(self):
        names = ['package1', 'package2,package3']
        result = _recover_package_name(names)
        self.assertEqual(result, ['package1', 'package2,package3'])

    def test__is_package_name(self):
        self.assertTrue(_is_package_name('package1'))
        self.assertFalse(_is_package_name('package1,package2'))

    def test__parse_package_name(self):
        package_name = 'package1==1.2.3'
        result = _parse_package_name(package_name)
        self.assertEqual(result, ('package1', '==', '1.2.3'))

    def test__get_package_version(self):
        package_name = 'package1==1.2.3'
        result = _get_package_version(package_name)
        self.assertEqual(result, '1.2.3')

    def test__get_package_name(self):
        package_name = 'package1==1.2.3'
        result = _get_package_name(package_name)
        self.assertEqual(result, 'package1')

    def test__parse_requirements(self):
        requirements = ['package1==1.2.3', 'package2>=2.3.4']
        result = _parse_requirements(requirements)
        self.assertEqual(result, [('package1', '==', '1.2.3'), ('package2', '>=', '2.3.4')])

    def test_run_module(self):
        instance = PipModule()
        result = instance.run_module({'name': 'package1', 'state': 'present'})
        self.assertEqual(result, {'changed': False, 'name': 'package1', 'state': 'present'})

if __name__ == '__main__':
    unittest.main()