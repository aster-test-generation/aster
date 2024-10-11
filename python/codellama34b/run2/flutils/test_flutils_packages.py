import unittest
from flutils.packages import *


class TestBumpVersion(unittest.TestCase):
    def test_bump_version(self):
        result = bump_version("1.2.3")
        self.assertEqual(result, "1.2.4")

    def test_bump_version_with_position(self):
        result = bump_version("1.2.3", 1)
        self.assertEqual(result, "1.3")

    def test_bump_version_with_pre_release(self):
        result = bump_version("1.2.3", pre_release="alpha")
        self.assertEqual(result, "1.2.4a0")

    def test_bump_version_with_position_and_pre_release(self):
        result = bump_version("1.2.3", 1, "alpha")
        self.assertEqual(result, "1.3a0")

    def test_build_version_bump_position(self):
        result = build_version_bump_position(2)
        self.assertEqual(result, 2)

    def test_build_version_bump_type(self):
        result = _build_version_bump_type(2, "alpha")
        self.assertEqual(result, 3)

    def test_build_version_info(self):
        result = build_version_info("1.2.3")
        self.assertEqual(result.version, "1.2.3")

    def test_each_version_part(self):
        result = list(each_version_part(StrictVersion("1.2.3")))
        self.assertEqual(result[0].pos, 0)
        self.assertEqual(result[1].pos, 1)
        self.assertEqual(result[2].pos, 2)

if __name__ == '__main__':
    unittest.main()