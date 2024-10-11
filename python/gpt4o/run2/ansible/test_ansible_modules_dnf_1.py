import unittest
from ansible.modules.dnf import *


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=module.dnf_argument_spec(),
            supports_check_mode=True
        )
        self.dnf = YumDnf(self.module)

    def test_init(self):
        self.assertIsInstance(self.dnf, YumDnf)

    def test_str_method(self):
        result = self.dnf.__str__()
        self.assertEqual(result, "YumDnf")

    def test_repr_method(self):
        result = self.dnf.__repr__()
        self.assertEqual(result, "YumDnf()")

    def test_eq_method(self):
        other_dnf = YumDnf(self.module)
        self.assertTrue(self.dnf.__eq__(other_dnf))

    def test_private_method(self):
        result = self.dnf._YumDnf__private_method()
        self.assertEqual(result, "Expected Result")

    def test_protected_method(self):
        result = self.dnf._protected_method()
        self.assertEqual(result, "Expected Result")

    def test_method_one(self):
        result = self.dnf.method_one(1)
        self.assertEqual(result, 2)

    def test_method_two(self):
        result = self.dnf.method_two(2)
        self.assertEqual(result, 4)

    def test_example_function(self):
        result = example_function(3)
        self.assertEqual(result, 2)

if __name__ == '__main__':
    unittest.main()