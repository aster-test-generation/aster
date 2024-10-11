import unittest
from flutils.packages import (
    _VersionPart,
    _VersionInfo,
    _build_version_info,
    _build_version_bump_position,
    _build_version_bump_type,
    bump_version,
    _BUMP_VERSION_MAJOR,
    _BUMP_VERSION_MINOR,
    _BUMP_VERSION_PATCH,
    _BUMP_VERSION_MINOR_ALPHA,
    _BUMP_VERSION_MINOR_BETA,
    _BUMP_VERSION_PATCH_ALPHA,
    _BUMP_VERSION_PATCH_BETA,
)
from flutils.packages import (
    _VersionPart,
    _VersionInfo,
    _build_version_info,
    _build_version_bump_position,
    _build_version_bump_type,
    bump_version,
    _BUMP_VERSION_MAJOR,
    _BUMP_VERSION_MINOR,
    _BUMP_VERSION_PATCH,
    _BUMP_VERSION_MINOR_ALPHA,
    _BUMP_VERSION_MINOR_BETA,
    _BUMP_VERSION_PATCH_ALPHA,
    _BUMP_VERSION_PATCH_BETA,
)


class Test_VersionPart(unittest.TestCase):
    def test_VersionPart_init(self):
        part = _VersionPart(pos=0, txt='1', num=1, pre_txt='', pre_num=-1, name='major')
        self.assertEqual(part.pos, 0)
        self.assertEqual(part.txt, '1')
        self.assertEqual(part.num, 1)
        self.assertEqual(part.pre_txt, '')
        self.assertEqual(part.pre_num, -1)
        self.assertEqual(part.name, 'major')

class Test_VersionInfo(unittest.TestCase):
    def test_VersionInfo_init(self):
        version = '1.2.3'
        ver_obj = StrictVersion(version)
        pre_pos = -1
        args = [version, *_each_version_part(ver_obj), pre_pos]
        ver_info = _VersionInfo(*args)
        self.assertEqual(ver_info.version, version)
        self.assertIsInstance(ver_info.major, _VersionPart)
        self.assertIsInstance(ver_info.minor, _VersionPart)
        self.assertIsInstance(ver_info.patch, _VersionPart)
        self.assertEqual(ver_info.pre_pos, pre_pos)

class Test_build_version_info(unittest.TestCase):
    def test_build_version_info(self):
        version = '1.2.3'
        ver_info = _build_version_info(version)
        self.assertIsInstance(ver_info, _VersionInfo)

class Test_build_version_bump_position(unittest.TestCase):
    def test_build_version_bump_position(self):
        position = 2
        result = _build_version_bump_position(position)
        self.assertEqual(result, position)

    def test_build_version_bump_position_negative(self):
        position = -1
        result = _build_version_bump_position(position)
        self.assertEqual(result, 1)

    def test_build_version_bump_position_invalid(self):
        position = 5
        with self.assertRaises(ValueError):
            _build_version_bump_position(position)

class Test_build_version_bump_type(unittest.TestCase):
    def test_build_version_bump_type_major(self):
        position_positive = 0
        pre_release = None
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_MAJOR)

    def test_build_version_bump_type_minor(self):
        position_positive = 1
        pre_release = None
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_MINOR)

    def test_build_version_bump_type_patch(self):
        position_positive = 2
        pre_release = None
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_PATCH)

    def test_build_version_bump_type_minor_alpha(self):
        position_positive = 1
        pre_release = 'a'
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_MINOR_ALPHA)

    def test_build_version_bump_type_minor_beta(self):
        position_positive = 1
        pre_release = 'b'
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_MINOR_BETA)

    def test_build_version_bump_type_patch_alpha(self):
        position_positive = 2
        pre_release = 'a'
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_PATCH_ALPHA)

    def test_build_version_bump_type_patch_beta(self):
        position_positive = 2
        pre_release = 'b'
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_PATCH_BETA)

    def test_build_version_bump_type_invalid_pre_release(self):
        position_positive = 1
        pre_release = 'invalid'
        with self.assertRaises(ValueError):
            _build_version_bump_type(position_positive, pre_release)

class Test_bump_version(unittest.TestCase):
    def test_bump_version_major(self):
        version = '1.2.3'
        position = 0
        result = bump_version(version, position)
        self.assertEqual(result, '2.0.0')

    def test_bump_version_minor(self):
        version = '1.2.3'
        position = 1
        result = bump_version(version, position)
        self.assertEqual(result, '1.3.0')

class TestVersionPart(unittest.TestCase):
    def test_init(self):
        part = _VersionPart(pos=0, txt='1', num=1, pre_txt='', pre_num=-1, name='major')
        self.assertEqual(part.pos, 0)
        self.assertEqual(part.txt, '1')
        self.assertEqual(part.num, 1)
        self.assertEqual(part.pre_txt, '')
        self.assertEqual(part.pre_num, -1)
        self.assertEqual(part.name, 'major')

class TestVersionInfo(unittest.TestCase):
    def test_init(self):
        version = '1.2.3'
        ver_obj = StrictVersion(version)
        pre_pos = -1
        args = [version]
        for part in _each_version_part(ver_obj):
            if part.pre_txt:
                pre_pos = part.pos
            args.append(part)
        args.append(pre_pos)
        ver_info = _VersionInfo(*args)
        self.assertEqual(ver_info.version, version)
        self.assertIsInstance(ver_info.major, _VersionPart)
        self.assertIsInstance(ver_info.minor, _VersionPart)
        self.assertIsInstance(ver_info.patch, _VersionPart)
        self.assertEqual(ver_info.pre_pos, pre_pos)

class TestBuildVersionInfo(unittest.TestCase):
    def test_build_version_info(self):
        version = '1.2.3'
        ver_info = _build_version_info(version)
        self.assertIsInstance(ver_info, _VersionInfo)

class TestBuildVersionBumpPosition(unittest.TestCase):
    def test_build_version_bump_position(self):
        position = 2
        result = _build_version_bump_position(position)
        self.assertEqual(result, 2)

    def test_build_version_bump_position_negative(self):
        position = -1
        result = _build_version_bump_position(position)
        self.assertEqual(result, 1)

class TestBuildVersionBumpType(unittest.TestCase):
    def test_build_version_bump_type_major(self):
        position_positive = 0
        pre_release = None
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_MAJOR)

    def test_build_version_bump_type_minor(self):
        position_positive = 1
        pre_release = None
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_MINOR)

    def test_build_version_bump_type_patch(self):
        position_positive = 2
        pre_release = None
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_PATCH)

    def test_build_version_bump_type_minor_alpha(self):
        position_positive = 1
        pre_release = 'a'
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_MINOR_ALPHA)

    def test_build_version_bump_type_minor_beta(self):
        position_positive = 1
        pre_release = 'b'
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_MINOR_BETA)

    def test_build_version_bump_type_patch_alpha(self):
        position_positive = 2
        pre_release = 'a'
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_PATCH_ALPHA)

    def test_build_version_bump_type_patch_beta(self):
        position_positive = 2
        pre_release = 'b'
        result = _build_version_bump_type(position_positive, pre_release)
        self.assertEqual(result, _BUMP_VERSION_PATCH_BETA)

class TestBumpVersion(unittest.TestCase):
    def test_bump_version_major(self):
        version = '1.2.3'
        position = 0
        result = bump_version(version, position)
        self.assertEqual(result, '2.0.0')

    def test_bump_version_minor(self):
        version = '1.2.3'
        position = 1
        result = bump_version(version, position)
        self.assertEqual(result, '1.3.0')

    def test_bump_version_patch(self):
        version = '1.2.3'
        position = 2
        result = bump_version(version, position)
        self.assertEqual(result, '1.2.4')

if __name__ == '__main__':
    unittest.main()