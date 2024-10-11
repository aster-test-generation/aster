import unittest
from flutils.packages import bump_version

class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        self.assertEqual(bump_version('1.0.0'), '1.0.1')

    def test_bump_version_minor(self):
        self.assertEqual(bump_version('1.0.0', position=1), '1.1')

    def test_bump_version_patch(self):
        self.assertEqual(bump_version('1.0.0', position=2), '1.0.1')

    def test_bump_version_minor_alpha(self):
        self.assertEqual(bump_version('1.0.0', position=1, pre_release='alpha'), '1.1a0')

    def test_bump_version_minor_beta(self):
        self.assertEqual(bump_version('1.0.0', position=1, pre_release='beta'), '1.1b0')

    def test_bump_version_patch_alpha(self):
        self.assertEqual(bump_version('1.0.0', position=2, pre_release='alpha'), '1.0.1a0')

    def test_bump_version_patch_beta(self):
        self.assertEqual(bump_version('1.0.0', position=2, pre_release='beta'), '1.0.1b0')

if __name__ == '__main__':
    unittest.main()