import unittest
from flutils.packages import bump_version

class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        version = '1.0.0'
        expected = '2.0.0'
        actual = bump_version(version, 0)
        self.assertEqual(actual, expected)

    def test_bump_version_minor(self):
        version = '1.0.0'
        expected = '1.1.0'
        actual = bump_version(version, 1)
        self.assertEqual(actual, expected)

    def test_bump_version_patch(self):
        version = '1.0.0'
        expected = '1.0.1'
        actual = bump_version(version, 2)
        self.assertEqual(actual, expected)

    def test_bump_version_minor_alpha(self):
        version = '1.0.0'
        expected = '1.1a0'
        actual = bump_version(version, 1, 'alpha')
        self.assertEqual(actual, expected)

    def test_bump_version_patch_beta(self):
        version = '1.0.0'
        expected = '1.0b0'
        actual = bump_version(version, 2, 'beta')
        self.assertEqual(actual, expected)

    def test_bump_version_invalid_position(self):
        version = '1.0.0'
        with self.assertRaises(ValueError):
            bump_version(version, -1)

    def test_bump_version_invalid_pre_release(self):
        version = '1.0.0'
        with self.assertRaises(ValueError):
            bump_version(version, 1, 'invalid')

if __name__ == '__main__':
    unittest.main()