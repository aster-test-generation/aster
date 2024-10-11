from unittest import TestCase
from flutils.packages import bump_version

class TestBumpVersion(TestCase):
    def test_bump_version_major(self):
        version = '1.0.0'
        expected_version = '2.0.0'
        actual_version = bump_version(version, 0)
        self.assertEqual(actual_version, expected_version)

    def test_bump_version_minor(self):
        version = '1.0.0'
        expected_version = '1.1.0'
        actual_version = bump_version(version, 1)
        self.assertEqual(actual_version, expected_version)

    def test_bump_version_patch(self):
        version = '1.0.0'
        expected_version = '1.0.1'
        actual_version = bump_version(version, 2)
        self.assertEqual(actual_version, expected_version)

    def test_bump_version_minor_alpha(self):
        version = '1.0.0a1'
        expected_version = '1.1.0a0'
        actual_version = bump_version(version, 1)
        self.assertEqual(actual_version, expected_version)

    def test_bump_version_patch_alpha(self):
        version = '1.0.0a1'
        expected_version = '1.0.1a0'
        actual_version = bump_version(version, 2)
        self.assertEqual(actual_version, expected_version)

    def test_bump_version_minor_beta(self):
        version = '1.0.0b1'
        expected_version = '1.1.0b0'
        actual_version = bump_version(version, 1)
        self.assertEqual(actual_version, expected_version)

    def test_bump_version_patch_beta(self):
        version = '1.0.0b1'
        expected_version = '1.0.1b0'
        actual_version = bump_version(version, 2)
        self.assertEqual(actual_version, expected_version)

if __name__ == '__main__':
    unittest.main()