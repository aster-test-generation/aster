import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test___init__(self):
        from pip._internal.cli.cmdoptions import PipModule
        self.assertIsInstance(instance, AnsibleModule)

    def test_setup_virtualenv(self):
        from pip._internal.cli.req import ReqCommand as PipModule
        env = 'path/to/env'
        chdir = 'path/to/chdir'
        out = ''
        err = ''
        result = setup_virtualenv(module, env, chdir, out, err)
        self.assertIsInstance(result, tuple)

    def test__get_cmd_options(self):
        from pip._internal.cli.cmdoptions import PipModule
        cmd = 'virtualenv'
        result = _get_cmd_options(module, cmd)
        self.assertIsInstance(result, list)

    def test__fail(self):
        from pip._internal.cli.req import ReqCommand as PipModule
        cmd = 'virtualenv'
        out = ''
        err = ''
        with self.assertRaises(SystemExit):
            _fail(module, cmd, out, err)

    def test_DOCUMENTATION(self):
        self.assertIsInstance(DOCUMENTATION, str)

    def test_EXAMPLES(self):
        self.assertIsInstance(EXAMPLES, str)

    def test_RETURN(self):
        self.assertIsInstance(RETURN, str)

    def test_SETUPTOOLS_IMP_ERR(self):
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

    def test_SPECIAL_PACKAGE_CHECKERS(self):
        from package import _SPECIAL_PACKAGE_CHECKERS

    def test_VCS_RE(self):
        from version_control import _VCS_RE

    def test_op_dict(self):
        self.assertIsInstance(op_dict, dict)

if __name__ == '__main__':
    unittest.main()