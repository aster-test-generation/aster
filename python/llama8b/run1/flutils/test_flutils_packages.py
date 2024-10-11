from flutils.packages import _BUMP_VERSION_MINOR
import unittest
from flutils.packages import bump_version, _build_version_info, _build_version_bump_position, _build_version_bump_type


class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        version = '1.2.3'
        result = bump_version(version, position=0)
        self.assertEqual(result, '2.0.0')

    def test_bump_version_minor(self):
        version = '1.2.3'
        result = bump_version(version, position=1)
        self.assertEqual(result, '1.3.0')

    def test_bump_version_patch(self):
        version = '1.2.3'
        result = bump_version(version, position=2)
        self.assertEqual(result, '1.2.4')

    def test_bump_version_minor_alpha(self):
        version = '1.2.3a'
        result = bump_version(version, position=1)
        self.assertEqual(result, '1.2.3a1')

    def test_bump_version_minor_beta(self):
        version = '1.2.3b'
        result = bump_version(version, position=1)
        self.assertEqual(result, '1.2.4b')

    def test_bump_version_patch_alpha(self):
        version = '1.2.3a'
        result = bump_version(version, position=2)
        self.assertEqual(result, '1.2.3a1')

    def test_bump_version_patch_beta(self):
        version = '1.2.3b'
        result = bump_version(version, position=2)
        self.assertEqual(result, '1.2.4b')

    def test_bump_version_invalid_position(self):
        version = '1.2.3'
        with self.assertRaises(ValueError):
            bump_version(version, position=-1)

    def test_bump_version_invalid_pre_release(self):
        version = '1.2.3'
        with self.assertRaises(ValueError):
            bump_version(version, pre_release='invalid')

    def test_build_version_info(self):
        version = '1.2.3'
        ver_info = _build_version_info(version)
        self.assertEqual(ver_info.version, '1.2.3')
        self.assertEqual(ver_info.major.num, 1)
        self.assertEqual(ver_info.minor.num, 2)
        self.assertEqual(ver_info.patch.num, 3)

    def test_build_version_bump_position(self):
        position = 0
        result = _build_version_bump_position(position)
        self.assertEqual(result, 2)

    def test_build_version_bump_type(self):
        position_positive = 1
        pre_release = None
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_MINOR)

if __name__ == '__main__':
    unittest.main()