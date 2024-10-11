import unittest
from ansible.template.vars import AnsibleJ2Vars


class TestAnsibleJ2Vars(unittest.TestCase):
    def setUp(self):
        self.templar = None
        self.globals = None
        self.locals = None
        self.ansible_j2_vars = AnsibleJ2Vars(self.templar, self.globals, self.locals)

    def test_init(self):
        self.assertIsInstance(self.ansible_j2_vars, AnsibleJ2Vars)

    def test_contains(self):
        self.assertFalse('key' in self.ansible_j2_vars.available_variables)

    def test_iter(self):
        self.assertIsInstance(iter(self.ansible_j2_vars.available_variables), type(iter({})))

    def test_len(self):
        self.ansible_j2_vars = self.ansible_runner.available_variables

    def test_getitem(self):
        self.ansible_j2_vars['varname']

    def test_add_locals(self):
        self.assertIsInstance(self.ansible_j2_vars.add_locals(None), AnsibleJ2Vars)

if __name__ == '__main__':
    unittest.main()