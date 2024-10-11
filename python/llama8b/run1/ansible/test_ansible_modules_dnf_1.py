import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import yu


class TestDnf(unittest.TestCase):
    def test_init(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_method_one(self):
        instance = dnf()
        result = instance.method_one(1)
        self.assertEqual(result, 2)

    def test_method_two(self):
        instance = dnf()
        result = instance.method_two(2)
        self.assertEqual(result, 4)

    def test_protected_method(self):
        instance = dnf()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_private_method(self):
        instance = dnf()
        result = instance._dnf__private_method(3)
        self.assertEqual(result, 9)

    def test_str_method(self):
        instance = dnf()
        result = instance.__str__()
        self.assertEqual(result, "dnf")

    def test_repr_method(self):
        instance = dnf()
        result = instance.__repr__()
        self.assertEqual(result, "dnf()")

    def test_example_function(self):
        result = dnf.example_function(3)
        self.assertEqual(result, 2)

    def test_yumdnf_argument_spec(self):
        result = yumdnf_argument_spec()
        self.assertIsNotNone(result)

    def test_yumdnf(self):
        instance = YumDnf()
        self.assertIsNotNone(instance)

    def test_dnfa(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfb(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfc(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfd(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfe(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnff(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfg(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfh(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfi(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfn(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfo(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfp(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfq(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfr(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfs(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnft(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfu(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfv(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfw(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfx(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfy(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfn(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfo(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfp(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfp(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfp(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfp(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfp(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfp(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfp(self):
        instance = dnf()
        self.assertIsNotNone(instance)

    def test_dnfp(self):
        instance = dnf()
        self.assertIsNotNone(instance)

if __name__ == '__main__':
    unittest.main()