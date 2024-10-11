import unittest
from ansible.module_utils.compat.version import Version, StrictVersion, LooseVersion


class TestVersion(unittest.TestCase):
    def test_init(self):
        v = Version("1.2.3")
        self.assertIsNotNone(v)

    def test_repr(self):
        v = Version("1.2.3")
        self.assertEqual(repr(v), "Version ('1.2.3')")

    def test_eq(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.3")
        self.assertTrue(v1 == v2)

    def test_lt(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.4")
        self.assertTrue(v1 < v2)

    def test_le(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.3")
        self.assertTrue(v1 <= v2)

    def test_gt(self):
        v1 = Version("1.2.4")
        v2 = Version("1.2.3")
        self.assertTrue(v1 > v2)

    def test_ge(self):
        v1 = Version("1.2.4")
        v2 = Version("1.2.4")
        self.assertTrue(v1 >= v2)

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
        self.assertEqual(str(sv), "1.2.3")

    def test_cmp(self):
        sv1 = StrictVersion("1.2.3")
        sv2 = StrictVersion("1.2.4")
        self.assertEqual(sv1 < sv2, True)

    def test_private_method(self):
        sv = StrictVersion("1.2.3")
        result = sv < sv
        self.assertEqual(result, False)

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
        self.assertEqual(str(lv), "1.2.3")

    def test_repr(self):
        lv = LooseVersion("1.2.3")
        self.assertEqual(repr(lv), "LooseVersion ('1.2.3')")

    def test_cmp(self):
        lv1 = LooseVersion("1.2.3")
        lv2 = LooseVersion("1.2.4")
        self.assertEqual(lv1 < lv2, True)

if __name__ == '__main__':
    unittest.main()