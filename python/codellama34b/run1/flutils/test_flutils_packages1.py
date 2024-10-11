
import unittest
from flutils.packages import *

class TestBumpVersion(unittest.TestCase):
    def test_bump_version(self):
        result = bump_version('1.2.3')
        self.assertEqual(result, '1.2.4')

    def test_bump_version_pre_release(self):
        result = bump_version('1.2.3', pre_release='a')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_pre_release_alpha(self):
        result = bump_version('1.2.3a0', pre_release='a')
        self.assertEqual(result, '1.2.3a1')

    def test_bump_version_pre_release_beta(self):
        result = bump_version('1.2.3a0', pre_release='b')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_pre_release_beta_alpha(self):
        result = bump_version('1.2.3b0', pre_release='a')
        self.assertEqual(result, '1.2.3b0a0')

    def test_bump_version_pre_release_beta_alpha_alpha(self):
        result = bump_version('1.2.3b0a0', pre_release='a')
        self.assertEqual(result, '1.2.3b0a1')

    def test_bump_version_pre_release_beta_alpha_beta(self):
        result = bump_version('1.2.3b0a0', pre_release='b')
        self.assertEqual(result, '1.2.3b0b0')

    def test_bump_version_pre_release_beta_beta(self):
        result = bump_version('1.2.3b0', pre_release='b')
        self.assertEqual(result, '1.2.3b1')

    def test_bump_version_pre_release_beta_beta_alpha(self):
        result = bump_version('1.2.3b1', pre_release='a')
        self.assertEqual(result, '1.2.3b1a0')

    def test_bump_version_pre_release_beta_beta_beta(self):
        result = bump_version('1.2.3b1', pre_release='b')
        self.assertEqual(result, '1.2.3b2')

    def test_bump_version_position(self):
        result = bump_version('1.2.3', position=1)
        self.assertEqual(result, '1.3.0')

    def test_bump_version_position_pre_release(self):
        result = bump_version('1.2.3', position=1, pre_release='a')
        self.assertEqual(result, '1.3.0a0')

    def test_bump_version_position_pre_release_alpha(self):
        result = bump_version('1.2.3a0', position=1, pre_release='a')
        self.assertEqual(result, '1.3.0a1')

    def test_bump_version_position_pre_release_beta(self):
        result = bump_version('1.2.3a0', position=1, pre_release='b')
        self.assertEqual(result, '1.3.0b0')

    def test_bump_version_position_pre_release_beta_alpha(self):
        result = bump_version('1.2.3b0', position=1, pre_release='a')
        self.assertEqual(result, '1.3.0b0a0')

if __name__ == '__main__':
    unittest.main()