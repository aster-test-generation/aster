
import unittest
from flutils.packages import *

class TestBumpVersion(unittest.TestCase):
    def test_bump_version(self):
        result = bump_version('1.2.3')
        self.assertEqual(result, '1.2.4')

    def test_bump_version_pre_release_a(self):
        result = bump_version('1.2.3a1')
        self.assertEqual(result, '1.2.3a2')

    def test_bump_version_pre_release_b(self):
        result = bump_version('1.2.3b1')
        self.assertEqual(result, '1.2.3b2')

    def test_bump_version_pre_release_alpha(self):
        result = bump_version('1.2.3alpha1')
        self.assertEqual(result, '1.2.3a2')

    def test_bump_version_pre_release_beta(self):
        result = bump_version('1.2.3beta1')
        self.assertEqual(result, '1.2.3b2')

    def test_bump_version_pre_release_a_to_b(self):
        result = bump_version('1.2.3a1', pre_release='b')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_pre_release_b_to_a(self):
        result = bump_version('1.2.3b1', pre_release='a')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_pre_release_alpha_to_beta(self):
        result = bump_version('1.2.3alpha1', pre_release='beta')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_pre_release_beta_to_alpha(self):
        result = bump_version('1.2.3beta1', pre_release='alpha')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_pre_release_a_to_beta(self):
        result = bump_version('1.2.3a1', pre_release='beta')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_pre_release_b_to_alpha(self):
        result = bump_version('1.2.3b1', pre_release='alpha')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_pre_release_alpha_to_b(self):
        result = bump_version('1.2.3alpha1', pre_release='b')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_pre_release_beta_to_a(self):
        result = bump_version('1.2.3beta1', pre_release='a')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_pre_release_a_to_alpha(self):
        result = bump_version('1.2.3a1', pre_release='alpha')
        self.assertEqual(result, '1.2.3alpha2')

    def test_bump_version_pre_release_b_to_beta(self):
        result = bump_version('1.2.3b1', pre_release='beta')
        self.assertEqual(result, '1.2.3beta2')

    def test_bump_version_pre_release_alpha_to_a(self):
        result = bump_version('1.2.3alpha1', pre_release='a')
        self.assertEqual(result, '1.2.3a2')

if __name__ == '__main__':
    unittest.main()