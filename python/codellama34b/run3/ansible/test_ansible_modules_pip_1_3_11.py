import unittest
from ansible.modules.pip import *



class TestPip(unittest.TestCase):
    def test_canonicalize_name(self):
        result = Package.canonicalize_name("setuptools")
        self.assertEqual(result, "setuptools")

    def test_parse_version_spec(self):
        result = Package.parse_version_spec(">1.11.0,<1.12.0")
        self.assertEqual(result, [('>', '1.11.0'), ('<', '1.12.0')])

    def test_version_is_in_spec(self):
        result = Package.version_is_in_spec("1.11.1", [('>', '1.11.0'), ('<', '1.12.0')])
        self.assertEqual(result, True)

    def test_version_is_in_spec_2(self):
        result = Package.version_is_in_spec("1.12.1", [('>', '1.11.0'), ('<', '1.13.0')])
        self.assertEqual(result, False)

    def test_version_is_in_spec_3(self):
        result = Package.version_is_in_spec("1.11.1", [('>', '1.11.0'), ('<', '1.12.0'), ('==', '1.11.1')])
        self.assertEqual(result, True)

    def test_version_is_in_spec_4(self):
        result = Package.version_is_in_spec("1.11.1", [('>', '1.11.0'), ('<', '1.12.0'), ('!=', '1.11.2')])
        self.assertEqual(result, False)

    def test_version_is_in_spec_5(self):
        result = Package.version_is_in_spec("1.11.1", [('>', '1.11.0'), ('<', '1.12.0'), ('==', '1.11.1')])
        self.assertEqual(result, True)

    def test_version_is_in_spec_6(self):
        result = Package.version_is_in_spec("1.11.1", [('>', '1.11.0'), ('<', '1.12.0'), ('==', '1.11.1')])
        self.assertEqual(result, False)

    def test_version_is_in_spec_7(self):
        result = Package.version_is_in_spec("1.11.1", [('>', '1.11.0'), ('<', '1.12.0'), ('==', '1.11.1'), ('~=', '1.11.1')])
        self.assertEqual(result, True)

    def test_version_is_in_spec_8(self):
        result = Package.version_is_in_spec("1.11.1", [('>', '1.11.0'), ('<', '1.12.0'), ('==', '1.11.1'), ('~=', '1.11.1')])
        self.assertEqual(result, False)

    def test_version_is_in_spec_9(self):
        result = Package.version_is_in_spec("1.11.1", [('>', '1.11.0'), ('<', '1.12.0'), ('==', '1.11.1'), ('~=', '1.11.1'), ('!=', '1.11.1')])
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()