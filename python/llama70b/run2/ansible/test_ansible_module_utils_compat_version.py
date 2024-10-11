import unittest
from ansible.module_utils.compat.version import Version, StrictVersion, LooseVersion


class TestVersion(unittest.TestCase):
    def test_init(self):
        v = Version("1.2.3")
        self.assertIsNotNone(v)

    def test_repr(self):
        v = Version("1.2.3")
        self.assertEqual(v.__repr__(), "Version ('1.2.3')")

    def test_eq(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.3")
        self.assertTrue(v1.__eq__(v2))

    def test_lt(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.4")
        self.assertTrue(v1.__lt__(v2))

    def test_le(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.3")
        self.assertTrue(v1.__le__(v2))

    def test_gt(self):
        v1 = Version("1.2.4")
        v2 = Version("1.2.3")
        self.assertTrue(v1.__gt__(v2))

    def test_ge(self):
        v1 = Version("1.2.4")
        v2 = Version("1.2.4")
        self.assertTrue(v1.__ge__(v2))

class TestStrictVersion(unittest.TestCase):
    def test_init(self):
        sv = StrictVersion("1.2.3")
        self.assertIsNotNone(sv)

    def test_parse(self):
        sv = StrictVersion("1.2.3")
        sv.parse("1.2.3")
        self.assertEqual(sv.version, (1, 2, 3))

    def test_str(self):
        sv = StrictVersion("1.2.3")
        self.assertEqual(sv.__str__(), "1.2.3")

    def test_repr(self):
        sv = StrictVersion("1.2.3")
        self.assertEqual(sv.__repr__(), "StrictVersion ('1.2.3')")

    def test_cmp(self):
        sv1 = StrictVersion("1.2.3")
        sv2 = StrictVersion("1.2.4")
        self.assertEqual(sv1._cmp(sv2), -1)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        lv = LooseVersion("1.2.3")
        self.assertIsNotNone(lv)

    def test_parse(self):
        lv = LooseVersion("1.2.3")
        lv.parse("1.2.3")
        self.assertEqual(lv.version, ["1", "2", "3"])

    def test_str(self):
        lv = LooseVersion("1.2.3")
        self.assertEqual(lv.__str__(), "1.2.3")

    def test_repr(self):
        lv = LooseVersion("1.2.3")
        self.assertEqual(lv.__repr__(), "LooseVersion ('1.2.3')")

    def test_cmp(self):
        lv1 = LooseVersion("1.2.3")
        lv2 = LooseVersion("1.2.4")
        self.assertEqual(lv1._cmp(lv2), -1)

if __name__ == '__main__':
    unittest.main()