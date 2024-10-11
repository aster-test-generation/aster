from ansible.modules.pip import _is_package_name
import unittest
from ansible.modules.pip import *



class TestPip(unittest.TestCase):
    def test_is_package_name(self):
        result = _is_package_name("name")
        self.assertTrue(result)

    def test_is_package_name_with_op(self):
        result = _is_package_name(">name")
        self.assertFalse(result)

    def test_is_package_name_with_op_and_version(self):
        result = _is_package_name(">name==1.0")
        self.assertFalse(result)

    def test_is_package_name_with_op_and_version_and_extra(self):
        result = _is_package_name(">name==1.0,<2.0")
        self.assertFalse(result)

    def test_is_package_name_with_op_and_version_and_extra_and_op(self):
        result = _is_package_name(">name==1.0,<2.0,!=1.1")
        self.assertFalse(result)

    def test_is_package_name_with_op_and_version_and_extra_and_op_and_version(self):
        result = _is_package_name(">name==1.0,<2.0,!=1.1,==1.2")
        self.assertFalse(result)

    def test_is_package_name_with_op_and_version_and_extra_and_op_and_version_and_extra(self):
        result = _is_package_name(">name==1.0,<2.0,!=1.1,==1.2,<=1.3")
        self.assertFalse(result)

    def test_is_package_name_with_op_and_version_and_extra_and_op_and_version_and_extra_and_op(self):
        result = _is_package_name(">name==1.0,<2.0,!=1.1,==1.2,<=1.3,>=1.4")
        self.assertFalse(result)

    def test_is_package_name_with_op_and_version_and_extra_and_op_and_version_and_extra_and_op_and_version(self):
        result = _is_package_name(">name==1.0,<2.0,!=1.1,==1.2,<=1.3,>=1.4,==1.5")
        self.assertFalse(result)

    def test_is_package_name_with_op_and_version_and_extra_and_op_and_version_and_extra_and_op_and_version_and_extra(self):
        result = _is_package_name(">name==1.0,<2.0,!=1.1,==1.2,<=1.3,>=1.4,==1.5,<=1.6")
        self.assertFalse(result)

    def test_is_package_name_with_op_and_version_and_extra_and_op_and_version_and_extra_and_op_and_version_and_extra_and_op(self):
        result = _is_package_name(">name==1.0,<2.0,!=1.1,==1.2,<=1.3,>=1.4,==1.5,<=1.6,>=1.7")
        self.assertFalse(result)

    def test_is_package_name_with_op_and_version_and_extra_and_op_and_version_and_extra_and_op_and_version_and_extra_and_op_and_version(self):
        result = _is_package_name(">name==1.0,<2.0,!=1.1,==1.2,<=1.3,>=1.4,==1.5,<=1.6,>=1.7,==1.8")
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()