import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test___init__(self):
        from pip._internal.cli.cmdoptions import PipModule
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
        from package import _SPECIAL_PACKAGE_CHECKERS

    def test_vcs_re(self):
        from version_control import _VCS_RE

    def test_op_dict(self):
        self.assertIsInstance(op_dict, dict)

    def test_fail(self):
        from pip._internal.operations import PipModule
        cmd = 'pip install'
        out = 'stdout'
        err = 'stderr'
        with self.assertRaises(SystemExit):
            _fail(module, cmd, out, err)

    def test___str__(self):
        from pip._internal.cli.cmdoptions import PipModule
        self.assertIsInstance(instance.__str__(), str)

    def test___repr__(self):
        from pip._internal.cli.cmdoptions import PipModule
        self.assertIsInstance(instance.__repr__(), str)

    def test___eq__(self):
        from pip._internal.cli.cmdoptions import PipModule
        instance2 = PipModule()
        self.assertTrue(instance1 == instance2)

    def test__fail_json(self):
        from pip._internal.cli.cmdoptions import PipModule
        cmd = 'pip install'
        msg = 'error message'
        with self.assertRaises(SystemExit):
            module.fail_json(cmd=cmd, msg=msg)

if __name__ == '__main__':
    unittest.main()