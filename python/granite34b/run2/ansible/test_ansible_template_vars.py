import unittest
from ansible.template.vars import AnsibleJ2Vars


class TestAnsibleJ2Vars(unittest.TestCase):
    def setUp(self):
        self.templar = None
        self.globals = {}
        self.locals = {}
        self.ansible_j2_vars = AnsibleJ2Vars(self.templar, self.globals, self.locals)

    def test_init(self):
        self.assertIsInstance(self.ansible_j2_vars, AnsibleJ2Vars)

    def test_contains(self):
        self.ansible_j2_vars = self.ansible_run()

    def test_iter(self):
        self.assertEqual(list(self.ansible_j2_vars.available_variables), [])

    def test_len(self):
        self.ansible_j2_vars = self.ansible_vars.available_variables()

    def test_getitem(self):
        with self.assertRaises(KeyError):
            self.ansible_j2_vars.varname

    def test_add_locals(self):
        new_locals = {'key': 'value'}
        new_ansible_j2_vars = self.ansible_j2_vars.add_locals(new_locals)
        self.assertEqual(new_ansible_j2_vars._locals, new_locals)

if __name__ == '__main__':
    unittest.main()