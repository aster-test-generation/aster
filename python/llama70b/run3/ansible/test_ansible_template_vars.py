import unittest
from ansible.template import vars


class TestAnsibleJ2Vars(unittest.TestCase):
    def test___init__(self):
        templar = object()  # mock templar object
        globals = {'global_var': 'global_value'}
        locals = {'local_var': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance._templar, templar)
        self.assertEqual(instance._globals, globals)
        self.assertEqual(instance._locals, {'local_var': 'local_value'})

    def test___contains__(self):
        templar = object()  # mock templar object
        globals = {'global_var': 'global_value'}
        locals = {'local_var': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertTrue('local_var' in instance)
        self.assertTrue('global_var' in instance)
        self.assertFalse('unknown_var' in instance)

    def test___iter__(self):
        templar = object()  # mock templar object
        globals = {'global_var': 'global_value'}
        locals = {'local_var': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        expected_keys = set(['local_var', 'global_var'])
        self.assertEqual(set(iter(instance)), expected_keys)

    def test___len__(self):
        templar = object()  # mock templar object
        globals = {'global_var': 'global_value'}
        locals = {'local_var': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(len(instance), 2)

    def test___getitem__(self):
        templar = object()  # mock templar object
        globals = {'global_var': 'global_value'}
        locals = {'local_var': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance['local_var'], 'local_value')
        self.assertEqual(instance['global_var'], 'global_value')
        with self.assertRaises(KeyError):
            instance['unknown_var']

    def test_add_locals(self):
        templar = object()  # mock templar object
        globals = {'global_var': 'global_value'}
        locals = {'local_var': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        new_locals = {'new_local_var': 'new_local_value'}
        new_instance = instance.add_locals(new_locals)
        self.assertEqual(new_instance._locals, {'local_var': 'local_value', 'new_local_var': 'new_local_value'})

    def test___repr__(self):
        templar = object()  # mock templar object
        globals = {'global_var': 'global_value'}
        locals = {'local_var': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(repr(instance), "AnsibleJ2Vars(<object object at ...>, {'global_var': 'global_value'}, {'local_var': 'local_value'})")

    def test___str__(self):
        templar = object()  # mock templar object
        globals = {'global_var': 'global_value'}
        locals = {'local_var': 'local_value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(str(instance), "AnsibleJ2Vars")

if __name__ == '__main__':
    unittest.main()