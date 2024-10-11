import unittest
from ansible.modules.pip import Package, SETUPTOOLS_IMP_ERR, _SPECIAL_PACKAGE_CHECKERS, op_dict, _VCS_RE


class TestPackage(unittest.TestCase):
    def test_init(self):
        package = Package("bottle")
        self.assertEqual(package.package_name, "bottle")
        self.assertIsNone(package._requirement)

    def test_init_with_version(self):
        package = Package("bottle", "0.11")
        self.assertEqual(package.package_name, "bottle")
        self.assertIsNotNone(package._requirement)

    def test_canonicalize_name(self):
        self.assertEqual(Package.canonicalize_name("Bottle"), "bottle")

    def test_is_satisfied_by(self):
        package = Package("bottle", "0.11")
        self.assertTrue(package.is_satisfied_by("0.11"))
        self.assertFalse(package.is_satisfied_by("0.12"))

    def test_private_method__plain_package(self):
        package = Package("bottle")
        self.assertFalse(package._Package__plain_package)
        package._requirement = "dummy"
        self.assertTrue(package._Package__plain_package)

    def test_private_method__requirement(self):
        package = Package("bottle", "0.11")
        self.assertIsNotNone(package._Package__requirement)

class TestSETUPTOOLS_IMP_ERR(unittest.TestCase):
    def test_SETUPTOOLS_IMP_ERR(self):
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

class Test_SPECIAL_PACKAGE_CHECKERS(unittest.TestCase):
    def test_SPECIAL_PACKAGE_CHECKERS(self):
        self.assertIn("setuptools", _SPECIAL_PACKAGE_CHECKERS)
        self.assertIn("pip", _SPECIAL_PACKAGE_CHECKERS)

class TestOpDict(unittest.TestCase):
    def test_op_dict(self):
        self.assertIn(">=", op_dict)
        self.assertIn("<=", op_dict)
        self.assertIn(">", op_dict)
        self.assertIn("<", op_dict)
        self.assertIn("==", op_dict)
        self.assertIn("!=", op_dict)
        self.assertIn("~=", op_dict)

class TestVCSRE(unittest.TestCase):
    def test_VCS_RE(self):
        self.assertIsInstance(_VCS_RE, re.Pattern)

if __name__ == '__main__':
    unittest.main()