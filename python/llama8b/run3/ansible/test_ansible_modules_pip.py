import unittest
from ansible.module_utils.basic import AnsibleModule, is_executable, missing_required_lib
from ansible.module_utils._text import to_native
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.six import PY3
from ansible.module_utils import pip as pip_util
import os
import re
import sys
import tempfile
import operator
import shlex
import traceback
from ansible.module_utils.compat.version import LooseVersion


class TestPip(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        self.assertEqual(module.__init__(), None)

    def test_get_best_parsable_locale(self):
        locale = get_best_parsable_locale()
        self.assertIsInstance(locale, str)

    def test_is_executable(self):
        executable = is_executable('pip')
        self.assertIsInstance(executable, bool)

    def test_missing_required_lib(self):
        lib = missing_required_lib('pip')
        self.assertIsInstance(lib, str)

    def test_to_native(self):
        native = to_native('pip')
        self.assertIsInstance(native, str)

    def test_operator(self):
        op = operator.ge
        self.assertIsInstance(op, type)

    def test_shlex(self):
        shlex_obj = shlex.shlex('pip')
        self.assertIsInstance(shlex_obj, shlex.shlex)

    def test_traceback(self):
        tb = traceback.format_exc()
        self.assertIsInstance(tb, str)

    def test_LooseVersion(self):
        version = LooseVersion('2.5.1')
        self.assertIsInstance(version, LooseVersion)

    def test_pip(self):
        pip = pip()
        self.assertIsInstance(pip, type)

    def test_virtualenv(self):
        virtualenv = virtualenv()
        self.assertIsInstance(virtualenv, type)

    def test_setuptools(self):
        setuptools = setuptools()
        self.assertIsInstance(setuptools, type)

    def test_vcs_re(self):
        vcs_re = _VCS_RE
        self.assertIsInstance(vcs_re, re._pattern_type)

    def test_op_dict(self):
        op_dict = op_dict
        self.assertIsInstance(op_dict, dict)

    def test_documentation(self):
        documentation = DOCUMENTATION
        self.assertIsInstance(documentation, str)

    def test_examples(self):
        examples = EXAMPLES
        self.assertIsInstance(examples, str)

    def test_return(self):
        return_ = RETURN
        self.assertIsInstance(return_, str)

    def test_setuptools_imp_err(self):
        setuptools_imp_err = SETUPTOOLS_IMP_ERR
        self.assertIsInstance(setuptools_imp_err, type)

    def test_special_package_checkers(self):
        special_package_checkers = _SPECIAL_PACKAGE_CHECKERS
        self.assertIsInstance(special_package_checkers, dict)

if __name__ == '__main__':
    unittest.main()