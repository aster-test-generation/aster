import unittest
from ansible.modules.command import AnsibleModule


class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec={})
        self.assertIsInstance(module, AnsibleModule)

    def test_str_method(self):
        module = AnsibleModule(argument_spec={})
        result = module.__str__()
        self.assertEqual(result, "AnsibleModule")

    def test_repr_method(self):
        module = AnsibleModule(argument_spec={})
        result = module.__repr__()
        self.assertEqual(result, "AnsibleModule()")

    def test_eq_method(self):
        module1 = AnsibleModule(argument_spec={})
        module2 = AnsibleModule(argument_spec={})
        result = module1.__eq__(module2)
        self.assertEqual(result, True)

    def test_private_method(self):
        module = AnsibleModule(argument_spec={})
        result = module._AnsibleModule__private_method()
        self.assertEqual(result, "private method")

    def test_protected_method(self):
        module = AnsibleModule(argument_spec={})
        result = module._protected_method()
        self.assertEqual(result, "protected method")

if __name__ == '__main__':
    unittest.main()