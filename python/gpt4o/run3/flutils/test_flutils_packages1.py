import unittest
from distutils.version import StrictVersion
from flutils.packages import (
    bump_version,
    _each_version_part,
    _build_version_info,
    _build_version_bump_position,
    _build_version_bump_type,
    _VersionPart,
    _VersionInfo,
)

class TestVersionPart(unittest.TestCase):
    def test_version_part(self):
        part = _VersionPart(0, '1', 1, '', -1, 'major')
        self.assertEqual(part.pos, 0)
        self.assertEqual(part.txt, '1')
        self.assertEqual(part.num, 1)
        self.assertEqual(part.pre_txt, '')
        self.assertEqual(part.pre_num, -1)
        self.assertEqual(part.name, 'major')

class TestEachVersionPart(unittest.TestCase):
    def test_each_version_part(self):
        ver_obj = StrictVersion('1.2.3')
        parts = list(_each_version_part(ver_obj))
        self.assertEqual(len(parts), 3)
        self.assertEqual(parts[0].pos, 0)
        self.assertEqual(parts[0].txt, '1')
        self.assertEqual(parts[0].num, 1)
        self.assertEqual(parts[0].pre_txt, '')
        self.assertEqual(parts[0].pre_num, -1)
        self.assertEqual(parts[0].name, 'major')

class TestBuildVersionInfo(unittest.TestCase):
    def test_build_version_info(self):
        version_info = _build_version_info('1.2.3')
        self.assertEqual(version_info.version, '1.2.3')
        self.assertEqual(version_info.major.num, 1)
        self.assertEqual(version_info.minor.num, 2)
        self.assertEqual(version_info.patch.num, 3)
        self.assertEqual(version_info.pre_pos, -1)

class TestBuildVersionBumpPosition(unittest.TestCase):
    def test_build_version_bump_position(self):
        position = _build_version_bump_position(1)
        self.assertEqual(position, 1)

    def test_build_version_bump_position_negative(self):
        position = _build_version_bump_position(-1)
        self.assertEqual(position, 2)

    def test_build_version_bump_position_invalid(self):
        with self.assertRaises(ValueError):
            _build_version_bump_position(3)

class TestBuildVersionBumpType(unittest.TestCase):
    def test_build_version_bump_type_major(self):
        bump_type = _build_version_bump_type(0, None)
        self.assertEqual(bump_type, 0)

    def test_build_version_bump_type_minor(self):
        bump_type = _build_version_bump_type(1, None)
        self.assertEqual(bump_type, 1)

    def test_build_version_bump_type_patch(self):
        bump_type = _build_version_bump_type(2, None)
        self.assertEqual(bump_type, 2)

    def test_build_version_bump_type_minor_alpha(self):
        bump_type = _build_version_bump_type(1, 'alpha')
        self.assertEqual(bump_type, 3)

    def test_build_version_bump_type_minor_beta(self):
        bump_type = _build_version_bump_type(1, 'beta')
        self.assertEqual(bump_type, 4)

    def test_build_version_bump_type_patch_alpha(self):
        bump_type = _build_version_bump_type(2, 'alpha')
        self.assertEqual(bump_type, 5)

    def test_build_version_bump_type_patch_beta(self):
        bump_type = _build_version_bump_type(2, 'beta')
        self.assertEqual(bump_type, 6)

    def test_build_version_bump_type_invalid(self):
        with self.assertRaises(ValueError):
            _build_version_bump_type(0, 'gamma')

class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        result = bump_version('1.2.3', 0)
        self.assertEqual(result, '2.0')

    def test_bump_version_minor(self):
        result = bump_version('1.2.3', 1)
        self.assertEqual(result, '1.3')

    def test_bump_version_patch(self):
        result = bump_version('1.2.3', 2)
        self.assertEqual(result, '1.2.4')

    def test_bump_version_minor_alpha(self):
        result = bump_version('1.2.3', 1, 'alpha')
        self.assertEqual(result, '1.3a0')

    def test_bump_version_minor_beta(self):
        result = bump_version('1.2.3', 1, 'beta')
        self.assertEqual(result, '1.3b0')

    def test_bump_version_patch_alpha(self):
        result = bump_version('1.2.3', 2, 'alpha')
        self.assertEqual(result, '1.2.4a0')

    def test_bump_version_patch_beta(self):
        result = bump_version('1.2.3', 2, 'beta')
        self.assertEqual(result, '1.2.4b0')

if __name__ == '__main__':
    unittest.main()