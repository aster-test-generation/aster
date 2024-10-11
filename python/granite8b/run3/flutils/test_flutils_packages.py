import unittest
from flutils.packages import bump_version


class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        version = '1.2.3'
        expected = '2.0.0'
        actual = bump_version(version, position=0)
        self.assertEqual(actual, expected)

    def test_bump_version_minor(self):
        version = '1.2.3'
        expected = '1.3.0'
        actual = bump_version(version, position=1)
        self.assertEqual(actual, expected)

    def test_bump_version_patch(self):
        version = '1.2.3'
        expected = '1.2.4'
        actual = bump_version(version, position=2)
        self.assertEqual(actual, expected)

    def test_bump_version_minor_alpha(self):
        version = '1.2.3a1'
        expected = '1.2.3a2'
        actual = bump_version(version, position=1)
        self.assertEqual(actual, expected)

    def test_bump_version_minor_beta(self):
        version = '1.2.3b1'
        expected = '1.2.3b2'
        actual = bump_version(version, position=1)
        self.assertEqual(actual, expected)

    def test_bump_version_patch_alpha(self):
        version = '1.2.3a1'
        expected = '1.2.3a2'
        actual = bump_version(version, position=2)
        self.assertEqual(actual, expected)

    def test_bump_version_patch_beta(self):
        version = '1.2.3b1'
        expected = '1.2.3b2'
        actual = bump_version(version, position=2)
        self.assertEqual(actual, expected)

    def test_bump_version_pre_release(self):
        version = '1.2.3'
        expected = '1.2.3a1'
        actual = bump_version(version, position=2, pre_release='a')
        self.assertEqual(actual, expected)

    def test_bump_version_pre_release_with_number(self):
        version = '1.2.3a1'
        expected = '1.2.3a2'
        actual = bump_version(version, position=2, pre_release='a')
        self.assertEqual(actual, expected)

    def test_bump_version_invalid_position(self):
        version = '1.2.3'
        with self.assertRaises(ValueError):
            bump_version(version, position=-1)

    def test_bump_version_invalid_pre_release(self):
        version = '1.2.3'
        with self.assertRaises(ValueError):
            bump_version(version, position=2, pre_release='x')

class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        self.assertEqual(bump_version('1.2.3'), '2.0.0')

    def test_bump_version_minor(self):
        self.assertEqual(bump_version('1.2.3', position=1), '1.3.0')

    def test_bump_version_patch(self):
        self.assertEqual(bump_version('1.2.3', position=2), '1.2.4')

    def test_bump_version_minor_alpha(self):
        self.assertEqual(bump_version('1.2.3', position=1, pre_release='a'), '1.3a0')

    def test_bump_version_minor_beta(self):
        self.assertEqual(bump_version('1.2.3', position=1, pre_release='b'), '1.3b0')

    def test_bump_version_patch_alpha(self):
        self.assertEqual(bump_version('1.2.3', position=2, pre_release='a'), '1.2a0')

    def test_bump_version_patch_beta(self):
        self.assertEqual(bump_version('1.2.3', position=2, pre_release='b'), '1.2b0')

    def test_bump_version_invalid_position(self):
        with self.assertRaises(ValueError):
            bump_version('1.2.3', position=-1)

    def test_bump_version_invalid_pre_release(self):
        with self.assertRaises(ValueError):
            bump_version('1.2.3', position=1, pre_release='c')

if __name__ == '__main__':
    unittest.main()