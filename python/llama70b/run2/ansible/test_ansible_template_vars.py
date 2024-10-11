import unittest
from ansible.template import vars


class TestAnsibleJ2Vars(unittest.TestCase):
    def test_init(self):
        templar = object()  # mock templar object
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance._templar, templar)
        self.assertEqual(instance._globals, globals)
        self.assertEqual(instance._locals, {})

    def test_contains(self):
        templar = object()  # mock templar object
        globals = {}
        locals = {'key': 'value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertTrue('key' in instance)
        self.assertFalse('nonexistent_key' in instance)

    def test_iter(self):
        templar = object()  # mock templar object
        globals = {'global_key': 'global_value'}
        locals = {'local_key': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        keys = list(instance)
        self.assertIn('global_key', keys)
        self.assertIn('local_key', keys)

    def test_len(self):
        templar = object()  # mock templar object
        globals = {'global_key': 'global_value'}
        locals = {'local_key': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(len(instance), 2)

    def test_getitem(self):
        templar = object()  # mock templar object
        globals = {'global_key': 'global_value'}
        locals = {'local_key': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance['local_key'], 'local_value')
        self.assertEqual(instance['global_key'], 'global_value')
        with self.assertRaises(KeyError):
            instance['nonexistent_key']

    def test_add_locals(self):
        templar = object()  # mock templar object
        globals = {}
        locals = {'key': 'value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        new_locals = {'new_key': 'new_value'}
        new_instance = instance.add_locals(new_locals)
        self.assertEqual(new_instance._locals, {'key': 'value', 'new_key': 'new_value'})

    def test_private_method__templar_template(self):
        templar = object()  # mock templar object
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        variable = 'some_variable'
        result = instance._AnsibleJ2Vars__templar_template(variable)
        # assert the result is templated correctly

    def test_magic_method__str__(self):
        templar = object()  # mock templar object
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        result = str(instance)
        self.assertEqual(result, 'AnsibleJ2Vars')

    def test_magic_method__repr__(self):
        templar = object()  # mock templar object
        globals = {}
        locals = {}
        instance = AnsibleJ2Vars(templar, globals, locals)
        result = repr(instance)
        self.assertEqual(result, 'AnsibleJ2Vars(...)')

if __name__ == '__main__':
    unittest.main()