import re
from ansible.module_utils.compat.version import StrictVersion, LooseVersion

class TestStrictVersion:
    def test_init_with_string(self):
        version = StrictVersion("1.2.3")
        assert version.version == (1, 2, 3)

    def test_init_with_tuple(self):
        version = StrictVersion((1, 2, 3))
        assert version.version == (1, 2, 3)

    def test_str_method(self):
        version = StrictVersion("1.2.3")
        assert str(version) == "1.2.3"

    def test_repr_method(self):
        version = StrictVersion("1.2.3")
        assert repr(version) == "StrictVersion('1.2.3')"

    def test_eq_method(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.3")
        assert version1 == version2

    def test_lt_method(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.4")
        assert version1 < version2

    def test_le_method(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.3")
        assert version1 <= version2

    def test_gt_method(self):
        version1 = StrictVersion("1.2.4")
        version2 = StrictVersion("1.2.3")
        assert version1 > version2

    def test_ge_method(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.3")
        assert version1 >= version2

class TestLooseVersion:
    def test_init_with_string(self):
        version = LooseVersion("1.2.3")
        assert version.version == [1, 2, 3]

    def test_init_with_list(self):
        version = LooseVersion([1, 2, 3])
        assert version.version == [1, 2, 3]

    def test_str_method(self):
        version = LooseVersion("1.2.3")
        assert str(version) == "1.2.3"

    def test_repr_method(self):
        version = LooseVersion("1.2.3")
        assert repr(version) == "LooseVersion('1.2.3')"

    def test_eq_method(self):
        version1 = LooseVersion("1.2.3")
        version2 = LooseVersion("1.2.3")
        assert version1 == version2

    def test_lt_method(self):
        version1 = LooseVersion("1.2.3")
        version2 = LooseVersion("1.2.4")
        assert version1 < version2

    def test_le_method(self):
        version1 = LooseVersion("1.2.3")
        version2 = LooseVersion("1.2.3")
        assert version1 <= version2

    def test_gt_method(self):
        version1 = LooseVersion("1.2.4")
        version2 = LooseVersion("1.2.3")
        assert version1 > version2

if __name__ == '__main__':
    unittest.main()