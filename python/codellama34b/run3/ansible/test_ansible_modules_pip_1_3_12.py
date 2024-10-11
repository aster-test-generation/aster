import unittest
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils._text import to_native
from ansible.module_utils.basic import AnsibleModule, is_executable, missing_required_lib
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.six import PY3
from ansible.modules.pip import Package

__metaclass__ = type

class TestPackage(unittest.TestCase):
    def test_init(self):
        instance = Package("name_string")
        self.assertEqual(instance.package_name, "name_string")
        self.assertEqual(instance._requirement, None)
        instance = Package("name_string", "version_string")
        self.assertEqual(instance.package_name, "name_string")
        self.assertEqual(instance._requirement, None)

    def test_canonicalize_name(self):
        result = Package.canonicalize_name("name_string")
        self.assertEqual(result, "name_string")

    def test_has_version_specifier(self):
        instance = Package("name_string")
        self.assertEqual(instance.has_version_specifier, False)


if __name__ == '__main__':
    unittest.main()