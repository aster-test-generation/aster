import unittest
from flutils.packages import bump_version


class TestBumpVersion(unittest.TestCase):
    def test_bump_major(self):
        self.assertEqual(bump_version('1.2.3'), '1.2.4')

    def test_bump_minor(self):
        self.assertEqual(bump_version('1.2.3', position=1), '1.3')

    def test_bump_patch(self):
        self.assertEqual(bump_version('1.2.3', position=2), '1.2.4')

    def test_bump_minor_alpha(self):
        self.assertEqual(bump_version('1.2.3', position=1, pre_release='alpha'), '1.3a0')

    def test_bump_patch_beta(self):
        self.assertEqual(bump_version('1.2.3', position=2, pre_release='beta'), '1.2.4b0')

    def test_bump_major_with_prerelease(self):
        self.assertEqual(bump_version('1.2.3-alpha', position=0), '2.0.0-alpha')

    def test_bump_minor_with_prerelease(self):
        self.assertEqual(bump_version('1.2.3-alpha', position=1), '1.3.0-alpha')

    def test_bump_patch_with_prerelease(self):
        self.assertEqual(bump_version('1.2.3-alpha', position=2), '1.2.4-alpha')

    def test_bump_minor_alpha_with_prerelease(self):
        self.assertEqual(bump_version('1.2.3-alpha', position=1, pre_release='alpha'), '1.3a0')

    def test_bump_patch_beta_with_prerelease(self):
        self.assertEqual(bump_version('1.2.3-alpha', position=2, pre_release='beta'), '1.2.4b0')

class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        self.assertEqual(bump_version('1.0.0'), '2.0.0')

    def test_bump_version_minor(self):
        self.assertEqual(bump_version('1.0.0', position=1), '1.1.0')

    def test_bump_version_patch(self):
        self.assertEqual(bump_version('1.0.0', position=2), '1.0.1')

    def test_bump_version_minor_alpha(self):
        self.assertEqual(bump_version('1.0.0', position=1, pre_release='a'), '1.1a0')

    def test_bump_version_minor_beta(self):
        self.assertEqual(bump_version('1.0.0', position=1, pre_release='b'), '1.1b0')

    def test_bump_version_patch_alpha(self):
        self.assertEqual(bump_version('1.0.0', position=2, pre_release='a'), '1.0.1a0')

    def test_bump_version_patch_beta(self):
        self.assertEqual(bump_version('1.0.0', position=2, pre_release='b'), '1.0.1b0')

    def test_bump_version_invalid_position(self):
        with self.assertRaises(ValueError):
            bump_version('1.0.0', position=3)

    def test_bump_version_invalid_pre_release(self):
        with self.assertRaises(ValueError):
            bump_version('1.0.0', position=1, pre_release='c')

if __name__ == '__main__':
    unittest.main()