import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six import PY3
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils._text import to_native
from ansible.modules.pip import *


class TestAnsibleModule(unittest.TestCase):
    def test_get_best_parsable_locale(self):
        locale = get_best_parsable_locale(AnsibleModule, arg)
        self.assertIsNotNone(locale)

    def test_is_executable(self):
        self.assertTrue(is_executable('python3'))

    def test_missing_required_lib(self):
        self.assertIsNone(missing_required_lib('os'))

    def test_to_native(self):
        self.assertEqual(to_native('test'), 'test')

    def test_LooseVersion(self):
        self.assertTrue(LooseVersion('1.2.3') >= LooseVersion('1.2.2'))

    def test_PY3(self):
        self.assertTrue(PY3)

class TestPipModule(unittest.TestCase):
    def test_get_packages(self):
        module = AnsibleModule()
        pip = ['pip']
        chdir = '/path/to/directory'
        command, out, err = _get_packages(module, pip, chdir)
        self.assertEqual(command, 'pip list --format=freeze')
        self.assertEqual(out, 'list of packages')
        self.assertEqual(err, 'error message')

if __name__ == '__main__':
    unittest.main()