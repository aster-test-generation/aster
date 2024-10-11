import unittest
from ansible.template.vars import AnsibleJ2Vars


class TestAnsibleJ2Vars(unittest.TestCase):
    def setUp(self):
        self.templar = None  # Replace with a valid Templar() object
        self.globals = {}  # Replace with a valid dictionary of global variables
        self.locals = {}  # Replace with a valid dictionary of local variables

    def test_init(self):
        obj = AnsibleJ2Vars(self.templar, self.globals, self.locals)
        self.assertIsInstance(obj, AnsibleJ2Vars)

    def test_contains(self):
        obj = AnsibleJ2Vars(self.templar, self.globals, self.locals)
        self.assertIn('key', obj.available_variables)
        self.assertNotIn('key', obj)

    def test_iter(self):
        obj = AnsibleJ2Vars(self.templar, self.globals, self.locals)
        self.assertEqual(list(obj.available_variables), ['key1', 'key2'])

    def test_len(self):
        obj = AnsibleJ2Vars(self.templar, self.globals, self.locals)
        self.assertEqual(len(obj.available_variables), 2)

    def test_getitem(self):
        obj = AnsibleJ2Vars(self.templar, self.globals, self.locals)
        self.assertEqual(obj.available_variables, 'value')
        with self.assertRaises(KeyError):
            obj['invalid_key']

    def test_add_locals(self):
        obj = AnsibleJ2Vars(self.templar, self.globals, self.locals)
        new_obj = obj.add_locals({'key3': 'value3'})
        self.assertEqual(new_obj['key3'], 'value3')

if __name__ == '__main__':
    unittest.main()