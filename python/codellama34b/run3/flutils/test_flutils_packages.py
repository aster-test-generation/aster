import unittest
from flutils.packages import *



class TestBumpVersion(unittest.TestCase):
    def test_bump_version(self):
        result = bump_version('1.2.3', 2, None)
        self.assertEqual(result, '1.2.4')

    def test_bump_version_2(self):
        result = bump_version('1.2.3', 1, None)
        self.assertEqual(result, '1.3.0')

    def test_bump_version_3(self):
        result = bump_version('1.2.3', 0, None)
        self.assertEqual(result, '2.0.0')

    def test_bump_version_4(self):
        result = bump_version('1.2.3', 2, 'a')
        self.assertEqual(result, '1.2.4a0')

    def test_bump_version_5(self):
        result = bump_version('1.2.3', 2, 'b')
        self.assertEqual(result, '1.2.4b0')

    def test_bump_version_6(self):
        result = bump_version('1.2.3', 2, 'alpha')
        self.assertEqual(result, '1.2.4a0')

    def test_bump_version_7(self):
        result = bump_version('1.2.3', 2, 'beta')
        self.assertEqual(result, '1.2.4b0')

    def test_bump_version_8(self):
        result = bump_version('1.2.3', 1, 'a')
        self.assertEqual(result, '1.3.0a0')

    def test_bump_version_9(self):
        result = bump_version('1.2.3', 1, 'b')
        self.assertEqual(result, '1.3.0b0')

    def test_bump_version_10(self):
        result = bump_version('1.2.3', 1, 'alpha')
        self.assertEqual(result, '1.3.0a0')

    def test_bump_version_11(self):
        result = bump_version('1.2.3', 1, 'beta')
        self.assertEqual(result, '1.3.0b0')

    def test_bump_version_12(self):
        result = bump_version('1.2.3', 0, 'a')
        self.assertEqual(result, '2.0.0a0')

    def test_bump_version_13(self):
        result = bump_version('1.2.3', 0, 'b')
        self.assertEqual(result, '2.0.0b0')

    def test_bump_version_14(self):
        result = bump_version('1.2.3', 0, 'alpha')
        self.assertEqual(result, '2.0.0a0')

    def test_bump_version_15(self):
        result = bump_version('1.2.3', 0, 'beta')
        self.assertEqual(result, '2.0.0b0')

    def test_bump_version_16(self):
        result = bump_version('1.2.3', 2, 'a')
        self.assertEqual(result, '1.2.4a0')

    def test_bump_version_17(self):
        result = bump_version('1.2.3', 2, 'b')
        self.assertEqual(result, '1.2.4b0')

    def test_bump_version_18(self):
        result = bump_version('1.2.3', 2, 'alpha')
        self.assertEqual(result, '1.2.4a0')

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

class TestBumpVersion(unittest.TestCase):
    def test_bump_version(self):
        result = bump_version('1.2.3')
        self.assertEqual(result, '1.2.4')

    def test_bump_version_position_0(self):
        result = bump_version('1.2.3', 0)
        self.assertEqual(result, '2.0')

    def test_bump_version_position_1(self):
        result = bump_version('1.2.3', 1)
        self.assertEqual(result, '1.3')

    def test_bump_version_position_2(self):
        result = bump_version('1.2.3', 2)
        self.assertEqual(result, '1.2.4')

    def test_bump_version_position_3(self):
        result = bump_version('1.2.3', 3)
        self.assertEqual(result, '1.2.3a1')

    def test_bump_version_position_4(self):
        result = bump_version('1.2.3', 4)
        self.assertEqual(result, '1.2.3b1')

    def test_bump_version_position_5(self):
        result = bump_version('1.2.3', 5)
        self.assertEqual(result, '1.2.3a2')

    def test_bump_version_position_6(self):
        result = bump_version('1.2.3', 6)
        self.assertEqual(result, '1.2.3b2')

    def test_bump_version_position_7(self):
        result = bump_version('1.2.3', 7)
        self.assertEqual(result, '1.2.4')

    def test_bump_version_position_8(self):
        result = bump_version('1.2.3', 8)
        self.assertEqual(result, '1.3')

    def test_bump_version_position_9(self):
        result = bump_version('1.2.3', 9)
        self.assertEqual(result, '2.0')

    def test_bump_version_position_10(self):
        result = bump_version('1.2.3', 10)
        self.assertEqual(result, '1.2.3a1')

    def test_bump_version_position_11(self):
        result = bump_version('1.2.3', 11)
        self.assertEqual(result, '1.2.3b1')

    def test_bump_version_position_12(self):
        result = bump_version('1.2.3', 12)
        self.assertEqual(result, '1.2.3a2')

    def test_bump_version_position_13(self):
        result = bump_version('1.2.3', 13)
        self.assertEqual(result, '1.2.3b2')

    def test_bump_version_position_14(self):
        result = bump_version('1.2.3', 14)
        self.assertEqual(result, '1.2.4')

    def test_bump_version_position_15(self):
        result = bump_version('1.2.3', 15)
        self.assertEqual(result, '1.3')

    def test_bump_version_position_16(self):
        result = bump_version('1.2.3', 16)
        self.assertEqual(result, '2.0')

    def test_bump_version_position_17(self):
        result = bump_version('1.2.3', 17)
        self.assertEqual(result, '1.2.3a1')

class TestBumpVersion(unittest.TestCase):
    def test_bump_version(self):
        result = bump_version('1.2.3', 2, None)
        self.assertEqual(result, '1.2.4')

    def test_bump_version_2(self):
        result = bump_version('1.2.3', 1, None)
        self.assertEqual(result, '1.3.0')

    def test_bump_version_3(self):
        result = bump_version('1.2.3', 0, None)
        self.assertEqual(result, '2.0.0')

    def test_bump_version_4(self):
        result = bump_version('1.2.3', 2, 'a')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_5(self):
        result = bump_version('1.2.3', 2, 'b')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_6(self):
        result = bump_version('1.2.3', 1, 'a')
        self.assertEqual(result, '1.2.4a0')

    def test_bump_version_7(self):
        result = bump_version('1.2.3', 1, 'b')
        self.assertEqual(result, '1.2.4b0')

    def test_bump_version_8(self):
        result = bump_version('1.2.3', 0, 'a')
        self.assertEqual(result, '2.0.0a0')

    def test_bump_version_9(self):
        result = bump_version('1.2.3', 0, 'b')
        self.assertEqual(result, '2.0.0b0')

    def test_bump_version_10(self):
        result = bump_version('1.2.3', 2, 'alpha')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_11(self):
        result = bump_version('1.2.3', 2, 'beta')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_12(self):
        result = bump_version('1.2.3', 1, 'alpha')
        self.assertEqual(result, '1.2.4a0')

    def test_bump_version_13(self):
        result = bump_version('1.2.3', 1, 'beta')
        self.assertEqual(result, '1.2.4b0')

    def test_bump_version_14(self):
        result = bump_version('1.2.3', 0, 'alpha')
        self.assertEqual(result, '2.0.0a0')

    def test_bump_version_15(self):
        result = bump_version('1.2.3', 0, 'beta')
        self.assertEqual(result, '2.0.0b0')

    def test_bump_version_16(self):
        result = bump_version('1.2.3', 2, 'a1')
        self.assertEqual(result, '1.2.3a1')

    def test_bump_version_17(self):
        result = bump_version('1.2.3', 2, 'b1')
        self.assertEqual(result, '1.2.3b1')

    def test_bump_version_18(self):
        result = bump_version('1.2.3', 1, 'a1')
        self.assertEqual(result, '1.2.4a1')

if __name__ == '__main__':
    unittest.main()