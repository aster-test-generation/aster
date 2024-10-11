import unittest
from flutils.packages import bump_version


class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        version = '1.2.3'
        expected = '2.0.0'
        actual = bump_version(version, 0)
        self.assertEqual(actual, expected)

    def test_bump_version_minor(self):
        version = '1.2.3'
        expected = '1.3.0'
        actual = bump_version(version, 1)
        self.assertEqual(actual, expected)

    def test_bump_version_patch(self):
        version = '1.2.3'
        expected = '1.2.4'
        actual = bump_version(version, 2)
        self.assertEqual(actual, expected)

    def test_bump_version_minor_alpha(self):
        version = '1.2.3a1'
        expected = '1.3a0'
        actual = bump_version(version, 1)
        self.assertEqual(actual, expected)

    def test_bump_version_minor_beta(self):
        version = '1.2.3b1'
        expected = '1.3b0'
        actual = bump_version(version, 1)
        self.assertEqual(actual, expected)

    def test_bump_version_patch_alpha(self):
        version = '1.2.3a1'
        expected = '1.2.4a0'
        actual = bump_version(version, 2)
        self.assertEqual(actual, expected)

    def test_bump_version_patch_beta(self):
        version = '1.2.3b1'
        expected = '1.2.4b0'
        actual = bump_version(version, 2)
        self.assertEqual(actual, expected)

    def test_bump_version_with_pre_release(self):
        version = '1.2.3a1'
        expected = '1.2.3b1'
        actual = bump_version(version, 2, 'b')
        self.assertEqual(actual, expected)

class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        version = '1.2.3'
        expected = '2.0.0'
        actual = bump_version(version, 0)
        self.assertEqual(actual, expected)

    def test_bump_version_minor(self):
        version = '1.2.3'
        expected = '1.3.0'
        actual = bump_version(version, 1)
        self.assertEqual(actual, expected)

    def test_bump_version_patch(self):
        version = '1.2.3'
        expected = '1.2.4'
        actual = bump_version(version, 2)
        self.assertEqual(actual, expected)

    def test_bump_version_minor_alpha(self):
        version = '1.2.3'
        expected = '1.3a0'
        actual = bump_version(version, 1, 'a')
        self.assertEqual(actual, expected)

    def test_bump_version_minor_beta(self):
        version = '1.2.3'
        expected = '1.3b0'
        actual = bump_version(version, 1, 'b')
        self.assertEqual(actual, expected)

    def test_bump_version_patch_alpha(self):
        version = '1.2.3'
        expected = '1.2a1'
        actual = bump_version(version, 2, 'a')
        self.assertEqual(actual, expected)

    def test_bump_version_patch_beta(self):
        version = '1.2.3'
        expected = '1.2b1'
        actual = bump_version(version, 2, 'b')
        self.assertEqual(actual, expected)

    def test_bump_version_invalid_position(self):
        version = '1.2.3'
        with self.assertRaises(ValueError):
            bump_version(version, 3)

    def test_bump_version_invalid_pre_release(self):
        version = '1.2.3'
        with self.assertRaises(ValueError):
            bump_version(version, 1, 'c')

if __name__ == '__main__':
    unittest.main()