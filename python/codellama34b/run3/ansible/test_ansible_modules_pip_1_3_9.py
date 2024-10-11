from ansible.modules.pip import _get_package_info
import unittest
from ansible.modules.pip import *



class TestPip(unittest.TestCase):
    def test_get_package_info(self):
        module = AnsibleModule
        package = "setuptools"
        env = None
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "setuptools==40.8.0")

    def test_get_package_info_2(self):
        module = AnsibleModule
        package = "pip"
        env = None
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "pip==19.1.1")

    def test_get_package_info_3(self):
        module = AnsibleModule
        package = "setuptools"
        env = "env"
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "setuptools==40.8.0")

    def test_get_package_info_4(self):
        module = AnsibleModule
        package = "pip"
        env = "env"
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "pip==19.1.1")

    def test_get_package_info_5(self):
        module = AnsibleModule
        package = "setuptools"
        env = None
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "setuptools==40.8.0")

    def test_get_package_info_6(self):
        module = AnsibleModule
        package = "pip"
        env = None
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "pip==19.1.1")

    def test_get_package_info_7(self):
        module = AnsibleModule
        package = "setuptools"
        env = "env"
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "setuptools==40.8.0")

    def test_get_package_info_8(self):
        module = AnsibleModule
        package = "pip"
        env = "env"
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "pip==19.1.1")

    def test_get_package_info_9(self):
        module = AnsibleModule
        package = "setuptools"
        env = None
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "setuptools==40.8.0")

    def test_get_package_info_10(self):
        module = AnsibleModule
        package = "pip"
        env = None
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "pip==19.1.1")

    def test_get_package_info_11(self):
        module = AnsibleModule
        package = "setuptools"
        env = "env"
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "setuptools==40.8.0")

    def test_get_package_info_12(self):
        module = AnsibleModule
        package = "pip"
        env = "env"
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "pip==19.1.1")

    def test_get_package_info_13(self):
        module = AnsibleModule
        package = "setuptools"
        env = None
        result = _get_package_info(module, package, env)
        self.assertEqual(result, "setuptools==40.8.0")

if __name__ == '__main__':
    unittest.main()