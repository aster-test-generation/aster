import unittest
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils._text import to_native
from ansible.module_utils.basic import AnsibleModule, is_executable, missing_required_lib
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.six import PY3
from ansible.modules.pip import *

__metaclass__ = type
class TestPip(unittest.TestCase):
    def test_LooseVersion(self):
        instance = LooseVersion()
        result = instance.v2_version
        self.assertEqual(result, None)

    def test_to_native(self):
        instance = to_native(obj)
        result = instance.text
        self.assertEqual(result, None)

    def test_is_executable(self):
        instance = is_executable(path)
        result = instance.path
        self.assertEqual(result, None)

    def test_missing_required_lib(self):
        instance = missing_required_lib('library')
        result = instance.module_name
        self.assertEqual(result, None)

    def test_AnsibleModule(self):
        instance = AnsibleModule(argument_spec={})
        result = instance.argument_spec
        self.assertEqual(result, None)

    def test_get_best_parsable_locale(self):
        instance = get_best_parsable_locale(module)
        result = instance.locales
        self.assertEqual(result, None)

    def test_Package(self):
        instance = Package()
        result = instance.package_name
        self.assertEqual(result, None)



class TestPip(unittest.TestCase):
    def test_canonicalize_name(self):
        result = Package.canonicalize_name("ansible")
        self.assertEqual(result, "ansible")

    def test_Package(self):
        result = Package("ansible")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools_pip_setuptools(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools_pip_setuptools_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools_pip_setuptools_pip_setuptools(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools_pip_setuptools_pip_setuptools_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

if __name__ == '__main__':
    unittest.main()