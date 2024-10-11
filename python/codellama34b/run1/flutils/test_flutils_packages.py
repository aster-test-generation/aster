import unittest
from flutils.packages import *



class TestBumpVersion(unittest.TestCase):
    def test_bump_version(self):
        result = bump_version('1.2.3', 2, None)
        self.assertEqual(result, '1.2.4')

    def test_bump_version_1(self):
        result = bump_version('1.2.3', 1, None)
        self.assertEqual(result, '1.3.0')

    def test_bump_version_2(self):
        result = bump_version('1.2.3', 0, None)
        self.assertEqual(result, '2.0.0')

    def test_bump_version_3(self):
        result = bump_version('1.2.3', 2, 'a')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_4(self):
        result = bump_version('1.2.3', 2, 'b')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_5(self):
        result = bump_version('1.2.3', 1, 'a')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_6(self):
        result = bump_version('1.2.3', 1, 'b')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_7(self):
        result = bump_version('1.2.3', 0, 'a')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_8(self):
        result = bump_version('1.2.3', 0, 'b')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_9(self):
        result = bump_version('1.2.3', 2, 'alpha')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_10(self):
        result = bump_version('1.2.3', 2, 'beta')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_11(self):
        result = bump_version('1.2.3', 1, 'alpha')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_12(self):
        result = bump_version('1.2.3', 1, 'beta')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_13(self):
        result = bump_version('1.2.3', 0, 'alpha')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_14(self):
        result = bump_version('1.2.3', 0, 'beta')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_15(self):
        result = bump_version('1.2.3', 2, 'a')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_16(self):
        result = bump_version('1.2.3', 2, 'b')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_17(self):
        result = bump_version('1.2.3', 1, 'a')
        self.assertEqual(result, '1.2.3a0')

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