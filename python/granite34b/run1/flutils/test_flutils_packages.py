import unittest
from flutils.packages import bump_version
from unittest import TestCase


class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        self.assertEqual(bump_version('1.0.0'), '2.0.0')

    def test_bump_version_minor(self):
        self.assertEqual(bump_version('1.0.0', position=1), '1.1.0')

    def test_bump_version_patch(self):
        self.assertEqual(bump_version('1.0.0', position=2), '1.0.1')

    def test_bump_version_minor_alpha(self):
        self.assertEqual(bump_version('1.0.0', position=1, pre_release='alpha'), '1.1a0')

    def test_bump_version_minor_beta(self):
        self.assertEqual(bump_version('1.0.0', position=1, pre_release='beta'), '1.1b0')

    def test_bump_version_patch_alpha(self):
        self.assertEqual(bump_version('1.0.0', position=2, pre_release='alpha'), '1.0a0')

    def test_bump_version_patch_beta(self):
        self.assertEqual(bump_version('1.0.0', position=2, pre_release='beta'), '1.0b0')

    def test_bump_version_invalid_position(self):
        with self.assertRaises(ValueError):
            bump_version('1.0.0', position=3)

    def test_bump_version_invalid_pre_release(self):
        with self.assertRaises(ValueError):
            bump_version('1.0.0', position=1, pre_release='invalid')

class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        version = "1.0.0"
        expected = "2.0.0"
        actual = bump_version(version, 0)
        self.assertEqual(actual, expected)

    def test_bump_version_minor(self):
        version = "1.0.0"
        expected = "1.1.0"
        actual = bump_version(version, 1)
        self.assertEqual(actual, expected)

    def test_bump_version_patch(self):
        version = "1.0.0"
        expected = "1.0.1"
        actual = bump_version(version, 2)
        self.assertEqual(actual, expected)

    def test_bump_version_minor_alpha(self):
        version = "1.0.0"
        expected = "1.1a0"
        actual = bump_version(version, 1, "alpha")
        self.assertEqual(actual, expected)

    def test_bump_version_patch_beta(self):
        version = "1.0.0"
        expected = "1.0b0"
        actual = bump_version(version, 2, "beta")
        self.assertEqual(actual, expected)

    def test_bump_version_invalid_position(self):
        version = "1.0.0"
        with self.assertRaises(ValueError):
            bump_version(version, -1)

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