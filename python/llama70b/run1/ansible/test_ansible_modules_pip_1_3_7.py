import unittest
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):
    def test___init__(self):
        from pip._internal.cli.cmdoptions import PipModule
        self.assertIsInstance(instance, AnsibleModule)

    def test__have_pip_module(self):
        from ansible.modules.pip import _have_pip_module
        result = _have_pip_module()
        self.assertIsInstance(result, bool)

    def test_SETUPTOOLS_IMP_ERR(self):
        from ansible.modules.pip import SETUPTOOLS_IMP_ERR
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

    def test_SPECIAL_PACKAGE_CHECKERS(self):
        from ansible.modules.pip import _SPECIAL_PACKAGE_CHECKERS
        self.assertIsInstance(_SPECIAL_PACKAGE_CHECKERS, dict)

    def test_VCS_RE(self):
        from ansible.modules.pip import _VCS_RE
        self.assertIsInstance(_VCS_RE, __import__('re').Pattern)

    def test_op_dict(self):
        from ansible.modules.pip import op_dict
        self.assertIsInstance(op_dict, dict)

    def test_DOCUMENTATION(self):
        from ansible.modules.pip import DOCUMENTATION
        self.assertIsInstance(DOCUMENTATION, str)

    def test_EXAMPLES(self):
        from ansible.modules.pip import EXAMPLES
        self.assertIsInstance(EXAMPLES, str)

    def test_RETURN(self):
        from ansible.modules.pip import RETURN
        self.assertIsInstance(RETURN, str)

    def test___str__(self):
        from pip._internal.cli.cmdoptions import PipModule
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from pip._internal.cli.cmdoptions import PipModule
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        from pip._internal.operations import PipModule
        instance2 = PipModule()
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()