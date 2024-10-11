import unittest
from distutils.version import StrictVersion
from flutils.packages import (
    bump_version,
    _each_version_part,
    _build_version_info,
    _build_version_bump_position,
    _build_version_bump_type,
    _VersionPart,
    _VersionInfo
)
from flutils.packages import (
    bump_version,
    _each_version_part,
    _build_version_info,
    _build_version_bump_position,
    _build_version_bump_type,
    _VersionPart,
    _VersionInfo,
)
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
        self.assertEqual(parts[0].name, 'major')

class TestBuildVersionInfo(unittest.TestCase):
    def test_build_version_info(self):
        version_info = _build_version_info('1.2.3')
        self.assertEqual(version_info.version, '1.2.3')
        self.assertEqual(version_info.major.num, 1)
        self.assertEqual(version_info.minor.num, 2)
        self.assertEqual(version_info.patch.num, 3)

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

    def test_build_version_bump_type_patch_beta(self):
        bump_type = _build_version_bump_type(2, 'beta')
        self.assertEqual(bump_type, 6)

    def test_build_version_bump_type_invalid(self):
        with self.assertRaises(ValueError):
            _build_version_bump_type(1, 'gamma')

class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        new_version = bump_version('1.2.3', 0)
        self.assertEqual(new_version, '2.0')

    def test_bump_version_minor(self):
        new_version = bump_version('1.2.3', 1)
        self.assertEqual(new_version, '1.3')

    def test_bump_version_patch(self):
        new_version = bump_version('1.2.3', 2)
        self.assertEqual(new_version, '1.2.4')

    def test_bump_version_minor_alpha(self):
        new_version = bump_version('1.2.0', 1, 'alpha')
        self.assertEqual(new_version, '1.3a0')

    def test_bump_version_patch_beta(self):
        new_version = bump_version('1.2.3', 2, 'beta')
        self.assertEqual(new_version, '1.2.4b0')

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

class TestEachVersionPart(unittest.TestCase):
    def test_each_version_part(self):
        ver_obj = StrictVersion('1.2.3')
        parts = list(_each_version_part(ver_obj))
        self.assertEqual(len(parts), 3)
        self.assertEqual(parts[0], _VersionPart(0, '1', 1, '', -1, 'major'))
        self.assertEqual(parts[1], _VersionPart(1, '2', 2, '', -1, 'minor'))
        self.assertEqual(parts[2], _VersionPart(2, '3', 3, '', -1, 'patch'))

class TestBuildVersionInfo(unittest.TestCase):
    def test_build_version_info(self):
        version_info = _build_version_info('1.2.3')
        self.assertEqual(version_info.version, '1.2.3')
        self.assertEqual(version_info.major, _VersionPart(0, '1', 1, '', -1, 'major'))
        self.assertEqual(version_info.minor, _VersionPart(1, '2', 2, '', -1, 'minor'))
        self.assertEqual(version_info.patch, _VersionPart(2, '3', 3, '', -1, 'patch'))
        self.assertEqual(version_info.pre_pos, -1)

class TestBuildVersionBumpPosition(unittest.TestCase):
    def test_build_version_bump_position(self):
        self.assertEqual(_build_version_bump_position(0), 0)
        self.assertEqual(_build_version_bump_position(1), 1)
        self.assertEqual(_build_version_bump_position(2), 2)
        self.assertEqual(_build_version_bump_position(-1), 2)
        self.assertEqual(_build_version_bump_position(-2), 1)
        self.assertEqual(_build_version_bump_position(-3), 0)
        with self.assertRaises(ValueError):
            _build_version_bump_position(3)
        with self.assertRaises(ValueError):
            _build_version_bump_position(-4)

class TestBuildVersionBumpType(unittest.TestCase):
    def test_build_version_bump_type(self):
        self.assertEqual(_build_version_bump_type(0, None), 0)
        self.assertEqual(_build_version_bump_type(1, None), 1)
        self.assertEqual(_build_version_bump_type(2, None), 2)
        self.assertEqual(_build_version_bump_type(1, 'a'), 3)
        self.assertEqual(_build_version_bump_type(1, 'alpha'), 3)
        self.assertEqual(_build_version_bump_type(1, 'b'), 4)
        self.assertEqual(_build_version_bump_type(1, 'beta'), 4)
        self.assertEqual(_build_version_bump_type(2, 'a'), 5)
        self.assertEqual(_build_version_bump_type(2, 'alpha'), 5)
        self.assertEqual(_build_version_bump_type(2, 'b'), 6)
        self.assertEqual(_build_version_bump_type(2, 'beta'), 6)
        with self.assertRaises(ValueError):
            _build_version_bump_type(0, 'a')
        with self.assertRaises(ValueError):
            _build_version_bump_type(0, 'alpha')
        with self.assertRaises(ValueError):
            _build_version_bump_type(0, 'b')
        with self.assertRaises(ValueError):
            _build_version_bump_type(0, 'beta')
        with self.assertRaises(ValueError):
            _build_version_bump_type(1, 'invalid')

class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        self.assertEqual(bump_version('1.2.3', 0), '2.0')

    def test_bump_version_minor(self):
        self.assertEqual(bump_version('1.2.3', 1), '1.3')

    def test_bump_version_patch(self):
        self.assertEqual(bump_version('1.2.3', 2), '1.2.4')

    def test_bump_version_minor_alpha(self):
        self.assertEqual(bump_version('1.2.0', 1, 'a'), '1.3a0')

    def test_bump_version_minor_beta(self):
        self.assertEqual(bump_version('1.2.0', 1, 'b'), '1.3b0')

    def test_bump_version_patch_alpha(self):
        self.assertEqual(bump_version('1.2.3', 2, 'a'), '1.2.4a0')

    def test_bump_version_patch_beta(self):
        self.assertEqual(bump_version('1.2.3', 2, 'b'), '1.2.4b0')

if __name__ == '__main__':
    unittest.main()