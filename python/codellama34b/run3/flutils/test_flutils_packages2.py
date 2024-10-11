
import unittest
from flutils.packages import *

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

if __name__ == '__main__':
    unittest.main()