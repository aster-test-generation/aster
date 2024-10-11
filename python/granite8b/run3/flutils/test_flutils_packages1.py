import unittest
from flutils.packages import bump_version

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