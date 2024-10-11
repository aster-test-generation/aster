import unittest
from flutils.packages import bump_version, _build_version_info, _build_version_bump_position, _build_version_bump_type, _each_version_part, _VersionPart, _VersionInfo


class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        result = bump_version('1.2.3')
        self.assertEqual(result, '2.0.0')

    def test_bump_version_minor(self):
        result = bump_version('1.2.3', position=1)
        self.assertEqual(result, '1.3.0')

    def test_bump_version_patch(self):
        result = bump_version('1.2.3', position=2)
        self.assertEqual(result, '1.2.4')

    def test_bump_version_minor_alpha(self):
        result = bump_version('1.2.3', position=1, pre_release='a')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_minor_beta(self):
        result = bump_version('1.2.3', position=1, pre_release='b')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_patch_alpha(self):
        result = bump_version('1.2.3', position=2, pre_release='a')
        self.assertEqual(result, '1.2.3a0')

    def test_bump_version_patch_beta(self):
        result = bump_version('1.2.3', position=2, pre_release='b')
        self.assertEqual(result, '1.2.3b0')

    def test_bump_version_invalid_position(self):
        with self.assertRaises(ValueError):
            bump_version('1.2.3', position=-1)

    def test_bump_version_invalid_pre_release(self):
        with self.assertRaises(ValueError):
            bump_version('1.2.3', position=1, pre_release='c')

    def test_build_version_info(self):
        version = '1.2.3'
        ver_info = _build_version_info(version)
        self.assertEqual(ver_info.version, version)
        self.assertEqual(ver_info.major.num, 1)
        self.assertEqual(ver_info.minor.num, 2)
        self.assertEqual(ver_info.patch.num, 3)

    def test_build_version_bump_position(self):
        position = 1
        result = _build_version_bump_position(position)
        self.assertEqual(result, 1)

    def test_build_version_bump_type(self):
        position_positive = 1
        pre_release = 'a'
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_MINOR_ALPHA)

    def test_each_version_part(self):
        ver_obj = StrictVersion('1.2.3')
        for part in _each_version_part(ver_obj):
            self.assertIsInstance(part, _VersionPart)

    def test_version_part(self):
        part = _VersionPart(pos=0, txt='1', num=1, pre_txt='', pre_num=-1, name='major')
        self.assertIsInstance(part, _VersionPart)

    def test_version_info(self):
        version = '1.2.3'
        ver_info = _VersionInfo(version, _VersionPart(pos=0, txt='1', num=1, pre_txt='', pre_num=-1, name='major'), _VersionPart(pos=1, txt='2', num=2, pre_txt='', pre_num=-1, name='minor'), _VersionPart(pos=2, txt='3', num=3, pre_txt='', pre_num=-1, name='patch'), 0)
        self.assertIsInstance(ver_info, _VersionInfo)

if __name__ == '__main__':
    unittest.main()